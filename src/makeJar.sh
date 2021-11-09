#!/bin/bash
javac -cp Pokemon.jar -d .. myMoves/*.java
javac -cp Pokemon.jar:.. -d .. myPokemons/*.java
javac -cp Pokemon.jar:.. -d .. Lab2.java

echo "Manifest-Version: 1.0" > MANIFEST.MF
echo "Main-Class: lib.Lab2" >> MANIFEST.MF
echo "Class-Path: Pokemon.jar" >> MANIFEST.MF

jar cmf MANIFEST.MF Lab2.jar ../lib/
