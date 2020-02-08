#!/bin/sh

val=$(sed '/==/d' $1 | sed '0,/^%%$/d' | sed '/^%%$/q' | sed '/%%/d' | sed 's/;$//g')
# val=$(sed '/==/d' parser.y | sed '0,/^%%$/d' | sed '/^%%$/q' | sed '/%%/d' | sed 's/;$//g')

table=$(echo "$val" | sed -r s/\'.\'//g | sed s/\'\\\\\.\'//g | sed 's/"\([^"]*\)"//g' )

grammerHead=$(echo "$table" | grep -E ^.*?\ : | awk -F ":" '{print $1}' | sed s/\ //g | sort | uniq)

grammerBodyElement=$(echo "$table" | sed s/^.*\\?\ ://g | sed s/\|//g)

grammerBody=$(echo "$grammerBodyElement" | tr '[:space:]' '[\n*]' | grep -v "^\s*$" | sort | uniq )

echo "$grammerBody" > grammerBody.txt
echo "$grammerHead" > grammerHead.txt