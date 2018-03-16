package org.grails

import groovy.transform.CompileStatic
import org.grails.datastore.mapping.core.connections.ConnectionSource
import org.grails.datastore.mapping.multitenancy.exceptions.TenantNotFoundException
import org.grails.datastore.mapping.multitenancy.web.SessionTenantResolver

@CompileStatic
class CustomTenantResolver extends SessionTenantResolver {

    @Override
    Serializable resolveTenantIdentifier() {
        try {
            return super.resolveTenantIdentifier()
        } catch (TenantNotFoundException e) {
            return ConnectionSource.DEFAULT
        }
    }
}
