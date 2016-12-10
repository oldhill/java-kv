#!/usr/bin/env bash
javac -cp src/main/java src/main/java/net/miniramp/kv/*.java
java -cp src/main/java net.miniramp.kv.KvApplication
