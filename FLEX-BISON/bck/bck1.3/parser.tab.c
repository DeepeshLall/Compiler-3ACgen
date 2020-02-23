/* A Bison parser, made by GNU Bison 3.0.4.  */

/* Bison implementation for Yacc-like parsers in C

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

/* C LALR(1) parser skeleton written by Richard Stallman, by
   simplifying the original so-called "semantic" parser.  */

/* All symbols defined below should begin with yy or YY, to avoid
   infringing on user name space.  This should be done even for local
   variables, as they might otherwise be expanded by user macros.
   There are some unavoidable exceptions within include files to
   define necessary library symbols; they are noted "INFRINGES ON
   USER NAME SPACE" below.  */

/* Identify Bison output.  */
#define YYBISON 1

/* Bison version.  */
#define YYBISON_VERSION "3.0.4"

/* Skeleton name.  */
#define YYSKELETON_NAME "yacc.c"

/* Pure parsers.  */
#define YYPURE 0

/* Push parsers.  */
#define YYPUSH 0

/* Pull parsers.  */
#define YYPULL 1




/* Copy the first part of user declarations.  */
#line 1 "parser.y" /* yacc.c:339  */

#include<bits/stdc++.h>

using namespace std;

extern int yylex();
extern int yyparse();
void yyerror(const char*s);

struct Node
{
    string key;
    vector<Node *>child;
};

Node *new_nonTerminal_Node_1_T(string value)
{
    Node *temp = new Node;
    temp->key=value;
    
    // cout << temp->key << " ";
    
    return temp;
}

Node *new_nonTerminal_Node_1_NT(Node *child_A)
{
    Node *temp = new Node;
    (temp->child).push_back(child_A);
    temp->key="NULL";
    return temp;
    // return child_A;
}

Node *new_nonTerminal_Node_2_NT(Node *child_A,Node *child_B)
{
    Node *temp = new Node;
    temp->key="NULL";
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_B);
    return temp;
}

Node *new_nonTerminal_Node_3_NT(Node *child_A,Node *child_B,Node *child_C)
{
    Node *temp = new Node;
    temp->key="NULL";
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_B);
    (temp->child).push_back(child_C);
    return temp;
}

Node *new_nonTerminal_Node_2_NT_1_T(string value,Node *child_A,Node *child_C)
{
    Node *temp = new Node;
    temp->key=value;
    
    // cout << value << " ";
    
    (temp->child).push_back(child_A);
    (temp->child).push_back(child_C);
    return temp;
}

Node *new_nonTerminal_Node_1_NT_2_T(string head_value,string child_value,Node *child_A)
{
    Node *temp = new Node;
    temp->key = head_value;
    
    Node *temp2 = new Node;
    temp2->key=child_value;
    
    // cout << temp2->key << " ";
    // cout << temp->key << " ";

    (temp->child).push_back(temp2);
    (temp->child).push_back(child_A);
    return temp;
}

void Visit(Node *root)
{
    if((root->child).size()==0){
        if(root->key=="NULL"){
            return;
        }
        cout << root->key << " ";
        return;
    }
    for(int i=0;i<((root->child).size());i++){
        Visit(root->child[i]);
    }
    if(root->key=="NULL"){
        return;
    }
    cout << root->key << " ";
    return;
}

Node *ast_root;


#line 170 "parser.tab.c" /* yacc.c:339  */

# ifndef YY_NULLPTR
#  if defined __cplusplus && 201103L <= __cplusplus
#   define YY_NULLPTR nullptr
#  else
#   define YY_NULLPTR 0
#  endif
# endif

/* Enabling verbose error messages.  */
#ifdef YYERROR_VERBOSE
# undef YYERROR_VERBOSE
# define YYERROR_VERBOSE 1
#else
# define YYERROR_VERBOSE 0
#endif

/* In a future release of Bison, this section will be replaced
   by #include "parser.tab.h".  */
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
#line 104 "parser.y" /* yacc.c:355  */

    struct Node *ast_node;

#line 322 "parser.tab.c" /* yacc.c:355  */
};

typedef union YYSTYPE YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define YYSTYPE_IS_DECLARED 1
#endif


extern YYSTYPE yylval;

int yyparse (void);

#endif /* !YY_YY_PARSER_TAB_H_INCLUDED  */

/* Copy the second part of user declarations.  */

#line 339 "parser.tab.c" /* yacc.c:358  */

#ifdef short
# undef short
#endif

#ifdef YYTYPE_UINT8
typedef YYTYPE_UINT8 yytype_uint8;
#else
typedef unsigned char yytype_uint8;
#endif

#ifdef YYTYPE_INT8
typedef YYTYPE_INT8 yytype_int8;
#else
typedef signed char yytype_int8;
#endif

#ifdef YYTYPE_UINT16
typedef YYTYPE_UINT16 yytype_uint16;
#else
typedef unsigned short int yytype_uint16;
#endif

#ifdef YYTYPE_INT16
typedef YYTYPE_INT16 yytype_int16;
#else
typedef short int yytype_int16;
#endif

#ifndef YYSIZE_T
# ifdef __SIZE_TYPE__
#  define YYSIZE_T __SIZE_TYPE__
# elif defined size_t
#  define YYSIZE_T size_t
# elif ! defined YYSIZE_T
#  include <stddef.h> /* INFRINGES ON USER NAME SPACE */
#  define YYSIZE_T size_t
# else
#  define YYSIZE_T unsigned int
# endif
#endif

#define YYSIZE_MAXIMUM ((YYSIZE_T) -1)

#ifndef YY_
# if defined YYENABLE_NLS && YYENABLE_NLS
#  if ENABLE_NLS
#   include <libintl.h> /* INFRINGES ON USER NAME SPACE */
#   define YY_(Msgid) dgettext ("bison-runtime", Msgid)
#  endif
# endif
# ifndef YY_
#  define YY_(Msgid) Msgid
# endif
#endif

#ifndef YY_ATTRIBUTE
# if (defined __GNUC__                                               \
      && (2 < __GNUC__ || (__GNUC__ == 2 && 96 <= __GNUC_MINOR__)))  \
     || defined __SUNPRO_C && 0x5110 <= __SUNPRO_C
#  define YY_ATTRIBUTE(Spec) __attribute__(Spec)
# else
#  define YY_ATTRIBUTE(Spec) /* empty */
# endif
#endif

#ifndef YY_ATTRIBUTE_PURE
# define YY_ATTRIBUTE_PURE   YY_ATTRIBUTE ((__pure__))
#endif

#ifndef YY_ATTRIBUTE_UNUSED
# define YY_ATTRIBUTE_UNUSED YY_ATTRIBUTE ((__unused__))
#endif

#if !defined _Noreturn \
     && (!defined __STDC_VERSION__ || __STDC_VERSION__ < 201112)
# if defined _MSC_VER && 1200 <= _MSC_VER
#  define _Noreturn __declspec (noreturn)
# else
#  define _Noreturn YY_ATTRIBUTE ((__noreturn__))
# endif
#endif

/* Suppress unused-variable warnings by "using" E.  */
#if ! defined lint || defined __GNUC__
# define YYUSE(E) ((void) (E))
#else
# define YYUSE(E) /* empty */
#endif

#if defined __GNUC__ && 407 <= __GNUC__ * 100 + __GNUC_MINOR__
/* Suppress an incorrect diagnostic about yylval being uninitialized.  */
# define YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN \
    _Pragma ("GCC diagnostic push") \
    _Pragma ("GCC diagnostic ignored \"-Wuninitialized\"")\
    _Pragma ("GCC diagnostic ignored \"-Wmaybe-uninitialized\"")
# define YY_IGNORE_MAYBE_UNINITIALIZED_END \
    _Pragma ("GCC diagnostic pop")
#else
# define YY_INITIAL_VALUE(Value) Value
#endif
#ifndef YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
# define YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
# define YY_IGNORE_MAYBE_UNINITIALIZED_END
#endif
#ifndef YY_INITIAL_VALUE
# define YY_INITIAL_VALUE(Value) /* Nothing. */
#endif


#if ! defined yyoverflow || YYERROR_VERBOSE

/* The parser invokes alloca or malloc; define the necessary symbols.  */

# ifdef YYSTACK_USE_ALLOCA
#  if YYSTACK_USE_ALLOCA
#   ifdef __GNUC__
#    define YYSTACK_ALLOC __builtin_alloca
#   elif defined __BUILTIN_VA_ARG_INCR
#    include <alloca.h> /* INFRINGES ON USER NAME SPACE */
#   elif defined _AIX
#    define YYSTACK_ALLOC __alloca
#   elif defined _MSC_VER
#    include <malloc.h> /* INFRINGES ON USER NAME SPACE */
#    define alloca _alloca
#   else
#    define YYSTACK_ALLOC alloca
#    if ! defined _ALLOCA_H && ! defined EXIT_SUCCESS
#     include <stdlib.h> /* INFRINGES ON USER NAME SPACE */
      /* Use EXIT_SUCCESS as a witness for stdlib.h.  */
#     ifndef EXIT_SUCCESS
#      define EXIT_SUCCESS 0
#     endif
#    endif
#   endif
#  endif
# endif

# ifdef YYSTACK_ALLOC
   /* Pacify GCC's 'empty if-body' warning.  */
#  define YYSTACK_FREE(Ptr) do { /* empty */; } while (0)
#  ifndef YYSTACK_ALLOC_MAXIMUM
    /* The OS might guarantee only one guard page at the bottom of the stack,
       and a page size can be as small as 4096 bytes.  So we cannot safely
       invoke alloca (N) if N exceeds 4096.  Use a slightly smaller number
       to allow for a few compiler-allocated temporary stack slots.  */
#   define YYSTACK_ALLOC_MAXIMUM 4032 /* reasonable circa 2006 */
#  endif
# else
#  define YYSTACK_ALLOC YYMALLOC
#  define YYSTACK_FREE YYFREE
#  ifndef YYSTACK_ALLOC_MAXIMUM
#   define YYSTACK_ALLOC_MAXIMUM YYSIZE_MAXIMUM
#  endif
#  if (defined __cplusplus && ! defined EXIT_SUCCESS \
       && ! ((defined YYMALLOC || defined malloc) \
             && (defined YYFREE || defined free)))
#   include <stdlib.h> /* INFRINGES ON USER NAME SPACE */
#   ifndef EXIT_SUCCESS
#    define EXIT_SUCCESS 0
#   endif
#  endif
#  ifndef YYMALLOC
#   define YYMALLOC malloc
#   if ! defined malloc && ! defined EXIT_SUCCESS
void *malloc (YYSIZE_T); /* INFRINGES ON USER NAME SPACE */
#   endif
#  endif
#  ifndef YYFREE
#   define YYFREE free
#   if ! defined free && ! defined EXIT_SUCCESS
void free (void *); /* INFRINGES ON USER NAME SPACE */
#   endif
#  endif
# endif
#endif /* ! defined yyoverflow || YYERROR_VERBOSE */


#if (! defined yyoverflow \
     && (! defined __cplusplus \
         || (defined YYSTYPE_IS_TRIVIAL && YYSTYPE_IS_TRIVIAL)))

/* A type that is properly aligned for any stack member.  */
union yyalloc
{
  yytype_int16 yyss_alloc;
  YYSTYPE yyvs_alloc;
};

/* The size of the maximum gap between one aligned stack and the next.  */
# define YYSTACK_GAP_MAXIMUM (sizeof (union yyalloc) - 1)

/* The size of an array large to enough to hold all stacks, each with
   N elements.  */
# define YYSTACK_BYTES(N) \
     ((N) * (sizeof (yytype_int16) + sizeof (YYSTYPE)) \
      + YYSTACK_GAP_MAXIMUM)

# define YYCOPY_NEEDED 1

/* Relocate STACK from its old location to the new one.  The
   local variables YYSIZE and YYSTACKSIZE give the old and new number of
   elements in the stack, and YYPTR gives the new location of the
   stack.  Advance YYPTR to a properly aligned location for the next
   stack.  */
# define YYSTACK_RELOCATE(Stack_alloc, Stack)                           \
    do                                                                  \
      {                                                                 \
        YYSIZE_T yynewbytes;                                            \
        YYCOPY (&yyptr->Stack_alloc, Stack, yysize);                    \
        Stack = &yyptr->Stack_alloc;                                    \
        yynewbytes = yystacksize * sizeof (*Stack) + YYSTACK_GAP_MAXIMUM; \
        yyptr += yynewbytes / sizeof (*yyptr);                          \
      }                                                                 \
    while (0)

#endif

#if defined YYCOPY_NEEDED && YYCOPY_NEEDED
/* Copy COUNT objects from SRC to DST.  The source and destination do
   not overlap.  */
# ifndef YYCOPY
#  if defined __GNUC__ && 1 < __GNUC__
#   define YYCOPY(Dst, Src, Count) \
      __builtin_memcpy (Dst, Src, (Count) * sizeof (*(Src)))
#  else
#   define YYCOPY(Dst, Src, Count)              \
      do                                        \
        {                                       \
          YYSIZE_T yyi;                         \
          for (yyi = 0; yyi < (Count); yyi++)   \
            (Dst)[yyi] = (Src)[yyi];            \
        }                                       \
      while (0)
#  endif
# endif
#endif /* !YYCOPY_NEEDED */

/* YYFINAL -- State number of the termination state.  */
#define YYFINAL  36
/* YYLAST -- Last index in YYTABLE.  */
#define YYLAST   3303

/* YYNTOKENS -- Number of terminals.  */
#define YYNTOKENS  108
/* YYNNTS -- Number of nonterminals.  */
#define YYNNTS  138
/* YYNRULES -- Number of rules.  */
#define YYNRULES  348
/* YYNSTATES -- Number of states.  */
#define YYNSTATES  618

/* YYTRANSLATE[YYX] -- Symbol number corresponding to YYX as returned
   by yylex, with out-of-bounds checking.  */
#define YYUNDEFTOK  2
#define YYMAXUTOK   362

#define YYTRANSLATE(YYX)                                                \
  ((unsigned int) (YYX) <= YYMAXUTOK ? yytranslate[YYX] : YYUNDEFTOK)

/* YYTRANSLATE[TOKEN-NUM] -- Symbol number corresponding to TOKEN-NUM
   as returned by yylex, without out-of-bounds checking.  */
static const yytype_uint8 yytranslate[] =
{
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      65,    66,    67,    68,    69,    70,    71,    72,    73,    74,
      75,    76,    77,    78,    79,    80,    81,    82,    83,    84,
      85,    86,    87,    88,    89,    90,    91,    92,    93,    94,
      95,    96,    97,    98,    99,   100,   101,   102,   103,   104,
     105,   106,   107
};

#if YYDEBUG
  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
