Commands to Be executed:

Use below command with relative addressing.

1. export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
2. alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
3. alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'

4. antlr4 -Dlanguage=Python3 -visitor Java8.g4
5. python3 astGenerator.py < ../hello_world.java > graph.dot
6. Need to remove the ANTLR version mismatch lines from graph.dot
7. dot -Tps graph.dot -o graph.pdf

