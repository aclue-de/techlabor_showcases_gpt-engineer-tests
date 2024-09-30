#!/bin/bash

# Install dependencies
./mvnw clean install

# Run the application
./mvnw spring-boot:run &

# Run the tests
./mvnw test
