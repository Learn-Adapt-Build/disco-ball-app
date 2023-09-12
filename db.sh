#!/bin/bash

# Clear the terminal
clear

javac *.java

#java DiscoBall

#mvn exec:java -Dexec.mainClass="disco.ball.app.DiscoBall"

mvn exec:java -Dexec.mainClass="com.disco.ball.app.DiscoBall"


# Set the classpath to include all JAR files in the parent directory
#BATIK_LIB_PATH="/Users/spencerau/batik-1.17/lib/*"

# Compile your Java code
#javac -classpath "$BATIK_LIB_PATH" *.java

# Run your Java program
#java -classpath "$BATIK_LIB_PATH" Discoball
