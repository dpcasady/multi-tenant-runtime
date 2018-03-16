package org.grails

import grails.transaction.Transactional

@Transactional(readOnly = true)
class DeviceService {

    def list() {
        Device.createCriteria().list { }
    }

}
