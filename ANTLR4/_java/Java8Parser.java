// Generated from Java8.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ABSTRACT=4, ASSERT=5, BOOLEAN=6, BREAK=7, BYTE=8, 
		CASE=9, CATCH=10, CHAR=11, CLASS=12, CONST=13, CONTINUE=14, DEFAULT=15, 
		DO=16, DOUBLE=17, ELSE=18, ENUM=19, EXTENDS=20, FINAL=21, FINALLY=22, 
		FLOAT=23, FOR=24, IF=25, GOTO=26, IMPLEMENTS=27, IMPORT=28, INSTANCEOF=29, 
		INT=30, INTERFACE=31, LONG=32, NATIVE=33, NEW=34, PACKAGE=35, PRIVATE=36, 
		PROTECTED=37, PUBLIC=38, RETURN=39, SHORT=40, STATIC=41, STRICTFP=42, 
		SUPER=43, SWITCH=44, SYNCHRONIZED=45, THIS=46, THROW=47, THROWS=48, TRANSIENT=49, 
		TRY=50, VOID=51, VOLATILE=52, WHILE=53, Literal=54, IntegerLiteral=55, 
		FloatingPointLiteral=56, BooleanLiteral=57, CharacterLiteral=58, StringLiteral=59, 
		NullLiteral=60, LSMB=61, RSMB=62, LCRB=63, RCRB=64, LSQB=65, RSQB=66, 
		SEMI=67, COMMA=68, DOT=69, ASSIGN=70, GT=71, LT=72, NOT=73, TILDE=74, 
		QMARK=75, COLON=76, EQEQ=77, LEEQ=78, GEEQ=79, NTEQ=80, AND=81, OR=82, 
		INCR=83, DECR=84, ADD=85, SUB=86, MUL=87, DIV=88, BAND=89, BOR=90, CARET=91, 
		MOD=92, ARROW=93, DCLN=94, ADDEQ=95, SUBEQ=96, MULEQ=97, DIVEQ=98, ANDEQ=99, 
		OREQ=100, XOREQ=101, MODEQ=102, LTLTEQ=103, GTGTEQ=104, GTGTGTEQ=105, 
		Identifier=106, ATTHERATE=107, THREEDOTS=108, WHITE_SPACE=109, MULTI_LINE_COMMENT=110, 
		SINGLE_LINE_COMMENT=111;
	public static final int
		RULE_type_1 = 0, RULE_primitiveType = 1, RULE_numericType = 2, RULE_integralType = 3, 
		RULE_floatingPointType = 4, RULE_referenceType = 5, RULE_classOrInterfaceType = 6, 
		RULE_type_Type_1 = 7, RULE_type_Type_2 = 8, RULE_classType_Type_1 = 9, 
		RULE_classType_Type_2 = 10, RULE_interfaceType_Type_1 = 11, RULE_interfaceType_Type_2 = 12, 
		RULE_classType = 13, RULE_interfaceType = 14, RULE_typeVariable = 15, 
		RULE_arrayType = 16, RULE_dims = 17, RULE_typeParameter = 18, RULE_typeParameterModifier = 19, 
		RULE_typeBound = 20, RULE_additionalBound = 21, RULE_typeArguments = 22, 
		RULE_typeArgumentList = 23, RULE_typeArgument = 24, RULE_wildcard = 25, 
		RULE_wildcardBounds = 26, RULE_methodName = 27, RULE_name = 28, RULE_compilationUnit = 29, 
		RULE_packageDeclaration = 30, RULE_packageModifier = 31, RULE_importDeclaration = 32, 
		RULE_singleTypeImportDeclaration = 33, RULE_typeImportOnDemandDeclaration = 34, 
		RULE_singleStaticImportDeclaration = 35, RULE_staticImportOnDemandDeclaration = 36, 
		RULE_typeDeclaration = 37, RULE_classDeclaration = 38, RULE_normalclassDeclaration = 39, 
		RULE_typeParameters = 40, RULE_typeParameterList = 41, RULE_superclass = 42, 
		RULE_superInterfaces = 43, RULE_interfaceTypeList = 44, RULE_classBody = 45, 
		RULE_classBodyDeclaration = 46, RULE_classMemeberDeclaration = 47, RULE_fieldDeclaration = 48, 
		RULE_variableDeclaratorList = 49, RULE_variableDeclarator = 50, RULE_variableDeclaratorId = 51, 
		RULE_variableInitializer = 52, RULE_unannType = 53, RULE_unannPrimitiveType = 54, 
		RULE_unannReferenceType = 55, RULE_unannclassOrInterfaceType = 56, RULE_unann_Type_Type_1 = 57, 
		RULE_unann_Type_Type_2 = 58, RULE_unann_classType_Type_1 = 59, RULE_unann_classType_Type_2 = 60, 
		RULE_unann_InterfaceType_Type_1 = 61, RULE_unann_InterfaceType_Type_2 = 62, 
		RULE_unannclassType = 63, RULE_unannInterfaceType = 64, RULE_unannTypeVariable = 65, 
		RULE_unannArrayType = 66, RULE_methodDeclaration = 67, RULE_methodHeader = 68, 
		RULE_result = 69, RULE_methodDeclarator = 70, RULE_formalParameterList = 71, 
		RULE_formalParameters = 72, RULE_formalParameter = 73, RULE_variableModifier = 74, 
		RULE_lastFormalParameter = 75, RULE_receiverParameter = 76, RULE_throwsVar = 77, 
		RULE_exceptionTypeList = 78, RULE_exceptionType = 79, RULE_methodBody = 80, 
		RULE_instanceInitializer = 81, RULE_staticInitializer = 82, RULE_constructorDeclaration = 83, 
		RULE_constructorDeclarator = 84, RULE_simpleTypeName = 85, RULE_constructorModifier = 86, 
		RULE_constructorBody = 87, RULE_explicitconstructorInvocation = 88, RULE_interfaceDeclaration = 89, 
		RULE_normalInterfaceDeclaration = 90, RULE_modifier = 91, RULE_extendsInterfaces = 92, 
		RULE_interfaceBody = 93, RULE_interfaceMemberDeclaration = 94, RULE_constantDeclaration = 95, 
		RULE_constantModifier = 96, RULE_interfaceMethodDeclaration = 97, RULE_interfaceMethodModifier = 98, 
		RULE_defaultValue = 99, RULE_annotation = 100, RULE_normalAnnotation = 101, 
		RULE_elementValuePairList = 102, RULE_elementValuePair = 103, RULE_elementValue = 104, 
		RULE_elementValueArrayInitializer = 105, RULE_elementValueList = 106, 
		RULE_markerAnnotation = 107, RULE_singleElementAnnotation = 108, RULE_arrayInitializer = 109, 
		RULE_variableInitializerList = 110, RULE_block = 111, RULE_blockStatements = 112, 
		RULE_blockStatement = 113, RULE_localVariableDeclarationStatement = 114, 
		RULE_localVariableDeclaration = 115, RULE_statement = 116, RULE_statementNoShortIf = 117, 
		RULE_statementWithoutTrailingSubstatement = 118, RULE_emptyStatement = 119, 
		RULE_labeledStatement = 120, RULE_labeledStatementNoShortIf = 121, RULE_expressionStatement = 122, 
		RULE_statementExpression = 123, RULE_ifThenStatement = 124, RULE_ifThenElseStatement = 125, 
		RULE_ifThenElseStatementNoShortIf = 126, RULE_assertStatement = 127, RULE_switchStatement = 128, 
		RULE_switchBlock = 129, RULE_switchBlockStatementGroup = 130, RULE_switchLabels = 131, 
		RULE_switchLabel = 132, RULE_whileStatement = 133, RULE_whileStatementNoShortIf = 134, 
		RULE_doStatement = 135, RULE_forStatement = 136, RULE_forStatementNoShortIf = 137, 
		RULE_basicForStatement = 138, RULE_basicForStatementNoShortIf = 139, RULE_forInit = 140, 
		RULE_forUpdate = 141, RULE_statementExpressionList = 142, RULE_enhancedForStatement = 143, 
		RULE_enhancedForStatementNoShortIf = 144, RULE_breakStatement = 145, RULE_continueStatement = 146, 
		RULE_returnStatement = 147, RULE_throwStatement = 148, RULE_synchronizedStatement = 149, 
		RULE_tryStatement = 150, RULE_catches = 151, RULE_catchclause = 152, RULE_catchFormalParameter = 153, 
		RULE_catchType = 154, RULE_finallyVar = 155, RULE_tryWithResourcesStatement = 156, 
		RULE_resourceSpecification = 157, RULE_resourceList = 158, RULE_resource = 159, 
		RULE_primary = 160, RULE_primary_Type_1 = 161, RULE_primary_Type_2 = 162, 
		RULE_primaryNoNewArray = 163, RULE_primaryNoNewArray_Type_2_Aa = 164, 
		RULE_primaryNoNewArray_Type_1_Aa = 165, RULE_primaryNoNewArray_Type_2_Pr = 166, 
		RULE_primaryNoNewArray_Type_2_2_2_Pr_Aa_Pr = 167, RULE_primaryNoNewArray_Type_2_1_2_Pr_Aa_Pr = 168, 
		RULE_primaryNoNewArray_Type_1_Pr = 169, RULE_primaryNoNewArray_Type_1_2_1_Pr_Aa_Pr = 170, 
		RULE_primaryNoNewArray_Type_1_1_1_Pr_Aa_Pr = 171, RULE_classLiteral = 172, 
		RULE_classInstancecreationExpression = 173, RULE_classInstancecreationExpression_Type_2_Pr = 174, 
		RULE_classInstancecreationExpression_Type_1_Pr = 175, RULE_unqualifiedclassInstancecreationExpression = 176, 
		RULE_classOrInterfaceTypeToInstantiate = 177, RULE_typeArgumentsOrDiamond = 178, 
		RULE_fieldAccess = 179, RULE_fieldAccess_Type_2_Pr = 180, RULE_fieldAccess_Type_1_Pr = 181, 
		RULE_arrayAccess = 182, RULE_arrayAccess_Type_1 = 183, RULE_arrayAccess_Type_2 = 184, 
		RULE_arrayAccess_Type_2_Pr = 185, RULE_arrayAccess_Type_2_Pr_Type_1 = 186, 
		RULE_arrayAccess_Type_2_Pr_Type_2 = 187, RULE_arrayAccess_Type_1_Pr = 188, 
		RULE_arrayAccess_Type_1_Pr_Type_1 = 189, RULE_arrayAccess_Type_1_Pr_Type_2 = 190, 
		RULE_methodInvocation = 191, RULE_methodInvocation_Type_2_Pr = 192, RULE_methodInvocation_Type_1_Pr = 193, 
		RULE_argumentList = 194, RULE_arraycreationExpression = 195, RULE_dimExprs = 196, 
		RULE_dimExpr = 197, RULE_expression = 198, RULE_lambdaExpression = 199, 
		RULE_lambdaParameters = 200, RULE_inferredFormalParameterList = 201, RULE_lambdaBody = 202, 
		RULE_assignmentExpression = 203, RULE_assignment = 204, RULE_leftHandSide = 205, 
		RULE_assignmentOperator = 206, RULE_conditionalExpression = 207, RULE_conditionalOrExpression = 208, 
		RULE_conditionalAndExpression = 209, RULE_inclusiveOrExpression = 210, 
		RULE_exclusiveOrExpression = 211, RULE_andExpression = 212, RULE_equalityExpression = 213, 
		RULE_relationalExpression = 214, RULE_shiftExpression = 215, RULE_additiveExpression = 216, 
		RULE_multiplicativeExpression = 217, RULE_unaryExpression = 218, RULE_preIncrementExpression = 219, 
		RULE_preDecrementExpression = 220, RULE_unaryExpressionNotPlusMinus = 221, 
		RULE_postfixExpression = 222, RULE_postfix_Type_1 = 223, RULE_postfix_Type_2 = 224, 
		RULE_postIncrementExpression = 225, RULE_pure_postfix_decrement = 226, 
		RULE_pure_postfix_increment = 227, RULE_postDecrementExpression = 228, 
		RULE_castExpression = 229, RULE_constantExpression = 230;
	public static final String[] ruleNames = {
		"type_1", "primitiveType", "numericType", "integralType", "floatingPointType", 
		"referenceType", "classOrInterfaceType", "type_Type_1", "type_Type_2", 
		"classType_Type_1", "classType_Type_2", "interfaceType_Type_1", "interfaceType_Type_2", 
		"classType", "interfaceType", "typeVariable", "arrayType", "dims", "typeParameter", 
		"typeParameterModifier", "typeBound", "additionalBound", "typeArguments", 
		"typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", "methodName", 
		"name", "compilationUnit", "packageDeclaration", "packageModifier", "importDeclaration", 
		"singleTypeImportDeclaration", "typeImportOnDemandDeclaration", "singleStaticImportDeclaration", 
		"staticImportOnDemandDeclaration", "typeDeclaration", "classDeclaration", 
		"normalclassDeclaration", "typeParameters", "typeParameterList", "superclass", 
		"superInterfaces", "interfaceTypeList", "classBody", "classBodyDeclaration", 
		"classMemeberDeclaration", "fieldDeclaration", "variableDeclaratorList", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "unannType", 
		"unannPrimitiveType", "unannReferenceType", "unannclassOrInterfaceType", 
		"unann_Type_Type_1", "unann_Type_Type_2", "unann_classType_Type_1", "unann_classType_Type_2", 
		"unann_InterfaceType_Type_1", "unann_InterfaceType_Type_2", "unannclassType", 
		"unannInterfaceType", "unannTypeVariable", "unannArrayType", "methodDeclaration", 
		"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", 
		"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
		"throwsVar", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorDeclarator", 
		"simpleTypeName", "constructorModifier", "constructorBody", "explicitconstructorInvocation", 
		"interfaceDeclaration", "normalInterfaceDeclaration", "modifier", "extendsInterfaces", 
		"interfaceBody", "interfaceMemberDeclaration", "constantDeclaration", 
		"constantModifier", "interfaceMethodDeclaration", "interfaceMethodModifier", 
		"defaultValue", "annotation", "normalAnnotation", "elementValuePairList", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "elementValueList", 
		"markerAnnotation", "singleElementAnnotation", "arrayInitializer", "variableInitializerList", 
		"block", "blockStatements", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "statementNoShortIf", "statementWithoutTrailingSubstatement", 
		"emptyStatement", "labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
		"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
		"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
		"tryStatement", "catches", "catchclause", "catchFormalParameter", "catchType", 
		"finallyVar", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
		"resource", "primary", "primary_Type_1", "primary_Type_2", "primaryNoNewArray", 
		"primaryNoNewArray_Type_2_Aa", "primaryNoNewArray_Type_1_Aa", "primaryNoNewArray_Type_2_Pr", 
		"primaryNoNewArray_Type_2_2_2_Pr_Aa_Pr", "primaryNoNewArray_Type_2_1_2_Pr_Aa_Pr", 
		"primaryNoNewArray_Type_1_Pr", "primaryNoNewArray_Type_1_2_1_Pr_Aa_Pr", 
		"primaryNoNewArray_Type_1_1_1_Pr_Aa_Pr", "classLiteral", "classInstancecreationExpression", 
		"classInstancecreationExpression_Type_2_Pr", "classInstancecreationExpression_Type_1_Pr", 
		"unqualifiedclassInstancecreationExpression", "classOrInterfaceTypeToInstantiate", 
		"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_Type_2_Pr", "fieldAccess_Type_1_Pr", 
		"arrayAccess", "arrayAccess_Type_1", "arrayAccess_Type_2", "arrayAccess_Type_2_Pr", 
		"arrayAccess_Type_2_Pr_Type_1", "arrayAccess_Type_2_Pr_Type_2", "arrayAccess_Type_1_Pr", 
		"arrayAccess_Type_1_Pr_Type_1", "arrayAccess_Type_1_Pr_Type_2", "methodInvocation", 
		"methodInvocation_Type_2_Pr", "methodInvocation_Type_1_Pr", "argumentList", 
		"arraycreationExpression", "dimExprs", "dimExpr", "expression", "lambdaExpression", 
		"lambdaParameters", "inferredFormalParameterList", "lambdaBody", "assignmentExpression", 
		"assignment", "leftHandSide", "assignmentOperator", "conditionalExpression", 
		"conditionalOrExpression", "conditionalAndExpression", "inclusiveOrExpression", 
		"exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression", 
		"shiftExpression", "additiveExpression", "multiplicativeExpression", "unaryExpression", 
		"preIncrementExpression", "preDecrementExpression", "unaryExpressionNotPlusMinus", 
		"postfixExpression", "postfix_Type_1", "postfix_Type_2", "postIncrementExpression", 
		"pure_postfix_decrement", "pure_postfix_increment", "postDecrementExpression", 
		"castExpression", "constantExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<<'", "'>>'", "'>>>'", "'abstract'", "'assert'", "'boolean'", 
		"'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", 
		"'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", 
		"'final'", "'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", 
		"'import'", "'instanceof'", "'int'", "'interface'", "'long'", "'native'", 
		"'new'", "'package'", "'private'", "'protected'", "'public'", "'return'", 
		"'short'", "'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", 
		"'this'", "'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
		"'while'", null, null, null, null, null, null, "'null'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
		"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
		"'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", 
		"CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", 
		"DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", 
		"IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
		"LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", 
		"RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", 
		"THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", 
		"Literal", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "NullLiteral", "LSMB", "RSMB", "LCRB", 
		"RCRB", "LSQB", "RSQB", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", 
		"NOT", "TILDE", "QMARK", "COLON", "EQEQ", "LEEQ", "GEEQ", "NTEQ", "AND", 
		"OR", "INCR", "DECR", "ADD", "SUB", "MUL", "DIV", "BAND", "BOR", "CARET", 
		"MOD", "ARROW", "DCLN", "ADDEQ", "SUBEQ", "MULEQ", "DIVEQ", "ANDEQ", "OREQ", 
		"XOREQ", "MODEQ", "LTLTEQ", "GTGTEQ", "GTGTGTEQ", "Identifier", "ATTHERATE", 
		"THREEDOTS", "WHITE_SPACE", "MULTI_LINE_COMMENT", "SINGLE_LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Type_1Context extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType_1(this);
		}
	}

	public final Type_1Context type_1() throws RecognitionException {
		Type_1Context _localctx = new Type_1Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_type_1);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				referenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitiveType);
		int _la;
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTHERATE) {
					{
					{
					setState(466);
					annotation();
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(472);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTHERATE) {
					{
					{
					setState(473);
					annotation();
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(479);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericType);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceType);
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public Type_Type_1Context type_Type_1() {
			return getRuleContext(Type_Type_1Context.class,0);
		}
		public List<Type_Type_2Context> type_Type_2() {
			return getRuleContexts(Type_Type_2Context.class);
		}
		public Type_Type_2Context type_Type_2(int i) {
			return getRuleContext(Type_Type_2Context.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			type_Type_1();
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(496);
					type_Type_2();
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Type_1Context extends ParserRuleContext {
		public ClassType_Type_1Context classType_Type_1() {
			return getRuleContext(ClassType_Type_1Context.class,0);
		}
		public InterfaceType_Type_1Context interfaceType_Type_1() {
			return getRuleContext(InterfaceType_Type_1Context.class,0);
		}
		public Type_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType_Type_1(this);
		}
	}

	public final Type_Type_1Context type_Type_1() throws RecognitionException {
		Type_Type_1Context _localctx = new Type_Type_1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_Type_1);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				classType_Type_1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				interfaceType_Type_1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Type_2Context extends ParserRuleContext {
		public ClassType_Type_2Context classType_Type_2() {
			return getRuleContext(ClassType_Type_2Context.class,0);
		}
		public InterfaceType_Type_2Context interfaceType_Type_2() {
			return getRuleContext(InterfaceType_Type_2Context.class,0);
		}
		public Type_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType_Type_2(this);
		}
	}

	public final Type_Type_2Context type_Type_2() throws RecognitionException {
		Type_Type_2Context _localctx = new Type_Type_2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_Type_2);
		try {
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				classType_Type_2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				interfaceType_Type_2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_Type_1Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_Type_1(this);
		}
	}

	public final ClassType_Type_1Context classType_Type_1() throws RecognitionException {
		ClassType_Type_1Context _localctx = new ClassType_Type_1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_Type_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTHERATE) {
				{
				{
				setState(510);
				annotation();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(Identifier);
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(517);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_Type_2Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_Type_2(this);
		}
	}

	public final ClassType_Type_2Context classType_Type_2() throws RecognitionException {
		ClassType_Type_2Context _localctx = new ClassType_Type_2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_Type_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(DOT);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTHERATE) {
				{
				{
				setState(521);
				annotation();
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			match(Identifier);
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(528);
				typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_Type_1Context extends ParserRuleContext {
		public ClassType_Type_1Context classType_Type_1() {
			return getRuleContext(ClassType_Type_1Context.class,0);
		}
		public InterfaceType_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_Type_1(this);
		}
	}

	public final InterfaceType_Type_1Context interfaceType_Type_1() throws RecognitionException {
		InterfaceType_Type_1Context _localctx = new InterfaceType_Type_1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType_Type_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			classType_Type_1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_Type_2Context extends ParserRuleContext {
		public ClassType_Type_2Context classType_Type_2() {
			return getRuleContext(ClassType_Type_2Context.class,0);
		}
		public InterfaceType_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_Type_2(this);
		}
	}

	public final InterfaceType_Type_2Context interfaceType_Type_2() throws RecognitionException {
		InterfaceType_Type_2Context _localctx = new InterfaceType_Type_2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_Type_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			classType_Type_2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classType);
		int _la;
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTHERATE) {
					{
					{
					setState(535);
					annotation();
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(541);
				match(Identifier);
				setState(543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(542);
					typeArguments();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				classOrInterfaceType();
				setState(546);
				match(DOT);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTHERATE) {
					{
					{
					setState(547);
					annotation();
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
				match(Identifier);
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(554);
					typeArguments();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTHERATE) {
				{
				{
				setState(561);
				annotation();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayType);
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				primitiveType();
				setState(570);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				classOrInterfaceType();
				setState(573);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				typeVariable();
				setState(576);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTHERATE) {
				{
				{
				setState(580);
				annotation();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(586);
			match(LSQB);
			setState(587);
			match(RSQB);
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ATTHERATE) {
						{
						{
						setState(588);
						annotation();
						}
						}
						setState(593);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(594);
					match(LSQB);
					setState(595);
					match(RSQB);
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTHERATE) {
				{
				{
				setState(601);
				typeParameterModifier();
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			match(Identifier);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(608);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeBound);
		int _la;
		try {
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(EXTENDS);
				setState(614);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				match(EXTENDS);
				setState(616);
				classOrInterfaceType();
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BAND) {
					{
					{
					setState(617);
					additionalBound();
					}
					}
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(BAND);
			setState(626);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(LT);
			setState(629);
			typeArgumentList();
			setState(630);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			typeArgument();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(633);
				match(COMMA);
				setState(634);
				typeArgument();
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeArgument);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTHERATE) {
				{
				{
				setState(644);
				annotation();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			match(QMARK);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(651);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_wildcardBounds);
		try {
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				match(EXTENDS);
				setState(655);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(SUPER);
				setState(657);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		return name(0);
	}

	private NameContext name(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NameContext _localctx = new NameContext(_ctx, _parentState);
		NameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_name, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(663);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_name);
					setState(665);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(666);
					match(DOT);
					setState(667);
					match(Identifier);
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(673);
				packageDeclaration();
				}
				break;
			}
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(676);
				importDeclaration();
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==ATTHERATE) {
				{
				{
				setState(682);
				typeDeclaration();
				}
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(688);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTHERATE) {
				{
				{
				setState(690);
				packageModifier();
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
			match(PACKAGE);
			setState(697);
			match(Identifier);
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(698);
				match(DOT);
				setState(699);
				match(Identifier);
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(705);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_importDeclaration);
		try {
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(IMPORT);
			setState(716);
			name(0);
			setState(717);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(IMPORT);
			setState(720);
			name(0);
			setState(721);
			match(DOT);
			setState(722);
			match(MUL);
			setState(723);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(IMPORT);
			setState(726);
			match(STATIC);
			setState(727);
			name(0);
			setState(728);
			match(DOT);
			setState(729);
			match(Identifier);
			setState(730);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(IMPORT);
			setState(733);
			match(STATIC);
			setState(734);
			name(0);
			setState(735);
			match(DOT);
			setState(736);
			match(MUL);
			setState(737);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeDeclaration);
		try {
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(741);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalclassDeclarationContext normalclassDeclaration() {
			return getRuleContext(NormalclassDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			normalclassDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalclassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperInterfacesContext superInterfaces() {
			return getRuleContext(SuperInterfacesContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public NormalclassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalclassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalclassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalclassDeclaration(this);
		}
	}

	public final NormalclassDeclarationContext normalclassDeclaration() throws RecognitionException {
		NormalclassDeclarationContext _localctx = new NormalclassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_normalclassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==ATTHERATE) {
				{
				{
				setState(746);
				modifier();
				}
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
			match(CLASS);
			setState(753);
			match(Identifier);
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(754);
				typeParameters();
				}
				break;
			}
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(757);
				superclass();
				}
			}

			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(760);
				superInterfaces();
				}
			}

			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(763);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(LT);
			setState(767);
			typeParameterList();
			setState(768);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			typeParameter();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(771);
				match(COMMA);
				setState(772);
				typeParameter();
				}
				}
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(EXTENDS);
			setState(779);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperInterfaces(this);
		}
	}

	public final SuperInterfacesContext superInterfaces() throws RecognitionException {
		SuperInterfacesContext _localctx = new SuperInterfacesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_superInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(IMPLEMENTS);
			setState(782);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			interfaceType();
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(785);
				match(COMMA);
				setState(786);
				interfaceType();
				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(LCRB);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << LCRB))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (Identifier - 67)) | (1L << (ATTHERATE - 67)))) != 0)) {
				{
				{
				setState(793);
				classBodyDeclaration();
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
			match(RCRB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemeberDeclarationContext classMemeberDeclaration() {
			return getRuleContext(ClassMemeberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classBodyDeclaration);
		try {
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				classMemeberDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				instanceInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				staticInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemeberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassMemeberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemeberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassMemeberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassMemeberDeclaration(this);
		}
	}

	public final ClassMemeberDeclarationContext classMemeberDeclaration() throws RecognitionException {
		ClassMemeberDeclarationContext _localctx = new ClassMemeberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classMemeberDeclaration);
		try {
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==ATTHERATE) {
				{
				{
				setState(814);
				modifier();
				}
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(820);
			unannType();
			setState(821);
			variableDeclaratorList();
			setState(822);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			variableDeclarator();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(825);
				match(COMMA);
				setState(826);
				variableDeclarator();
				}
				}
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			variableDeclaratorId();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSIGN) {
				{
				{
				setState(833);
				match(ASSIGN);
				setState(834);
				variableInitializer();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(Identifier);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQB || _la==ATTHERATE) {
				{
				setState(841);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variableInitializer);
		try {
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case Literal:
			case LSMB:
			case LSQB:
			case NOT:
			case TILDE:
			case INCR:
			case DECR:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				expression();
				}
				break;
			case LCRB:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unannType);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				unannReferenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				unannPrimitiveType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unannPrimitiveType);
		try {
			setState(854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannclassOrInterfaceTypeContext unannclassOrInterfaceType() {
			return getRuleContext(UnannclassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unannReferenceType);
		try {
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				unannclassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(858);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannclassOrInterfaceTypeContext extends ParserRuleContext {
		public Unann_Type_Type_1Context unann_Type_Type_1() {
			return getRuleContext(Unann_Type_Type_1Context.class,0);
		}
		public List<Unann_Type_Type_2Context> unann_Type_Type_2() {
			return getRuleContexts(Unann_Type_Type_2Context.class);
		}
		public Unann_Type_Type_2Context unann_Type_Type_2(int i) {
			return getRuleContext(Unann_Type_Type_2Context.class,i);
		}
		public UnannclassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannclassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannclassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannclassOrInterfaceType(this);
		}
	}

	public final UnannclassOrInterfaceTypeContext unannclassOrInterfaceType() throws RecognitionException {
		UnannclassOrInterfaceTypeContext _localctx = new UnannclassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unannclassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			unann_Type_Type_1();
			setState(865);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(862);
					unann_Type_Type_2();
					}
					} 
				}
				setState(867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unann_Type_Type_1Context extends ParserRuleContext {
		public Unann_classType_Type_1Context unann_classType_Type_1() {
			return getRuleContext(Unann_classType_Type_1Context.class,0);
		}
		public Unann_InterfaceType_Type_1Context unann_InterfaceType_Type_1() {
			return getRuleContext(Unann_InterfaceType_Type_1Context.class,0);
		}
		public Unann_Type_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unann_Type_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnann_Type_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnann_Type_Type_1(this);
		}
	}

	public final Unann_Type_Type_1Context unann_Type_Type_1() throws RecognitionException {
		Unann_Type_Type_1Context _localctx = new Unann_Type_Type_1Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_unann_Type_Type_1);
		try {
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				unann_classType_Type_1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				unann_InterfaceType_Type_1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unann_Type_Type_2Context extends ParserRuleContext {
		public Unann_classType_Type_2Context unann_classType_Type_2() {
			return getRuleContext(Unann_classType_Type_2Context.class,0);
		}
		public Unann_InterfaceType_Type_2Context unann_InterfaceType_Type_2() {
			return getRuleContext(Unann_InterfaceType_Type_2Context.class,0);
		}
		public Unann_Type_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unann_Type_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnann_Type_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnann_Type_Type_2(this);
		}
	}

	public final Unann_Type_Type_2Context unann_Type_Type_2() throws RecognitionException {
		Unann_Type_Type_2Context _localctx = new Unann_Type_Type_2Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_unann_Type_Type_2);
		try {
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				unann_classType_Type_2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				unann_InterfaceType_Type_2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unann_classType_Type_1Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Unann_classType_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unann_classType_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnann_classType_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnann_classType_Type_1(this);
		}
	}

	public final Unann_classType_Type_1Context unann_classType_Type_1() throws RecognitionException {
		Unann_classType_Type_1Context _localctx = new Unann_classType_Type_1Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_unann_classType_Type_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(Identifier);
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(877);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unann_classType_Type_2Context extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public Unann_classType_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unann_classType_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnann_classType_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnann_classType_Type_2(this);
		}
	}

	public final Unann_classType_Type_2Context unann_classType_Type_2() throws RecognitionException {
		Unann_classType_Type_2Context _localctx = new Unann_classType_Type_2Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_unann_classType_Type_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(DOT);
			setState(881);
			match(Identifier);
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(882);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unann_InterfaceType_Type_1Context extends ParserRuleContext {
		public Unann_classType_Type_1Context unann_classType_Type_1() {
			return getRuleContext(Unann_classType_Type_1Context.class,0);
		}
		public Unann_InterfaceType_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unann_InterfaceType_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnann_InterfaceType_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnann_InterfaceType_Type_1(this);
		}
	}

	public final Unann_InterfaceType_Type_1Context unann_InterfaceType_Type_1() throws RecognitionException {
		Unann_InterfaceType_Type_1Context _localctx = new Unann_InterfaceType_Type_1Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_unann_InterfaceType_Type_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			unann_classType_Type_1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unann_InterfaceType_Type_2Context extends ParserRuleContext {
		public Unann_classType_Type_2Context unann_classType_Type_2() {
			return getRuleContext(Unann_classType_Type_2Context.class,0);
		}
		public Unann_InterfaceType_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unann_InterfaceType_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnann_InterfaceType_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnann_InterfaceType_Type_2(this);
		}
	}

	public final Unann_InterfaceType_Type_2Context unann_InterfaceType_Type_2() throws RecognitionException {
		Unann_InterfaceType_Type_2Context _localctx = new Unann_InterfaceType_Type_2Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_unann_InterfaceType_Type_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			unann_classType_Type_2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannclassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannclassOrInterfaceTypeContext unannclassOrInterfaceType() {
			return getRuleContext(UnannclassOrInterfaceTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannclassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannclassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannclassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannclassType(this);
		}
	}

	public final UnannclassTypeContext unannclassType() throws RecognitionException {
		UnannclassTypeContext _localctx = new UnannclassTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannclassType);
		int _la;
		try {
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				match(Identifier);
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(890);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				unannclassOrInterfaceType();
				setState(894);
				match(DOT);
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTHERATE) {
					{
					{
					setState(895);
					annotation();
					}
					}
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(901);
				match(Identifier);
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(902);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannclassTypeContext unannclassType() {
			return getRuleContext(UnannclassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			unannclassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannclassOrInterfaceTypeContext unannclassOrInterfaceType() {
			return getRuleContext(UnannclassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannArrayType);
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				unannPrimitiveType();
				setState(912);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(914);
				unannclassOrInterfaceType();
				setState(915);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				unannTypeVariable();
				setState(918);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==ATTHERATE) {
				{
				{
				setState(922);
				modifier();
				}
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(928);
			methodHeader();
			setState(929);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public ThrowsVarContext throwsVar() {
			return getRuleContext(ThrowsVarContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_methodHeader);
		int _la;
		try {
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				result();
				setState(932);
				methodDeclarator();
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(933);
					throwsVar();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				typeParameters();
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTHERATE) {
					{
					{
					setState(937);
					annotation();
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(943);
				result();
				setState(944);
				methodDeclarator();
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(945);
					throwsVar();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_result);
		try {
			setState(952);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(Identifier);
			setState(955);
			match(LSMB);
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==ATTHERATE) {
				{
				setState(956);
				formalParameterList();
				}
			}

			setState(959);
			match(RSMB);
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQB || _la==ATTHERATE) {
				{
				setState(960);
				dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_formalParameterList);
		try {
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				receiverParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				formalParameters();
				setState(965);
				match(COMMA);
				setState(966);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(968);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_formalParameters);
		try {
			int _alt;
			setState(983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				formalParameter();
				setState(976);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(972);
						match(COMMA);
						setState(973);
						formalParameter();
						}
						} 
					}
					setState(978);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				receiverParameter();
				{
				setState(980);
				match(COMMA);
				setState(981);
				formalParameter();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==ATTHERATE) {
				{
				{
				setState(985);
				variableModifier();
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(991);
			unannType();
			setState(992);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_variableModifier);
		try {
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTHERATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==ATTHERATE) {
					{
					{
					setState(998);
					variableModifier();
					}
					}
					setState(1003);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1004);
				unannType();
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTHERATE) {
					{
					{
					setState(1005);
					annotation();
					}
					}
					setState(1010);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1011);
				match(THREEDOTS);
				setState(1012);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTHERATE) {
				{
				{
				setState(1017);
				annotation();
				}
				}
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1023);
			unannType();
			{
			setState(1024);
			match(Identifier);
			setState(1025);
			match(DOT);
			}
			setState(1027);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowsVarContext extends ParserRuleContext {
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public ThrowsVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrowsVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrowsVar(this);
		}
	}

	public final ThrowsVarContext throwsVar() throws RecognitionException {
		ThrowsVarContext _localctx = new ThrowsVarContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_throwsVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(THROWS);
			setState(1030);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			exceptionType();
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1033);
				match(COMMA);
				setState(1034);
				exceptionType();
				}
				}
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_exceptionType);
		try {
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1040);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_methodBody);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCRB:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(STATIC);
			setState(1051);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public List<ThrowsVarContext> throwsVar() {
			return getRuleContexts(ThrowsVarContext.class);
		}
		public ThrowsVarContext throwsVar(int i) {
			return getRuleContext(ThrowsVarContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==ATTHERATE) {
				{
				{
				setState(1053);
				constructorModifier();
				}
				}
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1059);
			constructorDeclarator();
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==THROWS) {
				{
				{
				setState(1060);
				throwsVar();
				}
				}
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1066);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1068);
				typeParameters();
				}
			}

			setState(1071);
			simpleTypeName();
			setState(1072);
			match(LSMB);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==ATTHERATE) {
				{
				setState(1073);
				formalParameterList();
				}
			}

			setState(1076);
			match(RSMB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_constructorModifier);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTHERATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1082);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1083);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitconstructorInvocationContext explicitconstructorInvocation() {
			return getRuleContext(ExplicitconstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(LCRB);
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1087);
				explicitconstructorInvocation();
				}
				break;
			}
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << Literal) | (1L << LSMB) | (1L << LCRB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (SEMI - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (Identifier - 65)) | (1L << (ATTHERATE - 65)))) != 0)) {
				{
				setState(1090);
				blockStatements();
				}
			}

			setState(1093);
			match(RCRB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitconstructorInvocationContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitconstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitconstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExplicitconstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExplicitconstructorInvocation(this);
		}
	}

	public final ExplicitconstructorInvocationContext explicitconstructorInvocation() throws RecognitionException {
		ExplicitconstructorInvocationContext _localctx = new ExplicitconstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_explicitconstructorInvocation);
		int _la;
		try {
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1095);
					typeArguments();
					}
				}

				setState(1098);
				match(THIS);
				setState(1099);
				match(LSMB);
				setState(1100);
				argumentList();
				setState(1101);
				match(RSMB);
				setState(1102);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1104);
					typeArguments();
					}
				}

				setState(1107);
				match(SUPER);
				setState(1108);
				match(LSMB);
				setState(1109);
				argumentList();
				setState(1110);
				match(RSMB);
				setState(1111);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1113);
				name(0);
				setState(1114);
				match(DOT);
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1115);
					typeArguments();
					}
				}

				setState(1118);
				match(SUPER);
				setState(1119);
				match(LSMB);
				setState(1120);
				argumentList();
				setState(1121);
				match(RSMB);
				setState(1122);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1124);
				primary();
				setState(1125);
				match(DOT);
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1126);
					typeArguments();
					}
				}

				setState(1129);
				match(SUPER);
				setState(1130);
				match(LSMB);
				setState(1131);
				argumentList();
				setState(1132);
				match(RSMB);
				setState(1133);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			normalInterfaceDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==ATTHERATE) {
				{
				{
				setState(1139);
				modifier();
				}
				}
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1145);
			match(INTERFACE);
			setState(1146);
			match(Identifier);
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1147);
				typeParameters();
				}
			}

			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1150);
				extendsInterfaces();
				}
			}

			setState(1153);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_modifier);
		try {
			setState(1163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTHERATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1157);
				match(PRIVATE);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 4);
				{
				setState(1158);
				match(PROTECTED);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1159);
				match(FINAL);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1160);
				match(ABSTRACT);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1161);
				match(STRICTFP);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 8);
				{
				setState(1162);
				match(STATIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(EXTENDS);
			setState(1166);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(LCRB);
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (Identifier - 67)) | (1L << (ATTHERATE - 67)))) != 0)) {
				{
				{
				setState(1169);
				interfaceMemberDeclaration();
				}
				}
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1175);
			match(RCRB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_interfaceMemberDeclaration);
		try {
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1179);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1180);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1181);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==ATTHERATE) {
				{
				{
				setState(1184);
				constantModifier();
				}
				}
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1190);
			unannType();
			setState(1191);
			variableDeclaratorList();
			setState(1192);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_constantModifier);
		try {
			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTHERATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1196);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1197);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==ATTHERATE) {
				{
				{
				setState(1200);
				interfaceMethodModifier();
				}
				}
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1206);
			methodHeader();
			setState(1207);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_interfaceMethodModifier);
		try {
			setState(1215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTHERATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1210);
				match(PUBLIC);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1211);
				match(DEFAULT);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1212);
				match(ABSTRACT);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1213);
				match(STRICTFP);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1214);
				match(STATIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(DEFAULT);
			setState(1218);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_annotation);
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1220);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1222);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(ATTHERATE);
			setState(1226);
			name(0);
			setState(1227);
			match(LSMB);
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1228);
				elementValuePairList();
				}
			}

			setState(1231);
			match(RSMB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			elementValuePair();
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1234);
				match(COMMA);
				setState(1235);
				elementValuePair();
				}
				}
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(Identifier);
			setState(1242);
			match(ASSIGN);
			setState(1243);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_elementValue);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case Literal:
			case LSMB:
			case NOT:
			case TILDE:
			case INCR:
			case DECR:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				conditionalExpression();
				}
				break;
			case LCRB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				elementValueArrayInitializer();
				}
				break;
			case ATTHERATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(LCRB);
			setState(1251);
			elementValueList();
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1252);
				match(COMMA);
				}
			}

			setState(1255);
			match(RCRB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			elementValue();
			setState(1262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1258);
					match(COMMA);
					setState(1259);
					elementValue();
					}
					} 
				}
				setState(1264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			match(ATTHERATE);
			setState(1266);
			name(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(ATTHERATE);
			setState(1269);
			name(0);
			setState(1270);
			match(LSMB);
			setState(1271);
			elementValue();
			setState(1272);
			match(RSMB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			match(LCRB);
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB) | (1L << LCRB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1275);
				variableInitializerList();
				}
			}

			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1278);
				match(COMMA);
				}
			}

			setState(1281);
			match(RCRB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			variableInitializer();
			setState(1288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1284);
					match(COMMA);
					setState(1285);
					variableInitializer();
					}
					} 
				}
				setState(1290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			match(LCRB);
			setState(1293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << Literal) | (1L << LSMB) | (1L << LCRB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (SEMI - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (Identifier - 65)) | (1L << (ATTHERATE - 65)))) != 0)) {
				{
				setState(1292);
				blockStatements();
				}
			}

			setState(1295);
			match(RCRB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			blockStatement();
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << Literal) | (1L << LSMB) | (1L << LCRB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (SEMI - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (Identifier - 65)) | (1L << (ATTHERATE - 65)))) != 0)) {
				{
				{
				setState(1298);
				blockStatement();
				}
				}
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_blockStatement);
		try {
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1306);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			localVariableDeclaration();
			setState(1310);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==ATTHERATE) {
				{
				{
				setState(1312);
				variableModifier();
				}
				}
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1318);
			unannType();
			setState(1319);
			variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_statement);
		try {
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1322);
				labeledStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1323);
				ifThenStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1324);
				ifThenElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1325);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1326);
				forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_statementNoShortIf);
		try {
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1331);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1332);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1333);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCRB:
				enterOuterAlt(_localctx, 1);
				{
				setState(1336);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1337);
				emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case Literal:
			case LSMB:
			case LSQB:
			case INCR:
			case DECR:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1338);
				expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1339);
				assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1340);
				switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1341);
				doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1342);
				breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1343);
				continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1344);
				returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1345);
				synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1346);
				throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1347);
				tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(Identifier);
			setState(1353);
			match(COLON);
			setState(1354);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(Identifier);
			setState(1357);
			match(COLON);
			setState(1358);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			statementExpression();
			setState(1361);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstancecreationExpressionContext classInstancecreationExpression() {
			return getRuleContext(ClassInstancecreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_statementExpression);
		try {
			setState(1370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1363);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1364);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1365);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1366);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1367);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1368);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1369);
				classInstancecreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			match(IF);
			setState(1373);
			match(LSMB);
			setState(1374);
			expression();
			setState(1375);
			match(RSMB);
			setState(1376);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(IF);
			setState(1379);
			match(LSMB);
			setState(1380);
			expression();
			setState(1381);
			match(RSMB);
			setState(1382);
			statementNoShortIf();
			setState(1383);
			match(ELSE);
			setState(1384);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(IF);
			setState(1387);
			match(LSMB);
			setState(1388);
			expression();
			setState(1389);
			match(RSMB);
			setState(1390);
			statementNoShortIf();
			setState(1391);
			match(ELSE);
			setState(1392);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_assertStatement);
		try {
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1394);
				match(ASSERT);
				setState(1395);
				expression();
				setState(1396);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
				match(ASSERT);
				setState(1399);
				expression();
				setState(1400);
				match(COLON);
				setState(1401);
				expression();
				setState(1402);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(SWITCH);
			setState(1407);
			match(LSMB);
			setState(1408);
			expression();
			setState(1409);
			match(RSMB);
			setState(1410);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(LCRB);
			setState(1416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1413);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			setState(1422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1419);
				switchLabel();
				}
				}
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1425);
			match(RCRB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			switchLabels();
			setState(1428);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			switchLabel();
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1431);
				switchLabel();
				}
				}
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_switchLabel);
		try {
			setState(1443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				match(CASE);
				setState(1438);
				constantExpression();
				setState(1439);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1441);
				match(DEFAULT);
				setState(1442);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(WHILE);
			setState(1446);
			match(LSMB);
			setState(1447);
			expression();
			setState(1448);
			match(RSMB);
			setState(1449);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(WHILE);
			setState(1452);
			match(LSMB);
			setState(1453);
			expression();
			setState(1454);
			match(RSMB);
			setState(1455);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			match(DO);
			setState(1458);
			statement();
			setState(1459);
			match(WHILE);
			setState(1460);
			match(LSMB);
			setState(1461);
			expression();
			setState(1462);
			match(RSMB);
			setState(1463);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_forStatement);
		try {
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_forStatementNoShortIf);
		try {
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			match(FOR);
			setState(1474);
			match(LSMB);
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (Identifier - 65)) | (1L << (ATTHERATE - 65)))) != 0)) {
				{
				setState(1475);
				forInit();
				}
			}

			setState(1478);
			match(SEMI);
			setState(1480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1479);
				expression();
				}
			}

			setState(1482);
			match(SEMI);
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1483);
				forUpdate();
				}
			}

			setState(1486);
			match(RSMB);
			setState(1487);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			match(FOR);
			setState(1490);
			match(LSMB);
			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (Identifier - 65)) | (1L << (ATTHERATE - 65)))) != 0)) {
				{
				setState(1491);
				forInit();
				}
			}

			setState(1494);
			match(SEMI);
			setState(1496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1495);
				expression();
				}
			}

			setState(1498);
			match(SEMI);
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1499);
				forUpdate();
				}
			}

			setState(1502);
			match(RSMB);
			setState(1503);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_forInit);
		try {
			setState(1507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1505);
				statementExpressionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1506);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			statementExpression();
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1512);
				match(COMMA);
				setState(1513);
				statementExpression();
				}
				}
				setState(1518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			match(FOR);
			setState(1520);
			match(LSMB);
			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==ATTHERATE) {
				{
				{
				setState(1521);
				variableModifier();
				}
				}
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1527);
			unannType();
			setState(1528);
			variableDeclaratorId();
			setState(1529);
			match(COLON);
			setState(1530);
			expression();
			setState(1531);
			match(RSMB);
			setState(1532);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			match(FOR);
			setState(1535);
			match(LSMB);
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==ATTHERATE) {
				{
				{
				setState(1536);
				variableModifier();
				}
				}
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1542);
			unannType();
			setState(1543);
			variableDeclaratorId();
			setState(1544);
			match(COLON);
			setState(1545);
			expression();
			setState(1546);
			match(RSMB);
			setState(1547);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(BREAK);
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1550);
				match(Identifier);
				}
			}

			setState(1553);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(CONTINUE);
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1556);
				match(Identifier);
				}
			}

			setState(1559);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			match(RETURN);
			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1562);
				expression();
				}
			}

			setState(1565);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(THROW);
			setState(1568);
			expression();
			setState(1569);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(SYNCHRONIZED);
			setState(1572);
			match(LSMB);
			setState(1573);
			expression();
			setState(1574);
			match(RSMB);
			setState(1575);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public FinallyVarContext finallyVar() {
			return getRuleContext(FinallyVarContext.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_tryStatement);
		int _la;
		try {
			setState(1589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1577);
				match(TRY);
				setState(1578);
				block();
				setState(1579);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1581);
				match(TRY);
				setState(1582);
				block();
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1583);
					catches();
					}
				}

				setState(1586);
				finallyVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1588);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchclauseContext> catchclause() {
			return getRuleContexts(CatchclauseContext.class);
		}
		public CatchclauseContext catchclause(int i) {
			return getRuleContext(CatchclauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			catchclause();
			setState(1595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1592);
				catchclause();
				}
				}
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchclauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchclause(this);
		}
	}

	public final CatchclauseContext catchclause() throws RecognitionException {
		CatchclauseContext _localctx = new CatchclauseContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_catchclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			match(CATCH);
			setState(1599);
			match(LSMB);
			setState(1600);
			catchFormalParameter();
			setState(1601);
			match(RSMB);
			setState(1602);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==ATTHERATE) {
				{
				{
				setState(1604);
				variableModifier();
				}
				}
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1610);
			catchType();
			setState(1611);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannclassTypeContext unannclassType() {
			return getRuleContext(UnannclassTypeContext.class,0);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			unannclassType();
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOR) {
				{
				{
				setState(1614);
				match(BOR);
				setState(1615);
				classType();
				}
				}
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyVarContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinallyVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinallyVar(this);
		}
	}

	public final FinallyVarContext finallyVar() throws RecognitionException {
		FinallyVarContext _localctx = new FinallyVarContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_finallyVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			match(FINALLY);
			setState(1622);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public FinallyVarContext finallyVar() {
			return getRuleContext(FinallyVarContext.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			match(TRY);
			setState(1625);
			resourceSpecification();
			setState(1626);
			block();
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1627);
				catches();
				}
			}

			setState(1631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1630);
				finallyVar();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(LSMB);
			setState(1634);
			resourceList();
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1635);
				match(SEMI);
				}
			}

			setState(1638);
			match(RSMB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			resource();
			setState(1645);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1641);
					match(SEMI);
					setState(1642);
					resource();
					}
					} 
				}
				setState(1647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==ATTHERATE) {
				{
				{
				setState(1648);
				variableModifier();
				}
				}
				setState(1653);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1654);
			unannType();
			setState(1655);
			variableDeclaratorId();
			setState(1656);
			match(ASSIGN);
			setState(1657);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public Primary_Type_1Context primary_Type_1() {
			return getRuleContext(Primary_Type_1Context.class,0);
		}
		public List<Primary_Type_2Context> primary_Type_2() {
			return getRuleContexts(Primary_Type_2Context.class);
		}
		public Primary_Type_2Context primary_Type_2(int i) {
			return getRuleContext(Primary_Type_2Context.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			primary_Type_1();
			setState(1663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1660);
					primary_Type_2();
					}
					} 
				}
				setState(1665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_Type_1Context extends ParserRuleContext {
		public PrimaryNoNewArray_Type_1_PrContext primaryNoNewArray_Type_1_Pr() {
			return getRuleContext(PrimaryNoNewArray_Type_1_PrContext.class,0);
		}
		public ArraycreationExpressionContext arraycreationExpression() {
			return getRuleContext(ArraycreationExpressionContext.class,0);
		}
		public Primary_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary_Type_1(this);
		}
	}

	public final Primary_Type_1Context primary_Type_1() throws RecognitionException {
		Primary_Type_1Context _localctx = new Primary_Type_1Context(_ctx, getState());
		enterRule(_localctx, 322, RULE_primary_Type_1);
		try {
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666);
				primaryNoNewArray_Type_1_Pr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1667);
				arraycreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_Type_2Context extends ParserRuleContext {
		public PrimaryNoNewArray_Type_2_PrContext primaryNoNewArray_Type_2_Pr() {
			return getRuleContext(PrimaryNoNewArray_Type_2_PrContext.class,0);
		}
		public Primary_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary_Type_2(this);
		}
	}

	public final Primary_Type_2Context primary_Type_2() throws RecognitionException {
		Primary_Type_2Context _localctx = new Primary_Type_2Context(_ctx, getState());
		enterRule(_localctx, 324, RULE_primary_Type_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			primaryNoNewArray_Type_2_Pr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public TerminalNode Literal() { return getToken(Java8Parser.Literal, 0); }
		public ClassLiteralContext classLiteral() {
			return getRuleContext(ClassLiteralContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstancecreationExpressionContext classInstancecreationExpression() {
			return getRuleContext(ClassInstancecreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_primaryNoNewArray);
		try {
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1672);
				match(Literal);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1673);
				classLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1674);
				match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1675);
				name(0);
				setState(1676);
				match(DOT);
				setState(1677);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1679);
				match(LSMB);
				setState(1680);
				expression();
				setState(1681);
				match(RSMB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1683);
				classInstancecreationExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1684);
				fieldAccess();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1685);
				arrayAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1686);
				methodInvocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_Type_2_AaContext extends ParserRuleContext {
		public PrimaryNoNewArray_Type_2_AaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_Type_2_Aa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_Type_2_Aa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_Type_2_Aa(this);
		}
	}

	public final PrimaryNoNewArray_Type_2_AaContext primaryNoNewArray_Type_2_Aa() throws RecognitionException {
		PrimaryNoNewArray_Type_2_AaContext _localctx = new PrimaryNoNewArray_Type_2_AaContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_primaryNoNewArray_Type_2_Aa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_Type_1_AaContext extends ParserRuleContext {
		public TerminalNode Literal() { return getToken(Java8Parser.Literal, 0); }
		public ClassLiteralContext classLiteral() {
			return getRuleContext(ClassLiteralContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstancecreationExpressionContext classInstancecreationExpression() {
			return getRuleContext(ClassInstancecreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public PrimaryNoNewArray_Type_1_AaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_Type_1_Aa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_Type_1_Aa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_Type_1_Aa(this);
		}
	}

	public final PrimaryNoNewArray_Type_1_AaContext primaryNoNewArray_Type_1_Aa() throws RecognitionException {
		PrimaryNoNewArray_Type_1_AaContext _localctx = new PrimaryNoNewArray_Type_1_AaContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_primaryNoNewArray_Type_1_Aa);
		try {
			setState(1705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1691);
				match(Literal);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1692);
				classLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1693);
				match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1694);
				name(0);
				setState(1695);
				match(DOT);
				setState(1696);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1698);
				match(LSMB);
				setState(1699);
				expression();
				setState(1700);
				match(RSMB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1702);
				classInstancecreationExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1703);
				fieldAccess();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1704);
				methodInvocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_Type_2_PrContext extends ParserRuleContext {
		public ClassInstancecreationExpression_Type_2_PrContext classInstancecreationExpression_Type_2_Pr() {
			return getRuleContext(ClassInstancecreationExpression_Type_2_PrContext.class,0);
		}
		public FieldAccess_Type_2_PrContext fieldAccess_Type_2_Pr() {
			return getRuleContext(FieldAccess_Type_2_PrContext.class,0);
		}
		public ArrayAccess_Type_2_PrContext arrayAccess_Type_2_Pr() {
			return getRuleContext(ArrayAccess_Type_2_PrContext.class,0);
		}
		public MethodInvocation_Type_2_PrContext methodInvocation_Type_2_Pr() {
			return getRuleContext(MethodInvocation_Type_2_PrContext.class,0);
		}
		public PrimaryNoNewArray_Type_2_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_Type_2_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_Type_2_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_Type_2_Pr(this);
		}
	}

	public final PrimaryNoNewArray_Type_2_PrContext primaryNoNewArray_Type_2_Pr() throws RecognitionException {
		PrimaryNoNewArray_Type_2_PrContext _localctx = new PrimaryNoNewArray_Type_2_PrContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_primaryNoNewArray_Type_2_Pr);
		try {
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1707);
				classInstancecreationExpression_Type_2_Pr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1708);
				fieldAccess_Type_2_Pr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1709);
				arrayAccess_Type_2_Pr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1710);
				methodInvocation_Type_2_Pr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_Type_2_2_2_Pr_Aa_PrContext extends ParserRuleContext {
		public PrimaryNoNewArray_Type_2_2_2_Pr_Aa_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_Type_2_2_2_Pr_Aa_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_Type_2_2_2_Pr_Aa_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_Type_2_2_2_Pr_Aa_Pr(this);
		}
	}

	public final PrimaryNoNewArray_Type_2_2_2_Pr_Aa_PrContext primaryNoNewArray_Type_2_2_2_Pr_Aa_Pr() throws RecognitionException {
		PrimaryNoNewArray_Type_2_2_2_Pr_Aa_PrContext _localctx = new PrimaryNoNewArray_Type_2_2_2_Pr_Aa_PrContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_primaryNoNewArray_Type_2_2_2_Pr_Aa_Pr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_Type_2_1_2_Pr_Aa_PrContext extends ParserRuleContext {
		public ClassInstancecreationExpression_Type_2_PrContext classInstancecreationExpression_Type_2_Pr() {
			return getRuleContext(ClassInstancecreationExpression_Type_2_PrContext.class,0);
		}
		public FieldAccess_Type_2_PrContext fieldAccess_Type_2_Pr() {
			return getRuleContext(FieldAccess_Type_2_PrContext.class,0);
		}
		public MethodInvocation_Type_2_PrContext methodInvocation_Type_2_Pr() {
			return getRuleContext(MethodInvocation_Type_2_PrContext.class,0);
		}
		public PrimaryNoNewArray_Type_2_1_2_Pr_Aa_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_Type_2_1_2_Pr_Aa_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_Type_2_1_2_Pr_Aa_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_Type_2_1_2_Pr_Aa_Pr(this);
		}
	}

	public final PrimaryNoNewArray_Type_2_1_2_Pr_Aa_PrContext primaryNoNewArray_Type_2_1_2_Pr_Aa_Pr() throws RecognitionException {
		PrimaryNoNewArray_Type_2_1_2_Pr_Aa_PrContext _localctx = new PrimaryNoNewArray_Type_2_1_2_Pr_Aa_PrContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_primaryNoNewArray_Type_2_1_2_Pr_Aa_Pr);
		try {
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1715);
				classInstancecreationExpression_Type_2_Pr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1716);
				fieldAccess_Type_2_Pr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1717);
				methodInvocation_Type_2_Pr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_Type_1_PrContext extends ParserRuleContext {
		public TerminalNode Literal() { return getToken(Java8Parser.Literal, 0); }
		public ClassLiteralContext classLiteral() {
			return getRuleContext(ClassLiteralContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstancecreationExpression_Type_1_PrContext classInstancecreationExpression_Type_1_Pr() {
			return getRuleContext(ClassInstancecreationExpression_Type_1_PrContext.class,0);
		}
		public FieldAccess_Type_1_PrContext fieldAccess_Type_1_Pr() {
			return getRuleContext(FieldAccess_Type_1_PrContext.class,0);
		}
		public ArrayAccess_Type_1_PrContext arrayAccess_Type_1_Pr() {
			return getRuleContext(ArrayAccess_Type_1_PrContext.class,0);
		}
		public MethodInvocation_Type_1_PrContext methodInvocation_Type_1_Pr() {
			return getRuleContext(MethodInvocation_Type_1_PrContext.class,0);
		}
		public PrimaryNoNewArray_Type_1_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_Type_1_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_Type_1_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_Type_1_Pr(this);
		}
	}

	public final PrimaryNoNewArray_Type_1_PrContext primaryNoNewArray_Type_1_Pr() throws RecognitionException {
		PrimaryNoNewArray_Type_1_PrContext _localctx = new PrimaryNoNewArray_Type_1_PrContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_primaryNoNewArray_Type_1_Pr);
		try {
			setState(1735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1720);
				match(Literal);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1721);
				classLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1722);
				match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1723);
				name(0);
				setState(1724);
				match(DOT);
				setState(1725);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1727);
				match(LSMB);
				setState(1728);
				expression();
				setState(1729);
				match(RSMB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1731);
				classInstancecreationExpression_Type_1_Pr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1732);
				fieldAccess_Type_1_Pr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1733);
				arrayAccess_Type_1_Pr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1734);
				methodInvocation_Type_1_Pr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_Type_1_2_1_Pr_Aa_PrContext extends ParserRuleContext {
		public PrimaryNoNewArray_Type_1_2_1_Pr_Aa_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_Type_1_2_1_Pr_Aa_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_Type_1_2_1_Pr_Aa_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_Type_1_2_1_Pr_Aa_Pr(this);
		}
	}

	public final PrimaryNoNewArray_Type_1_2_1_Pr_Aa_PrContext primaryNoNewArray_Type_1_2_1_Pr_Aa_Pr() throws RecognitionException {
		PrimaryNoNewArray_Type_1_2_1_Pr_Aa_PrContext _localctx = new PrimaryNoNewArray_Type_1_2_1_Pr_Aa_PrContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_primaryNoNewArray_Type_1_2_1_Pr_Aa_Pr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_Type_1_1_1_Pr_Aa_PrContext extends ParserRuleContext {
		public TerminalNode Literal() { return getToken(Java8Parser.Literal, 0); }
		public ClassLiteralContext classLiteral() {
			return getRuleContext(ClassLiteralContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstancecreationExpression_Type_1_PrContext classInstancecreationExpression_Type_1_Pr() {
			return getRuleContext(ClassInstancecreationExpression_Type_1_PrContext.class,0);
		}
		public FieldAccess_Type_1_PrContext fieldAccess_Type_1_Pr() {
			return getRuleContext(FieldAccess_Type_1_PrContext.class,0);
		}
		public MethodInvocation_Type_1_PrContext methodInvocation_Type_1_Pr() {
			return getRuleContext(MethodInvocation_Type_1_PrContext.class,0);
		}
		public PrimaryNoNewArray_Type_1_1_1_Pr_Aa_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_Type_1_1_1_Pr_Aa_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_Type_1_1_1_Pr_Aa_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_Type_1_1_1_Pr_Aa_Pr(this);
		}
	}

	public final PrimaryNoNewArray_Type_1_1_1_Pr_Aa_PrContext primaryNoNewArray_Type_1_1_1_Pr_Aa_Pr() throws RecognitionException {
		PrimaryNoNewArray_Type_1_1_1_Pr_Aa_PrContext _localctx = new PrimaryNoNewArray_Type_1_1_1_Pr_Aa_PrContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_primaryNoNewArray_Type_1_1_1_Pr_Aa_Pr);
		try {
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1739);
				match(Literal);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
				classLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1741);
				match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1742);
				name(0);
				setState(1743);
				match(DOT);
				setState(1744);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1746);
				match(LSMB);
				setState(1747);
				expression();
				setState(1748);
				match(RSMB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1750);
				classInstancecreationExpression_Type_1_Pr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1751);
				fieldAccess_Type_1_Pr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1752);
				methodInvocation_Type_1_Pr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassLiteralContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public ClassLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassLiteral(this);
		}
	}

	public final ClassLiteralContext classLiteral() throws RecognitionException {
		ClassLiteralContext _localctx = new ClassLiteralContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_classLiteral);
		int _la;
		try {
			setState(1790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1755);
				name(0);
				setState(1760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQB) {
					{
					{
					setState(1756);
					match(LSQB);
					setState(1757);
					match(RSQB);
					}
					}
					setState(1762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1763);
				match(DOT);
				setState(1764);
				match(CLASS);
				}
				break;
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766);
				numericType();
				setState(1771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQB) {
					{
					{
					setState(1767);
					match(LSQB);
					setState(1768);
					match(RSQB);
					}
					}
					setState(1773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1774);
				match(DOT);
				setState(1775);
				match(CLASS);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1777);
				match(BOOLEAN);
				setState(1782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LSQB) {
					{
					{
					setState(1778);
					match(LSQB);
					setState(1779);
					match(RSQB);
					}
					}
					setState(1784);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1785);
				match(DOT);
				setState(1786);
				match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(1787);
				match(VOID);
				setState(1788);
				match(DOT);
				setState(1789);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstancecreationExpressionContext extends ParserRuleContext {
		public UnqualifiedclassInstancecreationExpressionContext unqualifiedclassInstancecreationExpression() {
			return getRuleContext(UnqualifiedclassInstancecreationExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstancecreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstancecreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstancecreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstancecreationExpression(this);
		}
	}

	public final ClassInstancecreationExpressionContext classInstancecreationExpression() throws RecognitionException {
		ClassInstancecreationExpressionContext _localctx = new ClassInstancecreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_classInstancecreationExpression);
		try {
			setState(1801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1792);
				unqualifiedclassInstancecreationExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793);
				name(0);
				setState(1794);
				match(DOT);
				setState(1795);
				unqualifiedclassInstancecreationExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1797);
				primary();
				setState(1798);
				match(DOT);
				setState(1799);
				unqualifiedclassInstancecreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstancecreationExpression_Type_2_PrContext extends ParserRuleContext {
		public UnqualifiedclassInstancecreationExpressionContext unqualifiedclassInstancecreationExpression() {
			return getRuleContext(UnqualifiedclassInstancecreationExpressionContext.class,0);
		}
		public ClassInstancecreationExpression_Type_2_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstancecreationExpression_Type_2_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstancecreationExpression_Type_2_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstancecreationExpression_Type_2_Pr(this);
		}
	}

	public final ClassInstancecreationExpression_Type_2_PrContext classInstancecreationExpression_Type_2_Pr() throws RecognitionException {
		ClassInstancecreationExpression_Type_2_PrContext _localctx = new ClassInstancecreationExpression_Type_2_PrContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_classInstancecreationExpression_Type_2_Pr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			match(DOT);
			setState(1804);
			unqualifiedclassInstancecreationExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstancecreationExpression_Type_1_PrContext extends ParserRuleContext {
		public UnqualifiedclassInstancecreationExpressionContext unqualifiedclassInstancecreationExpression() {
			return getRuleContext(UnqualifiedclassInstancecreationExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ClassInstancecreationExpression_Type_1_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstancecreationExpression_Type_1_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstancecreationExpression_Type_1_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstancecreationExpression_Type_1_Pr(this);
		}
	}

	public final ClassInstancecreationExpression_Type_1_PrContext classInstancecreationExpression_Type_1_Pr() throws RecognitionException {
		ClassInstancecreationExpression_Type_1_PrContext _localctx = new ClassInstancecreationExpression_Type_1_PrContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_classInstancecreationExpression_Type_1_Pr);
		try {
			setState(1811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1806);
				unqualifiedclassInstancecreationExpression();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1807);
				name(0);
				setState(1808);
				match(DOT);
				setState(1809);
				unqualifiedclassInstancecreationExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedclassInstancecreationExpressionContext extends ParserRuleContext {
		public ClassOrInterfaceTypeToInstantiateContext classOrInterfaceTypeToInstantiate() {
			return getRuleContext(ClassOrInterfaceTypeToInstantiateContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public UnqualifiedclassInstancecreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedclassInstancecreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnqualifiedclassInstancecreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnqualifiedclassInstancecreationExpression(this);
		}
	}

	public final UnqualifiedclassInstancecreationExpressionContext unqualifiedclassInstancecreationExpression() throws RecognitionException {
		UnqualifiedclassInstancecreationExpressionContext _localctx = new UnqualifiedclassInstancecreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_unqualifiedclassInstancecreationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			match(NEW);
			setState(1815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1814);
				typeArguments();
				}
			}

			setState(1817);
			classOrInterfaceTypeToInstantiate();
			setState(1818);
			match(LSMB);
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1819);
				argumentList();
				}
			}

			setState(1822);
			match(RSMB);
			setState(1824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1823);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeToInstantiateContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassOrInterfaceTypeToInstantiateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceTypeToInstantiate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceTypeToInstantiate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceTypeToInstantiate(this);
		}
	}

	public final ClassOrInterfaceTypeToInstantiateContext classOrInterfaceTypeToInstantiate() throws RecognitionException {
		ClassOrInterfaceTypeToInstantiateContext _localctx = new ClassOrInterfaceTypeToInstantiateContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_classOrInterfaceTypeToInstantiate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTHERATE) {
				{
				{
				setState(1826);
				annotation();
				}
				}
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1832);
			match(Identifier);
			setState(1843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1833);
				match(DOT);
				setState(1837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ATTHERATE) {
					{
					{
					setState(1834);
					annotation();
					}
					}
					setState(1839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1840);
				match(Identifier);
				}
				}
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1846);
				typeArgumentsOrDiamond();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_typeArgumentsOrDiamond);
		try {
			setState(1852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1849);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1850);
				match(LT);
				setState(1851);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_fieldAccess);
		try {
			setState(1867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1854);
				primary();
				setState(1855);
				match(DOT);
				setState(1856);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1858);
				match(SUPER);
				setState(1859);
				match(DOT);
				setState(1860);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1861);
				name(0);
				setState(1862);
				match(DOT);
				setState(1863);
				match(SUPER);
				setState(1864);
				match(DOT);
				setState(1865);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_Type_2_PrContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_Type_2_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_Type_2_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_Type_2_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_Type_2_Pr(this);
		}
	}

	public final FieldAccess_Type_2_PrContext fieldAccess_Type_2_Pr() throws RecognitionException {
		FieldAccess_Type_2_PrContext _localctx = new FieldAccess_Type_2_PrContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_fieldAccess_Type_2_Pr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			match(DOT);
			setState(1870);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_Type_1_PrContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldAccess_Type_1_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_Type_1_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_Type_1_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_Type_1_Pr(this);
		}
	}

	public final FieldAccess_Type_1_PrContext fieldAccess_Type_1_Pr() throws RecognitionException {
		FieldAccess_Type_1_PrContext _localctx = new FieldAccess_Type_1_PrContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_fieldAccess_Type_1_Pr);
		try {
			setState(1881);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1872);
				match(SUPER);
				setState(1873);
				match(DOT);
				setState(1874);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1875);
				name(0);
				setState(1876);
				match(DOT);
				setState(1877);
				match(SUPER);
				setState(1878);
				match(DOT);
				setState(1879);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ArrayAccess_Type_1Context arrayAccess_Type_1() {
			return getRuleContext(ArrayAccess_Type_1Context.class,0);
		}
		public List<ArrayAccess_Type_2Context> arrayAccess_Type_2() {
			return getRuleContexts(ArrayAccess_Type_2Context.class);
		}
		public ArrayAccess_Type_2Context arrayAccess_Type_2(int i) {
			return getRuleContext(ArrayAccess_Type_2Context.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			arrayAccess_Type_1();
			setState(1887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSQB) {
				{
				{
				setState(1884);
				arrayAccess_Type_2();
				}
				}
				setState(1889);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_Type_1Context extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryNoNewArray_Type_2_AaContext primaryNoNewArray_Type_2_Aa() {
			return getRuleContext(PrimaryNoNewArray_Type_2_AaContext.class,0);
		}
		public ArrayAccess_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_Type_1(this);
		}
	}

	public final ArrayAccess_Type_1Context arrayAccess_Type_1() throws RecognitionException {
		ArrayAccess_Type_1Context _localctx = new ArrayAccess_Type_1Context(_ctx, getState());
		enterRule(_localctx, 366, RULE_arrayAccess_Type_1);
		try {
			setState(1900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1890);
				name(0);
				setState(1891);
				match(LSQB);
				setState(1892);
				expression();
				setState(1893);
				match(RSQB);
				}
				break;
			case LSQB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1895);
				primaryNoNewArray_Type_2_Aa();
				setState(1896);
				match(LSQB);
				setState(1897);
				expression();
				setState(1898);
				match(RSQB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_Type_2Context extends ParserRuleContext {
		public PrimaryNoNewArray_Type_2_AaContext primaryNoNewArray_Type_2_Aa() {
			return getRuleContext(PrimaryNoNewArray_Type_2_AaContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccess_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_Type_2(this);
		}
	}

	public final ArrayAccess_Type_2Context arrayAccess_Type_2() throws RecognitionException {
		ArrayAccess_Type_2Context _localctx = new ArrayAccess_Type_2Context(_ctx, getState());
		enterRule(_localctx, 368, RULE_arrayAccess_Type_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1902);
			primaryNoNewArray_Type_2_Aa();
			setState(1903);
			match(LSQB);
			setState(1904);
			expression();
			setState(1905);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_Type_2_PrContext extends ParserRuleContext {
		public ArrayAccess_Type_2_Pr_Type_1Context arrayAccess_Type_2_Pr_Type_1() {
			return getRuleContext(ArrayAccess_Type_2_Pr_Type_1Context.class,0);
		}
		public List<ArrayAccess_Type_2_Pr_Type_2Context> arrayAccess_Type_2_Pr_Type_2() {
			return getRuleContexts(ArrayAccess_Type_2_Pr_Type_2Context.class);
		}
		public ArrayAccess_Type_2_Pr_Type_2Context arrayAccess_Type_2_Pr_Type_2(int i) {
			return getRuleContext(ArrayAccess_Type_2_Pr_Type_2Context.class,i);
		}
		public ArrayAccess_Type_2_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_Type_2_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_Type_2_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_Type_2_Pr(this);
		}
	}

	public final ArrayAccess_Type_2_PrContext arrayAccess_Type_2_Pr() throws RecognitionException {
		ArrayAccess_Type_2_PrContext _localctx = new ArrayAccess_Type_2_PrContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_arrayAccess_Type_2_Pr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			arrayAccess_Type_2_Pr_Type_1();
			setState(1911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1908);
					arrayAccess_Type_2_Pr_Type_2();
					}
					} 
				}
				setState(1913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_Type_2_Pr_Type_1Context extends ParserRuleContext {
		public PrimaryNoNewArray_Type_2_1_2_Pr_Aa_PrContext primaryNoNewArray_Type_2_1_2_Pr_Aa_Pr() {
			return getRuleContext(PrimaryNoNewArray_Type_2_1_2_Pr_Aa_PrContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccess_Type_2_Pr_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_Type_2_Pr_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_Type_2_Pr_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_Type_2_Pr_Type_1(this);
		}
	}

	public final ArrayAccess_Type_2_Pr_Type_1Context arrayAccess_Type_2_Pr_Type_1() throws RecognitionException {
		ArrayAccess_Type_2_Pr_Type_1Context _localctx = new ArrayAccess_Type_2_Pr_Type_1Context(_ctx, getState());
		enterRule(_localctx, 372, RULE_arrayAccess_Type_2_Pr_Type_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			primaryNoNewArray_Type_2_1_2_Pr_Aa_Pr();
			setState(1915);
			match(LSQB);
			setState(1916);
			expression();
			setState(1917);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_Type_2_Pr_Type_2Context extends ParserRuleContext {
		public PrimaryNoNewArray_Type_2_2_2_Pr_Aa_PrContext primaryNoNewArray_Type_2_2_2_Pr_Aa_Pr() {
			return getRuleContext(PrimaryNoNewArray_Type_2_2_2_Pr_Aa_PrContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccess_Type_2_Pr_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_Type_2_Pr_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_Type_2_Pr_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_Type_2_Pr_Type_2(this);
		}
	}

	public final ArrayAccess_Type_2_Pr_Type_2Context arrayAccess_Type_2_Pr_Type_2() throws RecognitionException {
		ArrayAccess_Type_2_Pr_Type_2Context _localctx = new ArrayAccess_Type_2_Pr_Type_2Context(_ctx, getState());
		enterRule(_localctx, 374, RULE_arrayAccess_Type_2_Pr_Type_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			primaryNoNewArray_Type_2_2_2_Pr_Aa_Pr();
			setState(1920);
			match(LSQB);
			setState(1921);
			expression();
			setState(1922);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_Type_1_PrContext extends ParserRuleContext {
		public ArrayAccess_Type_1_Pr_Type_1Context arrayAccess_Type_1_Pr_Type_1() {
			return getRuleContext(ArrayAccess_Type_1_Pr_Type_1Context.class,0);
		}
		public List<ArrayAccess_Type_1_Pr_Type_2Context> arrayAccess_Type_1_Pr_Type_2() {
			return getRuleContexts(ArrayAccess_Type_1_Pr_Type_2Context.class);
		}
		public ArrayAccess_Type_1_Pr_Type_2Context arrayAccess_Type_1_Pr_Type_2(int i) {
			return getRuleContext(ArrayAccess_Type_1_Pr_Type_2Context.class,i);
		}
		public ArrayAccess_Type_1_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_Type_1_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_Type_1_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_Type_1_Pr(this);
		}
	}

	public final ArrayAccess_Type_1_PrContext arrayAccess_Type_1_Pr() throws RecognitionException {
		ArrayAccess_Type_1_PrContext _localctx = new ArrayAccess_Type_1_PrContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_arrayAccess_Type_1_Pr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1924);
			arrayAccess_Type_1_Pr_Type_1();
			setState(1928);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1925);
					arrayAccess_Type_1_Pr_Type_2();
					}
					} 
				}
				setState(1930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_Type_1_Pr_Type_1Context extends ParserRuleContext {
		public PrimaryNoNewArray_Type_1_1_1_Pr_Aa_PrContext primaryNoNewArray_Type_1_1_1_Pr_Aa_Pr() {
			return getRuleContext(PrimaryNoNewArray_Type_1_1_1_Pr_Aa_PrContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArrayAccess_Type_1_Pr_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_Type_1_Pr_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_Type_1_Pr_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_Type_1_Pr_Type_1(this);
		}
	}

	public final ArrayAccess_Type_1_Pr_Type_1Context arrayAccess_Type_1_Pr_Type_1() throws RecognitionException {
		ArrayAccess_Type_1_Pr_Type_1Context _localctx = new ArrayAccess_Type_1_Pr_Type_1Context(_ctx, getState());
		enterRule(_localctx, 378, RULE_arrayAccess_Type_1_Pr_Type_1);
		try {
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1931);
				primaryNoNewArray_Type_1_1_1_Pr_Aa_Pr();
				setState(1932);
				match(LSQB);
				setState(1933);
				expression();
				setState(1934);
				match(RSQB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1936);
				name(0);
				setState(1937);
				match(LSQB);
				setState(1938);
				expression();
				setState(1939);
				match(RSQB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_Type_1_Pr_Type_2Context extends ParserRuleContext {
		public PrimaryNoNewArray_Type_1_2_1_Pr_Aa_PrContext primaryNoNewArray_Type_1_2_1_Pr_Aa_Pr() {
			return getRuleContext(PrimaryNoNewArray_Type_1_2_1_Pr_Aa_PrContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccess_Type_1_Pr_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_Type_1_Pr_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_Type_1_Pr_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_Type_1_Pr_Type_2(this);
		}
	}

	public final ArrayAccess_Type_1_Pr_Type_2Context arrayAccess_Type_1_Pr_Type_2() throws RecognitionException {
		ArrayAccess_Type_1_Pr_Type_2Context _localctx = new ArrayAccess_Type_1_Pr_Type_2Context(_ctx, getState());
		enterRule(_localctx, 380, RULE_arrayAccess_Type_1_Pr_Type_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			primaryNoNewArray_Type_1_2_1_Pr_Aa_Pr();
			setState(1944);
			match(LSQB);
			setState(1945);
			expression();
			setState(1946);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_methodInvocation);
		int _la;
		try {
			setState(2016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1948);
				methodName();
				setState(1949);
				match(LSMB);
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1950);
					argumentList();
					}
				}

				setState(1953);
				match(RSMB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1955);
				name(0);
				setState(1956);
				match(DOT);
				setState(1958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1957);
					typeArguments();
					}
				}

				setState(1960);
				match(Identifier);
				setState(1961);
				match(LSMB);
				setState(1963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1962);
					argumentList();
					}
				}

				setState(1965);
				match(RSMB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1967);
				name(0);
				setState(1968);
				match(DOT);
				setState(1970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1969);
					typeArguments();
					}
				}

				setState(1972);
				match(Identifier);
				setState(1973);
				match(LSMB);
				setState(1975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1974);
					argumentList();
					}
				}

				setState(1977);
				match(RSMB);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1979);
				primary();
				setState(1980);
				match(DOT);
				setState(1982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1981);
					typeArguments();
					}
				}

				setState(1984);
				match(Identifier);
				setState(1985);
				match(LSMB);
				setState(1987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1986);
					argumentList();
					}
				}

				setState(1989);
				match(RSMB);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1991);
				match(SUPER);
				setState(1992);
				match(DOT);
				setState(1994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1993);
					typeArguments();
					}
				}

				setState(1996);
				match(Identifier);
				setState(1997);
				match(LSMB);
				setState(1999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1998);
					argumentList();
					}
				}

				setState(2001);
				match(RSMB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2002);
				name(0);
				setState(2003);
				match(DOT);
				setState(2004);
				match(SUPER);
				setState(2005);
				match(DOT);
				setState(2007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2006);
					typeArguments();
					}
				}

				setState(2009);
				match(Identifier);
				setState(2010);
				match(LSMB);
				setState(2012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(2011);
					argumentList();
					}
				}

				setState(2014);
				match(RSMB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_Type_2_PrContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_Type_2_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_Type_2_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_Type_2_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_Type_2_Pr(this);
		}
	}

	public final MethodInvocation_Type_2_PrContext methodInvocation_Type_2_Pr() throws RecognitionException {
		MethodInvocation_Type_2_PrContext _localctx = new MethodInvocation_Type_2_PrContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_methodInvocation_Type_2_Pr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			match(DOT);
			setState(2020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2019);
				typeArguments();
				}
			}

			setState(2022);
			match(Identifier);
			setState(2023);
			match(LSMB);
			setState(2025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(2024);
				argumentList();
				}
			}

			setState(2027);
			match(RSMB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_Type_1_PrContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodInvocation_Type_1_PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_Type_1_Pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_Type_1_Pr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_Type_1_Pr(this);
		}
	}

	public final MethodInvocation_Type_1_PrContext methodInvocation_Type_1_Pr() throws RecognitionException {
		MethodInvocation_Type_1_PrContext _localctx = new MethodInvocation_Type_1_PrContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_methodInvocation_Type_1_Pr);
		int _la;
		try {
			setState(2085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2029);
				methodName();
				setState(2030);
				match(LSMB);
				setState(2032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(2031);
					argumentList();
					}
				}

				setState(2034);
				match(RSMB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2036);
				name(0);
				setState(2037);
				match(DOT);
				setState(2039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2038);
					typeArguments();
					}
				}

				setState(2041);
				match(Identifier);
				setState(2042);
				match(LSMB);
				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(2043);
					argumentList();
					}
				}

				setState(2046);
				match(RSMB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2048);
				name(0);
				setState(2049);
				match(DOT);
				setState(2051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2050);
					typeArguments();
					}
				}

				setState(2053);
				match(Identifier);
				setState(2054);
				match(LSMB);
				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(2055);
					argumentList();
					}
				}

				setState(2058);
				match(RSMB);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2060);
				match(SUPER);
				setState(2061);
				match(DOT);
				setState(2063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2062);
					typeArguments();
					}
				}

				setState(2065);
				match(Identifier);
				setState(2066);
				match(LSMB);
				setState(2068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(2067);
					argumentList();
					}
				}

				setState(2070);
				match(RSMB);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2071);
				name(0);
				setState(2072);
				match(DOT);
				setState(2073);
				match(SUPER);
				setState(2074);
				match(DOT);
				setState(2076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2075);
					typeArguments();
					}
				}

				setState(2078);
				match(Identifier);
				setState(2079);
				match(LSMB);
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << Literal) | (1L << LSMB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LSQB - 65)) | (1L << (NOT - 65)) | (1L << (TILDE - 65)) | (1L << (INCR - 65)) | (1L << (DECR - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(2080);
					argumentList();
					}
				}

				setState(2083);
				match(RSMB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			expression();
			setState(2092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2088);
				match(COMMA);
				setState(2089);
				expression();
				}
				}
				setState(2094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraycreationExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArraycreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraycreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArraycreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArraycreationExpression(this);
		}
	}

	public final ArraycreationExpressionContext arraycreationExpression() throws RecognitionException {
		ArraycreationExpressionContext _localctx = new ArraycreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arraycreationExpression);
		try {
			setState(2117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2095);
				match(NEW);
				setState(2096);
				primitiveType();
				setState(2097);
				dimExprs();
				setState(2099);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(2098);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				match(NEW);
				setState(2102);
				classOrInterfaceType();
				setState(2103);
				dimExprs();
				setState(2105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(2104);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2107);
				match(NEW);
				setState(2108);
				primitiveType();
				setState(2109);
				dims();
				setState(2110);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2112);
				match(NEW);
				setState(2113);
				classOrInterfaceType();
				setState(2114);
				dims();
				setState(2115);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2119);
			dimExpr();
			setState(2123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2120);
					dimExpr();
					}
					} 
				}
				setState(2125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATTHERATE) {
				{
				{
				setState(2126);
				annotation();
				}
				}
				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2132);
			match(LSQB);
			setState(2133);
			expression();
			setState(2134);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			lambdaParameters();
			setState(2139);
			match(ARROW);
			setState(2140);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_lambdaParameters);
		int _la;
		try {
			setState(2152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2142);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2143);
				match(LSMB);
				setState(2145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==ATTHERATE) {
					{
					setState(2144);
					formalParameterList();
					}
				}

				setState(2147);
				match(RSMB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2148);
				match(LSMB);
				setState(2149);
				inferredFormalParameterList();
				setState(2150);
				match(RSMB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2154);
			match(Identifier);
			setState(2159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2155);
				match(COMMA);
				setState(2156);
				match(Identifier);
				}
				}
				setState(2161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_lambdaBody);
		try {
			setState(2164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case Literal:
			case LSMB:
			case LSQB:
			case NOT:
			case TILDE:
			case INCR:
			case DECR:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2162);
				expression();
				}
				break;
			case LCRB:
				enterOuterAlt(_localctx, 2);
				{
				setState(2163);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_assignmentExpression);
		try {
			setState(2168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2166);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2167);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2170);
			leftHandSide();
			setState(2171);
			assignmentOperator();
			setState(2172);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_leftHandSide);
		try {
			setState(2177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2174);
				name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2175);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2176);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASSIGN - 70)) | (1L << (ADDEQ - 70)) | (1L << (SUBEQ - 70)) | (1L << (MULEQ - 70)) | (1L << (DIVEQ - 70)) | (1L << (ANDEQ - 70)) | (1L << (OREQ - 70)) | (1L << (XOREQ - 70)) | (1L << (MODEQ - 70)) | (1L << (LTLTEQ - 70)) | (1L << (GTGTEQ - 70)) | (1L << (GTGTGTEQ - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_conditionalExpression);
		try {
			setState(2194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2181);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2182);
				conditionalOrExpression(0);
				setState(2183);
				match(QMARK);
				setState(2184);
				expression();
				setState(2185);
				match(COLON);
				setState(2186);
				conditionalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2188);
				conditionalOrExpression(0);
				setState(2189);
				match(QMARK);
				setState(2190);
				expression();
				setState(2191);
				match(COLON);
				setState(2192);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 416;
		enterRecursionRule(_localctx, 416, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2197);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2199);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2200);
					match(OR);
					setState(2201);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 418;
		enterRecursionRule(_localctx, 418, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2208);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2210);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2211);
					match(AND);
					setState(2212);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(2217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,224,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 420;
		enterRecursionRule(_localctx, 420, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2219);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2221);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2222);
					match(BOR);
					setState(2223);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(2228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 422;
		enterRecursionRule(_localctx, 422, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2230);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2232);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2233);
					match(CARET);
					setState(2234);
					andExpression(0);
					}
					} 
				}
				setState(2239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 424;
		enterRecursionRule(_localctx, 424, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2241);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2243);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2244);
					match(BAND);
					setState(2245);
					equalityExpression(0);
					}
					} 
				}
				setState(2250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 426;
		enterRecursionRule(_localctx, 426, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2252);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2254);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2255);
						match(EQEQ);
						setState(2256);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2257);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2258);
						match(NTEQ);
						setState(2259);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 428;
		enterRecursionRule(_localctx, 428, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2266);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2269);
						match(LT);
						setState(2270);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2271);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2272);
						match(GT);
						setState(2273);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2274);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2275);
						match(LEEQ);
						setState(2276);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2277);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2278);
						match(GEEQ);
						setState(2279);
						shiftExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2280);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2281);
						match(INSTANCEOF);
						setState(2282);
						referenceType();
						}
						break;
					}
					} 
				}
				setState(2287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 430;
		enterRecursionRule(_localctx, 430, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2289);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2292);
						match(T__0);
						setState(2293);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2294);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2295);
						match(T__1);
						setState(2296);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2297);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2298);
						match(T__2);
						setState(2299);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 432;
		enterRecursionRule(_localctx, 432, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2306);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2308);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2309);
						match(ADD);
						setState(2310);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2311);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2312);
						match(SUB);
						setState(2313);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2320);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2322);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2323);
						match(MUL);
						setState(2324);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2325);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2326);
						match(DIV);
						setState(2327);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2328);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2329);
						match(MOD);
						setState(2330);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_unaryExpression);
		try {
			setState(2343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2336);
				preIncrementExpression();
				}
				break;
			case DECR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2337);
				preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2338);
				match(ADD);
				setState(2339);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2340);
				match(SUB);
				setState(2341);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case Literal:
			case LSMB:
			case NOT:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(2342);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
			match(INCR);
			setState(2346);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2348);
			match(DECR);
			setState(2349);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2351);
				postfixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2352);
				match(TILDE);
				setState(2353);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2354);
				match(NOT);
				setState(2355);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2356);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public Postfix_Type_1Context postfix_Type_1() {
			return getRuleContext(Postfix_Type_1Context.class,0);
		}
		public List<Postfix_Type_2Context> postfix_Type_2() {
			return getRuleContexts(Postfix_Type_2Context.class);
		}
		public Postfix_Type_2Context postfix_Type_2(int i) {
			return getRuleContext(Postfix_Type_2Context.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			postfix_Type_1();
			setState(2363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2360);
					postfix_Type_2();
					}
					} 
				}
				setState(2365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_Type_1Context extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Postfix_Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_Type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfix_Type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfix_Type_1(this);
		}
	}

	public final Postfix_Type_1Context postfix_Type_1() throws RecognitionException {
		Postfix_Type_1Context _localctx = new Postfix_Type_1Context(_ctx, getState());
		enterRule(_localctx, 446, RULE_postfix_Type_1);
		try {
			setState(2368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2366);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2367);
				name(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_Type_2Context extends ParserRuleContext {
		public Pure_postfix_decrementContext pure_postfix_decrement() {
			return getRuleContext(Pure_postfix_decrementContext.class,0);
		}
		public Pure_postfix_incrementContext pure_postfix_increment() {
			return getRuleContext(Pure_postfix_incrementContext.class,0);
		}
		public Postfix_Type_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_Type_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfix_Type_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfix_Type_2(this);
		}
	}

	public final Postfix_Type_2Context postfix_Type_2() throws RecognitionException {
		Postfix_Type_2Context _localctx = new Postfix_Type_2Context(_ctx, getState());
		enterRule(_localctx, 448, RULE_postfix_Type_2);
		try {
			setState(2372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2370);
				pure_postfix_decrement();
				}
				break;
			case INCR:
				enterOuterAlt(_localctx, 2);
				{
				setState(2371);
				pure_postfix_increment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2374);
			postfixExpression();
			setState(2375);
			match(INCR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pure_postfix_decrementContext extends ParserRuleContext {
		public Pure_postfix_decrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pure_postfix_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPure_postfix_decrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPure_postfix_decrement(this);
		}
	}

	public final Pure_postfix_decrementContext pure_postfix_decrement() throws RecognitionException {
		Pure_postfix_decrementContext _localctx = new Pure_postfix_decrementContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_pure_postfix_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			match(DECR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pure_postfix_incrementContext extends ParserRuleContext {
		public Pure_postfix_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pure_postfix_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPure_postfix_increment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPure_postfix_increment(this);
		}
	}

	public final Pure_postfix_incrementContext pure_postfix_increment() throws RecognitionException {
		Pure_postfix_incrementContext _localctx = new Pure_postfix_incrementContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_pure_postfix_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2379);
			match(INCR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			postfixExpression();
			setState(2382);
			match(DECR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_castExpression);
		int _la;
		try {
			setState(2411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2384);
				match(LSMB);
				setState(2385);
				primitiveType();
				setState(2386);
				match(RSMB);
				setState(2387);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2389);
				match(LSMB);
				setState(2390);
				referenceType();
				setState(2394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BAND) {
					{
					{
					setState(2391);
					additionalBound();
					}
					}
					setState(2396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2397);
				match(RSMB);
				setState(2398);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2400);
				match(LSMB);
				setState(2401);
				referenceType();
				setState(2405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BAND) {
					{
					{
					setState(2402);
					additionalBound();
					}
					}
					setState(2407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2408);
				match(RSMB);
				setState(2409);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return name_sempred((NameContext)_localctx, predIndex);
		case 208:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 209:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 210:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 211:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 212:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 213:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 214:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 215:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 216:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 217:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean name_sempred(NameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3q\u0972\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\3\2\3\2\5\2\u01d3\n\2\3\3\7\3\u01d6\n\3\f\3\16\3\u01d9\13\3\3"+
		"\3\3\3\7\3\u01dd\n\3\f\3\16\3\u01e0\13\3\3\3\5\3\u01e3\n\3\3\4\3\4\5\4"+
		"\u01e7\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u01f0\n\7\3\b\3\b\7\b\u01f4"+
		"\n\b\f\b\16\b\u01f7\13\b\3\t\3\t\5\t\u01fb\n\t\3\n\3\n\5\n\u01ff\n\n\3"+
		"\13\7\13\u0202\n\13\f\13\16\13\u0205\13\13\3\13\3\13\5\13\u0209\n\13\3"+
		"\f\3\f\7\f\u020d\n\f\f\f\16\f\u0210\13\f\3\f\3\f\5\f\u0214\n\f\3\r\3\r"+
		"\3\16\3\16\3\17\7\17\u021b\n\17\f\17\16\17\u021e\13\17\3\17\3\17\5\17"+
		"\u0222\n\17\3\17\3\17\3\17\7\17\u0227\n\17\f\17\16\17\u022a\13\17\3\17"+
		"\3\17\5\17\u022e\n\17\5\17\u0230\n\17\3\20\3\20\3\21\7\21\u0235\n\21\f"+
		"\21\16\21\u0238\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0245\n\22\3\23\7\23\u0248\n\23\f\23\16\23\u024b\13\23\3\23"+
		"\3\23\3\23\7\23\u0250\n\23\f\23\16\23\u0253\13\23\3\23\3\23\7\23\u0257"+
		"\n\23\f\23\16\23\u025a\13\23\3\24\7\24\u025d\n\24\f\24\16\24\u0260\13"+
		"\24\3\24\3\24\5\24\u0264\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u026d\n\26\f\26\16\26\u0270\13\26\5\26\u0272\n\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u027e\n\31\f\31\16\31\u0281\13\31"+
		"\3\32\3\32\5\32\u0285\n\32\3\33\7\33\u0288\n\33\f\33\16\33\u028b\13\33"+
		"\3\33\3\33\5\33\u028f\n\33\3\34\3\34\3\34\3\34\5\34\u0295\n\34\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u029f\n\36\f\36\16\36\u02a2\13"+
		"\36\3\37\5\37\u02a5\n\37\3\37\7\37\u02a8\n\37\f\37\16\37\u02ab\13\37\3"+
		"\37\7\37\u02ae\n\37\f\37\16\37\u02b1\13\37\3\37\3\37\3 \7 \u02b6\n \f"+
		" \16 \u02b9\13 \3 \3 \3 \3 \7 \u02bf\n \f \16 \u02c2\13 \3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3\"\5\"\u02cc\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u02e9\n\'\3(\3(\3)\7)"+
		"\u02ee\n)\f)\16)\u02f1\13)\3)\3)\3)\5)\u02f6\n)\3)\5)\u02f9\n)\3)\5)\u02fc"+
		"\n)\3)\5)\u02ff\n)\3*\3*\3*\3*\3+\3+\3+\7+\u0308\n+\f+\16+\u030b\13+\3"+
		",\3,\3,\3-\3-\3-\3.\3.\3.\7.\u0316\n.\f.\16.\u0319\13.\3/\3/\7/\u031d"+
		"\n/\f/\16/\u0320\13/\3/\3/\3\60\3\60\3\60\3\60\5\60\u0328\n\60\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u032f\n\61\3\62\7\62\u0332\n\62\f\62\16\62\u0335"+
		"\13\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u033e\n\63\f\63\16\63\u0341"+
		"\13\63\3\64\3\64\3\64\7\64\u0346\n\64\f\64\16\64\u0349\13\64\3\65\3\65"+
		"\5\65\u034d\n\65\3\66\3\66\5\66\u0351\n\66\3\67\3\67\5\67\u0355\n\67\3"+
		"8\38\58\u0359\n8\39\39\39\59\u035e\n9\3:\3:\7:\u0362\n:\f:\16:\u0365\13"+
		":\3;\3;\5;\u0369\n;\3<\3<\5<\u036d\n<\3=\3=\5=\u0371\n=\3>\3>\3>\5>\u0376"+
		"\n>\3?\3?\3@\3@\3A\3A\5A\u037e\nA\3A\3A\3A\7A\u0383\nA\fA\16A\u0386\13"+
		"A\3A\3A\5A\u038a\nA\5A\u038c\nA\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\5D\u039b\nD\3E\7E\u039e\nE\fE\16E\u03a1\13E\3E\3E\3E\3F\3F\3F\5F\u03a9"+
		"\nF\3F\3F\7F\u03ad\nF\fF\16F\u03b0\13F\3F\3F\3F\5F\u03b5\nF\5F\u03b7\n"+
		"F\3G\3G\5G\u03bb\nG\3H\3H\3H\5H\u03c0\nH\3H\3H\5H\u03c4\nH\3I\3I\3I\3"+
		"I\3I\3I\5I\u03cc\nI\3J\3J\3J\7J\u03d1\nJ\fJ\16J\u03d4\13J\3J\3J\3J\3J"+
		"\5J\u03da\nJ\3K\7K\u03dd\nK\fK\16K\u03e0\13K\3K\3K\3K\3L\3L\5L\u03e7\n"+
		"L\3M\7M\u03ea\nM\fM\16M\u03ed\13M\3M\3M\7M\u03f1\nM\fM\16M\u03f4\13M\3"+
		"M\3M\3M\3M\5M\u03fa\nM\3N\7N\u03fd\nN\fN\16N\u0400\13N\3N\3N\3N\3N\3N"+
		"\3N\3O\3O\3O\3P\3P\3P\7P\u040e\nP\fP\16P\u0411\13P\3Q\3Q\5Q\u0415\nQ\3"+
		"R\3R\5R\u0419\nR\3S\3S\3T\3T\3T\3U\7U\u0421\nU\fU\16U\u0424\13U\3U\3U"+
		"\7U\u0428\nU\fU\16U\u042b\13U\3U\3U\3V\5V\u0430\nV\3V\3V\3V\5V\u0435\n"+
		"V\3V\3V\3W\3W\3X\3X\3X\3X\5X\u043f\nX\3Y\3Y\5Y\u0443\nY\3Y\5Y\u0446\n"+
		"Y\3Y\3Y\3Z\5Z\u044b\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0454\nZ\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\5Z\u045f\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u046a\nZ\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\5Z\u0472\nZ\3[\3[\3\\\7\\\u0477\n\\\f\\\16\\\u047a\13\\"+
		"\3\\\3\\\3\\\5\\\u047f\n\\\3\\\5\\\u0482\n\\\3\\\3\\\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\5]\u048e\n]\3^\3^\3^\3_\3_\7_\u0495\n_\f_\16_\u0498\13_\3_\3_"+
		"\3`\3`\3`\3`\3`\5`\u04a1\n`\3a\7a\u04a4\na\fa\16a\u04a7\13a\3a\3a\3a\3"+
		"a\3b\3b\3b\3b\5b\u04b1\nb\3c\7c\u04b4\nc\fc\16c\u04b7\13c\3c\3c\3c\3d"+
		"\3d\3d\3d\3d\3d\5d\u04c2\nd\3e\3e\3e\3f\3f\3f\5f\u04ca\nf\3g\3g\3g\3g"+
		"\5g\u04d0\ng\3g\3g\3h\3h\3h\7h\u04d7\nh\fh\16h\u04da\13h\3i\3i\3i\3i\3"+
		"j\3j\3j\5j\u04e3\nj\3k\3k\3k\5k\u04e8\nk\3k\3k\3l\3l\3l\7l\u04ef\nl\f"+
		"l\16l\u04f2\13l\3m\3m\3m\3n\3n\3n\3n\3n\3n\3o\3o\5o\u04ff\no\3o\5o\u0502"+
		"\no\3o\3o\3p\3p\3p\7p\u0509\np\fp\16p\u050c\13p\3q\3q\5q\u0510\nq\3q\3"+
		"q\3r\3r\7r\u0516\nr\fr\16r\u0519\13r\3s\3s\3s\5s\u051e\ns\3t\3t\3t\3u"+
		"\7u\u0524\nu\fu\16u\u0527\13u\3u\3u\3u\3v\3v\3v\3v\3v\3v\5v\u0532\nv\3"+
		"w\3w\3w\3w\3w\5w\u0539\nw\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u0547"+
		"\nx\3y\3y\3z\3z\3z\3z\3{\3{\3{\3{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\5}\u055d"+
		"\n}\3~\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u057f\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\7\u0083\u0589\n\u0083\f\u0083\16\u0083\u058c\13\u0083"+
		"\3\u0083\7\u0083\u058f\n\u0083\f\u0083\16\u0083\u0592\13\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\7\u0085\u059b\n\u0085"+
		"\f\u0085\16\u0085\u059e\13\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u05a6\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\5\u008a"+
		"\u05be\n\u008a\3\u008b\3\u008b\5\u008b\u05c2\n\u008b\3\u008c\3\u008c\3"+
		"\u008c\5\u008c\u05c7\n\u008c\3\u008c\3\u008c\5\u008c\u05cb\n\u008c\3\u008c"+
		"\3\u008c\5\u008c\u05cf\n\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u05d7\n\u008d\3\u008d\3\u008d\5\u008d\u05db\n\u008d\3"+
		"\u008d\3\u008d\5\u008d\u05df\n\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3"+
		"\u008e\5\u008e\u05e6\n\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\7"+
		"\u0090\u05ed\n\u0090\f\u0090\16\u0090\u05f0\13\u0090\3\u0091\3\u0091\3"+
		"\u0091\7\u0091\u05f5\n\u0091\f\u0091\16\u0091\u05f8\13\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092"+
		"\7\u0092\u0604\n\u0092\f\u0092\16\u0092\u0607\13\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\5\u0093\u0612"+
		"\n\u0093\3\u0093\3\u0093\3\u0094\3\u0094\5\u0094\u0618\n\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\5\u0095\u061e\n\u0095\3\u0095\3\u0095\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0633"+
		"\n\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0638\n\u0098\3\u0099\3\u0099"+
		"\7\u0099\u063c\n\u0099\f\u0099\16\u0099\u063f\13\u0099\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\7\u009b\u0648\n\u009b\f\u009b"+
		"\16\u009b\u064b\13\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c"+
		"\7\u009c\u0653\n\u009c\f\u009c\16\u009c\u0656\13\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u065f\n\u009e\3\u009e"+
		"\5\u009e\u0662\n\u009e\3\u009f\3\u009f\3\u009f\5\u009f\u0667\n\u009f\3"+
		"\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u066e\n\u00a0\f\u00a0\16"+
		"\u00a0\u0671\13\u00a0\3\u00a1\7\u00a1\u0674\n\u00a1\f\u00a1\16\u00a1\u0677"+
		"\13\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\7\u00a2"+
		"\u0680\n\u00a2\f\u00a2\16\u00a2\u0683\13\u00a2\3\u00a3\3\u00a3\5\u00a3"+
		"\u0687\n\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\5\u00a5\u069a\n\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\5\u00a7\u06ac\n\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\5\u00a8\u06b2\n\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\5\u00aa"+
		"\u06b9\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab"+
		"\u06ca\n\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\5\u00ad\u06dc\n\u00ad\3\u00ae\3\u00ae\3\u00ae\7\u00ae\u06e1\n\u00ae\f"+
		"\u00ae\16\u00ae\u06e4\13\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\7\u00ae\u06ec\n\u00ae\f\u00ae\16\u00ae\u06ef\13\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\7\u00ae\u06f7\n\u00ae\f\u00ae"+
		"\16\u00ae\u06fa\13\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae"+
		"\u0701\n\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\5\u00af\u070c\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0716\n\u00b1\3\u00b2\3\u00b2"+
		"\5\u00b2\u071a\n\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u071f\n\u00b2\3"+
		"\u00b2\3\u00b2\5\u00b2\u0723\n\u00b2\3\u00b3\7\u00b3\u0726\n\u00b3\f\u00b3"+
		"\16\u00b3\u0729\13\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u072e\n\u00b3"+
		"\f\u00b3\16\u00b3\u0731\13\u00b3\3\u00b3\7\u00b3\u0734\n\u00b3\f\u00b3"+
		"\16\u00b3\u0737\13\u00b3\3\u00b3\5\u00b3\u073a\n\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b4\5\u00b4\u073f\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5"+
		"\u074e\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u075c\n\u00b7\3\u00b8"+
		"\3\u00b8\7\u00b8\u0760\n\u00b8\f\u00b8\16\u00b8\u0763\13\u00b8\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\5\u00b9\u076f\n\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb"+
		"\3\u00bb\7\u00bb\u0778\n\u00bb\f\u00bb\16\u00bb\u077b\13\u00bb\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00be\3\u00be\7\u00be\u0789\n\u00be\f\u00be\16\u00be\u078c\13\u00be"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u0798\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u07a2\n\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\5\u00c1\u07a9\n\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u07ae\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u07b5\n"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u07ba\n\u00c1\3\u00c1\3\u00c1\3"+
		"\u00c1\3\u00c1\3\u00c1\5\u00c1\u07c1\n\u00c1\3\u00c1\3\u00c1\3\u00c1\5"+
		"\u00c1\u07c6\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u07cd"+
		"\n\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u07d2\n\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u07da\n\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\5\u00c1\u07df\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u07e3\n\u00c1\3"+
		"\u00c2\3\u00c2\5\u00c2\u07e7\n\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u07ec"+
		"\n\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u07f3\n\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u07fa\n\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u07ff\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\5\u00c3\u0806\n\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u080b\n"+
		"\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0812\n\u00c3\3"+
		"\u00c3\3\u00c3\3\u00c3\5\u00c3\u0817\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3"+
		"\u00c3\3\u00c3\3\u00c3\5\u00c3\u081f\n\u00c3\3\u00c3\3\u00c3\3\u00c3\5"+
		"\u00c3\u0824\n\u00c3\3\u00c3\3\u00c3\5\u00c3\u0828\n\u00c3\3\u00c4\3\u00c4"+
		"\3\u00c4\7\u00c4\u082d\n\u00c4\f\u00c4\16\u00c4\u0830\13\u00c4\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0836\n\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u083c\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0848\n\u00c5\3\u00c6"+
		"\3\u00c6\7\u00c6\u084c\n\u00c6\f\u00c6\16\u00c6\u084f\13\u00c6\3\u00c7"+
		"\7\u00c7\u0852\n\u00c7\f\u00c7\16\u00c7\u0855\13\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u0864\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u086b\n\u00ca\3\u00cb\3\u00cb\3\u00cb\7\u00cb\u0870\n"+
		"\u00cb\f\u00cb\16\u00cb\u0873\13\u00cb\3\u00cc\3\u00cc\5\u00cc\u0877\n"+
		"\u00cc\3\u00cd\3\u00cd\5\u00cd\u087b\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3"+
		"\u00ce\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0884\n\u00cf\3\u00d0\3\u00d0\3"+
		"\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0895\n\u00d1\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u089d\n\u00d2\f\u00d2\16\u00d2"+
		"\u08a0\13\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3"+
		"\u08a8\n\u00d3\f\u00d3\16\u00d3\u08ab\13\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u08b3\n\u00d4\f\u00d4\16\u00d4\u08b6"+
		"\13\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u08be"+
		"\n\u00d5\f\u00d5\16\u00d5\u08c1\13\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\7\u00d6\u08c9\n\u00d6\f\u00d6\16\u00d6\u08cc\13\u00d6"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\7\u00d7\u08d7\n\u00d7\f\u00d7\16\u00d7\u08da\13\u00d7\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u08ee"+
		"\n\u00d8\f\u00d8\16\u00d8\u08f1\13\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\7\u00d9"+
		"\u08ff\n\u00d9\f\u00d9\16\u00d9\u0902\13\u00d9\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\7\u00da\u090d\n\u00da"+
		"\f\u00da\16\u00da\u0910\13\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\7\u00db\u091e"+
		"\n\u00db\f\u00db\16\u00db\u0921\13\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u092a\n\u00dc\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\5\u00df\u0938\n\u00df\3\u00e0\3\u00e0\7\u00e0\u093c\n\u00e0\f\u00e0\16"+
		"\u00e0\u093f\13\u00e0\3\u00e1\3\u00e1\5\u00e1\u0943\n\u00e1\3\u00e2\3"+
		"\u00e2\5\u00e2\u0947\n\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3"+
		"\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\7\u00e7\u095b\n\u00e7\f\u00e7\16\u00e7"+
		"\u095e\13\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\7\u00e7"+
		"\u0966\n\u00e7\f\u00e7\16\u00e7\u0969\13\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\5\u00e7\u096e\n\u00e7\3\u00e8\3\u00e8\3\u00e8\2\r:\u01a2\u01a4\u01a6"+
		"\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u00e9\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184"+
		"\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c"+
		"\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4"+
		"\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc"+
		"\u01ce\2\5\7\2\n\n\r\r  \"\"**\4\2\23\23\31\31\4\2HHak\2\u09f2\2\u01d2"+
		"\3\2\2\2\4\u01e2\3\2\2\2\6\u01e6\3\2\2\2\b\u01e8\3\2\2\2\n\u01ea\3\2\2"+
		"\2\f\u01ef\3\2\2\2\16\u01f1\3\2\2\2\20\u01fa\3\2\2\2\22\u01fe\3\2\2\2"+
		"\24\u0203\3\2\2\2\26\u020a\3\2\2\2\30\u0215\3\2\2\2\32\u0217\3\2\2\2\34"+
		"\u022f\3\2\2\2\36\u0231\3\2\2\2 \u0236\3\2\2\2\"\u0244\3\2\2\2$\u0249"+
		"\3\2\2\2&\u025e\3\2\2\2(\u0265\3\2\2\2*\u0271\3\2\2\2,\u0273\3\2\2\2."+
		"\u0276\3\2\2\2\60\u027a\3\2\2\2\62\u0284\3\2\2\2\64\u0289\3\2\2\2\66\u0294"+
		"\3\2\2\28\u0296\3\2\2\2:\u0298\3\2\2\2<\u02a4\3\2\2\2>\u02b7\3\2\2\2@"+
		"\u02c5\3\2\2\2B\u02cb\3\2\2\2D\u02cd\3\2\2\2F\u02d1\3\2\2\2H\u02d7\3\2"+
		"\2\2J\u02de\3\2\2\2L\u02e8\3\2\2\2N\u02ea\3\2\2\2P\u02ef\3\2\2\2R\u0300"+
		"\3\2\2\2T\u0304\3\2\2\2V\u030c\3\2\2\2X\u030f\3\2\2\2Z\u0312\3\2\2\2\\"+
		"\u031a\3\2\2\2^\u0327\3\2\2\2`\u032e\3\2\2\2b\u0333\3\2\2\2d\u033a\3\2"+
		"\2\2f\u0342\3\2\2\2h\u034a\3\2\2\2j\u0350\3\2\2\2l\u0354\3\2\2\2n\u0358"+
		"\3\2\2\2p\u035d\3\2\2\2r\u035f\3\2\2\2t\u0368\3\2\2\2v\u036c\3\2\2\2x"+
		"\u036e\3\2\2\2z\u0372\3\2\2\2|\u0377\3\2\2\2~\u0379\3\2\2\2\u0080\u038b"+
		"\3\2\2\2\u0082\u038d\3\2\2\2\u0084\u038f\3\2\2\2\u0086\u039a\3\2\2\2\u0088"+
		"\u039f\3\2\2\2\u008a\u03b6\3\2\2\2\u008c\u03ba\3\2\2\2\u008e\u03bc\3\2"+
		"\2\2\u0090\u03cb\3\2\2\2\u0092\u03d9\3\2\2\2\u0094\u03de\3\2\2\2\u0096"+
		"\u03e6\3\2\2\2\u0098\u03f9\3\2\2\2\u009a\u03fe\3\2\2\2\u009c\u0407\3\2"+
		"\2\2\u009e\u040a\3\2\2\2\u00a0\u0414\3\2\2\2\u00a2\u0418\3\2\2\2\u00a4"+
		"\u041a\3\2\2\2\u00a6\u041c\3\2\2\2\u00a8\u0422\3\2\2\2\u00aa\u042f\3\2"+
		"\2\2\u00ac\u0438\3\2\2\2\u00ae\u043e\3\2\2\2\u00b0\u0440\3\2\2\2\u00b2"+
		"\u0471\3\2\2\2\u00b4\u0473\3\2\2\2\u00b6\u0478\3\2\2\2\u00b8\u048d\3\2"+
		"\2\2\u00ba\u048f\3\2\2\2\u00bc\u0492\3\2\2\2\u00be\u04a0\3\2\2\2\u00c0"+
		"\u04a5\3\2\2\2\u00c2\u04b0\3\2\2\2\u00c4\u04b5\3\2\2\2\u00c6\u04c1\3\2"+
		"\2\2\u00c8\u04c3\3\2\2\2\u00ca\u04c9\3\2\2\2\u00cc\u04cb\3\2\2\2\u00ce"+
		"\u04d3\3\2\2\2\u00d0\u04db\3\2\2\2\u00d2\u04e2\3\2\2\2\u00d4\u04e4\3\2"+
		"\2\2\u00d6\u04eb\3\2\2\2\u00d8\u04f3\3\2\2\2\u00da\u04f6\3\2\2\2\u00dc"+
		"\u04fc\3\2\2\2\u00de\u0505\3\2\2\2\u00e0\u050d\3\2\2\2\u00e2\u0513\3\2"+
		"\2\2\u00e4\u051d\3\2\2\2\u00e6\u051f\3\2\2\2\u00e8\u0525\3\2\2\2\u00ea"+
		"\u0531\3\2\2\2\u00ec\u0538\3\2\2\2\u00ee\u0546\3\2\2\2\u00f0\u0548\3\2"+
		"\2\2\u00f2\u054a\3\2\2\2\u00f4\u054e\3\2\2\2\u00f6\u0552\3\2\2\2\u00f8"+
		"\u055c\3\2\2\2\u00fa\u055e\3\2\2\2\u00fc\u0564\3\2\2\2\u00fe\u056c\3\2"+
		"\2\2\u0100\u057e\3\2\2\2\u0102\u0580\3\2\2\2\u0104\u0586\3\2\2\2\u0106"+
		"\u0595\3\2\2\2\u0108\u0598\3\2\2\2\u010a\u05a5\3\2\2\2\u010c\u05a7\3\2"+
		"\2\2\u010e\u05ad\3\2\2\2\u0110\u05b3\3\2\2\2\u0112\u05bd\3\2\2\2\u0114"+
		"\u05c1\3\2\2\2\u0116\u05c3\3\2\2\2\u0118\u05d3\3\2\2\2\u011a\u05e5\3\2"+
		"\2\2\u011c\u05e7\3\2\2\2\u011e\u05e9\3\2\2\2\u0120\u05f1\3\2\2\2\u0122"+
		"\u0600\3\2\2\2\u0124\u060f\3\2\2\2\u0126\u0615\3\2\2\2\u0128\u061b\3\2"+
		"\2\2\u012a\u0621\3\2\2\2\u012c\u0625\3\2\2\2\u012e\u0637\3\2\2\2\u0130"+
		"\u0639\3\2\2\2\u0132\u0640\3\2\2\2\u0134\u0649\3\2\2\2\u0136\u064f\3\2"+
		"\2\2\u0138\u0657\3\2\2\2\u013a\u065a\3\2\2\2\u013c\u0663\3\2\2\2\u013e"+
		"\u066a\3\2\2\2\u0140\u0675\3\2\2\2\u0142\u067d\3\2\2\2\u0144\u0686\3\2"+
		"\2\2\u0146\u0688\3\2\2\2\u0148\u0699\3\2\2\2\u014a\u069b\3\2\2\2\u014c"+
		"\u06ab\3\2\2\2\u014e\u06b1\3\2\2\2\u0150\u06b3\3\2\2\2\u0152\u06b8\3\2"+
		"\2\2\u0154\u06c9\3\2\2\2\u0156\u06cb\3\2\2\2\u0158\u06db\3\2\2\2\u015a"+
		"\u0700\3\2\2\2\u015c\u070b\3\2\2\2\u015e\u070d\3\2\2\2\u0160\u0715\3\2"+
		"\2\2\u0162\u0717\3\2\2\2\u0164\u0727\3\2\2\2\u0166\u073e\3\2\2\2\u0168"+
		"\u074d\3\2\2\2\u016a\u074f\3\2\2\2\u016c\u075b\3\2\2\2\u016e\u075d\3\2"+
		"\2\2\u0170\u076e\3\2\2\2\u0172\u0770\3\2\2\2\u0174\u0775\3\2\2\2\u0176"+
		"\u077c\3\2\2\2\u0178\u0781\3\2\2\2\u017a\u0786\3\2\2\2\u017c\u0797\3\2"+
		"\2\2\u017e\u0799\3\2\2\2\u0180\u07e2\3\2\2\2\u0182\u07e4\3\2\2\2\u0184"+
		"\u0827\3\2\2\2\u0186\u0829\3\2\2\2\u0188\u0847\3\2\2\2\u018a\u0849\3\2"+
		"\2\2\u018c\u0853\3\2\2\2\u018e\u085a\3\2\2\2\u0190\u085c\3\2\2\2\u0192"+
		"\u086a\3\2\2\2\u0194\u086c\3\2\2\2\u0196\u0876\3\2\2\2\u0198\u087a\3\2"+
		"\2\2\u019a\u087c\3\2\2\2\u019c\u0883\3\2\2\2\u019e\u0885\3\2\2\2\u01a0"+
		"\u0894\3\2\2\2\u01a2\u0896\3\2\2\2\u01a4\u08a1\3\2\2\2\u01a6\u08ac\3\2"+
		"\2\2\u01a8\u08b7\3\2\2\2\u01aa\u08c2\3\2\2\2\u01ac\u08cd\3\2\2\2\u01ae"+
		"\u08db\3\2\2\2\u01b0\u08f2\3\2\2\2\u01b2\u0903\3\2\2\2\u01b4\u0911\3\2"+
		"\2\2\u01b6\u0929\3\2\2\2\u01b8\u092b\3\2\2\2\u01ba\u092e\3\2\2\2\u01bc"+
		"\u0937\3\2\2\2\u01be\u0939\3\2\2\2\u01c0\u0942\3\2\2\2\u01c2\u0946\3\2"+
		"\2\2\u01c4\u0948\3\2\2\2\u01c6\u094b\3\2\2\2\u01c8\u094d\3\2\2\2\u01ca"+
		"\u094f\3\2\2\2\u01cc\u096d\3\2\2\2\u01ce\u096f\3\2\2\2\u01d0\u01d3\5\4"+
		"\3\2\u01d1\u01d3\5\f\7\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"\3\3\2\2\2\u01d4\u01d6\5\u00caf\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01da\u01e3\5\6\4\2\u01db\u01dd\5\u00caf\2\u01dc\u01db"+
		"\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e3\7\b\2\2\u01e2\u01d7\3\2"+
		"\2\2\u01e2\u01de\3\2\2\2\u01e3\5\3\2\2\2\u01e4\u01e7\5\b\5\2\u01e5\u01e7"+
		"\5\n\6\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\7\3\2\2\2\u01e8"+
		"\u01e9\t\2\2\2\u01e9\t\3\2\2\2\u01ea\u01eb\t\3\2\2\u01eb\13\3\2\2\2\u01ec"+
		"\u01f0\5\16\b\2\u01ed\u01f0\5 \21\2\u01ee\u01f0\5\"\22\2\u01ef\u01ec\3"+
		"\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\r\3\2\2\2\u01f1\u01f5"+
		"\5\20\t\2\u01f2\u01f4\5\22\n\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2"+
		"\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\17\3\2\2\2\u01f7\u01f5"+
		"\3\2\2\2\u01f8\u01fb\5\24\13\2\u01f9\u01fb\5\30\r\2\u01fa\u01f8\3\2\2"+
		"\2\u01fa\u01f9\3\2\2\2\u01fb\21\3\2\2\2\u01fc\u01ff\5\26\f\2\u01fd\u01ff"+
		"\5\32\16\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\23\3\2\2\2\u0200"+
		"\u0202\5\u00caf\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206"+
		"\u0208\7l\2\2\u0207\u0209\5.\30\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2"+
		"\2\2\u0209\25\3\2\2\2\u020a\u020e\7G\2\2\u020b\u020d\5\u00caf\2\u020c"+
		"\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0213\7l\2\2\u0212"+
		"\u0214\5.\30\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\27\3\2\2"+
		"\2\u0215\u0216\5\24\13\2\u0216\31\3\2\2\2\u0217\u0218\5\26\f\2\u0218\33"+
		"\3\2\2\2\u0219\u021b\5\u00caf\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2"+
		"\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c"+
		"\3\2\2\2\u021f\u0221\7l\2\2\u0220\u0222\5.\30\2\u0221\u0220\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0230\3\2\2\2\u0223\u0224\5\16\b\2\u0224\u0228\7"+
		"G\2\2\u0225\u0227\5\u00caf\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022b\u022d\7l\2\2\u022c\u022e\5.\30\2\u022d\u022c\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u021c\3\2\2\2\u022f\u0223\3\2"+
		"\2\2\u0230\35\3\2\2\2\u0231\u0232\5\34\17\2\u0232\37\3\2\2\2\u0233\u0235"+
		"\5\u00caf\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2"+
		"\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a"+
		"\7l\2\2\u023a!\3\2\2\2\u023b\u023c\5\4\3\2\u023c\u023d\5$\23\2\u023d\u0245"+
		"\3\2\2\2\u023e\u023f\5\16\b\2\u023f\u0240\5$\23\2\u0240\u0245\3\2\2\2"+
		"\u0241\u0242\5 \21\2\u0242\u0243\5$\23\2\u0243\u0245\3\2\2\2\u0244\u023b"+
		"\3\2\2\2\u0244\u023e\3\2\2\2\u0244\u0241\3\2\2\2\u0245#\3\2\2\2\u0246"+
		"\u0248\5\u00caf\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u024d\7C\2\2\u024d\u0258\7D\2\2\u024e\u0250\5\u00caf\2\u024f\u024e\3"+
		"\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0255\7C\2\2\u0255\u0257\7D\2"+
		"\2\u0256\u0251\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259"+
		"\3\2\2\2\u0259%\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025d\5(\25\2\u025c"+
		"\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0263\7l\2\2\u0262"+
		"\u0264\5*\26\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\'\3\2\2\2"+
		"\u0265\u0266\5\u00caf\2\u0266)\3\2\2\2\u0267\u0268\7\26\2\2\u0268\u0272"+
		"\5 \21\2\u0269\u026a\7\26\2\2\u026a\u026e\5\16\b\2\u026b\u026d\5,\27\2"+
		"\u026c\u026b\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0267\3\2\2\2\u0271"+
		"\u0269\3\2\2\2\u0272+\3\2\2\2\u0273\u0274\7[\2\2\u0274\u0275\5\36\20\2"+
		"\u0275-\3\2\2\2\u0276\u0277\7J\2\2\u0277\u0278\5\60\31\2\u0278\u0279\7"+
		"I\2\2\u0279/\3\2\2\2\u027a\u027f\5\62\32\2\u027b\u027c\7F\2\2\u027c\u027e"+
		"\5\62\32\2\u027d\u027b\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2"+
		"\u027f\u0280\3\2\2\2\u0280\61\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0285"+
		"\5\f\7\2\u0283\u0285\5\64\33\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2\2"+
		"\u0285\63\3\2\2\2\u0286\u0288\5\u00caf\2\u0287\u0286\3\2\2\2\u0288\u028b"+
		"\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028c\u028e\7M\2\2\u028d\u028f\5\66\34\2\u028e\u028d\3"+
		"\2\2\2\u028e\u028f\3\2\2\2\u028f\65\3\2\2\2\u0290\u0291\7\26\2\2\u0291"+
		"\u0295\5\f\7\2\u0292\u0293\7-\2\2\u0293\u0295\5\f\7\2\u0294\u0290\3\2"+
		"\2\2\u0294\u0292\3\2\2\2\u0295\67\3\2\2\2\u0296\u0297\7l\2\2\u02979\3"+
		"\2\2\2\u0298\u0299\b\36\1\2\u0299\u029a\7l\2\2\u029a\u02a0\3\2\2\2\u029b"+
		"\u029c\f\3\2\2\u029c\u029d\7G\2\2\u029d\u029f\7l\2\2\u029e\u029b\3\2\2"+
		"\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1;"+
		"\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a5\5> \2\u02a4\u02a3\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\u02a9\3\2\2\2\u02a6\u02a8\5B\"\2\u02a7\u02a6\3\2"+
		"\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"\u02af\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ae\5L\'\2\u02ad\u02ac\3\2"+
		"\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"\u02b2\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b3\7\2\2\3\u02b3=\3\2\2\2"+
		"\u02b4\u02b6\5@!\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5"+
		"\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba"+
		"\u02bb\7%\2\2\u02bb\u02c0\7l\2\2\u02bc\u02bd\7G\2\2\u02bd\u02bf\7l\2\2"+
		"\u02be\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\7E\2\2\u02c4"+
		"?\3\2\2\2\u02c5\u02c6\5\u00caf\2\u02c6A\3\2\2\2\u02c7\u02cc\5D#\2\u02c8"+
		"\u02cc\5F$\2\u02c9\u02cc\5H%\2\u02ca\u02cc\5J&\2\u02cb\u02c7\3\2\2\2\u02cb"+
		"\u02c8\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02ca\3\2\2\2\u02ccC\3\2\2\2"+
		"\u02cd\u02ce\7\36\2\2\u02ce\u02cf\5:\36\2\u02cf\u02d0\7E\2\2\u02d0E\3"+
		"\2\2\2\u02d1\u02d2\7\36\2\2\u02d2\u02d3\5:\36\2\u02d3\u02d4\7G\2\2\u02d4"+
		"\u02d5\7Y\2\2\u02d5\u02d6\7E\2\2\u02d6G\3\2\2\2\u02d7\u02d8\7\36\2\2\u02d8"+
		"\u02d9\7+\2\2\u02d9\u02da\5:\36\2\u02da\u02db\7G\2\2\u02db\u02dc\7l\2"+
		"\2\u02dc\u02dd\7E\2\2\u02ddI\3\2\2\2\u02de\u02df\7\36\2\2\u02df\u02e0"+
		"\7+\2\2\u02e0\u02e1\5:\36\2\u02e1\u02e2\7G\2\2\u02e2\u02e3\7Y\2\2\u02e3"+
		"\u02e4\7E\2\2\u02e4K\3\2\2\2\u02e5\u02e9\5N(\2\u02e6\u02e9\5\u00b4[\2"+
		"\u02e7\u02e9\7E\2\2\u02e8\u02e5\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7"+
		"\3\2\2\2\u02e9M\3\2\2\2\u02ea\u02eb\5P)\2\u02ebO\3\2\2\2\u02ec\u02ee\5"+
		"\u00b8]\2\u02ed\u02ec\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2"+
		"\u02ef\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3"+
		"\7\16\2\2\u02f3\u02f5\7l\2\2\u02f4\u02f6\5R*\2\u02f5\u02f4\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f9\5V,\2\u02f8\u02f7\3\2\2"+
		"\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02fc\5X-\2\u02fb\u02fa"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02ff\5\\/\2\u02fe"+
		"\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ffQ\3\2\2\2\u0300\u0301\7J\2\2\u0301"+
		"\u0302\5T+\2\u0302\u0303\7I\2\2\u0303S\3\2\2\2\u0304\u0309\5&\24\2\u0305"+
		"\u0306\7F\2\2\u0306\u0308\5&\24\2\u0307\u0305\3\2\2\2\u0308\u030b\3\2"+
		"\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030aU\3\2\2\2\u030b\u0309"+
		"\3\2\2\2\u030c\u030d\7\26\2\2\u030d\u030e\5\34\17\2\u030eW\3\2\2\2\u030f"+
		"\u0310\7\35\2\2\u0310\u0311\5Z.\2\u0311Y\3\2\2\2\u0312\u0317\5\36\20\2"+
		"\u0313\u0314\7F\2\2\u0314\u0316\5\36\20\2\u0315\u0313\3\2\2\2\u0316\u0319"+
		"\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318[\3\2\2\2\u0319"+
		"\u0317\3\2\2\2\u031a\u031e\7A\2\2\u031b\u031d\5^\60\2\u031c\u031b\3\2"+
		"\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0321\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0322\7B\2\2\u0322]\3\2\2\2\u0323"+
		"\u0328\5`\61\2\u0324\u0328\5\u00a4S\2\u0325\u0328\5\u00a6T\2\u0326\u0328"+
		"\5\u00a8U\2\u0327\u0323\3\2\2\2\u0327\u0324\3\2\2\2\u0327\u0325\3\2\2"+
		"\2\u0327\u0326\3\2\2\2\u0328_\3\2\2\2\u0329\u032f\5b\62\2\u032a\u032f"+
		"\5\u0088E\2\u032b\u032f\5N(\2\u032c\u032f\5\u00b4[\2\u032d\u032f\7E\2"+
		"\2\u032e\u0329\3\2\2\2\u032e\u032a\3\2\2\2\u032e\u032b\3\2\2\2\u032e\u032c"+
		"\3\2\2\2\u032e\u032d\3\2\2\2\u032fa\3\2\2\2\u0330\u0332\5\u00b8]\2\u0331"+
		"\u0330\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2"+
		"\2\2\u0334\u0336\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0337\5l\67\2\u0337"+
		"\u0338\5d\63\2\u0338\u0339\7E\2\2\u0339c\3\2\2\2\u033a\u033f\5f\64\2\u033b"+
		"\u033c\7F\2\2\u033c\u033e\5f\64\2\u033d\u033b\3\2\2\2\u033e\u0341\3\2"+
		"\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340e\3\2\2\2\u0341\u033f"+
		"\3\2\2\2\u0342\u0347\5h\65\2\u0343\u0344\7H\2\2\u0344\u0346\5j\66\2\u0345"+
		"\u0343\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2"+
		"\2\2\u0348g\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034c\7l\2\2\u034b\u034d"+
		"\5$\23\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034di\3\2\2\2\u034e"+
		"\u0351\5\u018e\u00c8\2\u034f\u0351\5\u00dco\2\u0350\u034e\3\2\2\2\u0350"+
		"\u034f\3\2\2\2\u0351k\3\2\2\2\u0352\u0355\5p9\2\u0353\u0355\5n8\2\u0354"+
		"\u0352\3\2\2\2\u0354\u0353\3\2\2\2\u0355m\3\2\2\2\u0356\u0359\5\6\4\2"+
		"\u0357\u0359\7\b\2\2\u0358\u0356\3\2\2\2\u0358\u0357\3\2\2\2\u0359o\3"+
		"\2\2\2\u035a\u035e\5r:\2\u035b\u035e\5\u0084C\2\u035c\u035e\5\u0086D\2"+
		"\u035d\u035a\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035c\3\2\2\2\u035eq\3"+
		"\2\2\2\u035f\u0363\5t;\2\u0360\u0362\5v<\2\u0361\u0360\3\2\2\2\u0362\u0365"+
		"\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364s\3\2\2\2\u0365"+
		"\u0363\3\2\2\2\u0366\u0369\5x=\2\u0367\u0369\5|?\2\u0368\u0366\3\2\2\2"+
		"\u0368\u0367\3\2\2\2\u0369u\3\2\2\2\u036a\u036d\5z>\2\u036b\u036d\5~@"+
		"\2\u036c\u036a\3\2\2\2\u036c\u036b\3\2\2\2\u036dw\3\2\2\2\u036e\u0370"+
		"\7l\2\2\u036f\u0371\5.\30\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"y\3\2\2\2\u0372\u0373\7G\2\2\u0373\u0375\7l\2\2\u0374\u0376\5.\30\2\u0375"+
		"\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376{\3\2\2\2\u0377\u0378\5x=\2\u0378"+
		"}\3\2\2\2\u0379\u037a\5z>\2\u037a\177\3\2\2\2\u037b\u037d\7l\2\2\u037c"+
		"\u037e\5.\30\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u038c\3\2"+
		"\2\2\u037f\u0380\5r:\2\u0380\u0384\7G\2\2\u0381\u0383\5\u00caf\2\u0382"+
		"\u0381\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2"+
		"\2\2\u0385\u0387\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0389\7l\2\2\u0388"+
		"\u038a\5.\30\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c\3\2"+
		"\2\2\u038b\u037b\3\2\2\2\u038b\u037f\3\2\2\2\u038c\u0081\3\2\2\2\u038d"+
		"\u038e\5\u0080A\2\u038e\u0083\3\2\2\2\u038f\u0390\7l\2\2\u0390\u0085\3"+
		"\2\2\2\u0391\u0392\5n8\2\u0392\u0393\5$\23\2\u0393\u039b\3\2\2\2\u0394"+
		"\u0395\5r:\2\u0395\u0396\5$\23\2\u0396\u039b\3\2\2\2\u0397\u0398\5\u0084"+
		"C\2\u0398\u0399\5$\23\2\u0399\u039b\3\2\2\2\u039a\u0391\3\2\2\2\u039a"+
		"\u0394\3\2\2\2\u039a\u0397\3\2\2\2\u039b\u0087\3\2\2\2\u039c\u039e\5\u00b8"+
		"]\2\u039d\u039c\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a3\5\u008a"+
		"F\2\u03a3\u03a4\5\u00a2R\2\u03a4\u0089\3\2\2\2\u03a5\u03a6\5\u008cG\2"+
		"\u03a6\u03a8\5\u008eH\2\u03a7\u03a9\5\u009cO\2\u03a8\u03a7\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9\u03b7\3\2\2\2\u03aa\u03ae\5R*\2\u03ab\u03ad\5\u00ca"+
		"f\2\u03ac\u03ab\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03b2\5\u008c"+
		"G\2\u03b2\u03b4\5\u008eH\2\u03b3\u03b5\5\u009cO\2\u03b4\u03b3\3\2\2\2"+
		"\u03b4\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03a5\3\2\2\2\u03b6\u03aa"+
		"\3\2\2\2\u03b7\u008b\3\2\2\2\u03b8\u03bb\5l\67\2\u03b9\u03bb\7\65\2\2"+
		"\u03ba\u03b8\3\2\2\2\u03ba\u03b9\3\2\2\2\u03bb\u008d\3\2\2\2\u03bc\u03bd"+
		"\7l\2\2\u03bd\u03bf\7?\2\2\u03be\u03c0\5\u0090I\2\u03bf\u03be\3\2\2\2"+
		"\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\7@\2\2\u03c2\u03c4"+
		"\5$\23\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u008f\3\2\2\2\u03c5"+
		"\u03cc\5\u009aN\2\u03c6\u03c7\5\u0092J\2\u03c7\u03c8\7F\2\2\u03c8\u03c9"+
		"\5\u0098M\2\u03c9\u03cc\3\2\2\2\u03ca\u03cc\5\u0098M\2\u03cb\u03c5\3\2"+
		"\2\2\u03cb\u03c6\3\2\2\2\u03cb\u03ca\3\2\2\2\u03cc\u0091\3\2\2\2\u03cd"+
		"\u03d2\5\u0094K\2\u03ce\u03cf\7F\2\2\u03cf\u03d1\5\u0094K\2\u03d0\u03ce"+
		"\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u03da\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d6\5\u009aN\2\u03d6\u03d7"+
		"\7F\2\2\u03d7\u03d8\5\u0094K\2\u03d8\u03da\3\2\2\2\u03d9\u03cd\3\2\2\2"+
		"\u03d9\u03d5\3\2\2\2\u03da\u0093\3\2\2\2\u03db\u03dd\5\u0096L\2\u03dc"+
		"\u03db\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2"+
		"\2\2\u03df\u03e1\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2\5l\67\2\u03e2"+
		"\u03e3\5h\65\2\u03e3\u0095\3\2\2\2\u03e4\u03e7\5\u00caf\2\u03e5\u03e7"+
		"\7\27\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e5\3\2\2\2\u03e7\u0097\3\2\2\2"+
		"\u03e8\u03ea\5\u0096L\2\u03e9\u03e8\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb"+
		"\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03eb\3\2"+
		"\2\2\u03ee\u03f2\5l\67\2\u03ef\u03f1\5\u00caf\2\u03f0\u03ef\3\2\2\2\u03f1"+
		"\u03f4\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f5\3\2"+
		"\2\2\u03f4\u03f2\3\2\2\2\u03f5\u03f6\7n\2\2\u03f6\u03f7\5h\65\2\u03f7"+
		"\u03fa\3\2\2\2\u03f8\u03fa\5\u0094K\2\u03f9\u03eb\3\2\2\2\u03f9\u03f8"+
		"\3\2\2\2\u03fa\u0099\3\2\2\2\u03fb\u03fd\5\u00caf\2\u03fc\u03fb\3\2\2"+
		"\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0401"+
		"\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0402\5l\67\2\u0402\u0403\7l\2\2\u0403"+
		"\u0404\7G\2\2\u0404\u0405\3\2\2\2\u0405\u0406\7\60\2\2\u0406\u009b\3\2"+
		"\2\2\u0407\u0408\7\62\2\2\u0408\u0409\5\u009eP\2\u0409\u009d\3\2\2\2\u040a"+
		"\u040f\5\u00a0Q\2\u040b\u040c\7F\2\2\u040c\u040e\5\u00a0Q\2\u040d\u040b"+
		"\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"\u009f\3\2\2\2\u0411\u040f\3\2\2\2\u0412\u0415\5\34\17\2\u0413\u0415\5"+
		" \21\2\u0414\u0412\3\2\2\2\u0414\u0413\3\2\2\2\u0415\u00a1\3\2\2\2\u0416"+
		"\u0419\5\u00e0q\2\u0417\u0419\7E\2\2\u0418\u0416\3\2\2\2\u0418\u0417\3"+
		"\2\2\2\u0419\u00a3\3\2\2\2\u041a\u041b\5\u00e0q\2\u041b\u00a5\3\2\2\2"+
		"\u041c\u041d\7+\2\2\u041d\u041e\5\u00e0q\2\u041e\u00a7\3\2\2\2\u041f\u0421"+
		"\5\u00aeX\2\u0420\u041f\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2"+
		"\2\u0422\u0423\3\2\2\2\u0423\u0425\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0429"+
		"\5\u00aaV\2\u0426\u0428\5\u009cO\2\u0427\u0426\3\2\2\2\u0428\u042b\3\2"+
		"\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042c\3\2\2\2\u042b"+
		"\u0429\3\2\2\2\u042c\u042d\5\u00b0Y\2\u042d\u00a9\3\2\2\2\u042e\u0430"+
		"\5R*\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2\2\u0431"+
		"\u0432\5\u00acW\2\u0432\u0434\7?\2\2\u0433\u0435\5\u0090I\2\u0434\u0433"+
		"\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\7@\2\2\u0437"+
		"\u00ab\3\2\2\2\u0438\u0439\7l\2\2\u0439\u00ad\3\2\2\2\u043a\u043f\5\u00ca"+
		"f\2\u043b\u043f\7(\2\2\u043c\u043f\7\'\2\2\u043d\u043f\7&\2\2\u043e\u043a"+
		"\3\2\2\2\u043e\u043b\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043d\3\2\2\2\u043f"+
		"\u00af\3\2\2\2\u0440\u0442\7A\2\2\u0441\u0443\5\u00b2Z\2\u0442\u0441\3"+
		"\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445\3\2\2\2\u0444\u0446\5\u00e2r\2"+
		"\u0445\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448"+
		"\7B\2\2\u0448\u00b1\3\2\2\2\u0449\u044b\5.\30\2\u044a\u0449\3\2\2\2\u044a"+
		"\u044b\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\7\60\2\2\u044d\u044e\7"+
		"?\2\2\u044e\u044f\5\u0186\u00c4\2\u044f\u0450\7@\2\2\u0450\u0451\7E\2"+
		"\2\u0451\u0472\3\2\2\2\u0452\u0454\5.\30\2\u0453\u0452\3\2\2\2\u0453\u0454"+
		"\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456\7-\2\2\u0456\u0457\7?\2\2\u0457"+
		"\u0458\5\u0186\u00c4\2\u0458\u0459\7@\2\2\u0459\u045a\7E\2\2\u045a\u0472"+
		"\3\2\2\2\u045b\u045c\5:\36\2\u045c\u045e\7G\2\2\u045d\u045f\5.\30\2\u045e"+
		"\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\7-"+
		"\2\2\u0461\u0462\7?\2\2\u0462\u0463\5\u0186\u00c4\2\u0463\u0464\7@\2\2"+
		"\u0464\u0465\7E\2\2\u0465\u0472\3\2\2\2\u0466\u0467\5\u0142\u00a2\2\u0467"+
		"\u0469\7G\2\2\u0468\u046a\5.\30\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2"+
		"\2\2\u046a\u046b\3\2\2\2\u046b\u046c\7-\2\2\u046c\u046d\7?\2\2\u046d\u046e"+
		"\5\u0186\u00c4\2\u046e\u046f\7@\2\2\u046f\u0470\7E\2\2\u0470\u0472\3\2"+
		"\2\2\u0471\u044a\3\2\2\2\u0471\u0453\3\2\2\2\u0471\u045b\3\2\2\2\u0471"+
		"\u0466\3\2\2\2\u0472\u00b3\3\2\2\2\u0473\u0474\5\u00b6\\\2\u0474\u00b5"+
		"\3\2\2\2\u0475\u0477\5\u00b8]\2\u0476\u0475\3\2\2\2\u0477\u047a\3\2\2"+
		"\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u0478"+
		"\3\2\2\2\u047b\u047c\7!\2\2\u047c\u047e\7l\2\2\u047d\u047f\5R*\2\u047e"+
		"\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\3\2\2\2\u0480\u0482\5\u00ba"+
		"^\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\3\2\2\2\u0483"+
		"\u0484\5\u00bc_\2\u0484\u00b7\3\2\2\2\u0485\u048e\5\u00caf\2\u0486\u048e"+
		"\7(\2\2\u0487\u048e\7&\2\2\u0488\u048e\7\'\2\2\u0489\u048e\7\27\2\2\u048a"+
		"\u048e\7\6\2\2\u048b\u048e\7,\2\2\u048c\u048e\7+\2\2\u048d\u0485\3\2\2"+
		"\2\u048d\u0486\3\2\2\2\u048d\u0487\3\2\2\2\u048d\u0488\3\2\2\2\u048d\u0489"+
		"\3\2\2\2\u048d\u048a\3\2\2\2\u048d\u048b\3\2\2\2\u048d\u048c\3\2\2\2\u048e"+
		"\u00b9\3\2\2\2\u048f\u0490\7\26\2\2\u0490\u0491\5Z.\2\u0491\u00bb\3\2"+
		"\2\2\u0492\u0496\7A\2\2\u0493\u0495\5\u00be`\2\u0494\u0493\3\2\2\2\u0495"+
		"\u0498\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0499\3\2"+
		"\2\2\u0498\u0496\3\2\2\2\u0499\u049a\7B\2\2\u049a\u00bd\3\2\2\2\u049b"+
		"\u04a1\5\u00c0a\2\u049c\u04a1\5\u00c4c\2\u049d\u04a1\5N(\2\u049e\u04a1"+
		"\5\u00b4[\2\u049f\u04a1\7E\2\2\u04a0\u049b\3\2\2\2\u04a0\u049c\3\2\2\2"+
		"\u04a0\u049d\3\2\2\2\u04a0\u049e\3\2\2\2\u04a0\u049f\3\2\2\2\u04a1\u00bf"+
		"\3\2\2\2\u04a2\u04a4\5\u00c2b\2\u04a3\u04a2\3\2\2\2\u04a4\u04a7\3\2\2"+
		"\2\u04a5\u04a3\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a5"+
		"\3\2\2\2\u04a8\u04a9\5l\67\2\u04a9\u04aa\5d\63\2\u04aa\u04ab\7E\2\2\u04ab"+
		"\u00c1\3\2\2\2\u04ac\u04b1\5\u00caf\2\u04ad\u04b1\7(\2\2\u04ae\u04b1\7"+
		"+\2\2\u04af\u04b1\7\27\2\2\u04b0\u04ac\3\2\2\2\u04b0\u04ad\3\2\2\2\u04b0"+
		"\u04ae\3\2\2\2\u04b0\u04af\3\2\2\2\u04b1\u00c3\3\2\2\2\u04b2\u04b4\5\u00c6"+
		"d\2\u04b3\u04b2\3\2\2\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b5"+
		"\u04b6\3\2\2\2\u04b6\u04b8\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8\u04b9\5\u008a"+
		"F\2\u04b9\u04ba\5\u00a2R\2\u04ba\u00c5\3\2\2\2\u04bb\u04c2\5\u00caf\2"+
		"\u04bc\u04c2\7(\2\2\u04bd\u04c2\7\21\2\2\u04be\u04c2\7\6\2\2\u04bf\u04c2"+
		"\7,\2\2\u04c0\u04c2\7+\2\2\u04c1\u04bb\3\2\2\2\u04c1\u04bc\3\2\2\2\u04c1"+
		"\u04bd\3\2\2\2\u04c1\u04be\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c0\3\2"+
		"\2\2\u04c2\u00c7\3\2\2\2\u04c3\u04c4\7\21\2\2\u04c4\u04c5\5\u00d2j\2\u04c5"+
		"\u00c9\3\2\2\2\u04c6\u04ca\5\u00ccg\2\u04c7\u04ca\5\u00d8m\2\u04c8\u04ca"+
		"\5\u00dan\2\u04c9\u04c6\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04c8\3\2\2"+
		"\2\u04ca\u00cb\3\2\2\2\u04cb\u04cc\7m\2\2\u04cc\u04cd\5:\36\2\u04cd\u04cf"+
		"\7?\2\2\u04ce\u04d0\5\u00ceh\2\u04cf\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2"+
		"\u04d0\u04d1\3\2\2\2\u04d1\u04d2\7@\2\2\u04d2\u00cd\3\2\2\2\u04d3\u04d8"+
		"\5\u00d0i\2\u04d4\u04d5\7F\2\2\u04d5\u04d7\5\u00d0i\2\u04d6\u04d4\3\2"+
		"\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u00cf\3\2\2\2\u04da\u04d8\3\2\2\2\u04db\u04dc\7l\2\2\u04dc\u04dd\7H\2"+
		"\2\u04dd\u04de\5\u00d2j\2\u04de\u00d1\3\2\2\2\u04df\u04e3\5\u01a0\u00d1"+
		"\2\u04e0\u04e3\5\u00d4k\2\u04e1\u04e3\5\u00caf\2\u04e2\u04df\3\2\2\2\u04e2"+
		"\u04e0\3\2\2\2\u04e2\u04e1\3\2\2\2\u04e3\u00d3\3\2\2\2\u04e4\u04e5\7A"+
		"\2\2\u04e5\u04e7\5\u00d6l\2\u04e6\u04e8\7F\2\2\u04e7\u04e6\3\2\2\2\u04e7"+
		"\u04e8\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\7B\2\2\u04ea\u00d5\3\2"+
		"\2\2\u04eb\u04f0\5\u00d2j\2\u04ec\u04ed\7F\2\2\u04ed\u04ef\5\u00d2j\2"+
		"\u04ee\u04ec\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04f1"+
		"\3\2\2\2\u04f1\u00d7\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u04f4\7m\2\2\u04f4"+
		"\u04f5\5:\36\2\u04f5\u00d9\3\2\2\2\u04f6\u04f7\7m\2\2\u04f7\u04f8\5:\36"+
		"\2\u04f8\u04f9\7?\2\2\u04f9\u04fa\5\u00d2j\2\u04fa\u04fb\7@\2\2\u04fb"+
		"\u00db\3\2\2\2\u04fc\u04fe\7A\2\2\u04fd\u04ff\5\u00dep\2\u04fe\u04fd\3"+
		"\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0501\3\2\2\2\u0500\u0502\7F\2\2\u0501"+
		"\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504\7B"+
		"\2\2\u0504\u00dd\3\2\2\2\u0505\u050a\5j\66\2\u0506\u0507\7F\2\2\u0507"+
		"\u0509\5j\66\2\u0508\u0506\3\2\2\2\u0509\u050c\3\2\2\2\u050a\u0508\3\2"+
		"\2\2\u050a\u050b\3\2\2\2\u050b\u00df\3\2\2\2\u050c\u050a\3\2\2\2\u050d"+
		"\u050f\7A\2\2\u050e\u0510\5\u00e2r\2\u050f\u050e\3\2\2\2\u050f\u0510\3"+
		"\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\7B\2\2\u0512\u00e1\3\2\2\2\u0513"+
		"\u0517\5\u00e4s\2\u0514\u0516\5\u00e4s\2\u0515\u0514\3\2\2\2\u0516\u0519"+
		"\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u00e3\3\2\2\2\u0519"+
		"\u0517\3\2\2\2\u051a\u051e\5\u00e6t\2\u051b\u051e\5N(\2\u051c\u051e\5"+
		"\u00eav\2\u051d\u051a\3\2\2\2\u051d\u051b\3\2\2\2\u051d\u051c\3\2\2\2"+
		"\u051e\u00e5\3\2\2\2\u051f\u0520\5\u00e8u\2\u0520\u0521\7E\2\2\u0521\u00e7"+
		"\3\2\2\2\u0522\u0524\5\u0096L\2\u0523\u0522\3\2\2\2\u0524\u0527\3\2\2"+
		"\2\u0525\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0528\3\2\2\2\u0527\u0525"+
		"\3\2\2\2\u0528\u0529\5l\67\2\u0529\u052a\5d\63\2\u052a\u00e9\3\2\2\2\u052b"+
		"\u0532\5\u00eex\2\u052c\u0532\5\u00f2z\2\u052d\u0532\5\u00fa~\2\u052e"+
		"\u0532\5\u00fc\177\2\u052f\u0532\5\u010c\u0087\2\u0530\u0532\5\u0112\u008a"+
		"\2\u0531\u052b\3\2\2\2\u0531\u052c\3\2\2\2\u0531\u052d\3\2\2\2\u0531\u052e"+
		"\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0530\3\2\2\2\u0532\u00eb\3\2\2\2\u0533"+
		"\u0539\5\u00eex\2\u0534\u0539\5\u00f4{\2\u0535\u0539\5\u00fe\u0080\2\u0536"+
		"\u0539\5\u010e\u0088\2\u0537\u0539\5\u0114\u008b\2\u0538\u0533\3\2\2\2"+
		"\u0538\u0534\3\2\2\2\u0538\u0535\3\2\2\2\u0538\u0536\3\2\2\2\u0538\u0537"+
		"\3\2\2\2\u0539\u00ed\3\2\2\2\u053a\u0547\5\u00e0q\2\u053b\u0547\5\u00f0"+
		"y\2\u053c\u0547\5\u00f6|\2\u053d\u0547\5\u0100\u0081\2\u053e\u0547\5\u0102"+
		"\u0082\2\u053f\u0547\5\u0110\u0089\2\u0540\u0547\5\u0124\u0093\2\u0541"+
		"\u0547\5\u0126\u0094\2\u0542\u0547\5\u0128\u0095\2\u0543\u0547\5\u012c"+
		"\u0097\2\u0544\u0547\5\u012a\u0096\2\u0545\u0547\5\u012e\u0098\2\u0546"+
		"\u053a\3\2\2\2\u0546\u053b\3\2\2\2\u0546\u053c\3\2\2\2\u0546\u053d\3\2"+
		"\2\2\u0546\u053e\3\2\2\2\u0546\u053f\3\2\2\2\u0546\u0540\3\2\2\2\u0546"+
		"\u0541\3\2\2\2\u0546\u0542\3\2\2\2\u0546\u0543\3\2\2\2\u0546\u0544\3\2"+
		"\2\2\u0546\u0545\3\2\2\2\u0547\u00ef\3\2\2\2\u0548\u0549\7E\2\2\u0549"+
		"\u00f1\3\2\2\2\u054a\u054b\7l\2\2\u054b\u054c\7N\2\2\u054c\u054d\5\u00ea"+
		"v\2\u054d\u00f3\3\2\2\2\u054e\u054f\7l\2\2\u054f\u0550\7N\2\2\u0550\u0551"+
		"\5\u00ecw\2\u0551\u00f5\3\2\2\2\u0552\u0553\5\u00f8}\2\u0553\u0554\7E"+
		"\2\2\u0554\u00f7\3\2\2\2\u0555\u055d\5\u019a\u00ce\2\u0556\u055d\5\u01b8"+
		"\u00dd\2\u0557\u055d\5\u01ba\u00de\2\u0558\u055d\5\u01c4\u00e3\2\u0559"+
		"\u055d\5\u01ca\u00e6\2\u055a\u055d\5\u0180\u00c1\2\u055b\u055d\5\u015c"+
		"\u00af\2\u055c\u0555\3\2\2\2\u055c\u0556\3\2\2\2\u055c\u0557\3\2\2\2\u055c"+
		"\u0558\3\2\2\2\u055c\u0559\3\2\2\2\u055c\u055a\3\2\2\2\u055c\u055b\3\2"+
		"\2\2\u055d\u00f9\3\2\2\2\u055e\u055f\7\33\2\2\u055f\u0560\7?\2\2\u0560"+
		"\u0561\5\u018e\u00c8\2\u0561\u0562\7@\2\2\u0562\u0563\5\u00eav\2\u0563"+
		"\u00fb\3\2\2\2\u0564\u0565\7\33\2\2\u0565\u0566\7?\2\2\u0566\u0567\5\u018e"+
		"\u00c8\2\u0567\u0568\7@\2\2\u0568\u0569\5\u00ecw\2\u0569\u056a\7\24\2"+
		"\2\u056a\u056b\5\u00eav\2\u056b\u00fd\3\2\2\2\u056c\u056d\7\33\2\2\u056d"+
		"\u056e\7?\2\2\u056e\u056f\5\u018e\u00c8\2\u056f\u0570\7@\2\2\u0570\u0571"+
		"\5\u00ecw\2\u0571\u0572\7\24\2\2\u0572\u0573\5\u00ecw\2\u0573\u00ff\3"+
		"\2\2\2\u0574\u0575\7\7\2\2\u0575\u0576\5\u018e\u00c8\2\u0576\u0577\7E"+
		"\2\2\u0577\u057f\3\2\2\2\u0578\u0579\7\7\2\2\u0579\u057a\5\u018e\u00c8"+
		"\2\u057a\u057b\7N\2\2\u057b\u057c\5\u018e\u00c8\2\u057c\u057d\7E\2\2\u057d"+
		"\u057f\3\2\2\2\u057e\u0574\3\2\2\2\u057e\u0578\3\2\2\2\u057f\u0101\3\2"+
		"\2\2\u0580\u0581\7.\2\2\u0581\u0582\7?\2\2\u0582\u0583\5\u018e\u00c8\2"+
		"\u0583\u0584\7@\2\2\u0584\u0585\5\u0104\u0083\2\u0585\u0103\3\2\2\2\u0586"+
		"\u058a\7A\2\2\u0587\u0589\5\u0106\u0084\2\u0588\u0587\3\2\2\2\u0589\u058c"+
		"\3\2\2\2\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u0590\3\2\2\2\u058c"+
		"\u058a\3\2\2\2\u058d\u058f\5\u010a\u0086\2\u058e\u058d\3\2\2\2\u058f\u0592"+
		"\3\2\2\2\u0590\u058e\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0593\3\2\2\2\u0592"+
		"\u0590\3\2\2\2\u0593\u0594\7B\2\2\u0594\u0105\3\2\2\2\u0595\u0596\5\u0108"+
		"\u0085\2\u0596\u0597\5\u00e2r\2\u0597\u0107\3\2\2\2\u0598\u059c\5\u010a"+
		"\u0086\2\u0599\u059b\5\u010a\u0086\2\u059a\u0599\3\2\2\2\u059b\u059e\3"+
		"\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u0109\3\2\2\2\u059e"+
		"\u059c\3\2\2\2\u059f\u05a0\7\13\2\2\u05a0\u05a1\5\u01ce\u00e8\2\u05a1"+
		"\u05a2\7N\2\2\u05a2\u05a6\3\2\2\2\u05a3\u05a4\7\21\2\2\u05a4\u05a6\7N"+
		"\2\2\u05a5\u059f\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a6\u010b\3\2\2\2\u05a7"+
		"\u05a8\7\67\2\2\u05a8\u05a9\7?\2\2\u05a9\u05aa\5\u018e\u00c8\2\u05aa\u05ab"+
		"\7@\2\2\u05ab\u05ac\5\u00eav\2\u05ac\u010d\3\2\2\2\u05ad\u05ae\7\67\2"+
		"\2\u05ae\u05af\7?\2\2\u05af\u05b0\5\u018e\u00c8\2\u05b0\u05b1\7@\2\2\u05b1"+
		"\u05b2\5\u00ecw\2\u05b2\u010f\3\2\2\2\u05b3\u05b4\7\22\2\2\u05b4\u05b5"+
		"\5\u00eav\2\u05b5\u05b6\7\67\2\2\u05b6\u05b7\7?\2\2\u05b7\u05b8\5\u018e"+
		"\u00c8\2\u05b8\u05b9\7@\2\2\u05b9\u05ba\7E\2\2\u05ba\u0111\3\2\2\2\u05bb"+
		"\u05be\5\u0116\u008c\2\u05bc\u05be\5\u0120\u0091\2\u05bd\u05bb\3\2\2\2"+
		"\u05bd\u05bc\3\2\2\2\u05be\u0113\3\2\2\2\u05bf\u05c2\5\u0118\u008d\2\u05c0"+
		"\u05c2\5\u0122\u0092\2\u05c1\u05bf\3\2\2\2\u05c1\u05c0\3\2\2\2\u05c2\u0115"+
		"\3\2\2\2\u05c3\u05c4\7\32\2\2\u05c4\u05c6\7?\2\2\u05c5\u05c7\5\u011a\u008e"+
		"\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05ca"+
		"\7E\2\2\u05c9\u05cb\5\u018e\u00c8\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3"+
		"\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05ce\7E\2\2\u05cd\u05cf\5\u011c\u008f"+
		"\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1"+
		"\7@\2\2\u05d1\u05d2\5\u00eav\2\u05d2\u0117\3\2\2\2\u05d3\u05d4\7\32\2"+
		"\2\u05d4\u05d6\7?\2\2\u05d5\u05d7\5\u011a\u008e\2\u05d6\u05d5\3\2\2\2"+
		"\u05d6\u05d7\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05da\7E\2\2\u05d9\u05db"+
		"\5\u018e\u00c8\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\3"+
		"\2\2\2\u05dc\u05de\7E\2\2\u05dd\u05df\5\u011c\u008f\2\u05de\u05dd\3\2"+
		"\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1\7@\2\2\u05e1"+
		"\u05e2\5\u00ecw\2\u05e2\u0119\3\2\2\2\u05e3\u05e6\5\u011e\u0090\2\u05e4"+
		"\u05e6\5\u00e8u\2\u05e5\u05e3\3\2\2\2\u05e5\u05e4\3\2\2\2\u05e6\u011b"+
		"\3\2\2\2\u05e7\u05e8\5\u011e\u0090\2\u05e8\u011d\3\2\2\2\u05e9\u05ee\5"+
		"\u00f8}\2\u05ea\u05eb\7F\2\2\u05eb\u05ed\5\u00f8}\2\u05ec\u05ea\3\2\2"+
		"\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u011f"+
		"\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1\u05f2\7\32\2\2\u05f2\u05f6\7?\2\2\u05f3"+
		"\u05f5\5\u0096L\2\u05f4\u05f3\3\2\2\2\u05f5\u05f8\3\2\2\2\u05f6\u05f4"+
		"\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f9"+
		"\u05fa\5l\67\2\u05fa\u05fb\5h\65\2\u05fb\u05fc\7N\2\2\u05fc\u05fd\5\u018e"+
		"\u00c8\2\u05fd\u05fe\7@\2\2\u05fe\u05ff\5\u00eav\2\u05ff\u0121\3\2\2\2"+
		"\u0600\u0601\7\32\2\2\u0601\u0605\7?\2\2\u0602\u0604\5\u0096L\2\u0603"+
		"\u0602\3\2\2\2\u0604\u0607\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0606\3\2"+
		"\2\2\u0606\u0608\3\2\2\2\u0607\u0605\3\2\2\2\u0608\u0609\5l\67\2\u0609"+
		"\u060a\5h\65\2\u060a\u060b\7N\2\2\u060b\u060c\5\u018e\u00c8\2\u060c\u060d"+
		"\7@\2\2\u060d\u060e\5\u00ecw\2\u060e\u0123\3\2\2\2\u060f\u0611\7\t\2\2"+
		"\u0610\u0612\7l\2\2\u0611\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0613"+
		"\3\2\2\2\u0613\u0614\7E\2\2\u0614\u0125\3\2\2\2\u0615\u0617\7\20\2\2\u0616"+
		"\u0618\7l\2\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3\2"+
		"\2\2\u0619\u061a\7E\2\2\u061a\u0127\3\2\2\2\u061b\u061d\7)\2\2\u061c\u061e"+
		"\5\u018e\u00c8\2\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3"+
		"\2\2\2\u061f\u0620\7E\2\2\u0620\u0129\3\2\2\2\u0621\u0622\7\61\2\2\u0622"+
		"\u0623\5\u018e\u00c8\2\u0623\u0624\7E\2\2\u0624\u012b\3\2\2\2\u0625\u0626"+
		"\7/\2\2\u0626\u0627\7?\2\2\u0627\u0628\5\u018e\u00c8\2\u0628\u0629\7@"+
		"\2\2\u0629\u062a\5\u00e0q\2\u062a\u012d\3\2\2\2\u062b\u062c\7\64\2\2\u062c"+
		"\u062d\5\u00e0q\2\u062d\u062e\5\u0130\u0099\2\u062e\u0638\3\2\2\2\u062f"+
		"\u0630\7\64\2\2\u0630\u0632\5\u00e0q\2\u0631\u0633\5\u0130\u0099\2\u0632"+
		"\u0631\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0635\5\u0138"+
		"\u009d\2\u0635\u0638\3\2\2\2\u0636\u0638\5\u013a\u009e\2\u0637\u062b\3"+
		"\2\2\2\u0637\u062f\3\2\2\2\u0637\u0636\3\2\2\2\u0638\u012f\3\2\2\2\u0639"+
		"\u063d\5\u0132\u009a\2\u063a\u063c\5\u0132\u009a\2\u063b\u063a\3\2\2\2"+
		"\u063c\u063f\3\2\2\2\u063d\u063b\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0131"+
		"\3\2\2\2\u063f\u063d\3\2\2\2\u0640\u0641\7\f\2\2\u0641\u0642\7?\2\2\u0642"+
		"\u0643\5\u0134\u009b\2\u0643\u0644\7@\2\2\u0644\u0645\5\u00e0q\2\u0645"+
		"\u0133\3\2\2\2\u0646\u0648\5\u0096L\2\u0647\u0646\3\2\2\2\u0648\u064b"+
		"\3\2\2\2\u0649\u0647\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064c\3\2\2\2\u064b"+
		"\u0649\3\2\2\2\u064c\u064d\5\u0136\u009c\2\u064d\u064e\5h\65\2\u064e\u0135"+
		"\3\2\2\2\u064f\u0654\5\u0080A\2\u0650\u0651\7\\\2\2\u0651\u0653\5\34\17"+
		"\2\u0652\u0650\3\2\2\2\u0653\u0656\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0655"+
		"\3\2\2\2\u0655\u0137\3\2\2\2\u0656\u0654\3\2\2\2\u0657\u0658\7\30\2\2"+
		"\u0658\u0659\5\u00e0q\2\u0659\u0139\3\2\2\2\u065a\u065b\7\64\2\2\u065b"+
		"\u065c\5\u013c\u009f\2\u065c\u065e\5\u00e0q\2\u065d\u065f\5\u0130\u0099"+
		"\2\u065e\u065d\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0661\3\2\2\2\u0660\u0662"+
		"\5\u0138\u009d\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u013b\3"+
		"\2\2\2\u0663\u0664\7?\2\2\u0664\u0666\5\u013e\u00a0\2\u0665\u0667\7E\2"+
		"\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669"+
		"\7@\2\2\u0669\u013d\3\2\2\2\u066a\u066f\5\u0140\u00a1\2\u066b\u066c\7"+
		"E\2\2\u066c\u066e\5\u0140\u00a1\2\u066d\u066b\3\2\2\2\u066e\u0671\3\2"+
		"\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u013f\3\2\2\2\u0671"+
		"\u066f\3\2\2\2\u0672\u0674\5\u0096L\2\u0673\u0672\3\2\2\2\u0674\u0677"+
		"\3\2\2\2\u0675\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\3\2\2\2\u0677"+
		"\u0675\3\2\2\2\u0678\u0679\5l\67\2\u0679\u067a\5h\65\2\u067a\u067b\7H"+
		"\2\2\u067b\u067c\5\u018e\u00c8\2\u067c\u0141\3\2\2\2\u067d\u0681\5\u0144"+
		"\u00a3\2\u067e\u0680\5\u0146\u00a4\2\u067f\u067e\3\2\2\2\u0680\u0683\3"+
		"\2\2\2\u0681\u067f\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0143\3\2\2\2\u0683"+
		"\u0681\3\2\2\2\u0684\u0687\5\u0154\u00ab\2\u0685\u0687\5\u0188\u00c5\2"+
		"\u0686\u0684\3\2\2\2\u0686\u0685\3\2\2\2\u0687\u0145\3\2\2\2\u0688\u0689"+
		"\5\u014e\u00a8\2\u0689\u0147\3\2\2\2\u068a\u069a\78\2\2\u068b\u069a\5"+
		"\u015a\u00ae\2\u068c\u069a\7\60\2\2\u068d\u068e\5:\36\2\u068e\u068f\7"+
		"G\2\2\u068f\u0690\7\60\2\2\u0690\u069a\3\2\2\2\u0691\u0692\7?\2\2\u0692"+
		"\u0693\5\u018e\u00c8\2\u0693\u0694\7@\2\2\u0694\u069a\3\2\2\2\u0695\u069a"+
		"\5\u015c\u00af\2\u0696\u069a\5\u0168\u00b5\2\u0697\u069a\5\u016e\u00b8"+
		"\2\u0698\u069a\5\u0180\u00c1\2\u0699\u068a\3\2\2\2\u0699\u068b\3\2\2\2"+
		"\u0699\u068c\3\2\2\2\u0699\u068d\3\2\2\2\u0699\u0691\3\2\2\2\u0699\u0695"+
		"\3\2\2\2\u0699\u0696\3\2\2\2\u0699\u0697\3\2\2\2\u0699\u0698\3\2\2\2\u069a"+
		"\u0149\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u014b\3\2\2\2\u069d\u06ac\78"+
		"\2\2\u069e\u06ac\5\u015a\u00ae\2\u069f\u06ac\7\60\2\2\u06a0\u06a1\5:\36"+
		"\2\u06a1\u06a2\7G\2\2\u06a2\u06a3\7\60\2\2\u06a3\u06ac\3\2\2\2\u06a4\u06a5"+
		"\7?\2\2\u06a5\u06a6\5\u018e\u00c8\2\u06a6\u06a7\7@\2\2\u06a7\u06ac\3\2"+
		"\2\2\u06a8\u06ac\5\u015c\u00af\2\u06a9\u06ac\5\u0168\u00b5\2\u06aa\u06ac"+
		"\5\u0180\u00c1\2\u06ab\u069d\3\2\2\2\u06ab\u069e\3\2\2\2\u06ab\u069f\3"+
		"\2\2\2\u06ab\u06a0\3\2\2\2\u06ab\u06a4\3\2\2\2\u06ab\u06a8\3\2\2\2\u06ab"+
		"\u06a9\3\2\2\2\u06ab\u06aa\3\2\2\2\u06ac\u014d\3\2\2\2\u06ad\u06b2\5\u015e"+
		"\u00b0\2\u06ae\u06b2\5\u016a\u00b6\2\u06af\u06b2\5\u0174\u00bb\2\u06b0"+
		"\u06b2\5\u0182\u00c2\2\u06b1\u06ad\3\2\2\2\u06b1\u06ae\3\2\2\2\u06b1\u06af"+
		"\3\2\2\2\u06b1\u06b0\3\2\2\2\u06b2\u014f\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4"+
		"\u0151\3\2\2\2\u06b5\u06b9\5\u015e\u00b0\2\u06b6\u06b9\5\u016a\u00b6\2"+
		"\u06b7\u06b9\5\u0182\u00c2\2\u06b8\u06b5\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8"+
		"\u06b7\3\2\2\2\u06b9\u0153\3\2\2\2\u06ba\u06ca\78\2\2\u06bb\u06ca\5\u015a"+
		"\u00ae\2\u06bc\u06ca\7\60\2\2\u06bd\u06be\5:\36\2\u06be\u06bf\7G\2\2\u06bf"+
		"\u06c0\7\60\2\2\u06c0\u06ca\3\2\2\2\u06c1\u06c2\7?\2\2\u06c2\u06c3\5\u018e"+
		"\u00c8\2\u06c3\u06c4\7@\2\2\u06c4\u06ca\3\2\2\2\u06c5\u06ca\5\u0160\u00b1"+
		"\2\u06c6\u06ca\5\u016c\u00b7\2\u06c7\u06ca\5\u017a\u00be\2\u06c8\u06ca"+
		"\5\u0184\u00c3\2\u06c9\u06ba\3\2\2\2\u06c9\u06bb\3\2\2\2\u06c9\u06bc\3"+
		"\2\2\2\u06c9\u06bd\3\2\2\2\u06c9\u06c1\3\2\2\2\u06c9\u06c5\3\2\2\2\u06c9"+
		"\u06c6\3\2\2\2\u06c9\u06c7\3\2\2\2\u06c9\u06c8\3\2\2\2\u06ca\u0155\3\2"+
		"\2\2\u06cb\u06cc\3\2\2\2\u06cc\u0157\3\2\2\2\u06cd\u06dc\78\2\2\u06ce"+
		"\u06dc\5\u015a\u00ae\2\u06cf\u06dc\7\60\2\2\u06d0\u06d1\5:\36\2\u06d1"+
		"\u06d2\7G\2\2\u06d2\u06d3\7\60\2\2\u06d3\u06dc\3\2\2\2\u06d4\u06d5\7?"+
		"\2\2\u06d5\u06d6\5\u018e\u00c8\2\u06d6\u06d7\7@\2\2\u06d7\u06dc\3\2\2"+
		"\2\u06d8\u06dc\5\u0160\u00b1\2\u06d9\u06dc\5\u016c\u00b7\2\u06da\u06dc"+
		"\5\u0184\u00c3\2\u06db\u06cd\3\2\2\2\u06db\u06ce\3\2\2\2\u06db\u06cf\3"+
		"\2\2\2\u06db\u06d0\3\2\2\2\u06db\u06d4\3\2\2\2\u06db\u06d8\3\2\2\2\u06db"+
		"\u06d9\3\2\2\2\u06db\u06da\3\2\2\2\u06dc\u0159\3\2\2\2\u06dd\u06e2\5:"+
		"\36\2\u06de\u06df\7C\2\2\u06df\u06e1\7D\2\2\u06e0\u06de\3\2\2\2\u06e1"+
		"\u06e4\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e5\3\2"+
		"\2\2\u06e4\u06e2\3\2\2\2\u06e5\u06e6\7G\2\2\u06e6\u06e7\7\16\2\2\u06e7"+
		"\u0701\3\2\2\2\u06e8\u06ed\5\6\4\2\u06e9\u06ea\7C\2\2\u06ea\u06ec\7D\2"+
		"\2\u06eb\u06e9\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed\u06ee"+
		"\3\2\2\2\u06ee\u06f0\3\2\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06f1\7G\2\2\u06f1"+
		"\u06f2\7\16\2\2\u06f2\u0701\3\2\2\2\u06f3\u06f8\7\b\2\2\u06f4\u06f5\7"+
		"C\2\2\u06f5\u06f7\7D\2\2\u06f6\u06f4\3\2\2\2\u06f7\u06fa\3\2\2\2\u06f8"+
		"\u06f6\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fb\3\2\2\2\u06fa\u06f8\3\2"+
		"\2\2\u06fb\u06fc\7G\2\2\u06fc\u0701\7\16\2\2\u06fd\u06fe\7\65\2\2\u06fe"+
		"\u06ff\7G\2\2\u06ff\u0701\7\16\2\2\u0700\u06dd\3\2\2\2\u0700\u06e8\3\2"+
		"\2\2\u0700\u06f3\3\2\2\2\u0700\u06fd\3\2\2\2\u0701\u015b\3\2\2\2\u0702"+
		"\u070c\5\u0162\u00b2\2\u0703\u0704\5:\36\2\u0704\u0705\7G\2\2\u0705\u0706"+
		"\5\u0162\u00b2\2\u0706\u070c\3\2\2\2\u0707\u0708\5\u0142\u00a2\2\u0708"+
		"\u0709\7G\2\2\u0709\u070a\5\u0162\u00b2\2\u070a\u070c\3\2\2\2\u070b\u0702"+
		"\3\2\2\2\u070b\u0703\3\2\2\2\u070b\u0707\3\2\2\2\u070c\u015d\3\2\2\2\u070d"+
		"\u070e\7G\2\2\u070e\u070f\5\u0162\u00b2\2\u070f\u015f\3\2\2\2\u0710\u0716"+
		"\5\u0162\u00b2\2\u0711\u0712\5:\36\2\u0712\u0713\7G\2\2\u0713\u0714\5"+
		"\u0162\u00b2\2\u0714\u0716\3\2\2\2\u0715\u0710\3\2\2\2\u0715\u0711\3\2"+
		"\2\2\u0716\u0161\3\2\2\2\u0717\u0719\7$\2\2\u0718\u071a\5.\30\2\u0719"+
		"\u0718\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u071c\5\u0164"+
		"\u00b3\2\u071c\u071e\7?\2\2\u071d\u071f\5\u0186\u00c4\2\u071e\u071d\3"+
		"\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0722\7@\2\2\u0721"+
		"\u0723\5\\/\2\u0722\u0721\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0163\3\2"+
		"\2\2\u0724\u0726\5\u00caf\2\u0725\u0724\3\2\2\2\u0726\u0729\3\2\2\2\u0727"+
		"\u0725\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072a\3\2\2\2\u0729\u0727\3\2"+
		"\2\2\u072a\u0735\7l\2\2\u072b\u072f\7G\2\2\u072c\u072e\5\u00caf\2\u072d"+
		"\u072c\3\2\2\2\u072e\u0731\3\2\2\2\u072f\u072d\3\2\2\2\u072f\u0730\3\2"+
		"\2\2\u0730\u0732\3\2\2\2\u0731\u072f\3\2\2\2\u0732\u0734\7l\2\2\u0733"+
		"\u072b\3\2\2\2\u0734\u0737\3\2\2\2\u0735\u0733\3\2\2\2\u0735\u0736\3\2"+
		"\2\2\u0736\u0739\3\2\2\2\u0737\u0735\3\2\2\2\u0738\u073a\5\u0166\u00b4"+
		"\2\u0739\u0738\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u0165\3\2\2\2\u073b\u073f"+
		"\5.\30\2\u073c\u073d\7J\2\2\u073d\u073f\7I\2\2\u073e\u073b\3\2\2\2\u073e"+
		"\u073c\3\2\2\2\u073f\u0167\3\2\2\2\u0740\u0741\5\u0142\u00a2\2\u0741\u0742"+
		"\7G\2\2\u0742\u0743\7l\2\2\u0743\u074e\3\2\2\2\u0744\u0745\7-\2\2\u0745"+
		"\u0746\7G\2\2\u0746\u074e\7l\2\2\u0747\u0748\5:\36\2\u0748\u0749\7G\2"+
		"\2\u0749\u074a\7-\2\2\u074a\u074b\7G\2\2\u074b\u074c\7l\2\2\u074c\u074e"+
		"\3\2\2\2\u074d\u0740\3\2\2\2\u074d\u0744\3\2\2\2\u074d\u0747\3\2\2\2\u074e"+
		"\u0169\3\2\2\2\u074f\u0750\7G\2\2\u0750\u0751\7l\2\2\u0751\u016b\3\2\2"+
		"\2\u0752\u0753\7-\2\2\u0753\u0754\7G\2\2\u0754\u075c\7l\2\2\u0755\u0756"+
		"\5:\36\2\u0756\u0757\7G\2\2\u0757\u0758\7-\2\2\u0758\u0759\7G\2\2\u0759"+
		"\u075a\7l\2\2\u075a\u075c\3\2\2\2\u075b\u0752\3\2\2\2\u075b\u0755\3\2"+
		"\2\2\u075c\u016d\3\2\2\2\u075d\u0761\5\u0170\u00b9\2\u075e\u0760\5\u0172"+
		"\u00ba\2\u075f\u075e\3\2\2\2\u0760\u0763\3\2\2\2\u0761\u075f\3\2\2\2\u0761"+
		"\u0762\3\2\2\2\u0762\u016f\3\2\2\2\u0763\u0761\3\2\2\2\u0764\u0765\5:"+
		"\36\2\u0765\u0766\7C\2\2\u0766\u0767\5\u018e\u00c8\2\u0767\u0768\7D\2"+
		"\2\u0768\u076f\3\2\2\2\u0769\u076a\5\u014a\u00a6\2\u076a\u076b\7C\2\2"+
		"\u076b\u076c\5\u018e\u00c8\2\u076c\u076d\7D\2\2\u076d\u076f\3\2\2\2\u076e"+
		"\u0764\3\2\2\2\u076e\u0769\3\2\2\2\u076f\u0171\3\2\2\2\u0770\u0771\5\u014a"+
		"\u00a6\2\u0771\u0772\7C\2\2\u0772\u0773\5\u018e\u00c8\2\u0773\u0774\7"+
		"D\2\2\u0774\u0173\3\2\2\2\u0775\u0779\5\u0176\u00bc\2\u0776\u0778\5\u0178"+
		"\u00bd\2\u0777\u0776\3\2\2\2\u0778\u077b\3\2\2\2\u0779\u0777\3\2\2\2\u0779"+
		"\u077a\3\2\2\2\u077a\u0175\3\2\2\2\u077b\u0779\3\2\2\2\u077c\u077d\5\u0152"+
		"\u00aa\2\u077d\u077e\7C\2\2\u077e\u077f\5\u018e\u00c8\2\u077f\u0780\7"+
		"D\2\2\u0780\u0177\3\2\2\2\u0781\u0782\5\u0150\u00a9\2\u0782\u0783\7C\2"+
		"\2\u0783\u0784\5\u018e\u00c8\2\u0784\u0785\7D\2\2\u0785\u0179\3\2\2\2"+
		"\u0786\u078a\5\u017c\u00bf\2\u0787\u0789\5\u017e\u00c0\2\u0788\u0787\3"+
		"\2\2\2\u0789\u078c\3\2\2\2\u078a\u0788\3\2\2\2\u078a\u078b\3\2\2\2\u078b"+
		"\u017b\3\2\2\2\u078c\u078a\3\2\2\2\u078d\u078e\5\u0158\u00ad\2\u078e\u078f"+
		"\7C\2\2\u078f\u0790\5\u018e\u00c8\2\u0790\u0791\7D\2\2\u0791\u0798\3\2"+
		"\2\2\u0792\u0793\5:\36\2\u0793\u0794\7C\2\2\u0794\u0795\5\u018e\u00c8"+
		"\2\u0795\u0796\7D\2\2\u0796\u0798\3\2\2\2\u0797\u078d\3\2\2\2\u0797\u0792"+
		"\3\2\2\2\u0798\u017d\3\2\2\2\u0799\u079a\5\u0156\u00ac\2\u079a\u079b\7"+
		"C\2\2\u079b\u079c\5\u018e\u00c8\2\u079c\u079d\7D\2\2\u079d\u017f\3\2\2"+
		"\2\u079e\u079f\58\35\2\u079f\u07a1\7?\2\2\u07a0\u07a2\5\u0186\u00c4\2"+
		"\u07a1\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4"+
		"\7@\2\2\u07a4\u07e3\3\2\2\2\u07a5\u07a6\5:\36\2\u07a6\u07a8\7G\2\2\u07a7"+
		"\u07a9\5.\30\2\u07a8\u07a7\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07aa\3\2"+
		"\2\2\u07aa\u07ab\7l\2\2\u07ab\u07ad\7?\2\2\u07ac\u07ae\5\u0186\u00c4\2"+
		"\u07ad\u07ac\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b0"+
		"\7@\2\2\u07b0\u07e3\3\2\2\2\u07b1\u07b2\5:\36\2\u07b2\u07b4\7G\2\2\u07b3"+
		"\u07b5\5.\30\2\u07b4\u07b3\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b6\3\2"+
		"\2\2\u07b6\u07b7\7l\2\2\u07b7\u07b9\7?\2\2\u07b8\u07ba\5\u0186\u00c4\2"+
		"\u07b9\u07b8\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bc"+
		"\7@\2\2\u07bc\u07e3\3\2\2\2\u07bd\u07be\5\u0142\u00a2\2\u07be\u07c0\7"+
		"G\2\2\u07bf\u07c1\5.\30\2\u07c0\u07bf\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1"+
		"\u07c2\3\2\2\2\u07c2\u07c3\7l\2\2\u07c3\u07c5\7?\2\2\u07c4\u07c6\5\u0186"+
		"\u00c4\2\u07c5\u07c4\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7"+
		"\u07c8\7@\2\2\u07c8\u07e3\3\2\2\2\u07c9\u07ca\7-\2\2\u07ca\u07cc\7G\2"+
		"\2\u07cb\u07cd\5.\30\2\u07cc\u07cb\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07ce"+
		"\3\2\2\2\u07ce\u07cf\7l\2\2\u07cf\u07d1\7?\2\2\u07d0\u07d2\5\u0186\u00c4"+
		"\2\u07d1\u07d0\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07e3"+
		"\7@\2\2\u07d4\u07d5\5:\36\2\u07d5\u07d6\7G\2\2\u07d6\u07d7\7-\2\2\u07d7"+
		"\u07d9\7G\2\2\u07d8\u07da\5.\30\2\u07d9\u07d8\3\2\2\2\u07d9\u07da\3\2"+
		"\2\2\u07da\u07db\3\2\2\2\u07db\u07dc\7l\2\2\u07dc\u07de\7?\2\2\u07dd\u07df"+
		"\5\u0186\u00c4\2\u07de\u07dd\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e0\3"+
		"\2\2\2\u07e0\u07e1\7@\2\2\u07e1\u07e3\3\2\2\2\u07e2\u079e\3\2\2\2\u07e2"+
		"\u07a5\3\2\2\2\u07e2\u07b1\3\2\2\2\u07e2\u07bd\3\2\2\2\u07e2\u07c9\3\2"+
		"\2\2\u07e2\u07d4\3\2\2\2\u07e3\u0181\3\2\2\2\u07e4\u07e6\7G\2\2\u07e5"+
		"\u07e7\5.\30\2\u07e6\u07e5\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\3\2"+
		"\2\2\u07e8\u07e9\7l\2\2\u07e9\u07eb\7?\2\2\u07ea\u07ec\5\u0186\u00c4\2"+
		"\u07eb\u07ea\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ee"+
		"\7@\2\2\u07ee\u0183\3\2\2\2\u07ef\u07f0\58\35\2\u07f0\u07f2\7?\2\2\u07f1"+
		"\u07f3\5\u0186\u00c4\2\u07f2\u07f1\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07f4"+
		"\3\2\2\2\u07f4\u07f5\7@\2\2\u07f5\u0828\3\2\2\2\u07f6\u07f7\5:\36\2\u07f7"+
		"\u07f9\7G\2\2\u07f8\u07fa\5.\30\2\u07f9\u07f8\3\2\2\2\u07f9\u07fa\3\2"+
		"\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fc\7l\2\2\u07fc\u07fe\7?\2\2\u07fd\u07ff"+
		"\5\u0186\u00c4\2\u07fe\u07fd\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\3"+
		"\2\2\2\u0800\u0801\7@\2\2\u0801\u0828\3\2\2\2\u0802\u0803\5:\36\2\u0803"+
		"\u0805\7G\2\2\u0804\u0806\5.\30\2\u0805\u0804\3\2\2\2\u0805\u0806\3\2"+
		"\2\2\u0806\u0807\3\2\2\2\u0807\u0808\7l\2\2\u0808\u080a\7?\2\2\u0809\u080b"+
		"\5\u0186\u00c4\2\u080a\u0809\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080c\3"+
		"\2\2\2\u080c\u080d\7@\2\2\u080d\u0828\3\2\2\2\u080e\u080f\7-\2\2\u080f"+
		"\u0811\7G\2\2\u0810\u0812\5.\30\2\u0811\u0810\3\2\2\2\u0811\u0812\3\2"+
		"\2\2\u0812\u0813\3\2\2\2\u0813\u0814\7l\2\2\u0814\u0816\7?\2\2\u0815\u0817"+
		"\5\u0186\u00c4\2\u0816\u0815\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0818\3"+
		"\2\2\2\u0818\u0828\7@\2\2\u0819\u081a\5:\36\2\u081a\u081b\7G\2\2\u081b"+
		"\u081c\7-\2\2\u081c\u081e\7G\2\2\u081d\u081f\5.\30\2\u081e\u081d\3\2\2"+
		"\2\u081e\u081f\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0821\7l\2\2\u0821\u0823"+
		"\7?\2\2\u0822\u0824\5\u0186\u00c4\2\u0823\u0822\3\2\2\2\u0823\u0824\3"+
		"\2\2\2\u0824\u0825\3\2\2\2\u0825\u0826\7@\2\2\u0826\u0828\3\2\2\2\u0827"+
		"\u07ef\3\2\2\2\u0827\u07f6\3\2\2\2\u0827\u0802\3\2\2\2\u0827\u080e\3\2"+
		"\2\2\u0827\u0819\3\2\2\2\u0828\u0185\3\2\2\2\u0829\u082e\5\u018e\u00c8"+
		"\2\u082a\u082b\7F\2\2\u082b\u082d\5\u018e\u00c8\2\u082c\u082a\3\2\2\2"+
		"\u082d\u0830\3\2\2\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0187"+
		"\3\2\2\2\u0830\u082e\3\2\2\2\u0831\u0832\7$\2\2\u0832\u0833\5\4\3\2\u0833"+
		"\u0835\5\u018a\u00c6\2\u0834\u0836\5$\23\2\u0835\u0834\3\2\2\2\u0835\u0836"+
		"\3\2\2\2\u0836\u0848\3\2\2\2\u0837\u0838\7$\2\2\u0838\u0839\5\16\b\2\u0839"+
		"\u083b\5\u018a\u00c6\2\u083a\u083c\5$\23\2\u083b\u083a\3\2\2\2\u083b\u083c"+
		"\3\2\2\2\u083c\u0848\3\2\2\2\u083d\u083e\7$\2\2\u083e\u083f\5\4\3\2\u083f"+
		"\u0840\5$\23\2\u0840\u0841\5\u00dco\2\u0841\u0848\3\2\2\2\u0842\u0843"+
		"\7$\2\2\u0843\u0844\5\16\b\2\u0844\u0845\5$\23\2\u0845\u0846\5\u00dco"+
		"\2\u0846\u0848\3\2\2\2\u0847\u0831\3\2\2\2\u0847\u0837\3\2\2\2\u0847\u083d"+
		"\3\2\2\2\u0847\u0842\3\2\2\2\u0848\u0189\3\2\2\2\u0849\u084d\5\u018c\u00c7"+
		"\2\u084a\u084c\5\u018c\u00c7\2\u084b\u084a\3\2\2\2\u084c\u084f\3\2\2\2"+
		"\u084d\u084b\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u018b\3\2\2\2\u084f\u084d"+
		"\3\2\2\2\u0850\u0852\5\u00caf\2\u0851\u0850\3\2\2\2\u0852\u0855\3\2\2"+
		"\2\u0853\u0851\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u0856\3\2\2\2\u0855\u0853"+
		"\3\2\2\2\u0856\u0857\7C\2\2\u0857\u0858\5\u018e\u00c8\2\u0858\u0859\7"+
		"D\2\2\u0859\u018d\3\2\2\2\u085a\u085b\5\u0198\u00cd\2\u085b\u018f\3\2"+
		"\2\2\u085c\u085d\5\u0192\u00ca\2\u085d\u085e\7_\2\2\u085e\u085f\5\u0196"+
		"\u00cc\2\u085f\u0191\3\2\2\2\u0860\u086b\7l\2\2\u0861\u0863\7?\2\2\u0862"+
		"\u0864\5\u0090I\2\u0863\u0862\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0865"+
		"\3\2\2\2\u0865\u086b\7@\2\2\u0866\u0867\7?\2\2\u0867\u0868\5\u0194\u00cb"+
		"\2\u0868\u0869\7@\2\2\u0869\u086b\3\2\2\2\u086a\u0860\3\2\2\2\u086a\u0861"+
		"\3\2\2\2\u086a\u0866\3\2\2\2\u086b\u0193\3\2\2\2\u086c\u0871\7l\2\2\u086d"+
		"\u086e\7F\2\2\u086e\u0870\7l\2\2\u086f\u086d\3\2\2\2\u0870\u0873\3\2\2"+
		"\2\u0871\u086f\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0195\3\2\2\2\u0873\u0871"+
		"\3\2\2\2\u0874\u0877\5\u018e\u00c8\2\u0875\u0877\5\u00e0q\2\u0876\u0874"+
		"\3\2\2\2\u0876\u0875\3\2\2\2\u0877\u0197\3\2\2\2\u0878\u087b\5\u01a0\u00d1"+
		"\2\u0879\u087b\5\u019a\u00ce\2\u087a\u0878\3\2\2\2\u087a\u0879\3\2\2\2"+
		"\u087b\u0199\3\2\2\2\u087c\u087d\5\u019c\u00cf\2\u087d\u087e\5\u019e\u00d0"+
		"\2\u087e\u087f\5\u018e\u00c8\2\u087f\u019b\3\2\2\2\u0880\u0884\5:\36\2"+
		"\u0881\u0884\5\u0168\u00b5\2\u0882\u0884\5\u016e\u00b8\2\u0883\u0880\3"+
		"\2\2\2\u0883\u0881\3\2\2\2\u0883\u0882\3\2\2\2\u0884\u019d\3\2\2\2\u0885"+
		"\u0886\t\4\2\2\u0886\u019f\3\2\2\2\u0887\u0895\5\u01a2\u00d2\2\u0888\u0889"+
		"\5\u01a2\u00d2\2\u0889\u088a\7M\2\2\u088a\u088b\5\u018e\u00c8\2\u088b"+
		"\u088c\7N\2\2\u088c\u088d\5\u01a0\u00d1\2\u088d\u0895\3\2\2\2\u088e\u088f"+
		"\5\u01a2\u00d2\2\u088f\u0890\7M\2\2\u0890\u0891\5\u018e\u00c8\2\u0891"+
		"\u0892\7N\2\2\u0892\u0893\5\u0190\u00c9\2\u0893\u0895\3\2\2\2\u0894\u0887"+
		"\3\2\2\2\u0894\u0888\3\2\2\2\u0894\u088e\3\2\2\2\u0895\u01a1\3\2\2\2\u0896"+
		"\u0897\b\u00d2\1\2\u0897\u0898\5\u01a4\u00d3\2\u0898\u089e\3\2\2\2\u0899"+
		"\u089a\f\3\2\2\u089a\u089b\7T\2\2\u089b\u089d\5\u01a4\u00d3\2\u089c\u0899"+
		"\3\2\2\2\u089d\u08a0\3\2\2\2\u089e\u089c\3\2\2\2\u089e\u089f\3\2\2\2\u089f"+
		"\u01a3\3\2\2\2\u08a0\u089e\3\2\2\2\u08a1\u08a2\b\u00d3\1\2\u08a2\u08a3"+
		"\5\u01a6\u00d4\2\u08a3\u08a9\3\2\2\2\u08a4\u08a5\f\3\2\2\u08a5\u08a6\7"+
		"S\2\2\u08a6\u08a8\5\u01a6\u00d4\2\u08a7\u08a4\3\2\2\2\u08a8\u08ab\3\2"+
		"\2\2\u08a9\u08a7\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u01a5\3\2\2\2\u08ab"+
		"\u08a9\3\2\2\2\u08ac\u08ad\b\u00d4\1\2\u08ad\u08ae\5\u01a8\u00d5\2\u08ae"+
		"\u08b4\3\2\2\2\u08af\u08b0\f\3\2\2\u08b0\u08b1\7\\\2\2\u08b1\u08b3\5\u01a8"+
		"\u00d5\2\u08b2\u08af\3\2\2\2\u08b3\u08b6\3\2\2\2\u08b4\u08b2\3\2\2\2\u08b4"+
		"\u08b5\3\2\2\2\u08b5\u01a7\3\2\2\2\u08b6\u08b4\3\2\2\2\u08b7\u08b8\b\u00d5"+
		"\1\2\u08b8\u08b9\5\u01aa\u00d6\2\u08b9\u08bf\3\2\2\2\u08ba\u08bb\f\3\2"+
		"\2\u08bb\u08bc\7]\2\2\u08bc\u08be\5\u01aa\u00d6\2\u08bd\u08ba\3\2\2\2"+
		"\u08be\u08c1\3\2\2\2\u08bf\u08bd\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u01a9"+
		"\3\2\2\2\u08c1\u08bf\3\2\2\2\u08c2\u08c3\b\u00d6\1\2\u08c3\u08c4\5\u01ac"+
		"\u00d7\2\u08c4\u08ca\3\2\2\2\u08c5\u08c6\f\3\2\2\u08c6\u08c7\7[\2\2\u08c7"+
		"\u08c9\5\u01ac\u00d7\2\u08c8\u08c5\3\2\2\2\u08c9\u08cc\3\2\2\2\u08ca\u08c8"+
		"\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u01ab\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cd"+
		"\u08ce\b\u00d7\1\2\u08ce\u08cf\5\u01ae\u00d8\2\u08cf\u08d8\3\2\2\2\u08d0"+
		"\u08d1\f\4\2\2\u08d1\u08d2\7O\2\2\u08d2\u08d7\5\u01ae\u00d8\2\u08d3\u08d4"+
		"\f\3\2\2\u08d4\u08d5\7R\2\2\u08d5\u08d7\5\u01ae\u00d8\2\u08d6\u08d0\3"+
		"\2\2\2\u08d6\u08d3\3\2\2\2\u08d7\u08da\3\2\2\2\u08d8\u08d6\3\2\2\2\u08d8"+
		"\u08d9\3\2\2\2\u08d9\u01ad\3\2\2\2\u08da\u08d8\3\2\2\2\u08db\u08dc\b\u00d8"+
		"\1\2\u08dc\u08dd\5\u01b0\u00d9\2\u08dd\u08ef\3\2\2\2\u08de\u08df\f\7\2"+
		"\2\u08df\u08e0\7J\2\2\u08e0\u08ee\5\u01b0\u00d9\2\u08e1\u08e2\f\6\2\2"+
		"\u08e2\u08e3\7I\2\2\u08e3\u08ee\5\u01b0\u00d9\2\u08e4\u08e5\f\5\2\2\u08e5"+
		"\u08e6\7P\2\2\u08e6\u08ee\5\u01b0\u00d9\2\u08e7\u08e8\f\4\2\2\u08e8\u08e9"+
		"\7Q\2\2\u08e9\u08ee\5\u01b0\u00d9\2\u08ea\u08eb\f\3\2\2\u08eb\u08ec\7"+
		"\37\2\2\u08ec\u08ee\5\f\7\2\u08ed\u08de\3\2\2\2\u08ed\u08e1\3\2\2\2\u08ed"+
		"\u08e4\3\2\2\2\u08ed\u08e7\3\2\2\2\u08ed\u08ea\3\2\2\2\u08ee\u08f1\3\2"+
		"\2\2\u08ef\u08ed\3\2\2\2\u08ef\u08f0\3\2\2\2\u08f0\u01af\3\2\2\2\u08f1"+
		"\u08ef\3\2\2\2\u08f2\u08f3\b\u00d9\1\2\u08f3\u08f4\5\u01b2\u00da\2\u08f4"+
		"\u0900\3\2\2\2\u08f5\u08f6\f\5\2\2\u08f6\u08f7\7\3\2\2\u08f7\u08ff\5\u01b2"+
		"\u00da\2\u08f8\u08f9\f\4\2\2\u08f9\u08fa\7\4\2\2\u08fa\u08ff\5\u01b2\u00da"+
		"\2\u08fb\u08fc\f\3\2\2\u08fc\u08fd\7\5\2\2\u08fd\u08ff\5\u01b2\u00da\2"+
		"\u08fe\u08f5\3\2\2\2\u08fe\u08f8\3\2\2\2\u08fe\u08fb\3\2\2\2\u08ff\u0902"+
		"\3\2\2\2\u0900\u08fe\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u01b1\3\2\2\2\u0902"+
		"\u0900\3\2\2\2\u0903\u0904\b\u00da\1\2\u0904\u0905\5\u01b4\u00db\2\u0905"+
		"\u090e\3\2\2\2\u0906\u0907\f\4\2\2\u0907\u0908\7W\2\2\u0908\u090d\5\u01b4"+
		"\u00db\2\u0909\u090a\f\3\2\2\u090a\u090b\7X\2\2\u090b\u090d\5\u01b4\u00db"+
		"\2\u090c\u0906\3\2\2\2\u090c\u0909\3\2\2\2\u090d\u0910\3\2\2\2\u090e\u090c"+
		"\3\2\2\2\u090e\u090f\3\2\2\2\u090f\u01b3\3\2\2\2\u0910\u090e\3\2\2\2\u0911"+
		"\u0912\b\u00db\1\2\u0912\u0913\5\u01b6\u00dc\2\u0913\u091f\3\2\2\2\u0914"+
		"\u0915\f\5\2\2\u0915\u0916\7Y\2\2\u0916\u091e\5\u01b6\u00dc\2\u0917\u0918"+
		"\f\4\2\2\u0918\u0919\7Z\2\2\u0919\u091e\5\u01b6\u00dc\2\u091a\u091b\f"+
		"\3\2\2\u091b\u091c\7^\2\2\u091c\u091e\5\u01b6\u00dc\2\u091d\u0914\3\2"+
		"\2\2\u091d\u0917\3\2\2\2\u091d\u091a\3\2\2\2\u091e\u0921\3\2\2\2\u091f"+
		"\u091d\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u01b5\3\2\2\2\u0921\u091f\3\2"+
		"\2\2\u0922\u092a\5\u01b8\u00dd\2\u0923\u092a\5\u01ba\u00de\2\u0924\u0925"+
		"\7W\2\2\u0925\u092a\5\u01b6\u00dc\2\u0926\u0927\7X\2\2\u0927\u092a\5\u01b6"+
		"\u00dc\2\u0928\u092a\5\u01bc\u00df\2\u0929\u0922\3\2\2\2\u0929\u0923\3"+
		"\2\2\2\u0929\u0924\3\2\2\2\u0929\u0926\3\2\2\2\u0929\u0928\3\2\2\2\u092a"+
		"\u01b7\3\2\2\2\u092b\u092c\7U\2\2\u092c\u092d\5\u01b6\u00dc\2\u092d\u01b9"+
		"\3\2\2\2\u092e\u092f\7V\2\2\u092f\u0930\5\u01b6\u00dc\2\u0930\u01bb\3"+
		"\2\2\2\u0931\u0938\5\u01be\u00e0\2\u0932\u0933\7L\2\2\u0933\u0938\5\u01b6"+
		"\u00dc\2\u0934\u0935\7K\2\2\u0935\u0938\5\u01b6\u00dc\2\u0936\u0938\5"+
		"\u01cc\u00e7\2\u0937\u0931\3\2\2\2\u0937\u0932\3\2\2\2\u0937\u0934\3\2"+
		"\2\2\u0937\u0936\3\2\2\2\u0938\u01bd\3\2\2\2\u0939\u093d\5\u01c0\u00e1"+
		"\2\u093a\u093c\5\u01c2\u00e2\2\u093b\u093a\3\2\2\2\u093c\u093f\3\2\2\2"+
		"\u093d\u093b\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u01bf\3\2\2\2\u093f\u093d"+
		"\3\2\2\2\u0940\u0943\5\u0142\u00a2\2\u0941\u0943\5:\36\2\u0942\u0940\3"+
		"\2\2\2\u0942\u0941\3\2\2\2\u0943\u01c1\3\2\2\2\u0944\u0947\5\u01c6\u00e4"+
		"\2\u0945\u0947\5\u01c8\u00e5\2\u0946\u0944\3\2\2\2\u0946\u0945\3\2\2\2"+
		"\u0947\u01c3\3\2\2\2\u0948\u0949\5\u01be\u00e0\2\u0949\u094a\7U\2\2\u094a"+
		"\u01c5\3\2\2\2\u094b\u094c\7V\2\2\u094c\u01c7\3\2\2\2\u094d\u094e\7U\2"+
		"\2\u094e\u01c9\3\2\2\2\u094f\u0950\5\u01be\u00e0\2\u0950\u0951\7V\2\2"+
		"\u0951\u01cb\3\2\2\2\u0952\u0953\7?\2\2\u0953\u0954\5\4\3\2\u0954\u0955"+
		"\7@\2\2\u0955\u0956\5\u01b6\u00dc\2\u0956\u096e\3\2\2\2\u0957\u0958\7"+
		"?\2\2\u0958\u095c\5\f\7\2\u0959\u095b\5,\27\2\u095a\u0959\3\2\2\2\u095b"+
		"\u095e\3\2\2\2\u095c\u095a\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u095f\3\2"+
		"\2\2\u095e\u095c\3\2\2\2\u095f\u0960\7@\2\2\u0960\u0961\5\u01bc\u00df"+
		"\2\u0961\u096e\3\2\2\2\u0962\u0963\7?\2\2\u0963\u0967\5\f\7\2\u0964\u0966"+
		"\5,\27\2\u0965\u0964\3\2\2\2\u0966\u0969\3\2\2\2\u0967\u0965\3\2\2\2\u0967"+
		"\u0968\3\2\2\2\u0968\u096a\3\2\2\2\u0969\u0967\3\2\2\2\u096a\u096b\7@"+
		"\2\2\u096b\u096c\5\u0190\u00c9\2\u096c\u096e\3\2\2\2\u096d\u0952\3\2\2"+
		"\2\u096d\u0957\3\2\2\2\u096d\u0962\3\2\2\2\u096e\u01cd\3\2\2\2\u096f\u0970"+
		"\5\u018e\u00c8\2\u0970\u01cf\3\2\2\2\u00f8\u01d2\u01d7\u01de\u01e2\u01e6"+
		"\u01ef\u01f5\u01fa\u01fe\u0203\u0208\u020e\u0213\u021c\u0221\u0228\u022d"+
		"\u022f\u0236\u0244\u0249\u0251\u0258\u025e\u0263\u026e\u0271\u027f\u0284"+
		"\u0289\u028e\u0294\u02a0\u02a4\u02a9\u02af\u02b7\u02c0\u02cb\u02e8\u02ef"+
		"\u02f5\u02f8\u02fb\u02fe\u0309\u0317\u031e\u0327\u032e\u0333\u033f\u0347"+
		"\u034c\u0350\u0354\u0358\u035d\u0363\u0368\u036c\u0370\u0375\u037d\u0384"+
		"\u0389\u038b\u039a\u039f\u03a8\u03ae\u03b4\u03b6\u03ba\u03bf\u03c3\u03cb"+
		"\u03d2\u03d9\u03de\u03e6\u03eb\u03f2\u03f9\u03fe\u040f\u0414\u0418\u0422"+
		"\u0429\u042f\u0434\u043e\u0442\u0445\u044a\u0453\u045e\u0469\u0471\u0478"+
		"\u047e\u0481\u048d\u0496\u04a0\u04a5\u04b0\u04b5\u04c1\u04c9\u04cf\u04d8"+
		"\u04e2\u04e7\u04f0\u04fe\u0501\u050a\u050f\u0517\u051d\u0525\u0531\u0538"+
		"\u0546\u055c\u057e\u058a\u0590\u059c\u05a5\u05bd\u05c1\u05c6\u05ca\u05ce"+
		"\u05d6\u05da\u05de\u05e5\u05ee\u05f6\u0605\u0611\u0617\u061d\u0632\u0637"+
		"\u063d\u0649\u0654\u065e\u0661\u0666\u066f\u0675\u0681\u0686\u0699\u06ab"+
		"\u06b1\u06b8\u06c9\u06db\u06e2\u06ed\u06f8\u0700\u070b\u0715\u0719\u071e"+
		"\u0722\u0727\u072f\u0735\u0739\u073e\u074d\u075b\u0761\u076e\u0779\u078a"+
		"\u0797\u07a1\u07a8\u07ad\u07b4\u07b9\u07c0\u07c5\u07cc\u07d1\u07d9\u07de"+
		"\u07e2\u07e6\u07eb\u07f2\u07f9\u07fe\u0805\u080a\u0811\u0816\u081e\u0823"+
		"\u0827\u082e\u0835\u083b\u0847\u084d\u0853\u0863\u086a\u0871\u0876\u087a"+
		"\u0883\u0894\u089e\u08a9\u08b4\u08bf\u08ca\u08d6\u08d8\u08ed\u08ef\u08fe"+
		"\u0900\u090c\u090e\u091d\u091f\u0929\u0937\u093d\u0942\u0946\u095c\u0967"+
		"\u096d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}