# berlin-clock-java

Berlin Clock in Java

[![Build Status](https://travis-ci.org/ryanb93/berlin-clock-java.svg?branch=master)](https://travis-ci.org/ryanb93/berlin-clock-java)
[![codecov.io](https://codecov.io/github/ryanb93/berlin-clock-java/coverage.svg?branch=master)](https://codecov.io/github/ryanb93/berlin-clock-java?branch=master)

A Java project that converts 24H time into its berlin clock representation.

The time should be entered in this format: "HH:MM:SS".

To run:

    ./gradlew run "24H_TIME"

Example run:

    ./gradlew run "09:40:01"

  To run tests:

    ./gradlew test

Clock representation:
-   "0" - Lamp is off
-   "R" - Red lamp is on
-   "Y" - Yellow lamp is on