static const yytype_uint16 yyrline[] =
{
       0,   242,   242,   245,   248,   249,   252,   253,   256,   257,
     260,   261,   262,   263,   264,   267,   268,   271,   272,   275,
     278,   281,   284,   285,   286,   306,   307,   310,   313,   332,
     333,   334,   335,   336,   337,   338,   339,   342,   343,   346,
     347,   350,   354,   355,   358,   361,   365,   366,   367,   371,
     372,   375,   376,   377,   378,   379,   380,   381,   382,   383,
     384,   404,   405,   406,   407,   408,   409,   410,   411,   414,
     417,   420,   421,   424,   425,   428,   429,   432,   433,   434,
     437,   438,   441,   442,   445,   446,   449,   450,   453,   454,
     457,   458,   463,   466,   467,   468,   469,   470,   471,   472,
     473,   477,   478,   479,   482,   483,   486,   489,   492,   493,
     497,   498,   502,   505,   506,   507,   508,   511,   512,   515,
     516,   517,   518,   521,   522,   523,   524,   546,   547,   548,
     549,   553,   554,   557,   558,   561,   562,   565,   566,   569,
     572,   590,   591,   592,   593,   596,   597,   615,   616,   619,
     620,   624,   625,   628,   631,   634,   635,   636,   637,   638,
     639,   642,   643,   644,   645,   646,   649,   650,   651,   652,
     653,   654,   655,   656,   657,   658,   659,   661,   664,   667,
     670,   673,   674,   675,   676,   677,   678,   679,   682,   685,
     688,   692,   695,   696,   697,   698,   701,   702,   705,   706,
     709,   713,   714,   717,   720,   723,   726,   729,   732,   733,
     734,   735,   736,   737,   738,   739,   742,   743,   744,   745,
     746,   747,   748,   749,   752,   753,   756,   759,   760,   763,
     764,   767,   768,   771,   772,   775,   778,   781,   782,   783,
     786,   787,   790,   794,   813,   814,   817,   818,   819,   820,
     821,   822,   823,   826,   827,   830,   831,   836,   837,   840,
     841,   844,   845,   846,   847,   848,   849,   855,   856,   857,
     858,   861,   862,   866,   869,   870,   873,   876,   877,   880,
     883,   884,   885,   888,   889,   890,   891,   892,   893,   894,
     895,   896,   897,   898,   899,   902,   903,   906,   907,   910,
     911,   914,   915,   918,   919,   922,   923,   926,   927,   928,
     931,   932,   933,   934,   935,   936,   939,   940,   941,   942,
     945,   946,   947,   950,   951,   952,   953,   956,   957,   958,
     959,   960,   963,   966,   969,   970,   971,   972,   975,   976,
     977,   978,   981,   984,   987,   988,   989,   990,   993
};
#endif

#if YYDEBUG || YYERROR_VERBOSE || 0
/* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
   First, the terminals, then, starting at YYNTOKENS, nonterminals.  */
static const char *const yytname[] =
{
  "$end", "error", "$undefined", "COMMENT", "LITERAL", "IDENTIFIER",
  "ERROR", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE",
  "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE",
  "ELSE", "ENUM", "EXTENDS", "FINALLY", "FINAL", "FLOAT", "FOR", "IF",
  "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG",
  "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN",
  "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS",
  "THROWS", "THROW", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "ET",
  "GT", "LT", "NT", "TLD", "QM", "COLON", "AR", "EQEQ", "GREQ", "LEQ",
  "NEQ", "INCR", "DECR", "OR", "AND", "ADD", "SBTR", "MULT", "DIV", "BOR",
  "BAND", "POW", "MOD", "GRGR", "LTLT", "GRGRGR", "PLEQ", "SBEQ", "MULEQ",
  "ANDEQ", "OREQ", "POWEQ", "DIVEQ", "MODEQ", "DGRGR", "DLRLR", "TGRGRGR",
  "LCB", "RCB", "LSQB", "RSQB", "LSMB", "RSMB", "CMA", "DCLN", "ATR",
  "TDT", "FST", "SCLN", "DST", "$accept", "Identifier", "Literal", "Type",
  "PrimitiveType", "NumericType", "IntegralType", "FloatingPointType",
  "ReferenceType", "ClassOrInterfaceType", "ClassType", "InterfaceType",
  "ArrayType", "Name", "SimpleName", "QualifiedName", "CompilationUnit",
  "ImportDeclarationRec", "TypeDeclarationRec", "PackageDeclaration",
  "ImportDeclaration", "SingleTypeImportDeclaration",
  "TypeImportOnDemandDeclaration", "TypeDeclaration", "Modifiers",
  "Modifier", "ClassDeclaration", "Super", "Interfaces",
  "InterfaceTypeList", "ClassBody", "ClassBodyDeclarationRec",
  "ClassBodyDeclaration", "ClassMemberDeclaration", "FieldDeclaration",
  "VariableDeclarators", "VariableDeclarator", "VariableDeclaratorId",
  "VariableInitializer", "MethodDeclaration", "MethodHeader",
  "MethodDeclarator", "FormalParameterList", "FormalParameter", "Throws",
  "ClassTypeList", "MethodBody", "StaticInitializer",
  "ConstructorDeclaration", "ConstructorDeclarator", "ConstructorBody",
  "ExplicitConstructorInvocation", "InterfaceDeclaration",
  "ExtendsInterfaces", "InterfaceBody", "InterfaceMemberDeclarationRec",
  "InterfaceMemberDeclaration", "ConstantDeclaration",
  "AbstractMethodDeclaration", "ArrayInitializer",
  "VariableInitializerList", "Block", "BlockStatements", "BlockStatement",
  "LocalVariableDeclarationStatement", "LocalVariableDeclaration",
  "Statement", "StatementNoShortIf",
  "StatementWithoutTrailingSubstatement", "EmptyStatement",
  "LabeledStatement", "LabeledStatementNoShortIf", "ExpressionStatement",
  "StatementExpression", "IfThenStatement", "IfThenElseStatement",
  "IfThenElseStatementNoShortIf", "SwitchStatement", "SwitchBlock",
  "SwitchBlockStatementGroups", "SwitchLabels",
  "SwitchBlockStatementGroup", "SwitchLabel", "WhileStatement",
  "WhileStatementNoShortIf", "DoStatement", "ForStatement",
  "ForStatementNoShortIf", "BasicForStatement",
  "BasicForStatementNoShortIf", "ForInit", "ForUpdate",
  "StatementExpressionList", "BreakStatement", "ContinueStatement",
  "ReturnStatement", "ThrowStatement", "SynchronizedStatement",
  "TryStatement", "Catches", "CatchClause", "Finally", "Primary",
  "PrimaryNoNewArray", "ClassInstanceCreationExpression", "ArgumentList",
  "FieldAccess", "ArrayAccess", "MethodInvocation",
  "ArrayCreationExpression", "DimExprs", "DimExpr", "Dims", "Expression",
  "AssignmentExpression", "Assignment", "LeftHandSide",
  "AssignmentOperator", "ConditionalExpression", "ConditionalOrExpression",
  "ConditionalAndExpression", "InclusiveOrExpression",
  "ExclusiveOrExpression", "AndExpression", "EqualityExpression",
  "RelationalExpression", "ShiftExpression", "AdditiveExpression",
  "MultiplicativeExpression", "UnaryExpression", "PreIncrementExpression",
  "PreDecrementExpression", "UnaryExpressionNotPlusMinus",
  "PostfixExpression", "PostIncrementExpression",
  "PostDecrementExpression", "CastExpression", "ConstantExpression", YY_NULLPTR
};
#endif

# ifdef YYPRINT
/* YYTOKNUM[NUM] -- (External) token number corresponding to the
   (internal) symbol number NUM (which must be that of a token).  */
static const yytype_uint16 yytoknum[] =
{
       0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
     315,   316,   317,   318,   319,   320,   321,   322,   323,   324,
     325,   326,   327,   328,   329,   330,   331,   332,   333,   334,
     335,   336,   337,   338,   339,   340,   341,   342,   343,   344,
     345,   346,   347,   348,   349,   350,   351,   352,   353,   354,
     355,   356,   357,   358,   359,   360,   361,   362
};
# endif

#define YYPACT_NINF -485

#define yypact_value_is_default(Yystate) \
  (!!((Yystate) == (-485)))

#define YYTABLE_NINF -342

#define yytable_value_is_error(Yytable_value) \
  0

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
static const yytype_int16 yypact[] =
{
    1816,  -485,    51,  -485,    51,    51,  -485,    51,  -485,  -485,
    -485,  -485,  -485,  -485,  -485,  -485,    86,  2625,  2642,  2625,
    -485,  -485,  -485,  -485,  3248,  -485,  -485,  -485,  -485,    23,
    -485,   210,  -485,  -485,    11,    98,  -485,  2642,  -485,  -485,
    2625,  2642,    51,    51,  -485,    51,    51,  3027,    18,    95,
    -485,    51,  -485,   -16,    51,  3078,   -33,  -485,  -485,  2642,
      23,    11,  -485,  -485,   109,  -485,  -485,   121,  -485,  -485,
    -485,  -485,  -485,  -485,  -485,  -485,   130,    51,  -485,    51,
     147,  -485,  -485,  -485,  -485,  -485,   170,   -39,   180,  3231,
    3129,  -485,  -485,  -485,  -485,    53,  -485,  -485,    19,    95,
    -485,  -485,  -485,  -485,  -485,  -485,  3231,  -485,   179,  3180,
    -485,  -485,  -485,    51,  -485,    18,    95,  -485,   -33,  -485,
      51,  2048,  -485,   191,   -12,   191,    16,  -485,    -5,   -12,
     194,   208,   241,   653,    51,    51,    19,  -485,  -485,  -485,
    -485,  -485,    51,  2122,   204,  -485,  -485,  -485,  -485,  -485,
    -485,    95,  -485,  -485,  -485,  -485,  -485,    14,    21,   426,
     251,   256,   534,   638,   257,   272,   281,  -485,  2949,   130,
     283,  2949,  2949,  -485,  2949,  -485,   284,  -485,    51,    92,
    -485,  2196,  -485,  -485,   282,  -485,  -485,  -485,  -485,  -485,
     287,  -485,  -485,  -485,  -485,  -485,  -485,  -485,  -485,  -485,
    -485,  -485,  -485,  -485,   291,   292,   133,   315,  1873,   168,
    -485,  -485,  1947,  -485,  -485,   195,   227,   261,  1374,   318,
    -485,    51,  -485,  2930,   313,  -485,  -485,  -485,  -485,  -485,
      51,   233,  -485,   -12,    28,   -12,   204,  -485,  -485,   323,
     138,   317,  -485,  2270,  2344,  -485,  -485,  -485,   319,  -485,
     322,  1649,   379,  1006,  2949,   340,   340,   339,  2949,  2949,
    2949,  2949,  2895,  -485,  -485,  -485,   333,  -485,  -485,  -485,
     125,   368,   364,   365,   372,   103,   246,   239,   262,    69,
    -485,  -485,  -485,  -485,   195,  -485,  -485,  -485,    51,  2949,
    2949,   345,    70,  2949,   112,  -485,  -485,  -485,  -485,   346,
     426,  -485,   351,  1445,  1583,  -485,  -485,  -485,  -485,    51,
    2949,  -485,  -485,  -485,  -485,  -485,  -485,  -485,  -485,  -485,
    -485,  -485,  -485,  2949,  -485,  -485,  -485,   240,  -485,  -485,
    2638,  -485,  -485,  -485,  -485,   358,  -485,   534,  -485,  -485,
    -485,  -485,    51,  2698,  2705,  -485,  2418,  -485,  -485,  -485,
    2949,   357,  1023,  -485,  -485,   353,   359,   361,  2949,   367,
    -485,   367,  2757,  -485,  -485,  -485,  -485,   156,  2631,   362,
    -485,  2949,  2949,  2949,  2949,  2949,  2949,  2949,  2949,   534,
    2949,  2949,  2949,  2949,  2949,  2949,  2949,  2949,  2949,  2949,
    2949,  2949,   371,   376,   380,  -485,   382,   130,    70,  -485,
    -485,   384,  -485,  -485,   369,  -485,   242,  -485,   386,   373,
    -485,  -485,  -485,   390,  -485,   122,  -485,  -485,   387,   245,
     388,   258,  -485,  2949,   146,   391,  1025,   763,  1675,   400,
    2947,  -485,   403,   403,  -485,   264,   405,  2949,   161,  2947,
     175,  1139,   425,   368,   364,   365,   372,   103,   246,   246,
     147,  -485,   239,   239,   239,   239,   262,   262,   262,    69,
      69,  -485,  -485,  -485,  2776,   409,   130,   534,  -485,  -485,
    -485,   426,  -485,  -485,  2949,  2824,  -485,  -485,  -485,  2876,
    -485,   399,  -485,   406,   411,   426,   413,   359,   201,   314,
     408,  -485,   416,   417,   418,   456,  -485,   499,   503,  -485,
    -485,  -485,  -485,  -485,  -485,  -485,   428,  -485,  -485,  2949,
    1139,  -485,  2949,  -485,   273,    27,  -485,  -485,   429,  -485,
    -485,  -485,   275,  -485,  -485,  -485,  -485,   427,  -485,   426,
     426,   431,   426,   434,   348,  2546,  2949,  2949,  1675,   426,
    -485,  -485,  -485,  -485,  -485,  2949,   475,  -485,    39,  1900,
    -485,  -485,   130,  -485,  -485,  -485,  -485,   426,  -485,   426,
     426,   441,  2548,   436,   444,   446,  -485,  -485,  -485,   488,
    -485,  -485,  1974,  -485,  -485,  2492,  -485,  -485,  -485,  -485,
    -485,   426,   453,   455,  2564,  1675,  1675,  -485,  -485,  -485,
    1675,   462,   871,  1041,   457,   543,  -485,  -485,  1675,  1675,
     465,  1675,   466,  1199,  1675,  -485,  -485,  1675,  -485,  1675,
    1675,   468,  -485,  -485,  -485,  -485,  1675,  -485
};

  /* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
     Performed when YYTABLE does not specify something else to do.  Zero
     means the default is an error.  */
static const yytype_uint16 yydefact[] =
{
      36,    55,     0,    56,     0,     0,    57,     0,    53,    52,
      51,    54,    58,    59,    60,    48,     0,    34,    32,    35,
      37,    42,    43,    39,     0,    49,    46,    47,     2,     0,
      27,     0,    25,    26,     0,     0,     1,    30,    38,    40,
      33,    31,     0,     0,    50,     0,     0,     0,     0,     0,
      68,     0,    44,     0,     0,     0,     0,   130,    41,    29,
       0,     0,    20,    69,    19,    21,    71,    70,     6,    10,
      13,    16,    15,    12,    14,    11,    54,     0,    73,     0,
       4,     7,     8,     9,     5,    17,    18,    19,    25,     0,
       0,    75,    77,    80,    81,     0,    78,    79,     0,     0,
      66,    64,    28,    45,   131,   134,     0,   139,     0,     0,
     135,   137,   138,     0,   128,     0,     0,    67,     0,   129,
       0,     0,   112,     0,   100,    88,     0,    84,    86,    96,
       0,     0,     0,     0,     0,     0,     0,    74,    76,   111,
      92,   110,     0,     0,     0,   116,    62,   140,   133,   136,
     132,     0,    65,    63,   127,    72,     3,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   247,     0,     0,
       0,     0,     0,   148,     0,   177,    27,   246,     0,   280,
     166,     0,   150,   151,     0,   152,   155,   167,   156,   168,
       0,   157,   158,   169,   159,   170,   160,   206,   171,   172,
     173,   175,   174,   176,   338,   244,   249,   250,   251,   252,
     245,   181,     0,   182,   183,     0,   184,   185,     0,     0,
      98,     0,    83,     0,     0,    94,    22,    24,    23,   118,
       0,     0,   104,    99,     0,    95,     0,   115,   108,   107,
       0,   247,   122,     0,     0,   114,    61,   230,     0,   232,
       0,   339,     0,     0,     0,     0,    20,     0,     0,     0,
       0,     0,     0,   233,   249,   252,     0,   276,   278,   277,
     295,   297,   299,   301,   303,   305,   307,   310,   316,   320,
     323,   327,   328,   331,   334,   340,   341,   337,     0,     0,
       0,     0,     0,     0,   339,   250,   251,   332,   333,     0,
       0,    88,   154,     0,     0,   147,   149,   153,   180,     0,
       0,   283,   287,   288,   284,   292,   294,   293,   285,   286,
     290,   289,   291,     0,   342,   343,   102,     0,   103,    85,
       0,    87,    91,    90,    89,   106,   117,     0,    97,    82,
      93,   113,     0,     0,     0,   121,     0,   120,   229,   231,
       0,     0,     0,   225,   228,     0,   224,     0,     0,   268,
     272,   270,     0,   336,   335,   329,   330,     0,   339,     0,
     234,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,   258,     0,     0,   235,     0,     0,   237,   241,
     238,     0,   248,   178,     0,   262,     0,   255,   257,     0,
     279,   101,   144,     0,   146,     0,   105,   109,     0,     0,
       0,     0,   119,     0,     0,     0,     0,     0,     0,     0,
       0,   271,   267,   269,   254,     0,     0,     0,     0,     0,
       0,   248,     0,   298,   300,   302,   304,   306,   308,   309,
       0,   315,   312,   311,   314,   313,   318,   317,   319,   321,
     322,   324,   325,   326,     0,     0,     0,     0,   243,   240,
     239,     0,   259,   261,     0,     0,   260,   142,   143,     0,
     126,     0,   124,     0,     0,     0,     0,   226,     0,     0,
       0,   227,     0,     0,     0,    27,   188,     0,   155,   162,
     163,   164,   165,   207,   273,   274,     0,   253,   346,     0,
       0,   345,     0,   266,     0,     0,   191,   236,     0,   203,
     256,   264,     0,   141,   145,   125,   123,     0,   215,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     275,   344,   347,   296,   265,     0,     0,   195,     0,     0,
     196,   198,     0,   263,   205,   211,   213,     0,   214,     0,
       0,     0,     0,     0,     0,     0,   179,   189,   348,     0,
     202,   194,     0,   197,   193,   200,   199,   242,   209,   210,
     212,     0,     0,     0,     0,     0,     0,   201,   192,   208,
       0,     0,     0,     0,     0,     0,   204,   223,     0,     0,
       0,     0,     0,     0,     0,   219,   221,     0,   222,     0,
       0,     0,   190,   217,   218,   220,     0,   216
};

  /* YYPGOTO[NTERM-NUM].  */
