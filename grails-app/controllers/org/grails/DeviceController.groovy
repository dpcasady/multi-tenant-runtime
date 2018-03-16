package org.grails

import grails.gorm.multitenancy.CurrentTenant

@CurrentTenant
class DeviceController {

    DeviceService deviceService

    def index() {
        deviceService.list()
        render Device.list()
    }

}
