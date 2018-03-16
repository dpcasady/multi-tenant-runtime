package org.grails

import groovy.transform.CompileStatic
import org.grails.datastore.mapping.core.connections.ConnectionSource
import org.grails.orm.hibernate.HibernateDatastore

@CompileStatic
class DatabaseProvisioningService {

    HibernateDatastore hibernateDatastore

    HibernateDatastore addDatastore(String dataSourceName) {
        ConnectionSource source = hibernateDatastore.connectionSources.addConnectionSource(dataSourceName, config)
        return hibernateDatastore.getDatastoreForConnection(source.name)
    }

    protected Map<String, Object> getConfig() {
        return [pooled: true,
                jmxExport: true,
                driverClassName: 'org.h2.Driver',
                username: 'sa',
                password: '',
                dbCreate: 'create-drop',
                url: 'jdbc:h2:mem:ds1Db;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE'] as Map<String, Object>
    }

}