static const yytype_int16 yypgoto[] =
{
    -485,    -2,  -485,   -46,  -155,  -485,  -485,  -485,   192,   -31,
    -132,   -17,  -485,   248,    77,  -485,  -485,   553,   167,  -485,
      44,  -485,  -485,   140,   123,     4,  -485,   514,   -13,  -485,
      31,  -485,   485,  -485,    -1,   -63,   355,   350,  -314,  -485,
       0,     2,   363,  -329,  -107,  -485,  -485,  -485,  -485,   493,
    -111,  -485,  -485,   525,     3,  -485,   478,  -485,  -485,  -485,
    -485,   -74,  -101,  -177,  -485,  -248,   941,   748,  -350,  -485,
    -485,  -485,  -485,  -226,  -485,  -485,  -485,  -485,  -485,  -485,
      41,    43,  -484,  -485,  -485,  -485,  -485,  -485,  -485,  -485,
      57,  -418,  -247,  -485,  -485,  -485,  -485,  -485,  -485,  -485,
     197,   200,  -485,  -485,   189,  -312,  1429,  1503,   306,  -485,
     337,  -285,  -141,  1361,  -485,  -150,  -485,  -485,    88,  -485,
     229,   230,   235,   236,   228,     1,   -99,   -58,    35,  -160,
     397,   630,  -405,   721,   838,  1032,  -485,  -485
};

  /* YYDEFGOTO[NTERM-NUM].  */
static const yytype_int16 yydefgoto[] =
{
      -1,    30,   177,   178,    80,    81,    82,    83,    84,    85,
      63,    66,    86,   251,    32,    33,    16,    17,    18,    19,
      20,    21,    22,    23,    24,    25,    26,    48,    49,    67,
      50,    90,    91,    92,    93,   126,   127,   128,   331,    94,
      95,   124,   231,   232,   144,   239,   140,    96,    97,    98,
     145,   243,    27,    56,    57,   109,   110,   111,   112,   332,
     415,   180,   575,   182,   183,   184,   185,   497,   186,   187,
     188,   499,   189,   190,   191,   192,   500,   193,   516,   548,
     549,   550,   551,   194,   501,   195,   196,   502,   197,   503,
     355,   486,   487,   198,   199,   200,   201,   202,   203,   398,
     399,   400,   204,   205,   264,   406,   207,   208,   265,   210,
     359,   360,   432,   407,   267,   211,   212,   323,   269,   270,
     271,   272,   273,   274,   275,   276,   277,   278,   279,   280,
     281,   282,   283,   284,   285,   286,   287,   569
};

  /* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule whose
     number is the opposite.  If YYTABLE_NINF, syntax error.  */
