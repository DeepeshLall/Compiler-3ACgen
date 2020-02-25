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
        echo "Way to use is available in Docs."
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
    echo "$T1"
    echo "$T2"
fi

if [ ! -z "$OUTPUTFILE" ]; then
    # echo "outputfile= $OUTPUTFILE"
    OUTDOTFILE="output/$OUTPUTFILE"
    ERRFILE="error/$T2"
    echo $OUTDOTFILE
fi


if [ ! -z "VFLAG" ]; then
    echo "Antlr4 starts Running.It may take some time."
fi
# antlr4 -Dlanguage=Python3 -visitor Java8.g4 2>$ERRFILE
if [ ! -z "VFLAG" ]; then
    echo "Antlr4 created following files"
    echo "----------------------------------------------------------"
    ls
    echo "----------------------------------------------------------"
    echo "Starting the script for AST Generator."
fi
# python3 astGenerator.py < $INFILE > graph_temp.dot

# Line=$(head -n 2 graph.dot)
# removeline=$(echo "$Line" | grep "ANTLR runtime and generated code versions disagree | wc -l")

# tail -n +3 graph_temp.dot > $OUTDOTFILE

if [ ! -z "VFLAG" ]; then
    echo "Generator made .dot file in output directory with the name $OUTDOTFILE"
    echo "Generating Graph in pdf using the dot file."
fi

# dot -Tps $OUTDOTFILE -o output/graph.pdf