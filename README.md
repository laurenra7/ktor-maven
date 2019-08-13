# ktor-maven

A simple Kotlin application on a Ktor server built with Maven that can
produce a self-contained "Fat" Jar file that includes all dependencies to
run the application. This is an example of how to create this kind of project.

## Configure

### Jar file name

The `<jarfile.basename>` property in `pom.xml` defines the name of the .jar
file that it produces, `ktor-maven.jar`.

### Class entry point
The `<main.class>` property in `pom.xml` defines the class entry point for
the application, `la.sample.MainKt`. The Kotlin main entry class is always
named `main`. When it is compiled to Java the Java class name becomes `MainKt`.

Both of these properties are used in the `maven-assembly-plugin` to generate
a self-contained fat jar with all dependencies.

### Server port

The server port, 8080, is defined in the `embeddedServer(Netty, 8080)`
code in `Main.kt`.

## Generate Jar file

To build the `ktor-maven.jar` file (in the `target/` directory):

```
mvn package

or

mvn clean package
```

## Run the application

Start the server by running:

```
java -jar target/ktor-maven.jar
```

### See the running application in a browser

Navigate to localhost:8080 in a browser (port is defined in Main.kt) and you should see:

```
Greetings, Earthlings! Maven, Kotlin and Ktor salute you.
```