static const yytype_int16 yytable[] =
{
      29,    79,   122,    34,   306,   353,   356,   255,   416,    79,
     238,   297,   298,   268,    62,    65,   414,   220,   268,    28,
     181,   141,   225,    65,   268,   237,    28,   354,    44,   236,
     257,   419,   421,   245,    54,    99,   511,   104,   142,   545,
      60,    61,   244,   135,    79,   546,    45,   116,    46,   102,
     435,   545,   223,    46,   107,   108,    28,   546,   132,   114,
     135,    38,    55,    79,   119,   576,    51,   306,   113,   142,
     531,   533,   234,   268,   431,   123,   431,   125,   498,   100,
     101,   129,    65,   396,    38,   219,    36,   230,   576,    65,
     103,   117,   224,    44,   397,   292,   150,   -19,   363,   364,
     365,   366,   151,   155,   268,   542,    55,   367,   107,   108,
      44,    62,   268,    47,   143,   302,   561,   221,    47,   176,
     247,   154,   222,   547,    88,   341,   338,   249,   340,   221,
     146,   256,   123,   125,   339,   571,   233,   235,   518,   268,
     268,   176,   346,   268,   389,   390,   152,   153,   121,   391,
     156,    28,   514,   268,   268,   248,   250,   176,    39,   139,
     268,  -339,  -339,   522,   591,   524,    88,    88,   377,   306,
      89,   378,   230,   268,   600,   602,   301,    39,   106,   176,
     268,    39,   246,   162,    37,   611,    41,   371,   498,   303,
      47,   304,   164,   268,   268,   167,   372,    51,   354,    39,
     268,   491,   268,    51,    58,   156,    28,    59,   268,   350,
     417,   304,   268,    89,    51,   171,   172,    51,   478,   301,
     433,   268,   120,   479,   450,   121,   438,   440,   301,   461,
     462,   463,   106,  -187,  -187,   498,   498,   343,   162,  -187,
     498,   176,   176,   288,   130,   174,   485,   164,   498,   498,
     167,   498,    31,   436,   498,    35,   437,   498,   506,   498,
     498,   509,   354,   354,   324,   325,   498,   131,  -186,  -186,
     171,   172,   506,   268,  -186,   510,   268,   508,   379,   133,
     268,   452,   453,   454,   455,   147,   392,   353,   356,   268,
     218,   230,   226,    64,    64,    87,  -340,  -340,   176,   143,
     174,   530,    64,    87,   380,   381,   227,   408,   354,   354,
     206,    62,   382,   383,   268,    51,    52,    53,   156,    28,
     384,   385,   386,   468,   268,   268,   456,   457,   458,   268,
    -341,  -341,   206,   336,   337,   387,   388,    87,    87,   228,
     411,   337,   473,   474,   176,   481,   474,   300,   206,   541,
     253,   162,   156,    28,    87,   254,   354,    87,   483,   474,
     164,    64,   288,   167,   507,   474,   354,   354,    64,   179,
     206,   289,  -281,   544,   474,   553,   474,   354,   448,   449,
     290,    87,   293,   171,   172,   162,   268,   268,   307,   310,
      64,   179,   517,   308,   164,   268,   309,   167,   306,  -281,
    -281,  -281,  -281,  -281,  -281,  -281,  -281,  -281,  -281,  -281,
      64,   334,   268,   174,   532,   328,   344,   171,   172,   294,
     294,   230,   459,   460,   342,   348,   495,   209,   349,   179,
     156,    28,   206,   206,   268,   351,   157,   358,   362,   370,
     373,   374,   206,   158,   375,   159,   402,   174,   560,   209,
     376,   395,   221,   160,   161,   224,   423,   156,    28,   426,
     427,   428,   441,   162,   430,   209,    87,   472,   163,   176,
     464,   476,   164,   165,   166,   167,   465,   168,   577,   169,
     466,   467,   170,   176,   471,   475,   477,   209,   512,   206,
     162,   179,   179,   480,   482,   171,   172,   488,   504,   164,
     506,   179,   167,   505,   515,   525,   294,   294,   294,   294,
     368,   527,   526,   529,   534,   535,   536,   537,   213,   538,
     539,   121,   171,   172,  -161,   174,   540,   176,   176,   552,
     176,   557,   175,   554,   559,   206,   495,   176,   570,    28,
     213,   581,   584,    68,   585,    69,   586,   176,    70,   209,
     209,   587,   174,   590,    71,   176,   213,   176,   176,   209,
      72,   592,   598,   603,   604,   607,   609,    73,   616,    74,
     176,   451,    40,   176,   115,   138,   329,    75,   213,   176,
     335,   327,   136,   495,   495,    87,   118,   149,   495,   572,
      64,   573,   563,   361,   179,   469,   495,   495,   470,   495,
     543,   443,   495,   444,   447,   495,   209,   495,   495,   445,
       0,   446,     0,   206,   495,     0,   206,   206,     0,     0,
     294,   294,   294,   294,   294,   294,   294,    87,   294,   294,
     294,   294,   294,   294,   294,   294,   294,   294,   294,   294,
     213,   213,   156,    28,     0,     0,     0,     0,     0,     0,
     213,     0,   209,     0,     0,     0,     0,     0,    28,     0,
     206,     0,    68,     0,    69,     0,     0,    70,     0,     0,
       0,     0,     0,    71,   206,   162,     0,   206,   206,    72,
       0,     0,     0,     0,   164,   294,    73,   167,    74,   294,
       0,     0,     0,     0,     0,     0,    75,   213,   258,   259,
       0,     0,     0,     0,     0,     0,     0,   171,   172,     0,
       0,   260,   261,     0,     0,    87,     0,     0,   206,   206,
       0,   206,     0,   206,   206,     0,     0,   206,   206,     0,
     209,     0,     0,   209,   209,     0,     0,   262,   206,     0,
       0,     0,     0,   213,   263,     0,   206,     0,   206,   206,
       0,   214,     0,   229,     0,     0,     0,   294,   294,     0,
     294,   206,     0,     0,   206,     0,     0,   156,    28,     0,
     206,   206,     0,   214,   206,   206,     0,   209,     0,   206,
       0,   206,   206,   179,     0,     0,     0,   206,   206,   214,
     206,   209,   206,   206,   209,   209,   206,   179,   206,   206,
     162,     0,     0,     0,     0,   206,     0,     0,     0,   164,
       0,   214,   167,     0,     0,     0,     0,     0,     0,     0,
     179,   213,     0,   179,   213,   213,     0,     0,     0,     0,
       0,     0,   171,   172,     0,   209,   209,     0,   209,     0,
     209,   209,   215,     0,   209,   209,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   209,     0,     0,     0,     0,
       0,     0,   174,   209,   215,   209,   209,     0,   213,     0,
       0,     0,     0,   214,   214,   156,    28,     0,   209,     0,
     215,   209,   213,   214,     0,   213,   213,   209,   209,     0,
       0,   209,   209,     0,     0,     0,   209,     0,   209,   209,
       0,     0,   215,     0,   209,   209,     0,   209,   162,   209,
     209,     0,     0,   209,     0,   209,   209,   164,     0,     0,
     167,     0,   209,     0,     0,     0,   213,   213,     0,   213,
     214,   213,   213,     0,     0,   213,   213,     0,     0,     0,
     171,   172,     0,     0,     0,     0,   213,     0,     0,     0,
       0,     0,     0,     0,   213,     0,   213,   213,     0,   216,
       0,     0,     0,     0,   215,   215,     0,     0,     0,   213,
     174,   599,   213,     0,   215,     0,   214,     0,   213,   213,
       0,   216,   213,   213,     0,     0,     0,   213,     0,   213,
     213,     0,     0,     0,     0,   213,   213,   216,   213,     0,
     213,   213,     0,     0,   213,     0,   213,   213,     0,     0,
     156,    28,     0,   213,     0,    68,     0,    69,     0,   216,
      70,   215,     0,     0,     0,     0,    71,   156,    28,   156,
      28,     0,    72,     0,     0,     0,     0,     0,     0,    73,
       0,    74,     0,   162,     0,   156,    28,     0,     0,    75,
       0,     0,   164,     0,   214,   167,     0,   214,   214,     0,
     162,     0,   162,     0,     0,     0,     0,   215,     0,   164,
       0,   164,   167,     0,   167,   171,   172,     0,   162,     0,
       0,   216,   216,   258,   259,   258,   259,   164,     0,     0,
     167,   216,   171,   172,   171,   172,   260,   261,   260,   261,
     252,   214,     0,     0,     0,   174,     0,     0,     0,     0,
     171,   172,   352,     0,     0,   214,     0,     0,   214,   214,
       0,     0,   262,     0,   262,     0,     0,     0,     0,   424,
       0,   489,     0,     0,     0,     0,     0,     0,   216,     0,
     174,   601,     0,   156,    28,   215,     0,     0,   215,   215,
       0,     0,     0,   217,     0,     0,     0,     0,     0,   214,
     214,     0,   214,     0,   214,   214,     0,     0,   214,   214,
       0,     0,     0,     0,     0,   217,   162,     0,     0,   214,
       0,     0,     0,     0,   216,   164,     0,   214,   167,   214,
     214,   217,   215,     0,     0,     0,     0,     0,     0,   258,
     259,     0,   214,   156,    28,   214,   215,     0,     0,   215,
     215,   214,   214,   217,     0,   214,   214,     0,     0,     0,
     214,     0,   214,   214,     0,     0,     0,     0,   214,   214,
       0,   214,     0,   214,   214,     0,   162,   214,   262,   214,
     214,   403,     0,     0,     0,   164,   214,     0,   167,     0,
     215,   215,     0,   215,     0,   215,   215,     0,     0,   215,
     215,     0,   216,     0,     0,   216,   216,     0,   171,   172,
     215,     0,     0,     0,     0,   217,   217,     0,   215,     0,
     215,   215,     0,     0,     0,   217,   566,     0,     0,     0,
       0,     0,     0,   215,     0,     0,   215,     0,   174,   610,
       0,     0,   215,   215,     0,     0,   215,   215,     0,   216,
       0,   215,     0,   215,   215,     0,     0,     0,     0,   215,
     215,     0,   215,   216,   215,   215,   216,   216,   215,     0,
     215,   215,   217,   595,   596,     0,     0,   215,   597,     0,
       0,     0,     0,     0,     0,     0,   605,   606,     0,   608,
       0,     0,   612,     0,     0,   613,     0,   614,   615,     0,
       0,     0,     0,     0,   617,     0,     0,   216,   216,   496,
     216,     0,   216,   216,     0,     0,   216,   216,   217,    28,
       0,     0,     0,    68,     0,    69,     0,   216,    70,     0,
       0,     0,     0,     0,    71,   216,     0,   216,   216,     0,
      72,     0,     0,     0,     0,     0,     0,    73,     0,    74,
     216,     0,   519,   216,     0,     0,     0,    75,     0,   216,
     216,     0,     0,   216,   216,     0,   528,     0,   216,     0,
     216,   216,     0,     0,     0,     0,   216,   216,     0,   216,
       0,   216,   216,     0,     0,   216,     0,   216,   216,   156,
      28,     0,     0,     0,   216,     0,   217,     0,     0,   217,
     217,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     555,   556,     0,   558,   326,     0,     0,     0,     0,   403,
     567,     0,   162,     0,     0,     0,     0,     0,     0,     0,
       0,   164,     0,     0,   167,     0,     0,     0,   578,     0,
     579,   580,     0,   217,     0,   258,   259,     0,     0,     0,
       0,     0,     0,     0,   171,   172,     0,   217,   260,   261,
     217,   217,   589,     0,   266,     0,   496,   519,     0,   291,
       0,   528,     0,     0,     0,   299,     0,     0,     0,   555,
     556,     0,   558,   228,   262,   567,     0,     0,   578,     0,
     579,   580,     0,     0,     0,     0,     0,   589,     0,     0,
       0,   217,   217,     0,   217,     0,   217,   217,     0,     0,
     217,   217,     0,     0,     0,     0,     0,     0,     0,     0,
       0,   217,     0,     0,   333,     0,     0,   156,    28,   217,
       0,   217,   217,     0,     0,     0,     0,     0,     0,     0,
     295,   295,     0,     0,   217,     0,     0,   217,     0,     0,
       0,     0,     0,   217,   217,   357,     0,   217,   217,     0,
     162,     0,   217,   369,   217,   217,     0,     0,     0,   164,
     217,   217,   167,   217,     0,   217,   217,     0,     0,   217,
       0,   217,   217,   258,   259,     0,     0,     0,   217,     0,
     393,   394,   171,   172,   401,     0,   260,   261,     0,     0,
       0,     0,     0,     0,   404,     0,     0,     0,     0,     0,
       0,   409,     0,     0,   296,   296,     0,     0,     0,   156,
      28,     0,   262,   405,   410,   157,     0,   295,   295,   295,
     295,   333,   158,     0,   159,     0,     0,     0,     0,     0,
       0,     0,   492,   493,     0,     0,  -280,     0,     0,     0,
       0,   404,   162,   425,     0,     0,     0,   163,     0,   429,
       0,   164,   165,   166,   167,     0,   168,     0,   169,     0,
       0,   494,   442,  -280,  -280,  -280,  -280,  -280,  -280,  -280,
    -280,  -280,  -280,  -280,   171,   172,   350,     0,   304,     0,
       0,     0,     0,     0,    51,     0,     0,     0,     0,     0,
       0,   296,   296,   296,   296,     0,     0,     0,     0,     0,
     121,     0,     0,     0,   174,     0,     0,     0,     0,     0,
       0,   175,     0,     0,   484,     0,     0,   490,     0,     0,
       0,   429,     0,     0,     0,     0,     0,     0,     0,     0,
     404,   295,   295,   295,   295,   295,   295,   295,     0,   295,
     295,   295,   295,   295,   295,   295,   295,   295,   295,   295,
     295,     0,     0,     1,     0,     0,     0,     0,     0,     0,
       0,     2,     0,     0,     0,   520,     0,     0,     0,     0,
     333,     3,     0,     0,     0,     0,     0,     4,     0,     0,
       5,     0,     6,     0,     7,     8,     9,    10,     0,     0,
      11,     0,     0,     0,    12,     0,   295,     0,    13,     0,
     295,    14,     0,     0,     0,   296,   296,   296,   296,   296,
     296,   296,     0,   296,   296,   296,   296,   296,   296,   296,
     296,   296,   296,   296,   296,     0,     0,   564,   565,     0,
       0,     0,     0,     0,   156,    28,   568,     0,     0,    68,
     157,    69,   545,     0,    70,     0,     0,   158,   546,   159,
      71,     0,    15,   583,     0,     0,    72,   160,   161,     0,
    -282,     0,     0,    73,     0,    74,     0,   162,   295,   295,
     296,   295,   163,    75,   296,   594,   164,   165,   166,   167,
       0,   168,     0,   169,     0,     0,   170,  -282,  -282,  -282,
    -282,  -282,  -282,  -282,  -282,  -282,  -282,  -282,     0,   171,
     172,     0,     0,     0,     0,     0,     0,     0,   156,    28,
       0,     0,     0,    68,   157,    69,   545,     0,    70,     0,
       0,   158,   546,   159,    71,   121,   574,     0,     0,   174,
      72,   160,   161,     0,   311,     0,   175,    73,     0,    74,
       0,   162,   296,   296,     0,   296,   163,    75,     0,     0,
     164,   165,   166,   167,     0,   168,     0,   169,     0,     0,
     170,   312,   313,   314,   315,   316,   317,   318,   319,   320,
     321,   322,     0,   171,   172,     0,     0,     0,     0,     0,
       0,     0,   156,    28,     0,     0,     0,    68,   157,    69,
       0,     0,    70,     0,     0,   158,     0,   159,    71,   121,
     588,     0,     0,   174,    72,   160,   161,     0,     0,     0,
     175,    73,     0,    74,     0,   162,     0,     0,     0,     0,
     163,    75,     0,     0,   164,   165,   166,   167,     0,   168,
       0,   169,     0,     0,   170,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   171,   172,     0,
       0,     0,     0,     0,     0,     0,   156,    28,     0,     0,
       0,    68,   157,    69,     0,     0,    70,     0,     0,   158,
       0,   159,    71,   121,   173,     0,     0,   174,    72,   160,
     161,     0,     0,     0,   175,    73,     0,    74,     0,   162,
       0,     0,     0,     0,   163,    75,     0,     0,   240,   165,
     166,   241,     0,   168,     0,   169,     0,     0,   170,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,   171,   172,     0,     0,     0,     0,     0,     0,     0,
     156,    28,     0,     0,     0,    68,   157,    69,     0,     0,
      70,     0,     0,   158,     0,   159,    71,   121,   242,     0,
       0,   174,    72,   160,   161,     0,     0,     0,   175,    73,
       0,    74,     0,   162,     0,     0,     0,     0,   163,    75,
       0,     0,   164,   165,   166,   167,     0,   168,     0,   169,
       0,     0,   170,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   171,   172,     0,     0,     0,
       0,     0,     0,     0,   156,    28,     0,     0,     0,    68,
     157,    69,     0,     0,    70,     0,     0,   158,     0,   159,
      71,   121,   305,     0,     0,   174,    72,   160,   161,     0,
       0,     0,   175,    73,     0,    74,     0,   162,     0,     0,
       0,     0,   163,    75,     0,     0,   164,   165,   166,   167,
       0,   168,     0,   169,     0,     0,   170,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   171,
     172,     0,     0,     0,     0,     0,     0,     0,   156,    28,
       0,     0,     0,    68,   157,    69,     0,     0,    70,     0,
       0,   158,     0,   159,    71,   121,   345,     0,     0,   174,
      72,   160,   161,     0,     0,     0,   175,    73,     0,    74,
       0,   162,     0,     0,     0,     0,   163,    75,     0,     0,
     164,   165,   166,   167,     0,   168,     0,   169,     0,     0,
     170,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,   171,   172,     0,     0,     0,     0,     0,
       0,     0,   156,    28,     0,     0,     0,    68,   157,    69,
       0,     0,    70,     0,     0,   158,     0,   159,    71,   121,
     347,     0,     0,   174,    72,   160,   161,     0,     0,     0,
     175,    73,     0,    74,     0,   162,     0,     0,     0,     0,
     163,    75,     0,     0,   164,   165,   166,   167,     0,   168,
       0,   169,     0,     0,   170,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   171,   172,     0,
       0,     0,     0,     0,     0,     0,   156,    28,     0,     0,
       0,    68,   157,    69,     0,     0,    70,     0,     0,   158,
       0,   159,    71,   121,   422,     0,     0,   174,    72,   160,
     161,     0,     0,     0,   175,    73,     0,    74,     0,   162,
       0,     0,     0,     0,   163,    75,     0,     0,   164,   165,
     166,   167,     0,   168,     0,   169,     0,     0,   170,     0,
     156,    28,   156,    28,     0,    68,     0,    69,     0,     0,
      70,   171,   172,     0,     0,     0,    71,     0,   156,    28,
       0,     0,    72,     0,     0,     0,     0,     0,     0,    73,
       0,    74,     0,   162,     0,   162,     0,   121,     0,    75,
       0,   174,   164,     0,   164,   167,     0,   167,   175,     0,
       0,   162,     0,     0,     0,     0,     0,     0,   258,   259,
     164,     0,     0,   167,     0,   171,   172,   171,   172,     0,
       0,   260,   261,     0,   258,   259,     0,     0,     0,     0,
       0,     0,     1,   171,   172,     0,     0,   260,   261,     0,
       2,     0,   156,    28,     0,   174,     0,   262,     0,     1,
       3,     0,   562,     0,   582,     0,     4,     2,     0,     5,
       0,     6,     0,   262,     8,     9,    10,     3,     0,    11,
     593,     0,     0,    12,     0,   162,     5,    13,     6,     0,
      14,     8,     9,    10,   164,     0,    11,   167,  -280,     0,
      12,     0,     0,     0,    13,     0,     0,    14,   258,   259,
       0,     0,   156,    28,     0,     0,     0,   171,   172,   156,
      28,   260,   261,     0,     0,  -280,  -280,  -280,  -280,  -280,
    -280,  -280,  -280,  -280,  -280,  -280,     0,     0,   439,     0,
     304,    15,     0,   330,   412,   162,    51,   262,     0,   413,
       0,     0,   162,     0,   164,     0,     0,   167,    15,     0,
       0,   164,     0,     0,   167,     0,     0,     0,   258,   259,
       0,   156,    28,     0,     0,   258,   259,   171,   172,     0,
       0,   260,   261,     0,   171,   172,     0,     0,   260,   261,
     156,    28,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   162,     0,     0,   262,   418,     0,
       0,     0,     0,   164,   262,   420,   167,     0,     0,     0,
       0,     0,     0,   162,     0,     0,     0,   258,   259,     0,
       0,     0,   164,     0,     0,   167,   171,   172,   156,    28,
     260,   261,     0,     0,     0,     0,   258,   259,     0,     0,
       0,     0,     0,     0,     0,   171,   172,     0,     0,   260,
     261,     0,     0,     0,     0,     0,   262,   434,     0,     0,
       0,   162,     0,     0,     0,     0,     0,     0,     0,     0,
     164,     0,     0,   167,     0,   262,   513,     0,     0,     0,
     156,    28,     0,     0,   258,   259,     0,     0,     0,     0,
       0,     0,     0,   171,   172,     0,     0,   260,   261,   156,
      28,     0,     0,     0,    68,     0,    69,     0,     0,    70,
       0,     0,     0,   162,     0,    71,     0,     0,     0,     0,
       0,    72,   164,   262,   521,   167,     0,     0,    73,     0,
      74,     0,   162,     0,   156,    28,   258,   259,    75,     0,
       0,   164,     0,     0,   167,   171,   172,     0,     0,   260,
     261,   156,    28,   156,    28,   258,   259,     0,     0,     0,
       0,     0,     0,     0,   171,   172,     0,   162,   260,   261,
       0,   330,   523,     0,     0,   262,   164,     0,     0,   167,
       0,     0,     0,     0,   162,     0,   162,     0,     0,     0,
     258,   259,     0,   164,   262,   164,   167,     0,   167,   171,
     172,     0,     0,   260,   261,     0,     0,   258,   259,   258,
     259,     0,     0,     0,     0,     0,   171,   172,   171,   172,
     260,   261,   260,   261,     0,   330,     0,     0,     0,   262,
       0,     0,    28,     0,     1,     0,    68,     0,    69,     0,
       0,    70,     0,     0,     0,   505,   262,    71,   262,     0,
       0,     0,     3,    72,     0,     0,     0,     0,     0,     0,
      73,     0,    74,     6,     0,     0,     8,     9,    10,     0,
      75,    76,     0,     0,     0,    12,     0,     0,     0,    13,
       0,    77,    14,    28,     0,     1,     0,    68,     0,    69,
       0,     0,    70,     0,     0,     0,     0,     0,    71,     0,
       0,     0,     0,     3,    72,     0,     0,     0,     0,     0,
       0,    73,     0,    74,     6,     0,     0,     8,     9,    10,
       0,    75,    11,    78,     0,     0,    12,     0,     0,     0,
      13,     0,    77,    14,    28,     0,     1,     0,    68,     0,
      69,     0,     0,    70,     0,     0,     0,     0,     0,    71,
       0,     0,     0,     0,     3,    72,     0,     0,     0,     0,
       0,     0,    73,     0,    74,     6,     0,     0,     8,     9,
      10,     0,    75,    76,   105,     0,     0,    12,     0,     0,
       0,    13,     0,    77,    14,    28,     0,     1,     0,    68,
       0,    69,     0,     0,    70,     0,     0,     0,     0,     0,
      71,     0,     0,     0,     0,     3,    72,     0,     0,     0,
       0,     0,     0,    73,     0,    74,     6,     0,     0,     8,
       9,    10,     0,    75,    11,   137,     0,     0,    12,     0,
       0,     0,    13,     0,    77,    14,    28,     0,     1,     0,
      68,     0,    69,     0,     0,    70,     0,     0,     0,     0,
       0,    71,     0,     0,     0,     1,     3,    72,     0,     0,
       0,     0,     0,    42,    73,     0,    74,     6,     0,     0,
       8,     9,    10,     3,    75,    11,   148,     0,     0,    12,
       0,     0,    43,    13,     6,   134,    14,     8,     9,    10,
       0,     0,    11,     0,     0,     0,    12,     0,     0,     0,
      13,     0,     0,    14
};

