package org.grails

import geb.spock.GebSpec
import grails.test.mixin.integration.Integration

@Integration
class TenantRuntimeSpec extends GebSpec {

    void "domains are listed successfully for the DEFAULT dataSource"() {
        when:
        go '/device'

        then:
        !driver.pageSource.contains("PooledConnection has already been closed.")
    }

    void "domains are listed successfully for the additional dataSource from application.yml"() {
        given:
        go '/tenant/select/existingDS'

        when:
        go '/device'

        then:
        !driver.pageSource.contains("PooledConnection has already been closed.")
    }

    void "domains are listed successfully for the new dataSource added at runtime"() {
        given:
        go '/tenant/select/newDS'

        when:
        go '/device'

        then:
        !driver.pageSource.contains("PooledConnection has already been closed.")
    }
}
