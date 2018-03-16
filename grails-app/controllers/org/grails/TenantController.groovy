package org.grails

import org.grails.datastore.mapping.multitenancy.web.SessionTenantResolver
import org.grails.orm.hibernate.HibernateDatastore

class TenantController {

    HibernateDatastore hibernateDatastore

    def index() {
        respond true, model: [tenants: hibernateDatastore.connectionSources.allConnectionSources*.name.sort()]
    }

    def select(String id) {
        session.setAttribute(SessionTenantResolver.ATTRIBUTE, id)
        redirect controller: 'tenant'
    }

}
