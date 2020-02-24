#!/bin/bash

export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
antlr4 -Dlanguage=Python3 -visitor Java8.g4
python3 astGenerator.py < $1 > graph_temp.dot

Line=$(head -n 2 graph.dot)
removeline=$(echo "$line" | grep "ANTLR runtime and generated code versions disagree | wc -l")

tail -n +3 graph_temp.dot > graph.dot

dot -Tps graph.dot -o graph.pdf