static const yytype_int16 yycheck[] =
{
       2,    47,    76,     5,   181,   253,   253,   162,   337,    55,
     142,   171,   172,   163,    45,    46,   330,   124,   168,     5,
     121,    95,   129,    54,   174,   136,     5,   253,    24,   136,
     162,   343,   344,   144,    23,    48,   441,    54,    50,    12,
      42,    43,   143,    89,    90,    18,    23,    60,    30,    51,
     362,    12,    57,    30,    55,    55,     5,    18,    97,    56,
     106,    17,    95,   109,    61,   549,   105,   244,   101,    50,
     488,   489,   135,   223,   359,    77,   361,    79,   428,    48,
      49,    79,   113,    13,    40,    97,     0,   133,   572,   120,
     106,    60,    97,    89,    24,   169,   113,     5,   258,   259,
     260,   261,   115,   120,   254,   510,    95,   262,   109,   109,
     106,   142,   262,    95,    95,   178,   534,   101,    95,   121,
     106,   118,   106,    96,    47,   236,   233,   106,   235,   101,
      99,   162,   134,   135,   106,    96,   134,   135,   467,   289,
     290,   143,   243,   293,    75,    76,   115,   116,    95,    80,
       4,     5,   464,   303,   304,   157,   158,   159,    18,   106,
     310,    69,    70,   475,   582,   479,    89,    90,    65,   346,
      47,    68,   218,   323,   592,   593,   178,    37,    55,   181,
     330,    41,   151,    37,    17,   603,    19,    62,   538,    97,
      95,    99,    46,   343,   344,    49,    71,   105,   424,    59,
     350,   427,   352,   105,   106,     4,     5,    40,   358,    97,
     342,    99,   362,    90,   105,    69,    70,   105,    96,   221,
     361,   371,   101,   101,   379,    95,   367,   368,   230,   389,
     390,   391,   109,   100,   101,   585,   586,    99,    37,   106,
     590,   243,   244,   105,    97,    99,   100,    46,   598,   599,
      49,   601,     4,    97,   604,     7,   100,   607,    97,   609,
     610,   100,   488,   489,    69,    70,   616,    97,   100,   101,
      69,    70,    97,   423,   106,   100,   426,   437,    32,    99,
     430,   380,   381,   382,   383,   106,   288,   535,   535,   439,
      99,   337,    98,    45,    46,    47,    69,    70,   300,    95,
      99,   100,    54,    55,    58,    59,    98,   309,   534,   535,
     121,   342,    66,    67,   464,   105,   106,   107,     4,     5,
      81,    82,    83,   397,   474,   475,   384,   385,   386,   479,
      69,    70,   143,   100,   101,    73,    74,    89,    90,    98,
     100,   101,   100,   101,   346,   100,   101,    63,   159,   509,
      99,    37,     4,     5,   106,    99,   582,   109,   100,   101,
      46,   113,   105,    49,   100,   101,   592,   593,   120,   121,
     181,    99,    57,   100,   101,   100,   101,   603,   377,   378,
      99,   133,    99,    69,    70,    37,   536,   537,   106,    97,
     142,   143,   466,   106,    46,   545,   105,    49,   575,    84,
      85,    86,    87,    88,    89,    90,    91,    92,    93,    94,
     162,    98,   562,    99,   100,    97,    99,    69,    70,   171,
     172,   467,   387,   388,   101,   106,   428,   121,   106,   181,
       4,     5,   243,   244,   584,    56,    10,    97,    99,   106,
      72,    77,   253,    17,    79,    19,   100,    99,   100,   143,
      78,   106,   101,    27,    28,    97,    99,     4,     5,   106,
     101,   100,   100,    37,    97,   159,   218,    98,    42,   471,
      99,    98,    46,    47,    48,    49,   100,    51,   552,    53,
     100,    99,    56,   485,   100,    99,    96,   181,    63,   300,
      37,   243,   244,   106,   106,    69,    70,   106,    98,    46,
      97,   253,    49,    98,    95,   106,   258,   259,   260,   261,
     262,   100,   106,   100,   106,    99,    99,    99,   121,    63,
      21,    95,    69,    70,    21,    99,    98,   529,   530,   100,
     532,   100,   106,   106,   100,   346,   538,   539,    63,     5,
     143,   100,   106,     9,   100,    11,   100,   549,    14,   243,
     244,    63,    99,   100,    20,   557,   159,   559,   560,   253,
      26,   106,   100,   106,    21,   100,   100,    33,   100,    35,
     572,   379,    19,   575,    60,    90,   221,    43,   181,   581,
     230,   218,    89,   585,   586,   337,    61,   109,   590,   548,
     342,   548,   535,   256,   346,   398,   598,   599,   398,   601,
     512,   372,   604,   373,   376,   607,   300,   609,   610,   374,
      -1,   375,    -1,   424,   616,    -1,   427,   428,    -1,    -1,
     372,   373,   374,   375,   376,   377,   378,   379,   380,   381,
     382,   383,   384,   385,   386,   387,   388,   389,   390,   391,
     243,   244,     4,     5,    -1,    -1,    -1,    -1,    -1,    -1,
     253,    -1,   346,    -1,    -1,    -1,    -1,    -1,     5,    -1,
     471,    -1,     9,    -1,    11,    -1,    -1,    14,    -1,    -1,
      -1,    -1,    -1,    20,   485,    37,    -1,   488,   489,    26,
      -1,    -1,    -1,    -1,    46,   437,    33,    49,    35,   441,
      -1,    -1,    -1,    -1,    -1,    -1,    43,   300,    60,    61,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    69,    70,    -1,
      -1,    73,    74,    -1,    -1,   467,    -1,    -1,   529,   530,
      -1,   532,    -1,   534,   535,    -1,    -1,   538,   539,    -1,
     424,    -1,    -1,   427,   428,    -1,    -1,    99,   549,    -1,
      -1,    -1,    -1,   346,   106,    -1,   557,    -1,   559,   560,
      -1,   121,    -1,   100,    -1,    -1,    -1,   509,   510,    -1,
     512,   572,    -1,    -1,   575,    -1,    -1,     4,     5,    -1,
     581,   582,    -1,   143,   585,   586,    -1,   471,    -1,   590,
      -1,   592,   593,   535,    -1,    -1,    -1,   598,   599,   159,
     601,   485,   603,   604,   488,   489,   607,   549,   609,   610,
      37,    -1,    -1,    -1,    -1,   616,    -1,    -1,    -1,    46,
      -1,   181,    49,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
     572,   424,    -1,   575,   427,   428,    -1,    -1,    -1,    -1,
      -1,    -1,    69,    70,    -1,   529,   530,    -1,   532,    -1,
     534,   535,   121,    -1,   538,   539,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,   549,    -1,    -1,    -1,    -1,
      -1,    -1,    99,   557,   143,   559,   560,    -1,   471,    -1,
      -1,    -1,    -1,   243,   244,     4,     5,    -1,   572,    -1,
     159,   575,   485,   253,    -1,   488,   489,   581,   582,    -1,
      -1,   585,   586,    -1,    -1,    -1,   590,    -1,   592,   593,
      -1,    -1,   181,    -1,   598,   599,    -1,   601,    37,   603,
     604,    -1,    -1,   607,    -1,   609,   610,    46,    -1,    -1,
      49,    -1,   616,    -1,    -1,    -1,   529,   530,    -1,   532,
     300,   534,   535,    -1,    -1,   538,   539,    -1,    -1,    -1,
      69,    70,    -1,    -1,    -1,    -1,   549,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,   557,    -1,   559,   560,    -1,   121,
      -1,    -1,    -1,    -1,   243,   244,    -1,    -1,    -1,   572,
      99,   100,   575,    -1,   253,    -1,   346,    -1,   581,   582,
      -1,   143,   585,   586,    -1,    -1,    -1,   590,    -1,   592,
     593,    -1,    -1,    -1,    -1,   598,   599,   159,   601,    -1,
     603,   604,    -1,    -1,   607,    -1,   609,   610,    -1,    -1,
       4,     5,    -1,   616,    -1,     9,    -1,    11,    -1,   181,
      14,   300,    -1,    -1,    -1,    -1,    20,     4,     5,     4,
       5,    -1,    26,    -1,    -1,    -1,    -1,    -1,    -1,    33,
      -1,    35,    -1,    37,    -1,     4,     5,    -1,    -1,    43,
      -1,    -1,    46,    -1,   424,    49,    -1,   427,   428,    -1,
      37,    -1,    37,    -1,    -1,    -1,    -1,   346,    -1,    46,
      -1,    46,    49,    -1,    49,    69,    70,    -1,    37,    -1,
      -1,   243,   244,    60,    61,    60,    61,    46,    -1,    -1,
      49,   253,    69,    70,    69,    70,    73,    74,    73,    74,
     159,   471,    -1,    -1,    -1,    99,    -1,    -1,    -1,    -1,
      69,    70,   106,    -1,    -1,   485,    -1,    -1,   488,   489,
      -1,    -1,    99,    -1,    99,    -1,    -1,    -1,    -1,   106,
      -1,   106,    -1,    -1,    -1,    -1,    -1,    -1,   300,    -1,
      99,   100,    -1,     4,     5,   424,    -1,    -1,   427,   428,
      -1,    -1,    -1,   121,    -1,    -1,    -1,    -1,    -1,   529,
     530,    -1,   532,    -1,   534,   535,    -1,    -1,   538,   539,
      -1,    -1,    -1,    -1,    -1,   143,    37,    -1,    -1,   549,
      -1,    -1,    -1,    -1,   346,    46,    -1,   557,    49,   559,
     560,   159,   471,    -1,    -1,    -1,    -1,    -1,    -1,    60,
      61,    -1,   572,     4,     5,   575,   485,    -1,    -1,   488,
     489,   581,   582,   181,    -1,   585,   586,    -1,    -1,    -1,
     590,    -1,   592,   593,    -1,    -1,    -1,    -1,   598,   599,
      -1,   601,    -1,   603,   604,    -1,    37,   607,    99,   609,
     610,   300,    -1,    -1,    -1,    46,   616,    -1,    49,    -1,
     529,   530,    -1,   532,    -1,   534,   535,    -1,    -1,   538,
     539,    -1,   424,    -1,    -1,   427,   428,    -1,    69,    70,
     549,    -1,    -1,    -1,    -1,   243,   244,    -1,   557,    -1,
     559,   560,    -1,    -1,    -1,   253,   538,    -1,    -1,    -1,
      -1,    -1,    -1,   572,    -1,    -1,   575,    -1,    99,   100,
      -1,    -1,   581,   582,    -1,    -1,   585,   586,    -1,   471,
      -1,   590,    -1,   592,   593,    -1,    -1,    -1,    -1,   598,
     599,    -1,   601,   485,   603,   604,   488,   489,   607,    -1,
     609,   610,   300,   585,   586,    -1,    -1,   616,   590,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,   598,   599,    -1,   601,
      -1,    -1,   604,    -1,    -1,   607,    -1,   609,   610,    -1,
      -1,    -1,    -1,    -1,   616,    -1,    -1,   529,   530,   428,
     532,    -1,   534,   535,    -1,    -1,   538,   539,   346,     5,
      -1,    -1,    -1,     9,    -1,    11,    -1,   549,    14,    -1,
      -1,    -1,    -1,    -1,    20,   557,    -1,   559,   560,    -1,
      26,    -1,    -1,    -1,    -1,    -1,    -1,    33,    -1,    35,
     572,    -1,   471,   575,    -1,    -1,    -1,    43,    -1,   581,
     582,    -1,    -1,   585,   586,    -1,   485,    -1,   590,    -1,
     592,   593,    -1,    -1,    -1,    -1,   598,   599,    -1,   601,
      -1,   603,   604,    -1,    -1,   607,    -1,   609,   610,     4,
       5,    -1,    -1,    -1,   616,    -1,   424,    -1,    -1,   427,
     428,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
     529,   530,    -1,   532,   100,    -1,    -1,    -1,    -1,   538,
     539,    -1,    37,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    46,    -1,    -1,    49,    -1,    -1,    -1,   557,    -1,
     559,   560,    -1,   471,    -1,    60,    61,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    69,    70,    -1,   485,    73,    74,
     488,   489,   581,    -1,   163,    -1,   585,   586,    -1,   168,
      -1,   590,    -1,    -1,    -1,   174,    -1,    -1,    -1,   598,
     599,    -1,   601,    98,    99,   604,    -1,    -1,   607,    -1,
     609,   610,    -1,    -1,    -1,    -1,    -1,   616,    -1,    -1,
      -1,   529,   530,    -1,   532,    -1,   534,   535,    -1,    -1,
     538,   539,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,   549,    -1,    -1,   223,    -1,    -1,     4,     5,   557,
      -1,   559,   560,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
     171,   172,    -1,    -1,   572,    -1,    -1,   575,    -1,    -1,
      -1,    -1,    -1,   581,   582,   254,    -1,   585,   586,    -1,
      37,    -1,   590,   262,   592,   593,    -1,    -1,    -1,    46,
     598,   599,    49,   601,    -1,   603,   604,    -1,    -1,   607,
      -1,   609,   610,    60,    61,    -1,    -1,    -1,   616,    -1,
     289,   290,    69,    70,   293,    -1,    73,    74,    -1,    -1,
      -1,    -1,    -1,    -1,   303,    -1,    -1,    -1,    -1,    -1,
      -1,   310,    -1,    -1,   171,   172,    -1,    -1,    -1,     4,
       5,    -1,    99,   100,   323,    10,    -1,   258,   259,   260,
     261,   330,    17,    -1,    19,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    27,    28,    -1,    -1,    57,    -1,    -1,    -1,
      -1,   350,    37,   352,    -1,    -1,    -1,    42,    -1,   358,
      -1,    46,    47,    48,    49,    -1,    51,    -1,    53,    -1,
      -1,    56,   371,    84,    85,    86,    87,    88,    89,    90,
      91,    92,    93,    94,    69,    70,    97,    -1,    99,    -1,
      -1,    -1,    -1,    -1,   105,    -1,    -1,    -1,    -1,    -1,
      -1,   258,   259,   260,   261,    -1,    -1,    -1,    -1,    -1,
      95,    -1,    -1,    -1,    99,    -1,    -1,    -1,    -1,    -1,
      -1,   106,    -1,    -1,   423,    -1,    -1,   426,    -1,    -1,
      -1,   430,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
     439,   372,   373,   374,   375,   376,   377,   378,    -1,   380,
     381,   382,   383,   384,   385,   386,   387,   388,   389,   390,
     391,    -1,    -1,     7,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    15,    -1,    -1,    -1,   474,    -1,    -1,    -1,    -1,
     479,    25,    -1,    -1,    -1,    -1,    -1,    31,    -1,    -1,
      34,    -1,    36,    -1,    38,    39,    40,    41,    -1,    -1,
      44,    -1,    -1,    -1,    48,    -1,   437,    -1,    52,    -1,
     441,    55,    -1,    -1,    -1,   372,   373,   374,   375,   376,
     377,   378,    -1,   380,   381,   382,   383,   384,   385,   386,
     387,   388,   389,   390,   391,    -1,    -1,   536,   537,    -1,
      -1,    -1,    -1,    -1,     4,     5,   545,    -1,    -1,     9,
      10,    11,    12,    -1,    14,    -1,    -1,    17,    18,    19,
      20,    -1,   106,   562,    -1,    -1,    26,    27,    28,    -1,
      57,    -1,    -1,    33,    -1,    35,    -1,    37,   509,   510,
     437,   512,    42,    43,   441,   584,    46,    47,    48,    49,
      -1,    51,    -1,    53,    -1,    -1,    56,    84,    85,    86,
      87,    88,    89,    90,    91,    92,    93,    94,    -1,    69,
      70,    -1,    -1,    -1,    -1,    -1,    -1,    -1,     4,     5,
      -1,    -1,    -1,     9,    10,    11,    12,    -1,    14,    -1,
      -1,    17,    18,    19,    20,    95,    96,    -1,    -1,    99,
      26,    27,    28,    -1,    57,    -1,   106,    33,    -1,    35,
      -1,    37,   509,   510,    -1,   512,    42,    43,    -1,    -1,
      46,    47,    48,    49,    -1,    51,    -1,    53,    -1,    -1,
      56,    84,    85,    86,    87,    88,    89,    90,    91,    92,
      93,    94,    -1,    69,    70,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,     4,     5,    -1,    -1,    -1,     9,    10,    11,
      -1,    -1,    14,    -1,    -1,    17,    -1,    19,    20,    95,
      96,    -1,    -1,    99,    26,    27,    28,    -1,    -1,    -1,
     106,    33,    -1,    35,    -1,    37,    -1,    -1,    -1,    -1,
      42,    43,    -1,    -1,    46,    47,    48,    49,    -1,    51,
      -1,    53,    -1,    -1,    56,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    69,    70,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,     4,     5,    -1,    -1,
      -1,     9,    10,    11,    -1,    -1,    14,    -1,    -1,    17,
      -1,    19,    20,    95,    96,    -1,    -1,    99,    26,    27,
      28,    -1,    -1,    -1,   106,    33,    -1,    35,    -1,    37,
      -1,    -1,    -1,    -1,    42,    43,    -1,    -1,    46,    47,
      48,    49,    -1,    51,    -1,    53,    -1,    -1,    56,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    69,    70,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
       4,     5,    -1,    -1,    -1,     9,    10,    11,    -1,    -1,
      14,    -1,    -1,    17,    -1,    19,    20,    95,    96,    -1,
      -1,    99,    26,    27,    28,    -1,    -1,    -1,   106,    33,
      -1,    35,    -1,    37,    -1,    -1,    -1,    -1,    42,    43,
      -1,    -1,    46,    47,    48,    49,    -1,    51,    -1,    53,
      -1,    -1,    56,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    69,    70,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,     4,     5,    -1,    -1,    -1,     9,
      10,    11,    -1,    -1,    14,    -1,    -1,    17,    -1,    19,
      20,    95,    96,    -1,    -1,    99,    26,    27,    28,    -1,
      -1,    -1,   106,    33,    -1,    35,    -1,    37,    -1,    -1,
      -1,    -1,    42,    43,    -1,    -1,    46,    47,    48,    49,
      -1,    51,    -1,    53,    -1,    -1,    56,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    69,
      70,    -1,    -1,    -1,    -1,    -1,    -1,    -1,     4,     5,
      -1,    -1,    -1,     9,    10,    11,    -1,    -1,    14,    -1,
      -1,    17,    -1,    19,    20,    95,    96,    -1,    -1,    99,
      26,    27,    28,    -1,    -1,    -1,   106,    33,    -1,    35,
      -1,    37,    -1,    -1,    -1,    -1,    42,    43,    -1,    -1,
      46,    47,    48,    49,    -1,    51,    -1,    53,    -1,    -1,
      56,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    69,    70,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,     4,     5,    -1,    -1,    -1,     9,    10,    11,
      -1,    -1,    14,    -1,    -1,    17,    -1,    19,    20,    95,
      96,    -1,    -1,    99,    26,    27,    28,    -1,    -1,    -1,
     106,    33,    -1,    35,    -1,    37,    -1,    -1,    -1,    -1,
      42,    43,    -1,    -1,    46,    47,    48,    49,    -1,    51,
      -1,    53,    -1,    -1,    56,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    69,    70,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,     4,     5,    -1,    -1,
      -1,     9,    10,    11,    -1,    -1,    14,    -1,    -1,    17,
      -1,    19,    20,    95,    96,    -1,    -1,    99,    26,    27,
      28,    -1,    -1,    -1,   106,    33,    -1,    35,    -1,    37,
      -1,    -1,    -1,    -1,    42,    43,    -1,    -1,    46,    47,
      48,    49,    -1,    51,    -1,    53,    -1,    -1,    56,    -1,
       4,     5,     4,     5,    -1,     9,    -1,    11,    -1,    -1,
      14,    69,    70,    -1,    -1,    -1,    20,    -1,     4,     5,
      -1,    -1,    26,    -1,    -1,    -1,    -1,    -1,    -1,    33,
      -1,    35,    -1,    37,    -1,    37,    -1,    95,    -1,    43,
      -1,    99,    46,    -1,    46,    49,    -1,    49,   106,    -1,
      -1,    37,    -1,    -1,    -1,    -1,    -1,    -1,    60,    61,
      46,    -1,    -1,    49,    -1,    69,    70,    69,    70,    -1,
      -1,    73,    74,    -1,    60,    61,    -1,    -1,    -1,    -1,
      -1,    -1,     7,    69,    70,    -1,    -1,    73,    74,    -1,
      15,    -1,     4,     5,    -1,    99,    -1,    99,    -1,     7,
      25,    -1,   106,    -1,   106,    -1,    31,    15,    -1,    34,
      -1,    36,    -1,    99,    39,    40,    41,    25,    -1,    44,
     106,    -1,    -1,    48,    -1,    37,    34,    52,    36,    -1,
      55,    39,    40,    41,    46,    -1,    44,    49,    57,    -1,
      48,    -1,    -1,    -1,    52,    -1,    -1,    55,    60,    61,
      -1,    -1,     4,     5,    -1,    -1,    -1,    69,    70,     4,
       5,    73,    74,    -1,    -1,    84,    85,    86,    87,    88,
      89,    90,    91,    92,    93,    94,    -1,    -1,    97,    -1,
      99,   106,    -1,    95,    96,    37,   105,    99,    -1,   101,
      -1,    -1,    37,    -1,    46,    -1,    -1,    49,   106,    -1,
      -1,    46,    -1,    -1,    49,    -1,    -1,    -1,    60,    61,
      -1,     4,     5,    -1,    -1,    60,    61,    69,    70,    -1,
      -1,    73,    74,    -1,    69,    70,    -1,    -1,    73,    74,
       4,     5,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    37,    -1,    -1,    99,   100,    -1,
      -1,    -1,    -1,    46,    99,   100,    49,    -1,    -1,    -1,
      -1,    -1,    -1,    37,    -1,    -1,    -1,    60,    61,    -1,
      -1,    -1,    46,    -1,    -1,    49,    69,    70,     4,     5,
      73,    74,    -1,    -1,    -1,    -1,    60,    61,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    69,    70,    -1,    -1,    73,
      74,    -1,    -1,    -1,    -1,    -1,    99,   100,    -1,    -1,
      -1,    37,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      46,    -1,    -1,    49,    -1,    99,   100,    -1,    -1,    -1,
       4,     5,    -1,    -1,    60,    61,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    69,    70,    -1,    -1,    73,    74,     4,
       5,    -1,    -1,    -1,     9,    -1,    11,    -1,    -1,    14,
      -1,    -1,    -1,    37,    -1,    20,    -1,    -1,    -1,    -1,
      -1,    26,    46,    99,   100,    49,    -1,    -1,    33,    -1,
      35,    -1,    37,    -1,     4,     5,    60,    61,    43,    -1,
      -1,    46,    -1,    -1,    49,    69,    70,    -1,    -1,    73,
      74,     4,     5,     4,     5,    60,    61,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    69,    70,    -1,    37,    73,    74,
      -1,    95,    96,    -1,    -1,    99,    46,    -1,    -1,    49,
      -1,    -1,    -1,    -1,    37,    -1,    37,    -1,    -1,    -1,
      60,    61,    -1,    46,    99,    46,    49,    -1,    49,    69,
      70,    -1,    -1,    73,    74,    -1,    -1,    60,    61,    60,
      61,    -1,    -1,    -1,    -1,    -1,    69,    70,    69,    70,
      73,    74,    73,    74,    -1,    95,    -1,    -1,    -1,    99,
      -1,    -1,     5,    -1,     7,    -1,     9,    -1,    11,    -1,
      -1,    14,    -1,    -1,    -1,    98,    99,    20,    99,    -1,
      -1,    -1,    25,    26,    -1,    -1,    -1,    -1,    -1,    -1,
      33,    -1,    35,    36,    -1,    -1,    39,    40,    41,    -1,
      43,    44,    -1,    -1,    -1,    48,    -1,    -1,    -1,    52,
      -1,    54,    55,     5,    -1,     7,    -1,     9,    -1,    11,
      -1,    -1,    14,    -1,    -1,    -1,    -1,    -1,    20,    -1,
      -1,    -1,    -1,    25,    26,    -1,    -1,    -1,    -1,    -1,
      -1,    33,    -1,    35,    36,    -1,    -1,    39,    40,    41,
      -1,    43,    44,    96,    -1,    -1,    48,    -1,    -1,    -1,
      52,    -1,    54,    55,     5,    -1,     7,    -1,     9,    -1,
      11,    -1,    -1,    14,    -1,    -1,    -1,    -1,    -1,    20,
      -1,    -1,    -1,    -1,    25,    26,    -1,    -1,    -1,    -1,
      -1,    -1,    33,    -1,    35,    36,    -1,    -1,    39,    40,
      41,    -1,    43,    44,    96,    -1,    -1,    48,    -1,    -1,
      -1,    52,    -1,    54,    55,     5,    -1,     7,    -1,     9,
      -1,    11,    -1,    -1,    14,    -1,    -1,    -1,    -1,    -1,
      20,    -1,    -1,    -1,    -1,    25,    26,    -1,    -1,    -1,
      -1,    -1,    -1,    33,    -1,    35,    36,    -1,    -1,    39,
      40,    41,    -1,    43,    44,    96,    -1,    -1,    48,    -1,
      -1,    -1,    52,    -1,    54,    55,     5,    -1,     7,    -1,
       9,    -1,    11,    -1,    -1,    14,    -1,    -1,    -1,    -1,
      -1,    20,    -1,    -1,    -1,     7,    25,    26,    -1,    -1,
      -1,    -1,    -1,    15,    33,    -1,    35,    36,    -1,    -1,
      39,    40,    41,    25,    43,    44,    96,    -1,    -1,    48,
      -1,    -1,    34,    52,    36,    54,    55,    39,    40,    41,
      -1,    -1,    44,    -1,    -1,    -1,    48,    -1,    -1,    -1,
      52,    -1,    -1,    55
};

  /* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
static const yytype_uint8 yystos[] =
{
       0,     7,    15,    25,    31,    34,    36,    38,    39,    40,
      41,    44,    48,    52,    55,   106,   124,   125,   126,   127,
     128,   129,   130,   131,   132,   133,   134,   160,     5,   109,
     109,   121,   122,   123,   109,   121,     0,   126,   128,   131,
     125,   126,    15,    34,   133,    23,    30,    95,   135,   136,
     138,   105,   106,   107,    23,    95,   161,   162,   106,   126,
     109,   109,   117,   118,   121,   117,   119,   137,     9,    11,
      14,    20,    26,    33,    35,    43,    44,    54,    96,   111,
     112,   113,   114,   115,   116,   117,   120,   121,   122,   132,
     139,   140,   141,   142,   147,   148,   155,   156,   157,   136,
     138,   138,   109,   106,   119,    96,   132,   142,   148,   163,
     164,   165,   166,   101,   162,   135,   136,   138,   161,   162,
     101,    95,   169,   109,   149,   109,   143,   144,   145,   149,
      97,    97,    97,    99,    54,   111,   157,    96,   140,   106,
     154,   169,    50,    95,   152,   158,   138,   106,    96,   164,
     119,   136,   138,   138,   162,   119,     4,    10,    17,    19,
      27,    28,    37,    42,    46,    47,    48,    49,    51,    53,
      56,    69,    70,    96,    99,   106,   109,   110,   111,   121,
     169,   170,   171,   172,   173,   174,   176,   177,   178,   180,
     181,   182,   183,   185,   191,   193,   194,   196,   201,   202,
     203,   204,   205,   206,   210,   211,   212,   214,   215,   216,
     217,   223,   224,   238,   239,   241,   242,   243,    99,    97,
     152,   101,   106,    57,    97,   152,    98,    98,    98,   100,
     111,   150,   151,   149,   143,   149,   152,   158,   118,   153,
      46,    49,    96,   159,   170,   158,   138,   106,   109,   106,
     109,   121,   174,    99,    99,   112,   117,   118,    60,    61,
      73,    74,    99,   106,   212,   216,   221,   222,   223,   226,
     227,   228,   229,   230,   231,   232,   233,   234,   235,   236,
     237,   238,   239,   240,   241,   242,   243,   244,   105,    99,
      99,   221,   169,    99,   121,   214,   215,   237,   237,   221,
      63,   109,   143,    97,    99,    96,   171,   106,   106,   105,
      97,    57,    84,    85,    86,    87,    88,    89,    90,    91,
      92,    93,    94,   225,    69,    70,   100,   150,    97,   144,
      95,   146,   167,   221,    98,   145,   100,   101,   152,   106,
     152,   158,   101,    99,    99,    96,   170,    96,   106,   106,
      97,    56,   106,   173,   181,   198,   200,   221,    97,   218,
     219,   218,    99,   237,   237,   237,   237,   112,   121,   221,
     106,    62,    71,    72,    77,    79,    78,    65,    68,    32,
      58,    59,    66,    67,    81,    82,    83,    73,    74,    75,
      76,    80,   109,   221,   221,   106,    13,    24,   207,   208,
     209,   221,   100,   174,   221,   100,   213,   221,   109,   221,
     221,   100,    96,   101,   146,   168,   151,   118,   100,   213,
     100,   213,    96,    99,   106,   221,   106,   101,   100,   221,
      97,   219,   220,   220,   100,   213,    97,   100,   220,    97,
     220,   100,   221,   228,   229,   230,   231,   232,   233,   233,
     112,   116,   234,   234,   234,   234,   235,   235,   235,   236,
     236,   237,   237,   237,    99,   100,   100,    99,   169,   208,
     209,   100,    98,   100,   101,    99,    98,    96,    96,   101,
     106,   100,   106,   100,   221,   100,   199,   200,   106,   106,
     221,   181,    27,    28,    56,   109,   174,   175,   176,   179,
     184,   192,   195,   197,    98,    98,    97,   100,   237,   100,
     100,   240,    63,   100,   213,    95,   186,   169,   151,   174,
     221,   100,   213,    96,   146,   106,   106,   100,   174,   100,
     100,   199,   100,   199,   106,    99,    99,    99,    63,    21,
      98,   237,   240,   226,   100,    12,    18,    96,   187,   188,
     189,   190,   100,   100,   106,   174,   174,   100,   174,   100,
     100,   199,   106,   198,   221,   221,   175,   174,   221,   245,
      63,    96,   188,   189,    96,   170,   190,   169,   174,   174,
     174,   100,   106,   221,   106,   100,   100,    63,    96,   174,
     100,   199,   106,   106,   221,   175,   175,   175,   100,   100,
     199,   100,   199,   106,    21,   175,   175,   100,   175,   100,
     100,   199,   175,   175,   175,   175,   100,   175
};

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
static const yytype_uint8 yyr1[] =
{
       0,   108,   109,   110,   111,   111,   112,   112,   113,   113,
     114,   114,   114,   114,   114,   115,   115,   116,   116,   117,
     118,   119,   120,   120,   120,   121,   121,   122,   123,   124,
     124,   124,   124,   124,   124,   124,   124,   125,   125,   126,
     126,   127,   128,   128,   129,   130,   131,   131,   131,   132,
     132,   133,   133,   133,   133,   133,   133,   133,   133,   133,
     133,   134,   134,   134,   134,   134,   134,   134,   134,   135,
     136,   137,   137,   138,   138,   139,   139,   140,   140,   140,
     141,   141,   142,   142,   143,   143,   144,   144,   145,   145,
     146,   146,   147,   148,   148,   148,   148,   148,   148,   148,
     148,   149,   149,   149,   150,   150,   151,   152,   153,   153,
     154,   154,   155,   156,   156,   156,   156,   157,   157,   158,
     158,   158,   158,   159,   159,   159,   159,   160,   160,   160,
     160,   161,   161,   162,   162,   163,   163,   164,   164,   165,
     166,   167,   167,   167,   167,   168,   168,   169,   169,   170,
     170,   171,   171,   172,   173,   174,   174,   174,   174,   174,
     174,   175,   175,   175,   175,   175,   176,   176,   176,   176,
     176,   176,   176,   176,   176,   176,   176,   177,   178,   179,
     180,   181,   181,   181,   181,   181,   181,   181,   182,   183,
     184,   185,   186,   186,   186,   186,   187,   187,   188,   188,
     189,   190,   190,   191,   192,   193,   194,   195,   196,   196,
     196,   196,   196,   196,   196,   196,   197,   197,   197,   197,
     197,   197,   197,   197,   198,   198,   199,   200,   200,   201,
     201,   202,   202,   203,   203,   204,   205,   206,   206,   206,
     207,   207,   208,   209,   210,   210,   211,   211,   211,   211,
     211,   211,   211,   212,   212,   213,   213,   214,   214,   215,
     215,   216,   216,   216,   216,   216,   216,   217,   217,   217,
     217,   218,   218,   219,   220,   220,   221,   222,   222,   223,
     224,   224,   224,   225,   225,   225,   225,   225,   225,   225,
     225,   225,   225,   225,   225,   226,   226,   227,   227,   228,
     228,   229,   229,   230,   230,   231,   231,   232,   232,   232,
     233,   233,   233,   233,   233,   233,   234,   234,   234,   234,
     235,   235,   235,   236,   236,   236,   236,   237,   237,   237,
     237,   237,   238,   239,   240,   240,   240,   240,   241,   241,
     241,   241,   242,   243,   244,   244,   244,   244,   245
};

  /* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
static const yytype_uint8 yyr2[] =
{
       0,     2,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     3,     3,     3,     1,     1,     1,     3,     3,
       2,     2,     1,     2,     1,     1,     0,     1,     2,     1,
       2,     3,     1,     1,     3,     4,     1,     1,     1,     1,
       2,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     6,     5,     5,     4,     5,     4,     4,     3,     2,
       2,     1,     3,     2,     3,     1,     2,     1,     1,     1,
       1,     1,     4,     3,     1,     3,     1,     3,     1,     3,
       1,     1,     2,     4,     3,     3,     2,     4,     3,     3,
       2,     4,     3,     3,     1,     3,     2,     2,     1,     3,
       1,     1,     2,     4,     3,     3,     2,     4,     3,     4,
       3,     3,     2,     5,     4,     5,     4,     5,     4,     4,
       3,     2,     3,     3,     2,     1,     2,     1,     1,     1,
       2,     4,     3,     3,     2,     3,     1,     3,     2,     2,
       1,     1,     1,     2,     2,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     3,     3,
       2,     1,     1,     1,     1,     1,     1,     1,     5,     7,
       7,     5,     4,     3,     3,     2,     1,     2,     1,     2,
       2,     3,     2,     5,     5,     7,     1,     1,     9,     8,
       8,     7,     8,     7,     7,     6,     9,     8,     8,     7,
       8,     7,     7,     6,     1,     1,     1,     3,     1,     3,
       2,     3,     2,     2,     3,     3,     5,     3,     3,     4,
       2,     1,     5,     2,     1,     1,     1,     1,     3,     1,
       1,     1,     1,     5,     4,     1,     3,     3,     3,     4,
       4,     4,     3,     6,     5,     6,     5,     4,     3,     4,
       3,     2,     1,     3,     2,     3,     1,     1,     1,     3,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     5,     1,     3,     1,
       3,     1,     3,     1,     3,     1,     3,     1,     3,     3,
       1,     3,     3,     3,     3,     3,     1,     3,     3,     3,
       1,     3,     3,     1,     3,     3,     3,     1,     1,     2,
       2,     1,     2,     2,     1,     2,     2,     1,     1,     1,
       1,     1,     2,     2,     5,     4,     4,     5,     1
};


#define yyerrok         (yyerrstatus = 0)
#define yyclearin       (yychar = YYEMPTY)
#define YYEMPTY         (-2)
#define YYEOF           0

#define YYACCEPT        goto yyacceptlab
#define YYABORT         goto yyabortlab
#define YYERROR         goto yyerrorlab


#define YYRECOVERING()  (!!yyerrstatus)

#define YYBACKUP(Token, Value)                                  \
do                                                              \
  if (yychar == YYEMPTY)                                        \
    {                                                           \
      yychar = (Token);                                         \
      yylval = (Value);                                         \
      YYPOPSTACK (yylen);                                       \
      yystate = *yyssp;                                         \
      goto yybackup;                                            \
    }                                                           \
  else                                                          \
    {                                                           \
      yyerror (YY_("syntax error: cannot back up")); \
      YYERROR;                                                  \
    }                                                           \
while (0)

/* Error token number */
#define YYTERROR        1
#define YYERRCODE       256



