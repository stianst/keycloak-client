# Keyloak standalone client

PoC showing a standalone Keycloak client that can be used without any direct dependencies on Keycloak.

It basically creates a shaded `client-common` with what is needed from `keycloak-core` and `keycloak-common`,
as well as a shaded `admin-client-shaded`.

Under the covers the core/common/admin-client classes from Keycloak can be updated, but to the end user
they get something like `org.keycloak:keycloak-admin-client-shaded:<client version>`.

To try it out simply run `mvn test` which will run some tests in the `test` module to show that it works.

Running `mvn dependency:tree -f test` will show that the example use of the admin client has no dependencies
on Keycloak server JARs.