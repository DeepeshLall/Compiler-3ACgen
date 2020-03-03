#!/bin/bash

check_outfile() {
    if [ ! -f "$OUTFILE" ]; then
        echo "ERROR: Outfile '$OUTFILE' is not present!"
        exit -1
    fi
}

read_input() {
    INFILE=$1

    if [ "$INFILE" = "" ]; then
        echo "ERROR: Please provide Java input file name!"
        exit -1
    fi

    #Check if given file is indeed a Java file
    T1=$(echo $INFILE | awk -F'.' '{print $1}' | awk -F '/' '{print $2}')
    T2=$(echo $INFILE | awk -F'.' '{print $2}')
    if [ "$T2" != "java" ]; then
        echo "ERROR: File name '$INFILE' is incorrect!"
        exit -1
    fi

    #Check if file exists
    if [ ! -f $INFILE ]; then
        echo "ERROR: FIle '$INFILE' is not present!"
        exit -1
    fi

    OUTFILE="output/$T1.out"
    ERRFILE="error/$T1.err"
}

build_code() {
    if [ ! -f java_scanner.cpp ]; then
        echo "ERROR: Source file is not present!"
        exit -1
    fi
    if [ ! -f java_scanner.l ]; then
        echo "ERROR: Lex file is not present!"
        exit -1
    fi
    if [ ! -f java_scanner.h ]; then
        echo "ERROR: Header file is not present!"
        exit -1
    fi

    #### PUT YOUR TERMINAL CODE.
    bison -dv parser.y

    flex java_scanner.l

    g++ -w -std=c++17 parser.tab.c lex.yy.c -lfl -o output

    #Output file generated in "output" named exec.

}

######################################

# Build your code
build_code

# You need to use following variables to refer to input and output files
# You program's output must be present in OUTFILE only.
INFILE=""
OUTFILE=""
ERRFILE=""

# Read input file name from user.
# And make output file name.
read_input $1

# Here you execute your lexer
./lexer <$INFILE >$OUTFILE 2>$ERRFILE

#In the end, check if output file is created and is not of size zero.
check_outfile

echo "Congo!! Everything seems fine so far."