/* Enable debugging if requested.  */
#if YYDEBUG

# ifndef YYFPRINTF
#  include <stdio.h> /* INFRINGES ON USER NAME SPACE */
#  define YYFPRINTF fprintf
# endif

# define YYDPRINTF(Args)                        \
do {                                            \
  if (yydebug)                                  \
    YYFPRINTF Args;                             \
} while (0)

/* This macro is provided for backward compatibility. */
#ifndef YY_LOCATION_PRINT
# define YY_LOCATION_PRINT(File, Loc) ((void) 0)
#endif


# define YY_SYMBOL_PRINT(Title, Type, Value, Location)                    \
do {                                                                      \
  if (yydebug)                                                            \
    {                                                                     \
      YYFPRINTF (stderr, "%s ", Title);                                   \
      yy_symbol_print (stderr,                                            \
                  Type, Value); \
      YYFPRINTF (stderr, "\n");                                           \
    }                                                                     \
} while (0)


/*----------------------------------------.
| Print this symbol's value on YYOUTPUT.  |
`----------------------------------------*/

static void
yy_symbol_value_print (FILE *yyoutput, int yytype, YYSTYPE const * const yyvaluep)
{
  FILE *yyo = yyoutput;
  YYUSE (yyo);
  if (!yyvaluep)
    return;
# ifdef YYPRINT
  if (yytype < YYNTOKENS)
    YYPRINT (yyoutput, yytoknum[yytype], *yyvaluep);
# endif
  YYUSE (yytype);
}


