package org.grails

class BootStrap {

    DatabaseProvisioningService databaseProvisioningService

    def init = { servletContext ->
        databaseProvisioningService.addDatastore("newDS")
    }
    def destroy = {
    }
}
