package org.grails

import grails.gorm.MultiTenant
import org.grails.datastore.gorm.GormEntity

class Device implements GormEntity<Device>, MultiTenant<Device> {

    String name

    static constraints = {
        name nullable: true
    }

}