/*--------------------------------.
| Print this symbol on YYOUTPUT.  |
`--------------------------------*/

static void
yy_symbol_print (FILE *yyoutput, int yytype, YYSTYPE const * const yyvaluep)
{
  YYFPRINTF (yyoutput, "%s %s (",
             yytype < YYNTOKENS ? "token" : "nterm", yytname[yytype]);

  yy_symbol_value_print (yyoutput, yytype, yyvaluep);
  YYFPRINTF (yyoutput, ")");
}

/*------------------------------------------------------------------.
| yy_stack_print -- Print the state stack from its BOTTOM up to its |
| TOP (included).                                                   |
`------------------------------------------------------------------*/

static void
yy_stack_print (yytype_int16 *yybottom, yytype_int16 *yytop)
{
  YYFPRINTF (stderr, "Stack now");
  for (; yybottom <= yytop; yybottom++)
    {
      int yybot = *yybottom;
      YYFPRINTF (stderr, " %d", yybot);
    }
  YYFPRINTF (stderr, "\n");
}

# define YY_STACK_PRINT(Bottom, Top)                            \
do {                                                            \
  if (yydebug)                                                  \
    yy_stack_print ((Bottom), (Top));                           \
} while (0)


/*------------------------------------------------.
| Report that the YYRULE is going to be reduced.  |
`------------------------------------------------*/

static void
yy_reduce_print (yytype_int16 *yyssp, YYSTYPE *yyvsp, int yyrule)
{
  unsigned long int yylno = yyrline[yyrule];
  int yynrhs = yyr2[yyrule];
  int yyi;
  YYFPRINTF (stderr, "Reducing stack by rule %d (line %lu):\n",
             yyrule - 1, yylno);
  /* The symbols being reduced.  */
  for (yyi = 0; yyi < yynrhs; yyi++)
    {
      YYFPRINTF (stderr, "   $%d = ", yyi + 1);
      yy_symbol_print (stderr,
                       yystos[yyssp[yyi + 1 - yynrhs]],
                       &(yyvsp[(yyi + 1) - (yynrhs)])
                                              );
      YYFPRINTF (stderr, "\n");
    }
}

# define YY_REDUCE_PRINT(Rule)          \
do {                                    \
  if (yydebug)                          \
    yy_reduce_print (yyssp, yyvsp, Rule); \
} while (0)

/* Nonzero means print parse trace.  It is left uninitialized so that
   multiple parsers can coexist.  */
int yydebug;
#else /* !YYDEBUG */
# define YYDPRINTF(Args)
# define YY_SYMBOL_PRINT(Title, Type, Value, Location)
# define YY_STACK_PRINT(Bottom, Top)
# define YY_REDUCE_PRINT(Rule)
#endif /* !YYDEBUG */


/* YYINITDEPTH -- initial size of the parser's stacks.  */
#ifndef YYINITDEPTH
# define YYINITDEPTH 200
#endif

/* YYMAXDEPTH -- maximum size the stacks can grow to (effective only
   if the built-in stack extension method is used).

   Do not make this value too large; the results are undefined if
   YYSTACK_ALLOC_MAXIMUM < YYSTACK_BYTES (YYMAXDEPTH)
   evaluated with infinite-precision integer arithmetic.  */

#ifndef YYMAXDEPTH
# define YYMAXDEPTH 10000
#endif


#if YYERROR_VERBOSE

# ifndef yystrlen
#  if defined __GLIBC__ && defined _STRING_H
#   define yystrlen strlen
#  else
/* Return the length of YYSTR.  */
static YYSIZE_T
yystrlen (const char *yystr)
{
  YYSIZE_T yylen;
  for (yylen = 0; yystr[yylen]; yylen++)
    continue;
  return yylen;
}
#  endif
# endif

# ifndef yystpcpy
#  if defined __GLIBC__ && defined _STRING_H && defined _GNU_SOURCE
#   define yystpcpy stpcpy
#  else
/* Copy YYSRC to YYDEST, returning the address of the terminating '\0' in
   YYDEST.  */
static char *
yystpcpy (char *yydest, const char *yysrc)
{
  char *yyd = yydest;
  const char *yys = yysrc;

  while ((*yyd++ = *yys++) != '\0')
    continue;

  return yyd - 1;
}
#  endif
# endif

# ifndef yytnamerr
/* Copy to YYRES the contents of YYSTR after stripping away unnecessary
   quotes and backslashes, so that it's suitable for yyerror.  The
   heuristic is that double-quoting is unnecessary unless the string
   contains an apostrophe, a comma, or backslash (other than
   backslash-backslash).  YYSTR is taken from yytname.  If YYRES is
   null, do not copy; instead, return the length of what the result
   would have been.  */
static YYSIZE_T
yytnamerr (char *yyres, const char *yystr)
{
  if (*yystr == '"')
    {
      YYSIZE_T yyn = 0;
      char const *yyp = yystr;

      for (;;)
        switch (*++yyp)
          {
          case '\'':
          case ',':
            goto do_not_strip_quotes;

          case '\\':
            if (*++yyp != '\\')
              goto do_not_strip_quotes;
            /* Fall through.  */
          default:
            if (yyres)
              yyres[yyn] = *yyp;
            yyn++;
            break;

          case '"':
            if (yyres)
              yyres[yyn] = '\0';
            return yyn;
          }
    do_not_strip_quotes: ;
    }

  if (! yyres)
    return yystrlen (yystr);

  return yystpcpy (yyres, yystr) - yyres;
}
# endif

/* Copy into *YYMSG, which is of size *YYMSG_ALLOC, an error message
   about the unexpected token YYTOKEN for the state stack whose top is
   YYSSP.

   Return 0 if *YYMSG was successfully written.  Return 1 if *YYMSG is
   not large enough to hold the message.  In that case, also set
   *YYMSG_ALLOC to the required number of bytes.  Return 2 if the
   required number of bytes is too large to store.  */
static int
yysyntax_error (YYSIZE_T *yymsg_alloc, char **yymsg,
                yytype_int16 *yyssp, int yytoken)
{
  YYSIZE_T yysize0 = yytnamerr (YY_NULLPTR, yytname[yytoken]);
  YYSIZE_T yysize = yysize0;
  enum { YYERROR_VERBOSE_ARGS_MAXIMUM = 5 };
  /* Internationalized format string. */
  const char *yyformat = YY_NULLPTR;
  /* Arguments of yyformat. */
  char const *yyarg[YYERROR_VERBOSE_ARGS_MAXIMUM];
  /* Number of reported tokens (one for the "unexpected", one per
     "expected"). */
  int yycount = 0;

  /* There are many possibilities here to consider:
     - If this state is a consistent state with a default action, then
       the only way this function was invoked is if the default action
       is an error action.  In that case, don't check for expected
       tokens because there are none.
     - The only way there can be no lookahead present (in yychar) is if
       this state is a consistent state with a default action.  Thus,
       detecting the absence of a lookahead is sufficient to determine
       that there is no unexpected or expected token to report.  In that
       case, just report a simple "syntax error".
     - Don't assume there isn't a lookahead just because this state is a
       consistent state with a default action.  There might have been a
       previous inconsistent state, consistent state with a non-default
       action, or user semantic action that manipulated yychar.
     - Of course, the expected token list depends on states to have
       correct lookahead information, and it depends on the parser not
       to perform extra reductions after fetching a lookahead from the
       scanner and before detecting a syntax error.  Thus, state merging
       (from LALR or IELR) and default reductions corrupt the expected
       token list.  However, the list is correct for canonical LR with
       one exception: it will still contain any token that will not be
       accepted due to an error action in a later state.
  */
  if (yytoken != YYEMPTY)
    {
      int yyn = yypact[*yyssp];
      yyarg[yycount++] = yytname[yytoken];
      if (!yypact_value_is_default (yyn))
        {
          /* Start YYX at -YYN if negative to avoid negative indexes in
             YYCHECK.  In other words, skip the first -YYN actions for
             this state because they are default actions.  */
          int yyxbegin = yyn < 0 ? -yyn : 0;
          /* Stay within bounds of both yycheck and yytname.  */
          int yychecklim = YYLAST - yyn + 1;
          int yyxend = yychecklim < YYNTOKENS ? yychecklim : YYNTOKENS;
          int yyx;

          for (yyx = yyxbegin; yyx < yyxend; ++yyx)
            if (yycheck[yyx + yyn] == yyx && yyx != YYTERROR
                && !yytable_value_is_error (yytable[yyx + yyn]))
              {
                if (yycount == YYERROR_VERBOSE_ARGS_MAXIMUM)
                  {
                    yycount = 1;
                    yysize = yysize0;
                    break;
                  }
                yyarg[yycount++] = yytname[yyx];
                {
                  YYSIZE_T yysize1 = yysize + yytnamerr (YY_NULLPTR, yytname[yyx]);
                  if (! (yysize <= yysize1
                         && yysize1 <= YYSTACK_ALLOC_MAXIMUM))
                    return 2;
                  yysize = yysize1;
                }
              }
        }
    }

  switch (yycount)
    {
# define YYCASE_(N, S)                      \
      case N:                               \
        yyformat = S;                       \
      break
      YYCASE_(0, YY_("syntax error"));
      YYCASE_(1, YY_("syntax error, unexpected %s"));
      YYCASE_(2, YY_("syntax error, unexpected %s, expecting %s"));
      YYCASE_(3, YY_("syntax error, unexpected %s, expecting %s or %s"));
      YYCASE_(4, YY_("syntax error, unexpected %s, expecting %s or %s or %s"));
      YYCASE_(5, YY_("syntax error, unexpected %s, expecting %s or %s or %s or %s"));
# undef YYCASE_
    }

  {
    YYSIZE_T yysize1 = yysize + yystrlen (yyformat);
    if (! (yysize <= yysize1 && yysize1 <= YYSTACK_ALLOC_MAXIMUM))
      return 2;
    yysize = yysize1;
  }

  if (*yymsg_alloc < yysize)
    {
      *yymsg_alloc = 2 * yysize;
      if (! (yysize <= *yymsg_alloc
             && *yymsg_alloc <= YYSTACK_ALLOC_MAXIMUM))
        *yymsg_alloc = YYSTACK_ALLOC_MAXIMUM;
      return 1;
    }

  /* Avoid sprintf, as that infringes on the user's name space.
     Don't have undefined behavior even if the translation
     produced a string with the wrong number of "%s"s.  */
  {
    char *yyp = *yymsg;
    int yyi = 0;
    while ((*yyp = *yyformat) != '\0')
      if (*yyp == '%' && yyformat[1] == 's' && yyi < yycount)
        {
          yyp += yytnamerr (yyp, yyarg[yyi++]);
          yyformat += 2;
        }
      else
        {
          yyp++;
          yyformat++;
        }
  }
  return 0;
}
#endif /* YYERROR_VERBOSE */

