# lex lex.l
# g++ --std=c++14 lex.yy.c -ll
# # ./a.out test.java > temp

# ./a.out test.java

# # cat temp | sort > output1

# # ./java_lexer.l.bin < test.java > temp

# # cat temp | sort > output2

# # diff output1 output2





# echo $1
# echo $2


lex $1
g++ --std=c++17 lex.yy.c -ll -o $1.bin
# lex $2
# g++ --std=c++17 lex.yy.c -ll -o $2.bin
rm lex.yy.c
./$1.bin < test3.java | sort > $1_output.txt
./$2 < test3.java | sort > $2_output.txt
echo "=================================="
var=$(diff $1_output.txt $2_output.txt)
[[ -z "$var" ]] && echo "test3.java [PASSED]" || echo "test3.java [FAILED]"
[[ ! -z "$var" ]] && echo "$var" || echo ""
echo "=================================="


for file in test/*.java
do
    ./$1.bin < $file | sort > $1_output.txt
	./$2 < $file | sort > $2_output.txt
	var=$(diff $1_output.txt $2_output.txt)
	echo "=================================="
	[[ -z "$var" ]] && echo "${file} [PASSED]" || echo "${file} [FAILED]"
	[[ ! -z "$var" ]] && echo "$var" || echo ""
	echo "=================================="
	
done
echo "=================================="


for file in Test/*.java
do
    ./$1.bin < $file | sort > $1_output.txt
	./$2 < $file | sort > $2_output.txt
	var=$(diff $1_output.txt $2_output.txt)
	echo "=================================="
	[[ -z "$var" ]] && echo "${file} [PASSED]" || echo "${file} [FAILED]"
	[[ ! -z "$var" ]] && echo "$var" || echo ""
	echo "=================================="
	
done
echo "=================================="