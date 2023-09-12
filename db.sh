#!/bin/bash

# Clear the terminal
clear

#mvn exec:java -Dexec.mainClass="disco_ball_app.src.DiscoBall"

mvn clean install -U exec:java


