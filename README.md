# jsonschema2pojo-test
Testing application for jsonschema2pojo.

This is a small application that demonstrates use of jsonschema2pojo to generate a POJO from a JSON schema.

# Build

    mvn clean package

# Test

    # Parse and print name from http://store.steampowered.com/api/appdetails?appids=10
    java -jar target/test-json.jar 10
    Counter-Strike

    # Parse and print name from http://store.steampowered.com/api/appdetails?appids=219
    java -jar target/test-json.jar 219
    Half-Life 2: Demo
