#!/bin/bash

export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'

while [ -n "$1" ]; do
    
    case "$1" in

    -input | -i) 
            INFILE="$2"
            shift
            ;;

    -output | -o | -out) 
            OUTPUTFILE="$2"
            shift
            ;;
            
    -help | -h) 
        echo "Way to use Command is available in Docs."
        shift
        ;;

    -verbose | -v) VFLAG=1;;

    *) 
        echo "Option $1 not recognized" 
        break
        ;;

    esac
    shift
done

if [ ! -z "$INFILE" ]; then
    # echo "inputfile= $INFILE"
    T1=$(echo $INFILE | awk -F '/' '{print $3}')
    T2=$(echo $T1 | awk -F '.' '{print $1}')
fi

if [ ! -z "$OUTPUTFILE" ]; then
    # echo "outputfile= $OUTPUTFILE"
    OUTDOTFILE="output/$OUTPUTFILE"
    ERRFILE="error/$T2"
fi


if [ ! -z "$VFLAG" ]; then
    echo "Input file provided : $T1"
    echo "Output dot file in : $OUTDOTFILE"
    echo "Antlr4 starts Running."
fi
antlr4 -Dlanguage=Python3 -visitor Java8.g4

if [ ! -z "$VFLAG" ]; then
    echo "Antlr4 created following files"
    echo "----------------------------------------------------------"
    ls
    echo "----------------------------------------------------------"
    echo "Starting the script for AST Generator.It may take some time."
fi
python3 astGenerator.py < $INFILE > graph_temp.dot 2>$ERRFILE
error_line=$(cat $ERRFILE | wc -l)
if [ $error_line -gt 0 ]; then
    echo "Terminating due to error."
    echo "Error in error directory."
    rm -r __pycache__ graph_temp.dot Java8.tokens Java8Lexer.* Java8Visitor.py Java8Parser.py Java8Listener.py    
    exit 0
fi

Line=$(head -n 2 graph_temp.dot)
removeline=$(echo "$Line" | grep "ANTLR runtime and generated code versions disagree | wc -l")

tail -n +3 graph_temp.dot > $OUTDOTFILE

if [ ! -z "$VFLAG" ]; then
    echo "Generator made .dot file in output directory with the name $OUTDOTFILE"
    echo "Generating Graph in pdf using the dot file."
fi

dot -Tps $OUTDOTFILE -o output/graph.pdf

rm -r __pycache__ graph_temp.dot Java8.tokens Java8Lexer.* Java8Visitor.py Java8Parser.py Java8Listener.py