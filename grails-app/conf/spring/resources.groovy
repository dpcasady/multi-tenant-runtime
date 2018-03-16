import org.grails.DatabaseProvisioningService

// Place your Spring DSL code here
beans = {
    databaseProvisioningService(DatabaseProvisioningService) {
        hibernateDatastore = ref('hibernateDatastore')
    }
}
