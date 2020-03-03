/* A Bison parser, made by GNU Bison 3.0.4.  */

/* Bison interface for Yacc-like parsers in C

   Copyright (C) 1984, 1989-1990, 2000-2015 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

#ifndef YY_YY_PARSER_TAB_H_INCLUDED
# define YY_YY_PARSER_TAB_H_INCLUDED
/* Debug traces.  */
#ifndef YYDEBUG
# define YYDEBUG 0
#endif
#if YYDEBUG
extern int yydebug;
#endif

/* Token type.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
  enum yytokentype
  {
    COMMENT = 258,
    LITERAL = 259,
    IDENTIFIER = 260,
    ERROR = 261,
    ABSTRACT = 262,
    ASSERT = 263,
    BOOLEAN = 264,
    BREAK = 265,
    BYTE = 266,
    CASE = 267,
    CATCH = 268,
    CHAR = 269,
    CLASS = 270,
    CONST = 271,
    CONTINUE = 272,
    DEFAULT = 273,
    DO = 274,
    DOUBLE = 275,
    ELSE = 276,
    ENUM = 277,
    EXTENDS = 278,
    FINALLY = 279,
    FINAL = 280,
    FLOAT = 281,
    FOR = 282,
    IF = 283,
    GOTO = 284,
    IMPLEMENTS = 285,
    IMPORT = 286,
    INSTANCEOF = 287,
    INT = 288,
    INTERFACE = 289,
    LONG = 290,
    NATIVE = 291,
    NEW = 292,
    PACKAGE = 293,
    PRIVATE = 294,
    PROTECTED = 295,
    PUBLIC = 296,
    RETURN = 297,
    SHORT = 298,
    STATIC = 299,
    STRICTFP = 300,
    SUPER = 301,
    SWITCH = 302,
    SYNCHRONIZED = 303,
    THIS = 304,
    THROWS = 305,
    THROW = 306,
    TRANSIENT = 307,
    TRY = 308,
    VOID = 309,
    VOLATILE = 310,
    WHILE = 311,
    ET = 312,
    GT = 313,
    LT = 314,
    NT = 315,
    TLD = 316,
    QM = 317,
    COLON = 318,
    AR = 319,
    EQEQ = 320,
    GREQ = 321,
    LEQ = 322,
    NEQ = 323,
    INCR = 324,
    DECR = 325,
    OR = 326,
    AND = 327,
    ADD = 328,
    SBTR = 329,
    MULT = 330,
    DIV = 331,
    BOR = 332,
    BAND = 333,
    POW = 334,
    MOD = 335,
    GRGR = 336,
    LTLT = 337,
    GRGRGR = 338,
    PLEQ = 339,
    SBEQ = 340,
    MULEQ = 341,
    ANDEQ = 342,
    OREQ = 343,
    POWEQ = 344,
    DIVEQ = 345,
    MODEQ = 346,
    DGRGR = 347,
    DLRLR = 348,
    TGRGRGR = 349,
    LCB = 350,
    RCB = 351,
    LSQB = 352,
    RSQB = 353,
    LSMB = 354,
    RSMB = 355,
    CMA = 356,
    DCLN = 357,
    ATR = 358,
    TDT = 359,
    FST = 360,
    SCLN = 361,
    DST = 362
  };
#endif

/* Value type.  */
#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED

union YYSTYPE
{
#line 104 "parser.y" /* yacc.c:1909  */

    struct Node *ast_node;

#line 166 "parser.tab.h" /* yacc.c:1909  */
};

typedef union YYSTYPE YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define YYSTYPE_IS_DECLARED 1
#endif


extern YYSTYPE yylval;

int yyparse (void);

#endif /* !YY_YY_PARSER_TAB_H_INCLUDED  */