/*-----------------------------------------------.
| Release the memory associated to this symbol.  |
`-----------------------------------------------*/

static void
yydestruct (const char *yymsg, int yytype, YYSTYPE *yyvaluep)
{
  YYUSE (yyvaluep);
  if (!yymsg)
    yymsg = "Deleting";
  YY_SYMBOL_PRINT (yymsg, yytype, yyvaluep, yylocationp);

  YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
  YYUSE (yytype);
  YY_IGNORE_MAYBE_UNINITIALIZED_END
}




/* The lookahead symbol.  */
int yychar;

/* The semantic value of the lookahead symbol.  */
YYSTYPE yylval;
/* Number of syntax errors so far.  */
int yynerrs;


/*----------.
| yyparse.  |
`----------*/

int
yyparse (void)
{
    int yystate;
    /* Number of tokens to shift before error messages enabled.  */
    int yyerrstatus;

    /* The stacks and their tools:
       'yyss': related to states.
       'yyvs': related to semantic values.

       Refer to the stacks through separate pointers, to allow yyoverflow
       to reallocate them elsewhere.  */

    /* The state stack.  */
    yytype_int16 yyssa[YYINITDEPTH];
    yytype_int16 *yyss;
    yytype_int16 *yyssp;

    /* The semantic value stack.  */
    YYSTYPE yyvsa[YYINITDEPTH];
    YYSTYPE *yyvs;
    YYSTYPE *yyvsp;

    YYSIZE_T yystacksize;

  int yyn;
  int yyresult;
  /* Lookahead token as an internal (translated) token number.  */
  int yytoken = 0;
  /* The variables used to return semantic value and location from the
     action routines.  */
  YYSTYPE yyval;

#if YYERROR_VERBOSE
  /* Buffer for error messages, and its allocated size.  */
  char yymsgbuf[128];
  char *yymsg = yymsgbuf;
  YYSIZE_T yymsg_alloc = sizeof yymsgbuf;
#endif

#define YYPOPSTACK(N)   (yyvsp -= (N), yyssp -= (N))

  /* The number of symbols on the RHS of the reduced rule.
     Keep to zero when no symbol should be popped.  */
  int yylen = 0;

  yyssp = yyss = yyssa;
  yyvsp = yyvs = yyvsa;
  yystacksize = YYINITDEPTH;

  YYDPRINTF ((stderr, "Starting parse\n"));

  yystate = 0;
  yyerrstatus = 0;
  yynerrs = 0;
  yychar = YYEMPTY; /* Cause a token to be read.  */
  goto yysetstate;

/*------------------------------------------------------------.
| yynewstate -- Push a new state, which is found in yystate.  |
`------------------------------------------------------------*/
 yynewstate:
  /* In all cases, when you get here, the value and location stacks
     have just been pushed.  So pushing a state here evens the stacks.  */
  yyssp++;

 yysetstate:
  *yyssp = yystate;

  if (yyss + yystacksize - 1 <= yyssp)
    {
      /* Get the current used size of the three stacks, in elements.  */
      YYSIZE_T yysize = yyssp - yyss + 1;

#ifdef yyoverflow
      {
        /* Give user a chance to reallocate the stack.  Use copies of
           these so that the &'s don't force the real ones into
           memory.  */
        YYSTYPE *yyvs1 = yyvs;
        yytype_int16 *yyss1 = yyss;

        /* Each stack pointer address is followed by the size of the
           data in use in that stack, in bytes.  This used to be a
           conditional around just the two extra args, but that might
           be undefined if yyoverflow is a macro.  */
        yyoverflow (YY_("memory exhausted"),
                    &yyss1, yysize * sizeof (*yyssp),
                    &yyvs1, yysize * sizeof (*yyvsp),
                    &yystacksize);

        yyss = yyss1;
        yyvs = yyvs1;
      }
#else /* no yyoverflow */
# ifndef YYSTACK_RELOCATE
      goto yyexhaustedlab;
# else
      /* Extend the stack our own way.  */
      if (YYMAXDEPTH <= yystacksize)
        goto yyexhaustedlab;
      yystacksize *= 2;
      if (YYMAXDEPTH < yystacksize)
        yystacksize = YYMAXDEPTH;

      {
        yytype_int16 *yyss1 = yyss;
        union yyalloc *yyptr =
          (union yyalloc *) YYSTACK_ALLOC (YYSTACK_BYTES (yystacksize));
        if (! yyptr)
          goto yyexhaustedlab;
        YYSTACK_RELOCATE (yyss_alloc, yyss);
        YYSTACK_RELOCATE (yyvs_alloc, yyvs);
#  undef YYSTACK_RELOCATE
        if (yyss1 != yyssa)
          YYSTACK_FREE (yyss1);
      }
# endif
#endif /* no yyoverflow */

      yyssp = yyss + yysize - 1;
      yyvsp = yyvs + yysize - 1;

      YYDPRINTF ((stderr, "Stack size increased to %lu\n",
                  (unsigned long int) yystacksize));

      if (yyss + yystacksize - 1 <= yyssp)
        YYABORT;
    }

  YYDPRINTF ((stderr, "Entering state %d\n", yystate));

  if (yystate == YYFINAL)
    YYACCEPT;

  goto yybackup;

/*-----------.
| yybackup.  |
`-----------*/
yybackup:

  /* Do appropriate processing given the current state.  Read a
     lookahead token if we need one and don't already have one.  */

  /* First try to decide what to do without reference to lookahead token.  */
  yyn = yypact[yystate];
  if (yypact_value_is_default (yyn))
    goto yydefault;

  /* Not known => get a lookahead token if don't already have one.  */

  /* YYCHAR is either YYEMPTY or YYEOF or a valid lookahead symbol.  */
  if (yychar == YYEMPTY)
    {
      YYDPRINTF ((stderr, "Reading a token: "));
      yychar = yylex ();
    }

  if (yychar <= YYEOF)
    {
      yychar = yytoken = YYEOF;
      YYDPRINTF ((stderr, "Now at end of input.\n"));
    }
  else
    {
      yytoken = YYTRANSLATE (yychar);
      YY_SYMBOL_PRINT ("Next token is", yytoken, &yylval, &yylloc);
    }

  /* If the proper action on seeing token YYTOKEN is to reduce or to
     detect an error, take that action.  */
  yyn += yytoken;
  if (yyn < 0 || YYLAST < yyn || yycheck[yyn] != yytoken)
    goto yydefault;
  yyn = yytable[yyn];
  if (yyn <= 0)
    {
      if (yytable_value_is_error (yyn))
        goto yyerrlab;
      yyn = -yyn;
      goto yyreduce;
    }

  /* Count tokens shifted since error; after three, turn off error
     status.  */
  if (yyerrstatus)
    yyerrstatus--;

  /* Shift the lookahead token.  */
  YY_SYMBOL_PRINT ("Shifting", yytoken, &yylval, &yylloc);

  /* Discard the shifted token.  */
  yychar = YYEMPTY;

  yystate = yyn;
  YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
  *++yyvsp = yylval;
  YY_IGNORE_MAYBE_UNINITIALIZED_END

  goto yynewstate;


/*-----------------------------------------------------------.
| yydefault -- do the default action for the current state.  |
`-----------------------------------------------------------*/
yydefault:
  yyn = yydefact[yystate];
  if (yyn == 0)
    goto yyerrlab;
  goto yyreduce;


/*-----------------------------.
| yyreduce -- Do a reduction.  |
`-----------------------------*/
yyreduce:
  /* yyn is the number of a rule to reduce with.  */
  yylen = yyr2[yyn];

  /* If YYLEN is nonzero, implement the default value of the action:
     '$$ = $1'.

     Otherwise, the following line sets YYVAL to garbage.
     This behavior is undocumented and Bison
     users should not rely upon it.  Assigning to YYVAL
     unconditionally makes the parser a bit smaller, and it avoids a
     GCC warning that YYVAL may be used uninitialized.  */
  yyval = yyvsp[1-yylen];


  YY_REDUCE_PRINT (yyn);
  switch (yyn)
    {
      
#line 2451 "parser.tab.c" /* yacc.c:1646  */
      default: break;
    }
  /* User semantic actions sometimes alter yychar, and that requires
     that yytoken be updated with the new translation.  We take the
     approach of translating immediately before every use of yytoken.
     One alternative is translating here after every semantic action,
     but that translation would be missed if the semantic action invokes
     YYABORT, YYACCEPT, or YYERROR immediately after altering yychar or
     if it invokes YYBACKUP.  In the case of YYABORT or YYACCEPT, an
     incorrect destructor might then be invoked immediately.  In the
     case of YYERROR or YYBACKUP, subsequent parser actions might lead
     to an incorrect destructor call or verbose syntax error message
     before the lookahead is translated.  */
  YY_SYMBOL_PRINT ("-> $$ =", yyr1[yyn], &yyval, &yyloc);

  YYPOPSTACK (yylen);
  yylen = 0;
  YY_STACK_PRINT (yyss, yyssp);

  *++yyvsp = yyval;

  /* Now 'shift' the result of the reduction.  Determine what state
     that goes to, based on the state we popped back to and the rule
     number reduced by.  */

  yyn = yyr1[yyn];

  yystate = yypgoto[yyn - YYNTOKENS] + *yyssp;
  if (0 <= yystate && yystate <= YYLAST && yycheck[yystate] == *yyssp)
    yystate = yytable[yystate];
  else
    yystate = yydefgoto[yyn - YYNTOKENS];

  goto yynewstate;


/*--------------------------------------.
| yyerrlab -- here on detecting error.  |
`--------------------------------------*/
yyerrlab:
  /* Make sure we have latest lookahead translation.  See comments at
     user semantic actions for why this is necessary.  */
  yytoken = yychar == YYEMPTY ? YYEMPTY : YYTRANSLATE (yychar);

  /* If not already recovering from an error, report this error.  */
  if (!yyerrstatus)
    {
      ++yynerrs;
#if ! YYERROR_VERBOSE
      yyerror (YY_("syntax error"));
#else
# define YYSYNTAX_ERROR yysyntax_error (&yymsg_alloc, &yymsg, \
                                        yyssp, yytoken)
      {
        char const *yymsgp = YY_("syntax error");
        int yysyntax_error_status;
        yysyntax_error_status = YYSYNTAX_ERROR;
        if (yysyntax_error_status == 0)
          yymsgp = yymsg;
        else if (yysyntax_error_status == 1)
          {
            if (yymsg != yymsgbuf)
              YYSTACK_FREE (yymsg);
            yymsg = (char *) YYSTACK_ALLOC (yymsg_alloc);
            if (!yymsg)
              {
                yymsg = yymsgbuf;
                yymsg_alloc = sizeof yymsgbuf;
                yysyntax_error_status = 2;
              }
            else
              {
                yysyntax_error_status = YYSYNTAX_ERROR;
                yymsgp = yymsg;
              }
          }
        yyerror (yymsgp);
        if (yysyntax_error_status == 2)
          goto yyexhaustedlab;
      }
# undef YYSYNTAX_ERROR
#endif
    }



  if (yyerrstatus == 3)
    {
      /* If just tried and failed to reuse lookahead token after an
         error, discard it.  */

      if (yychar <= YYEOF)
        {
          /* Return failure if at end of input.  */
          if (yychar == YYEOF)
            YYABORT;
        }
      else
        {
          yydestruct ("Error: discarding",
                      yytoken, &yylval);
          yychar = YYEMPTY;
        }
    }

  /* Else will try to reuse lookahead token after shifting the error
     token.  */
  goto yyerrlab1;


/*---------------------------------------------------.
| yyerrorlab -- error raised explicitly by YYERROR.  |
`---------------------------------------------------*/
yyerrorlab:

  /* Pacify compilers like GCC when the user code never invokes
     YYERROR and the label yyerrorlab therefore never appears in user
     code.  */
  if (/*CONSTCOND*/ 0)
     goto yyerrorlab;

  /* Do not reclaim the symbols of the rule whose action triggered
     this YYERROR.  */
  YYPOPSTACK (yylen);
  yylen = 0;
  YY_STACK_PRINT (yyss, yyssp);
  yystate = *yyssp;
  goto yyerrlab1;


/*-------------------------------------------------------------.
| yyerrlab1 -- common code for both syntax error and YYERROR.  |
`-------------------------------------------------------------*/
yyerrlab1:
  yyerrstatus = 3;      /* Each real token shifted decrements this.  */

  for (;;)
    {
      yyn = yypact[yystate];
      if (!yypact_value_is_default (yyn))
        {
          yyn += YYTERROR;
          if (0 <= yyn && yyn <= YYLAST && yycheck[yyn] == YYTERROR)
            {
              yyn = yytable[yyn];
              if (0 < yyn)
                break;
            }
        }

      /* Pop the current state because it cannot handle the error token.  */
      if (yyssp == yyss)
        YYABORT;


      yydestruct ("Error: popping",
                  yystos[yystate], yyvsp);
      YYPOPSTACK (1);
      yystate = *yyssp;
      YY_STACK_PRINT (yyss, yyssp);
    }

  YY_IGNORE_MAYBE_UNINITIALIZED_BEGIN
  *++yyvsp = yylval;
  YY_IGNORE_MAYBE_UNINITIALIZED_END


  /* Shift the error token.  */
  YY_SYMBOL_PRINT ("Shifting", yystos[yyn], yyvsp, yylsp);

  yystate = yyn;
  goto yynewstate;


/*-------------------------------------.
| yyacceptlab -- YYACCEPT comes here.  |
`-------------------------------------*/
yyacceptlab:
  yyresult = 0;
  goto yyreturn;

/*-----------------------------------.
| yyabortlab -- YYABORT comes here.  |
`-----------------------------------*/
yyabortlab:
  yyresult = 1;
  goto yyreturn;

#if !defined yyoverflow || YYERROR_VERBOSE
/*-------------------------------------------------.
| yyexhaustedlab -- memory exhaustion comes here.  |
`-------------------------------------------------*/
yyexhaustedlab:
  yyerror (YY_("memory exhausted"));
  yyresult = 2;
  /* Fall through.  */
#endif

yyreturn:
  if (yychar != YYEMPTY)
    {
      /* Make sure we have latest lookahead translation.  See comments at
         user semantic actions for why this is necessary.  */
      yytoken = YYTRANSLATE (yychar);
      yydestruct ("Cleanup: discarding lookahead",
                  yytoken, &yylval);
    }
  /* Do not reclaim the symbols of the rule whose action triggered
     this YYABORT or YYACCEPT.  */
  YYPOPSTACK (yylen);
  YY_STACK_PRINT (yyss, yyssp);
  while (yyssp != yyss)
    {
      yydestruct ("Cleanup: popping",
                  yystos[*yyssp], yyvsp);
      YYPOPSTACK (1);
    }
#ifndef yyoverflow
  if (yyss != yyssa)
    YYSTACK_FREE (yyss);
#endif
#if YYERROR_VERBOSE
  if (yymsg != yymsgbuf)
    YYSTACK_FREE (yymsg);
#endif
  return yyresult;
}
#line 1007 "parser.y" /* yacc.c:1906  */


void yyerror(const char *s)
{
	fprintf(stderr ,"Error Type: %s\n", s);
}

int main (int, char**) {
	yyparse();
    // Visit(ast_root);
	return 0;
}
