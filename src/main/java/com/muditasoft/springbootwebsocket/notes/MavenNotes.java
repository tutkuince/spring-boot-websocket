package com.muditasoft.springbootwebsocket.notes;

public class MavenNotes {
    /**
     *      SNAPSHOT is a special version that indicates a current development copy.
     *      Unlike regular versions, Maven checks for a new SNAPSHOT version in a remote repository for every build.
     *
     *
     *       maven plugin:
     *       package -> run test first before generating snapshot
     *       If we get an error, process isn't going to complete
     *
     *
     *       surefile plugin runs the JUnit unit tests and creates test reports.
     *
     *       mvn help:effective-pom commands can be used to look at the default configuration of the super POM
     *
     *       process-test-classes phase in maven life cycle processes
     *       the generated files from the test code file compilation
     * */
}
