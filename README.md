# repro-nr-376
Small project to reproduce New Relic's Java agent issue 376

To reproduce, add 404 as a expected status code in your NR configuration.

Modify `build.gradle` and set the proper path to the NR agent.

Start the server with `./gradlew bootRun`

Make a request to http://localhost:8080

A 404 will be returned and will be sent as an error to NR.

Making a request to http://localhost:8080/bad_path should also return a 404 that will be marked as expected in NR.
