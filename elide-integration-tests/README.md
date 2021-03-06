# elide-integration-tests

This package contains integration tests for Elide, and is executed as part of the maven verify lifecycle.

## Executing in IntelliJ

The integration tests must be executed against a concrete data store implementation. The maven lifecycles automatically
manage this for hibernate3 and hibernate5. If you want to run integration tests in IntelliJ, there are two simple steps
to follow.

1. Create a new TestNG run configuration that targets the integration test you want to run (e.g. `FilterIT`)
1. Change "Use classpath of module" to the data store you want to run the integration test against 
    (e.g. `elide-datastore-hibernate5`)
1. Set the dataStoreSupplier property in VM options
    (e.g. `-DdataStoreSupplier=com.yahoo.elide.datastores.hibernate5.HibernateDataStoreSupplier`)

Here's an example of working configuration for the FilterIT integration test using the Hibernate 5 data store:

![IntelliJ TestNG Config Example](https://cdn.rawgit.com/yahoo/elide/master/elide-integration-tests/intellij-testng-config.png)
