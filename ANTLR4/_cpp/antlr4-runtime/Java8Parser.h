
// Generated from Java8.g4 by ANTLR 4.7.1

#pragma once


#include "antlr4-runtime.h"




class  Java8Parser : public antlr4::Parser {
public:
  enum {
    ABSTRACT = 1, ASSERT = 2, BOOLEAN = 3, BREAK = 4, BYTE = 5, CASE = 6, 
    CATCH = 7, CHAR = 8, CLASS = 9, CONST = 10, CONTINUE = 11, DEFAULT = 12, 
    DO = 13, DOUBLE = 14, ELSE = 15, ENUM = 16, EXTENDS = 17, FINAL = 18, 
    FINALLY = 19, FLOAT = 20, FOR = 21, IF = 22, GOTO = 23, IMPLEMENTS = 24, 
    IMPORT = 25, INSTANCEOF = 26, INT = 27, INTERFACE = 28, LONG = 29, NATIVE = 30, 
    NEW = 31, PACKAGE = 32, PRIVATE = 33, PROTECTED = 34, PUBLIC = 35, RETURN = 36, 
    SHORT = 37, STATIC = 38, STRICTFP = 39, SUPER = 40, SWITCH = 41, SYNCHRONIZED = 42, 
    THIS = 43, THROW = 44, THROWS = 45, TRANSIENT = 46, TRY = 47, VOID = 48, 
    VOLATILE = 49, WHILE = 50, IntegerLiteral = 51, FloatingPointLiteral = 52, 
    BooleanLiteral = 53, CharacterLiteral = 54, StringLiteral = 55, NullLiteral = 56, 
    LPAREN = 57, RPAREN = 58, LBRACE = 59, RBRACE = 60, LBRACK = 61, RBRACK = 62, 
    SEMI = 63, COMMA = 64, DOT = 65, ASSIGN = 66, GT = 67, LT = 68, BANG = 69, 
    TILDE = 70, QUESTION = 71, COLON = 72, EQUAL = 73, LE = 74, GE = 75, 
    NOTEQUAL = 76, AND = 77, OR = 78, INC = 79, DEC = 80, ADD = 81, SUB = 82, 
    MUL = 83, DIV = 84, BITAND = 85, BITOR = 86, CARET = 87, MOD = 88, ARROW = 89, 
    COLONCOLON = 90, ADD_ASSIGN = 91, SUB_ASSIGN = 92, MUL_ASSIGN = 93, 
    DIV_ASSIGN = 94, AND_ASSIGN = 95, OR_ASSIGN = 96, XOR_ASSIGN = 97, MOD_ASSIGN = 98, 
    LSHIFT_ASSIGN = 99, RSHIFT_ASSIGN = 100, URSHIFT_ASSIGN = 101, Identifier = 102, 
    AT = 103, ELLIPSIS = 104, WS = 105, COMMENT = 106, LINE_COMMENT = 107
  };

  enum {
    RuleLiteral = 0, RuleType = 1, RulePrimitiveType = 2, RuleNumericType = 3, 
    RuleIntegralType = 4, RuleFloatingPointType = 5, RuleReferenceType = 6, 
    RuleClassOrInterfaceType = 7, RuleClassType = 8, RuleClassType_lf_classOrInterfaceType = 9, 
    RuleClassType_lfno_classOrInterfaceType = 10, RuleInterfaceType = 11, 
    RuleInterfaceType_lf_classOrInterfaceType = 12, RuleInterfaceType_lfno_classOrInterfaceType = 13, 
    RuleTypeVariable = 14, RuleArrayType = 15, RuleDims = 16, RuleTypeParameter = 17, 
    RuleTypeParameterModifier = 18, RuleTypeBound = 19, RuleAdditionalBound = 20, 
    RuleTypeArguments = 21, RuleTypeArgumentList = 22, RuleTypeArgument = 23, 
    RuleWildcard = 24, RuleWildcardBounds = 25, RulePackageName = 26, RuleTypeName = 27, 
    RulePackageOrTypeName = 28, RuleExpressionName = 29, RuleMethodName = 30, 
    RuleAmbiguousName = 31, RuleCompilationUnit = 32, RulePackageDeclaration = 33, 
    RulePackageModifier = 34, RuleImportDeclaration = 35, RuleSingleTypeImportDeclaration = 36, 
    RuleTypeImportOnDemandDeclaration = 37, RuleSingleStaticImportDeclaration = 38, 
    RuleStaticImportOnDemandDeclaration = 39, RuleTypeDeclaration = 40, 
    RuleClassDeclaration = 41, RuleNormalClassDeclaration = 42, RuleClassModifier = 43, 
    RuleTypeParameters = 44, RuleTypeParameterList = 45, RuleSuperclass = 46, 
    RuleSuperinterfaces = 47, RuleInterfaceTypeList = 48, RuleClassBody = 49, 
    RuleClassBodyDeclaration = 50, RuleClassMemberDeclaration = 51, RuleFieldDeclaration = 52, 
    RuleFieldModifier = 53, RuleVariableDeclaratorList = 54, RuleVariableDeclarator = 55, 
    RuleVariableDeclaratorId = 56, RuleVariableInitializer = 57, RuleUnannType = 58, 
    RuleUnannPrimitiveType = 59, RuleUnannReferenceType = 60, RuleUnannClassOrInterfaceType = 61, 
    RuleUnannClassType = 62, RuleUnannClassType_lf_unannClassOrInterfaceType = 63, 
    RuleUnannClassType_lfno_unannClassOrInterfaceType = 64, RuleUnannInterfaceType = 65, 
    RuleUnannInterfaceType_lf_unannClassOrInterfaceType = 66, RuleUnannInterfaceType_lfno_unannClassOrInterfaceType = 67, 
    RuleUnannTypeVariable = 68, RuleUnannArrayType = 69, RuleMethodDeclaration = 70, 
    RuleMethodModifier = 71, RuleMethodHeader = 72, RuleResult = 73, RuleMethodDeclarator = 74, 
    RuleFormalParameterList = 75, RuleFormalParameters = 76, RuleFormalParameter = 77, 
    RuleVariableModifier = 78, RuleLastFormalParameter = 79, RuleReceiverParameter = 80, 
    RuleThrows_ = 81, RuleExceptionTypeList = 82, RuleExceptionType = 83, 
    RuleMethodBody = 84, RuleInstanceInitializer = 85, RuleStaticInitializer = 86, 
    RuleConstructorDeclaration = 87, RuleConstructorModifier = 88, RuleConstructorDeclarator = 89, 
    RuleSimpleTypeName = 90, RuleConstructorBody = 91, RuleExplicitConstructorInvocation = 92, 
    RuleEnumDeclaration = 93, RuleEnumBody = 94, RuleEnumConstantList = 95, 
    RuleEnumConstant = 96, RuleEnumConstantModifier = 97, RuleEnumBodyDeclarations = 98, 
    RuleInterfaceDeclaration = 99, RuleNormalInterfaceDeclaration = 100, 
    RuleInterfaceModifier = 101, RuleExtendsInterfaces = 102, RuleInterfaceBody = 103, 
    RuleInterfaceMemberDeclaration = 104, RuleConstantDeclaration = 105, 
    RuleConstantModifier = 106, RuleInterfaceMethodDeclaration = 107, RuleInterfaceMethodModifier = 108, 
    RuleAnnotationTypeDeclaration = 109, RuleAnnotationTypeBody = 110, RuleAnnotationTypeMemberDeclaration = 111, 
    RuleAnnotationTypeElementDeclaration = 112, RuleAnnotationTypeElementModifier = 113, 
    RuleDefaultValue = 114, RuleAnnotation = 115, RuleNormalAnnotation = 116, 
    RuleElementValuePairList = 117, RuleElementValuePair = 118, RuleElementValue = 119, 
    RuleElementValueArrayInitializer = 120, RuleElementValueList = 121, 
    RuleMarkerAnnotation = 122, RuleSingleElementAnnotation = 123, RuleArrayInitializer = 124, 
    RuleVariableInitializerList = 125, RuleBlock = 126, RuleBlockStatements = 127, 
    RuleBlockStatement = 128, RuleLocalVariableDeclarationStatement = 129, 
    RuleLocalVariableDeclaration = 130, RuleStatement = 131, RuleStatementNoShortIf = 132, 
    RuleStatementWithoutTrailingSubstatement = 133, RuleEmptyStatement = 134, 
    RuleLabeledStatement = 135, RuleLabeledStatementNoShortIf = 136, RuleExpressionStatement = 137, 
    RuleStatementExpression = 138, RuleIfThenStatement = 139, RuleIfThenElseStatement = 140, 
    RuleIfThenElseStatementNoShortIf = 141, RuleAssertStatement = 142, RuleSwitchStatement = 143, 
    RuleSwitchBlock = 144, RuleSwitchBlockStatementGroup = 145, RuleSwitchLabels = 146, 
    RuleSwitchLabel = 147, RuleEnumConstantName = 148, RuleWhileStatement = 149, 
    RuleWhileStatementNoShortIf = 150, RuleDoStatement = 151, RuleForStatement = 152, 
    RuleForStatementNoShortIf = 153, RuleBasicForStatement = 154, RuleBasicForStatementNoShortIf = 155, 
    RuleForInit = 156, RuleForUpdate = 157, RuleStatementExpressionList = 158, 
    RuleEnhancedForStatement = 159, RuleEnhancedForStatementNoShortIf = 160, 
    RuleBreakStatement = 161, RuleContinueStatement = 162, RuleReturnStatement = 163, 
    RuleThrowStatement = 164, RuleSynchronizedStatement = 165, RuleTryStatement = 166, 
    RuleCatches = 167, RuleCatchClause = 168, RuleCatchFormalParameter = 169, 
    RuleCatchType = 170, RuleFinally_ = 171, RuleTryWithResourcesStatement = 172, 
    RuleResourceSpecification = 173, RuleResourceList = 174, RuleResource = 175, 
    RulePrimary = 176, RulePrimaryNoNewArray = 177, RulePrimaryNoNewArray_lf_arrayAccess = 178, 
    RulePrimaryNoNewArray_lfno_arrayAccess = 179, RulePrimaryNoNewArray_lf_primary = 180, 
    RulePrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 181, RulePrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 182, 
    RulePrimaryNoNewArray_lfno_primary = 183, RulePrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 184, 
    RulePrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 185, 
    RuleClassInstanceCreationExpression = 186, RuleClassInstanceCreationExpression_lf_primary = 187, 
    RuleClassInstanceCreationExpression_lfno_primary = 188, RuleTypeArgumentsOrDiamond = 189, 
    RuleFieldAccess = 190, RuleFieldAccess_lf_primary = 191, RuleFieldAccess_lfno_primary = 192, 
    RuleArrayAccess = 193, RuleArrayAccess_lf_primary = 194, RuleArrayAccess_lfno_primary = 195, 
    RuleMethodInvocation = 196, RuleMethodInvocation_lf_primary = 197, RuleMethodInvocation_lfno_primary = 198, 
    RuleArgumentList = 199, RuleMethodReference = 200, RuleMethodReference_lf_primary = 201, 
    RuleMethodReference_lfno_primary = 202, RuleArrayCreationExpression = 203, 
    RuleDimExprs = 204, RuleDimExpr = 205, RuleConstantExpression = 206, 
    RuleExpression = 207, RuleLambdaExpression = 208, RuleLambdaParameters = 209, 
    RuleInferredFormalParameterList = 210, RuleLambdaBody = 211, RuleAssignmentExpression = 212, 
    RuleAssignment = 213, RuleLeftHandSide = 214, RuleAssignmentOperator = 215, 
    RuleConditionalExpression = 216, RuleConditionalOrExpression = 217, 
    RuleConditionalAndExpression = 218, RuleInclusiveOrExpression = 219, 
    RuleExclusiveOrExpression = 220, RuleAndExpression = 221, RuleEqualityExpression = 222, 
    RuleRelationalExpression = 223, RuleShiftExpression = 224, RuleAdditiveExpression = 225, 
    RuleMultiplicativeExpression = 226, RuleUnaryExpression = 227, RulePreIncrementExpression = 228, 
    RulePreDecrementExpression = 229, RuleUnaryExpressionNotPlusMinus = 230, 
    RulePostfixExpression = 231, RulePostIncrementExpression = 232, RulePostIncrementExpression_lf_postfixExpression = 233, 
    RulePostDecrementExpression = 234, RulePostDecrementExpression_lf_postfixExpression = 235, 
    RuleCastExpression = 236
  };

  Java8Parser(antlr4::TokenStream *input);
  ~Java8Parser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class LiteralContext;
  class TypeContext;
  class PrimitiveTypeContext;
  class NumericTypeContext;
  class IntegralTypeContext;
  class FloatingPointTypeContext;
  class ReferenceTypeContext;
  class ClassOrInterfaceTypeContext;
  class ClassTypeContext;
  class ClassType_lf_classOrInterfaceTypeContext;
  class ClassType_lfno_classOrInterfaceTypeContext;
  class InterfaceTypeContext;
  class InterfaceType_lf_classOrInterfaceTypeContext;
  class InterfaceType_lfno_classOrInterfaceTypeContext;
  class TypeVariableContext;
  class ArrayTypeContext;
  class DimsContext;
  class TypeParameterContext;
  class TypeParameterModifierContext;
  class TypeBoundContext;
  class AdditionalBoundContext;
  class TypeArgumentsContext;
  class TypeArgumentListContext;
  class TypeArgumentContext;
  class WildcardContext;
  class WildcardBoundsContext;
  class PackageNameContext;
  class TypeNameContext;
  class PackageOrTypeNameContext;
  class ExpressionNameContext;
  class MethodNameContext;
  class AmbiguousNameContext;
  class CompilationUnitContext;
  class PackageDeclarationContext;
  class PackageModifierContext;
  class ImportDeclarationContext;
  class SingleTypeImportDeclarationContext;
  class TypeImportOnDemandDeclarationContext;
  class SingleStaticImportDeclarationContext;
  class StaticImportOnDemandDeclarationContext;
  class TypeDeclarationContext;
  class ClassDeclarationContext;
  class NormalClassDeclarationContext;
  class ClassModifierContext;
  class TypeParametersContext;
  class TypeParameterListContext;
  class SuperclassContext;
  class SuperinterfacesContext;
  class InterfaceTypeListContext;
  class ClassBodyContext;
  class ClassBodyDeclarationContext;
  class ClassMemberDeclarationContext;
  class FieldDeclarationContext;
  class FieldModifierContext;
  class VariableDeclaratorListContext;
  class VariableDeclaratorContext;
  class VariableDeclaratorIdContext;
  class VariableInitializerContext;
  class UnannTypeContext;
  class UnannPrimitiveTypeContext;
  class UnannReferenceTypeContext;
  class UnannClassOrInterfaceTypeContext;
  class UnannClassTypeContext;
  class UnannClassType_lf_unannClassOrInterfaceTypeContext;
  class UnannClassType_lfno_unannClassOrInterfaceTypeContext;
  class UnannInterfaceTypeContext;
  class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext;
  class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext;
  class UnannTypeVariableContext;
  class UnannArrayTypeContext;
  class MethodDeclarationContext;
  class MethodModifierContext;
  class MethodHeaderContext;
  class ResultContext;
  class MethodDeclaratorContext;
  class FormalParameterListContext;
  class FormalParametersContext;
  class FormalParameterContext;
  class VariableModifierContext;
  class LastFormalParameterContext;
  class ReceiverParameterContext;
  class Throws_Context;
  class ExceptionTypeListContext;
  class ExceptionTypeContext;
  class MethodBodyContext;
  class InstanceInitializerContext;
  class StaticInitializerContext;
  class ConstructorDeclarationContext;
  class ConstructorModifierContext;
  class ConstructorDeclaratorContext;
  class SimpleTypeNameContext;
  class ConstructorBodyContext;
  class ExplicitConstructorInvocationContext;
  class EnumDeclarationContext;
  class EnumBodyContext;
  class EnumConstantListContext;
  class EnumConstantContext;
  class EnumConstantModifierContext;
  class EnumBodyDeclarationsContext;
  class InterfaceDeclarationContext;
  class NormalInterfaceDeclarationContext;
  class InterfaceModifierContext;
  class ExtendsInterfacesContext;
  class InterfaceBodyContext;
  class InterfaceMemberDeclarationContext;
  class ConstantDeclarationContext;
  class ConstantModifierContext;
  class InterfaceMethodDeclarationContext;
  class InterfaceMethodModifierContext;
  class AnnotationTypeDeclarationContext;
  class AnnotationTypeBodyContext;
  class AnnotationTypeMemberDeclarationContext;
  class AnnotationTypeElementDeclarationContext;
  class AnnotationTypeElementModifierContext;
  class DefaultValueContext;
  class AnnotationContext;
  class NormalAnnotationContext;
  class ElementValuePairListContext;
  class ElementValuePairContext;
  class ElementValueContext;
  class ElementValueArrayInitializerContext;
  class ElementValueListContext;
  class MarkerAnnotationContext;
  class SingleElementAnnotationContext;
  class ArrayInitializerContext;
  class VariableInitializerListContext;
  class BlockContext;
  class BlockStatementsContext;
  class BlockStatementContext;
  class LocalVariableDeclarationStatementContext;
  class LocalVariableDeclarationContext;
  class StatementContext;
  class StatementNoShortIfContext;
  class StatementWithoutTrailingSubstatementContext;
  class EmptyStatementContext;
  class LabeledStatementContext;
  class LabeledStatementNoShortIfContext;
  class ExpressionStatementContext;
  class StatementExpressionContext;
  class IfThenStatementContext;
  class IfThenElseStatementContext;
  class IfThenElseStatementNoShortIfContext;
  class AssertStatementContext;
  class SwitchStatementContext;
  class SwitchBlockContext;
  class SwitchBlockStatementGroupContext;
  class SwitchLabelsContext;
  class SwitchLabelContext;
  class EnumConstantNameContext;
  class WhileStatementContext;
  class WhileStatementNoShortIfContext;
  class DoStatementContext;
  class ForStatementContext;
  class ForStatementNoShortIfContext;
  class BasicForStatementContext;
  class BasicForStatementNoShortIfContext;
  class ForInitContext;
  class ForUpdateContext;
  class StatementExpressionListContext;
  class EnhancedForStatementContext;
  class EnhancedForStatementNoShortIfContext;
  class BreakStatementContext;
  class ContinueStatementContext;
  class ReturnStatementContext;
  class ThrowStatementContext;
  class SynchronizedStatementContext;
  class TryStatementContext;
  class CatchesContext;
  class CatchClauseContext;
  class CatchFormalParameterContext;
  class CatchTypeContext;
  class Finally_Context;
  class TryWithResourcesStatementContext;
  class ResourceSpecificationContext;
  class ResourceListContext;
  class ResourceContext;
  class PrimaryContext;
  class PrimaryNoNewArrayContext;
  class PrimaryNoNewArray_lf_arrayAccessContext;
  class PrimaryNoNewArray_lfno_arrayAccessContext;
  class PrimaryNoNewArray_lf_primaryContext;
  class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext;
  class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext;
  class PrimaryNoNewArray_lfno_primaryContext;
  class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext;
  class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext;
  class ClassInstanceCreationExpressionContext;
  class ClassInstanceCreationExpression_lf_primaryContext;
  class ClassInstanceCreationExpression_lfno_primaryContext;
  class TypeArgumentsOrDiamondContext;
  class FieldAccessContext;
  class FieldAccess_lf_primaryContext;
  class FieldAccess_lfno_primaryContext;
  class ArrayAccessContext;
  class ArrayAccess_lf_primaryContext;
  class ArrayAccess_lfno_primaryContext;
  class MethodInvocationContext;
  class MethodInvocation_lf_primaryContext;
  class MethodInvocation_lfno_primaryContext;
  class ArgumentListContext;
  class MethodReferenceContext;
  class MethodReference_lf_primaryContext;
  class MethodReference_lfno_primaryContext;
  class ArrayCreationExpressionContext;
  class DimExprsContext;
  class DimExprContext;
  class ConstantExpressionContext;
  class ExpressionContext;
  class LambdaExpressionContext;
  class LambdaParametersContext;
  class InferredFormalParameterListContext;
  class LambdaBodyContext;
  class AssignmentExpressionContext;
  class AssignmentContext;
  class LeftHandSideContext;
  class AssignmentOperatorContext;
  class ConditionalExpressionContext;
  class ConditionalOrExpressionContext;
  class ConditionalAndExpressionContext;
  class InclusiveOrExpressionContext;
  class ExclusiveOrExpressionContext;
  class AndExpressionContext;
  class EqualityExpressionContext;
  class RelationalExpressionContext;
  class ShiftExpressionContext;
  class AdditiveExpressionContext;
  class MultiplicativeExpressionContext;
  class UnaryExpressionContext;
  class PreIncrementExpressionContext;
  class PreDecrementExpressionContext;
  class UnaryExpressionNotPlusMinusContext;
  class PostfixExpressionContext;
  class PostIncrementExpressionContext;
  class PostIncrementExpression_lf_postfixExpressionContext;
  class PostDecrementExpressionContext;
  class PostDecrementExpression_lf_postfixExpressionContext;
  class CastExpressionContext; 

  class  LiteralContext : public antlr4::ParserRuleContext {
  public:
    LiteralContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IntegerLiteral();
    antlr4::tree::TerminalNode *FloatingPointLiteral();
    antlr4::tree::TerminalNode *BooleanLiteral();
    antlr4::tree::TerminalNode *CharacterLiteral();
    antlr4::tree::TerminalNode *StringLiteral();
    antlr4::tree::TerminalNode *NullLiteral();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LiteralContext* literal();

  class  TypeContext : public antlr4::ParserRuleContext {
  public:
    TypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PrimitiveTypeContext *primitiveType();
    ReferenceTypeContext *referenceType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeContext* type();

  class  PrimitiveTypeContext : public antlr4::ParserRuleContext {
  public:
    PrimitiveTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    NumericTypeContext *numericType();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimitiveTypeContext* primitiveType();

  class  NumericTypeContext : public antlr4::ParserRuleContext {
  public:
    NumericTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IntegralTypeContext *integralType();
    FloatingPointTypeContext *floatingPointType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  NumericTypeContext* numericType();

  class  IntegralTypeContext : public antlr4::ParserRuleContext {
  public:
    IntegralTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IntegralTypeContext* integralType();

  class  FloatingPointTypeContext : public antlr4::ParserRuleContext {
  public:
    FloatingPointTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FloatingPointTypeContext* floatingPointType();

  class  ReferenceTypeContext : public antlr4::ParserRuleContext {
  public:
    ReferenceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassOrInterfaceTypeContext *classOrInterfaceType();
    TypeVariableContext *typeVariable();
    ArrayTypeContext *arrayType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ReferenceTypeContext* referenceType();

  class  ClassOrInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    ClassOrInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassType_lfno_classOrInterfaceTypeContext *classType_lfno_classOrInterfaceType();
    InterfaceType_lfno_classOrInterfaceTypeContext *interfaceType_lfno_classOrInterfaceType();
    std::vector<ClassType_lf_classOrInterfaceTypeContext *> classType_lf_classOrInterfaceType();
    ClassType_lf_classOrInterfaceTypeContext* classType_lf_classOrInterfaceType(size_t i);
    std::vector<InterfaceType_lf_classOrInterfaceTypeContext *> interfaceType_lf_classOrInterfaceType();
    InterfaceType_lf_classOrInterfaceTypeContext* interfaceType_lf_classOrInterfaceType(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassOrInterfaceTypeContext* classOrInterfaceType();

  class  ClassTypeContext : public antlr4::ParserRuleContext {
  public:
    ClassTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);
    TypeArgumentsContext *typeArguments();
    ClassOrInterfaceTypeContext *classOrInterfaceType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassTypeContext* classType();

  class  ClassType_lf_classOrInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    ClassType_lf_classOrInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);
    TypeArgumentsContext *typeArguments();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassType_lf_classOrInterfaceTypeContext* classType_lf_classOrInterfaceType();

  class  ClassType_lfno_classOrInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    ClassType_lfno_classOrInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);
    TypeArgumentsContext *typeArguments();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassType_lfno_classOrInterfaceTypeContext* classType_lfno_classOrInterfaceType();

  class  InterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    InterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassTypeContext *classType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceTypeContext* interfaceType();

  class  InterfaceType_lf_classOrInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    InterfaceType_lf_classOrInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassType_lf_classOrInterfaceTypeContext *classType_lf_classOrInterfaceType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceType_lf_classOrInterfaceTypeContext* interfaceType_lf_classOrInterfaceType();

  class  InterfaceType_lfno_classOrInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    InterfaceType_lfno_classOrInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassType_lfno_classOrInterfaceTypeContext *classType_lfno_classOrInterfaceType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceType_lfno_classOrInterfaceTypeContext* interfaceType_lfno_classOrInterfaceType();

  class  TypeVariableContext : public antlr4::ParserRuleContext {
  public:
    TypeVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeVariableContext* typeVariable();

  class  ArrayTypeContext : public antlr4::ParserRuleContext {
  public:
    ArrayTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PrimitiveTypeContext *primitiveType();
    DimsContext *dims();
    ClassOrInterfaceTypeContext *classOrInterfaceType();
    TypeVariableContext *typeVariable();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayTypeContext* arrayType();

  class  DimsContext : public antlr4::ParserRuleContext {
  public:
    DimsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  DimsContext* dims();

  class  TypeParameterContext : public antlr4::ParserRuleContext {
  public:
    TypeParameterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    std::vector<TypeParameterModifierContext *> typeParameterModifier();
    TypeParameterModifierContext* typeParameterModifier(size_t i);
    TypeBoundContext *typeBound();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeParameterContext* typeParameter();

  class  TypeParameterModifierContext : public antlr4::ParserRuleContext {
  public:
    TypeParameterModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeParameterModifierContext* typeParameterModifier();

  class  TypeBoundContext : public antlr4::ParserRuleContext {
  public:
    TypeBoundContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeVariableContext *typeVariable();
    ClassOrInterfaceTypeContext *classOrInterfaceType();
    std::vector<AdditionalBoundContext *> additionalBound();
    AdditionalBoundContext* additionalBound(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeBoundContext* typeBound();

  class  AdditionalBoundContext : public antlr4::ParserRuleContext {
  public:
    AdditionalBoundContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    InterfaceTypeContext *interfaceType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AdditionalBoundContext* additionalBound();

  class  TypeArgumentsContext : public antlr4::ParserRuleContext {
  public:
    TypeArgumentsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeArgumentListContext *typeArgumentList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeArgumentsContext* typeArguments();

  class  TypeArgumentListContext : public antlr4::ParserRuleContext {
  public:
    TypeArgumentListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<TypeArgumentContext *> typeArgument();
    TypeArgumentContext* typeArgument(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeArgumentListContext* typeArgumentList();

  class  TypeArgumentContext : public antlr4::ParserRuleContext {
  public:
    TypeArgumentContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ReferenceTypeContext *referenceType();
    WildcardContext *wildcard();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeArgumentContext* typeArgument();

  class  WildcardContext : public antlr4::ParserRuleContext {
  public:
    WildcardContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);
    WildcardBoundsContext *wildcardBounds();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  WildcardContext* wildcard();

  class  WildcardBoundsContext : public antlr4::ParserRuleContext {
  public:
    WildcardBoundsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ReferenceTypeContext *referenceType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  WildcardBoundsContext* wildcardBounds();

  class  PackageNameContext : public antlr4::ParserRuleContext {
  public:
    PackageNameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    PackageNameContext *packageName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PackageNameContext* packageName();
  PackageNameContext* packageName(int precedence);
  class  TypeNameContext : public antlr4::ParserRuleContext {
  public:
    TypeNameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    PackageOrTypeNameContext *packageOrTypeName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeNameContext* typeName();

  class  PackageOrTypeNameContext : public antlr4::ParserRuleContext {
  public:
    PackageOrTypeNameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    PackageOrTypeNameContext *packageOrTypeName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PackageOrTypeNameContext* packageOrTypeName();
  PackageOrTypeNameContext* packageOrTypeName(int precedence);
  class  ExpressionNameContext : public antlr4::ParserRuleContext {
  public:
    ExpressionNameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    AmbiguousNameContext *ambiguousName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpressionNameContext* expressionName();

  class  MethodNameContext : public antlr4::ParserRuleContext {
  public:
    MethodNameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodNameContext* methodName();

  class  AmbiguousNameContext : public antlr4::ParserRuleContext {
  public:
    AmbiguousNameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    AmbiguousNameContext *ambiguousName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AmbiguousNameContext* ambiguousName();
  AmbiguousNameContext* ambiguousName(int precedence);
  class  CompilationUnitContext : public antlr4::ParserRuleContext {
  public:
    CompilationUnitContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EOF();
    PackageDeclarationContext *packageDeclaration();
    std::vector<ImportDeclarationContext *> importDeclaration();
    ImportDeclarationContext* importDeclaration(size_t i);
    std::vector<TypeDeclarationContext *> typeDeclaration();
    TypeDeclarationContext* typeDeclaration(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CompilationUnitContext* compilationUnit();

  class  PackageDeclarationContext : public antlr4::ParserRuleContext {
  public:
    PackageDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Identifier();
    antlr4::tree::TerminalNode* Identifier(size_t i);
    std::vector<PackageModifierContext *> packageModifier();
    PackageModifierContext* packageModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PackageDeclarationContext* packageDeclaration();

  class  PackageModifierContext : public antlr4::ParserRuleContext {
  public:
    PackageModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PackageModifierContext* packageModifier();

  class  ImportDeclarationContext : public antlr4::ParserRuleContext {
  public:
    ImportDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SingleTypeImportDeclarationContext *singleTypeImportDeclaration();
    TypeImportOnDemandDeclarationContext *typeImportOnDemandDeclaration();
    SingleStaticImportDeclarationContext *singleStaticImportDeclaration();
    StaticImportOnDemandDeclarationContext *staticImportOnDemandDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ImportDeclarationContext* importDeclaration();

  class  SingleTypeImportDeclarationContext : public antlr4::ParserRuleContext {
  public:
    SingleTypeImportDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeNameContext *typeName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SingleTypeImportDeclarationContext* singleTypeImportDeclaration();

  class  TypeImportOnDemandDeclarationContext : public antlr4::ParserRuleContext {
  public:
    TypeImportOnDemandDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PackageOrTypeNameContext *packageOrTypeName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeImportOnDemandDeclarationContext* typeImportOnDemandDeclaration();

  class  SingleStaticImportDeclarationContext : public antlr4::ParserRuleContext {
  public:
    SingleStaticImportDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeNameContext *typeName();
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SingleStaticImportDeclarationContext* singleStaticImportDeclaration();

  class  StaticImportOnDemandDeclarationContext : public antlr4::ParserRuleContext {
  public:
    StaticImportOnDemandDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeNameContext *typeName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StaticImportOnDemandDeclarationContext* staticImportOnDemandDeclaration();

  class  TypeDeclarationContext : public antlr4::ParserRuleContext {
  public:
    TypeDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassDeclarationContext *classDeclaration();
    InterfaceDeclarationContext *interfaceDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeDeclarationContext* typeDeclaration();

  class  ClassDeclarationContext : public antlr4::ParserRuleContext {
  public:
    ClassDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    NormalClassDeclarationContext *normalClassDeclaration();
    EnumDeclarationContext *enumDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassDeclarationContext* classDeclaration();

  class  NormalClassDeclarationContext : public antlr4::ParserRuleContext {
  public:
    NormalClassDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    ClassBodyContext *classBody();
    std::vector<ClassModifierContext *> classModifier();
    ClassModifierContext* classModifier(size_t i);
    TypeParametersContext *typeParameters();
    SuperclassContext *superclass();
    SuperinterfacesContext *superinterfaces();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  NormalClassDeclarationContext* normalClassDeclaration();

  class  ClassModifierContext : public antlr4::ParserRuleContext {
  public:
    ClassModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassModifierContext* classModifier();

  class  TypeParametersContext : public antlr4::ParserRuleContext {
  public:
    TypeParametersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeParameterListContext *typeParameterList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeParametersContext* typeParameters();

  class  TypeParameterListContext : public antlr4::ParserRuleContext {
  public:
    TypeParameterListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<TypeParameterContext *> typeParameter();
    TypeParameterContext* typeParameter(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeParameterListContext* typeParameterList();

  class  SuperclassContext : public antlr4::ParserRuleContext {
  public:
    SuperclassContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassTypeContext *classType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SuperclassContext* superclass();

  class  SuperinterfacesContext : public antlr4::ParserRuleContext {
  public:
    SuperinterfacesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    InterfaceTypeListContext *interfaceTypeList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SuperinterfacesContext* superinterfaces();

  class  InterfaceTypeListContext : public antlr4::ParserRuleContext {
  public:
    InterfaceTypeListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<InterfaceTypeContext *> interfaceType();
    InterfaceTypeContext* interfaceType(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceTypeListContext* interfaceTypeList();

  class  ClassBodyContext : public antlr4::ParserRuleContext {
  public:
    ClassBodyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ClassBodyDeclarationContext *> classBodyDeclaration();
    ClassBodyDeclarationContext* classBodyDeclaration(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassBodyContext* classBody();

  class  ClassBodyDeclarationContext : public antlr4::ParserRuleContext {
  public:
    ClassBodyDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassMemberDeclarationContext *classMemberDeclaration();
    InstanceInitializerContext *instanceInitializer();
    StaticInitializerContext *staticInitializer();
    ConstructorDeclarationContext *constructorDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassBodyDeclarationContext* classBodyDeclaration();

  class  ClassMemberDeclarationContext : public antlr4::ParserRuleContext {
  public:
    ClassMemberDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FieldDeclarationContext *fieldDeclaration();
    MethodDeclarationContext *methodDeclaration();
    ClassDeclarationContext *classDeclaration();
    InterfaceDeclarationContext *interfaceDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassMemberDeclarationContext* classMemberDeclaration();

  class  FieldDeclarationContext : public antlr4::ParserRuleContext {
  public:
    FieldDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();
    VariableDeclaratorListContext *variableDeclaratorList();
    std::vector<FieldModifierContext *> fieldModifier();
    FieldModifierContext* fieldModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FieldDeclarationContext* fieldDeclaration();

  class  FieldModifierContext : public antlr4::ParserRuleContext {
  public:
    FieldModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FieldModifierContext* fieldModifier();

  class  VariableDeclaratorListContext : public antlr4::ParserRuleContext {
  public:
    VariableDeclaratorListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<VariableDeclaratorContext *> variableDeclarator();
    VariableDeclaratorContext* variableDeclarator(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDeclaratorListContext* variableDeclaratorList();

  class  VariableDeclaratorContext : public antlr4::ParserRuleContext {
  public:
    VariableDeclaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableDeclaratorIdContext *variableDeclaratorId();
    VariableInitializerContext *variableInitializer();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDeclaratorContext* variableDeclarator();

  class  VariableDeclaratorIdContext : public antlr4::ParserRuleContext {
  public:
    VariableDeclaratorIdContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    DimsContext *dims();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableDeclaratorIdContext* variableDeclaratorId();

  class  VariableInitializerContext : public antlr4::ParserRuleContext {
  public:
    VariableInitializerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    ArrayInitializerContext *arrayInitializer();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableInitializerContext* variableInitializer();

  class  UnannTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannPrimitiveTypeContext *unannPrimitiveType();
    UnannReferenceTypeContext *unannReferenceType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannTypeContext* unannType();

  class  UnannPrimitiveTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannPrimitiveTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    NumericTypeContext *numericType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannPrimitiveTypeContext* unannPrimitiveType();

  class  UnannReferenceTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannReferenceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannClassOrInterfaceTypeContext *unannClassOrInterfaceType();
    UnannTypeVariableContext *unannTypeVariable();
    UnannArrayTypeContext *unannArrayType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannReferenceTypeContext* unannReferenceType();

  class  UnannClassOrInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannClassOrInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannClassType_lfno_unannClassOrInterfaceTypeContext *unannClassType_lfno_unannClassOrInterfaceType();
    UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext *unannInterfaceType_lfno_unannClassOrInterfaceType();
    std::vector<UnannClassType_lf_unannClassOrInterfaceTypeContext *> unannClassType_lf_unannClassOrInterfaceType();
    UnannClassType_lf_unannClassOrInterfaceTypeContext* unannClassType_lf_unannClassOrInterfaceType(size_t i);
    std::vector<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext *> unannInterfaceType_lf_unannClassOrInterfaceType();
    UnannInterfaceType_lf_unannClassOrInterfaceTypeContext* unannInterfaceType_lf_unannClassOrInterfaceType(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannClassOrInterfaceTypeContext* unannClassOrInterfaceType();

  class  UnannClassTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannClassTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    TypeArgumentsContext *typeArguments();
    UnannClassOrInterfaceTypeContext *unannClassOrInterfaceType();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannClassTypeContext* unannClassType();

  class  UnannClassType_lf_unannClassOrInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannClassType_lf_unannClassOrInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);
    TypeArgumentsContext *typeArguments();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannClassType_lf_unannClassOrInterfaceTypeContext* unannClassType_lf_unannClassOrInterfaceType();

  class  UnannClassType_lfno_unannClassOrInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannClassType_lfno_unannClassOrInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    TypeArgumentsContext *typeArguments();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannClassType_lfno_unannClassOrInterfaceTypeContext* unannClassType_lfno_unannClassOrInterfaceType();

  class  UnannInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannClassTypeContext *unannClassType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannInterfaceTypeContext* unannInterfaceType();

  class  UnannInterfaceType_lf_unannClassOrInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannClassType_lf_unannClassOrInterfaceTypeContext *unannClassType_lf_unannClassOrInterfaceType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannInterfaceType_lf_unannClassOrInterfaceTypeContext* unannInterfaceType_lf_unannClassOrInterfaceType();

  class  UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannClassType_lfno_unannClassOrInterfaceTypeContext *unannClassType_lfno_unannClassOrInterfaceType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext* unannInterfaceType_lfno_unannClassOrInterfaceType();

  class  UnannTypeVariableContext : public antlr4::ParserRuleContext {
  public:
    UnannTypeVariableContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannTypeVariableContext* unannTypeVariable();

  class  UnannArrayTypeContext : public antlr4::ParserRuleContext {
  public:
    UnannArrayTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannPrimitiveTypeContext *unannPrimitiveType();
    DimsContext *dims();
    UnannClassOrInterfaceTypeContext *unannClassOrInterfaceType();
    UnannTypeVariableContext *unannTypeVariable();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnannArrayTypeContext* unannArrayType();

  class  MethodDeclarationContext : public antlr4::ParserRuleContext {
  public:
    MethodDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    MethodHeaderContext *methodHeader();
    MethodBodyContext *methodBody();
    std::vector<MethodModifierContext *> methodModifier();
    MethodModifierContext* methodModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodDeclarationContext* methodDeclaration();

  class  MethodModifierContext : public antlr4::ParserRuleContext {
  public:
    MethodModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodModifierContext* methodModifier();

  class  MethodHeaderContext : public antlr4::ParserRuleContext {
  public:
    MethodHeaderContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ResultContext *result();
    MethodDeclaratorContext *methodDeclarator();
    Throws_Context *throws_();
    TypeParametersContext *typeParameters();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodHeaderContext* methodHeader();

  class  ResultContext : public antlr4::ParserRuleContext {
  public:
    ResultContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ResultContext* result();

  class  MethodDeclaratorContext : public antlr4::ParserRuleContext {
  public:
    MethodDeclaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    FormalParameterListContext *formalParameterList();
    DimsContext *dims();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodDeclaratorContext* methodDeclarator();

  class  FormalParameterListContext : public antlr4::ParserRuleContext {
  public:
    FormalParameterListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    FormalParametersContext *formalParameters();
    LastFormalParameterContext *lastFormalParameter();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FormalParameterListContext* formalParameterList();

  class  FormalParametersContext : public antlr4::ParserRuleContext {
  public:
    FormalParametersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<FormalParameterContext *> formalParameter();
    FormalParameterContext* formalParameter(size_t i);
    ReceiverParameterContext *receiverParameter();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FormalParametersContext* formalParameters();

  class  FormalParameterContext : public antlr4::ParserRuleContext {
  public:
    FormalParameterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();
    VariableDeclaratorIdContext *variableDeclaratorId();
    std::vector<VariableModifierContext *> variableModifier();
    VariableModifierContext* variableModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FormalParameterContext* formalParameter();

  class  VariableModifierContext : public antlr4::ParserRuleContext {
  public:
    VariableModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableModifierContext* variableModifier();

  class  LastFormalParameterContext : public antlr4::ParserRuleContext {
  public:
    LastFormalParameterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();
    VariableDeclaratorIdContext *variableDeclaratorId();
    std::vector<VariableModifierContext *> variableModifier();
    VariableModifierContext* variableModifier(size_t i);
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);
    FormalParameterContext *formalParameter();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LastFormalParameterContext* lastFormalParameter();

  class  ReceiverParameterContext : public antlr4::ParserRuleContext {
  public:
    ReceiverParameterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ReceiverParameterContext* receiverParameter();

  class  Throws_Context : public antlr4::ParserRuleContext {
  public:
    Throws_Context(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExceptionTypeListContext *exceptionTypeList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Throws_Context* throws_();

  class  ExceptionTypeListContext : public antlr4::ParserRuleContext {
  public:
    ExceptionTypeListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExceptionTypeContext *> exceptionType();
    ExceptionTypeContext* exceptionType(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExceptionTypeListContext* exceptionTypeList();

  class  ExceptionTypeContext : public antlr4::ParserRuleContext {
  public:
    ExceptionTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassTypeContext *classType();
    TypeVariableContext *typeVariable();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExceptionTypeContext* exceptionType();

  class  MethodBodyContext : public antlr4::ParserRuleContext {
  public:
    MethodBodyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockContext *block();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodBodyContext* methodBody();

  class  InstanceInitializerContext : public antlr4::ParserRuleContext {
  public:
    InstanceInitializerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockContext *block();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InstanceInitializerContext* instanceInitializer();

  class  StaticInitializerContext : public antlr4::ParserRuleContext {
  public:
    StaticInitializerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockContext *block();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StaticInitializerContext* staticInitializer();

  class  ConstructorDeclarationContext : public antlr4::ParserRuleContext {
  public:
    ConstructorDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConstructorDeclaratorContext *constructorDeclarator();
    ConstructorBodyContext *constructorBody();
    std::vector<ConstructorModifierContext *> constructorModifier();
    ConstructorModifierContext* constructorModifier(size_t i);
    Throws_Context *throws_();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstructorDeclarationContext* constructorDeclaration();

  class  ConstructorModifierContext : public antlr4::ParserRuleContext {
  public:
    ConstructorModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstructorModifierContext* constructorModifier();

  class  ConstructorDeclaratorContext : public antlr4::ParserRuleContext {
  public:
    ConstructorDeclaratorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SimpleTypeNameContext *simpleTypeName();
    TypeParametersContext *typeParameters();
    FormalParameterListContext *formalParameterList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstructorDeclaratorContext* constructorDeclarator();

  class  SimpleTypeNameContext : public antlr4::ParserRuleContext {
  public:
    SimpleTypeNameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SimpleTypeNameContext* simpleTypeName();

  class  ConstructorBodyContext : public antlr4::ParserRuleContext {
  public:
    ConstructorBodyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExplicitConstructorInvocationContext *explicitConstructorInvocation();
    BlockStatementsContext *blockStatements();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstructorBodyContext* constructorBody();

  class  ExplicitConstructorInvocationContext : public antlr4::ParserRuleContext {
  public:
    ExplicitConstructorInvocationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeArgumentsContext *typeArguments();
    ArgumentListContext *argumentList();
    ExpressionNameContext *expressionName();
    PrimaryContext *primary();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExplicitConstructorInvocationContext* explicitConstructorInvocation();

  class  EnumDeclarationContext : public antlr4::ParserRuleContext {
  public:
    EnumDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    EnumBodyContext *enumBody();
    std::vector<ClassModifierContext *> classModifier();
    ClassModifierContext* classModifier(size_t i);
    SuperinterfacesContext *superinterfaces();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EnumDeclarationContext* enumDeclaration();

  class  EnumBodyContext : public antlr4::ParserRuleContext {
  public:
    EnumBodyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    EnumConstantListContext *enumConstantList();
    EnumBodyDeclarationsContext *enumBodyDeclarations();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EnumBodyContext* enumBody();

  class  EnumConstantListContext : public antlr4::ParserRuleContext {
  public:
    EnumConstantListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<EnumConstantContext *> enumConstant();
    EnumConstantContext* enumConstant(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EnumConstantListContext* enumConstantList();

  class  EnumConstantContext : public antlr4::ParserRuleContext {
  public:
    EnumConstantContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    std::vector<EnumConstantModifierContext *> enumConstantModifier();
    EnumConstantModifierContext* enumConstantModifier(size_t i);
    ClassBodyContext *classBody();
    ArgumentListContext *argumentList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EnumConstantContext* enumConstant();

  class  EnumConstantModifierContext : public antlr4::ParserRuleContext {
  public:
    EnumConstantModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EnumConstantModifierContext* enumConstantModifier();

  class  EnumBodyDeclarationsContext : public antlr4::ParserRuleContext {
  public:
    EnumBodyDeclarationsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ClassBodyDeclarationContext *> classBodyDeclaration();
    ClassBodyDeclarationContext* classBodyDeclaration(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EnumBodyDeclarationsContext* enumBodyDeclarations();

  class  InterfaceDeclarationContext : public antlr4::ParserRuleContext {
  public:
    InterfaceDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    NormalInterfaceDeclarationContext *normalInterfaceDeclaration();
    AnnotationTypeDeclarationContext *annotationTypeDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceDeclarationContext* interfaceDeclaration();

  class  NormalInterfaceDeclarationContext : public antlr4::ParserRuleContext {
  public:
    NormalInterfaceDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    InterfaceBodyContext *interfaceBody();
    std::vector<InterfaceModifierContext *> interfaceModifier();
    InterfaceModifierContext* interfaceModifier(size_t i);
    TypeParametersContext *typeParameters();
    ExtendsInterfacesContext *extendsInterfaces();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  NormalInterfaceDeclarationContext* normalInterfaceDeclaration();

  class  InterfaceModifierContext : public antlr4::ParserRuleContext {
  public:
    InterfaceModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceModifierContext* interfaceModifier();

  class  ExtendsInterfacesContext : public antlr4::ParserRuleContext {
  public:
    ExtendsInterfacesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    InterfaceTypeListContext *interfaceTypeList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExtendsInterfacesContext* extendsInterfaces();

  class  InterfaceBodyContext : public antlr4::ParserRuleContext {
  public:
    InterfaceBodyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<InterfaceMemberDeclarationContext *> interfaceMemberDeclaration();
    InterfaceMemberDeclarationContext* interfaceMemberDeclaration(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceBodyContext* interfaceBody();

  class  InterfaceMemberDeclarationContext : public antlr4::ParserRuleContext {
  public:
    InterfaceMemberDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConstantDeclarationContext *constantDeclaration();
    InterfaceMethodDeclarationContext *interfaceMethodDeclaration();
    ClassDeclarationContext *classDeclaration();
    InterfaceDeclarationContext *interfaceDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceMemberDeclarationContext* interfaceMemberDeclaration();

  class  ConstantDeclarationContext : public antlr4::ParserRuleContext {
  public:
    ConstantDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();
    VariableDeclaratorListContext *variableDeclaratorList();
    std::vector<ConstantModifierContext *> constantModifier();
    ConstantModifierContext* constantModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstantDeclarationContext* constantDeclaration();

  class  ConstantModifierContext : public antlr4::ParserRuleContext {
  public:
    ConstantModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstantModifierContext* constantModifier();

  class  InterfaceMethodDeclarationContext : public antlr4::ParserRuleContext {
  public:
    InterfaceMethodDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    MethodHeaderContext *methodHeader();
    MethodBodyContext *methodBody();
    std::vector<InterfaceMethodModifierContext *> interfaceMethodModifier();
    InterfaceMethodModifierContext* interfaceMethodModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceMethodDeclarationContext* interfaceMethodDeclaration();

  class  InterfaceMethodModifierContext : public antlr4::ParserRuleContext {
  public:
    InterfaceMethodModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InterfaceMethodModifierContext* interfaceMethodModifier();

  class  AnnotationTypeDeclarationContext : public antlr4::ParserRuleContext {
  public:
    AnnotationTypeDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    AnnotationTypeBodyContext *annotationTypeBody();
    std::vector<InterfaceModifierContext *> interfaceModifier();
    InterfaceModifierContext* interfaceModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnnotationTypeDeclarationContext* annotationTypeDeclaration();

  class  AnnotationTypeBodyContext : public antlr4::ParserRuleContext {
  public:
    AnnotationTypeBodyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<AnnotationTypeMemberDeclarationContext *> annotationTypeMemberDeclaration();
    AnnotationTypeMemberDeclarationContext* annotationTypeMemberDeclaration(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnnotationTypeBodyContext* annotationTypeBody();

  class  AnnotationTypeMemberDeclarationContext : public antlr4::ParserRuleContext {
  public:
    AnnotationTypeMemberDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationTypeElementDeclarationContext *annotationTypeElementDeclaration();
    ConstantDeclarationContext *constantDeclaration();
    ClassDeclarationContext *classDeclaration();
    InterfaceDeclarationContext *interfaceDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnnotationTypeMemberDeclarationContext* annotationTypeMemberDeclaration();

  class  AnnotationTypeElementDeclarationContext : public antlr4::ParserRuleContext {
  public:
    AnnotationTypeElementDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();
    antlr4::tree::TerminalNode *Identifier();
    std::vector<AnnotationTypeElementModifierContext *> annotationTypeElementModifier();
    AnnotationTypeElementModifierContext* annotationTypeElementModifier(size_t i);
    DimsContext *dims();
    DefaultValueContext *defaultValue();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnnotationTypeElementDeclarationContext* annotationTypeElementDeclaration();

  class  AnnotationTypeElementModifierContext : public antlr4::ParserRuleContext {
  public:
    AnnotationTypeElementModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnnotationTypeElementModifierContext* annotationTypeElementModifier();

  class  DefaultValueContext : public antlr4::ParserRuleContext {
  public:
    DefaultValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ElementValueContext *elementValue();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  DefaultValueContext* defaultValue();

  class  AnnotationContext : public antlr4::ParserRuleContext {
  public:
    AnnotationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    NormalAnnotationContext *normalAnnotation();
    MarkerAnnotationContext *markerAnnotation();
    SingleElementAnnotationContext *singleElementAnnotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AnnotationContext* annotation();

  class  NormalAnnotationContext : public antlr4::ParserRuleContext {
  public:
    NormalAnnotationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeNameContext *typeName();
    ElementValuePairListContext *elementValuePairList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  NormalAnnotationContext* normalAnnotation();

  class  ElementValuePairListContext : public antlr4::ParserRuleContext {
  public:
    ElementValuePairListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ElementValuePairContext *> elementValuePair();
    ElementValuePairContext* elementValuePair(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElementValuePairListContext* elementValuePairList();

  class  ElementValuePairContext : public antlr4::ParserRuleContext {
  public:
    ElementValuePairContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    ElementValueContext *elementValue();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElementValuePairContext* elementValuePair();

  class  ElementValueContext : public antlr4::ParserRuleContext {
  public:
    ElementValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionalExpressionContext *conditionalExpression();
    ElementValueArrayInitializerContext *elementValueArrayInitializer();
    AnnotationContext *annotation();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElementValueContext* elementValue();

  class  ElementValueArrayInitializerContext : public antlr4::ParserRuleContext {
  public:
    ElementValueArrayInitializerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ElementValueListContext *elementValueList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElementValueArrayInitializerContext* elementValueArrayInitializer();

  class  ElementValueListContext : public antlr4::ParserRuleContext {
  public:
    ElementValueListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ElementValueContext *> elementValue();
    ElementValueContext* elementValue(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ElementValueListContext* elementValueList();

  class  MarkerAnnotationContext : public antlr4::ParserRuleContext {
  public:
    MarkerAnnotationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeNameContext *typeName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MarkerAnnotationContext* markerAnnotation();

  class  SingleElementAnnotationContext : public antlr4::ParserRuleContext {
  public:
    SingleElementAnnotationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeNameContext *typeName();
    ElementValueContext *elementValue();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SingleElementAnnotationContext* singleElementAnnotation();

  class  ArrayInitializerContext : public antlr4::ParserRuleContext {
  public:
    ArrayInitializerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    VariableInitializerListContext *variableInitializerList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayInitializerContext* arrayInitializer();

  class  VariableInitializerListContext : public antlr4::ParserRuleContext {
  public:
    VariableInitializerListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<VariableInitializerContext *> variableInitializer();
    VariableInitializerContext* variableInitializer(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  VariableInitializerListContext* variableInitializerList();

  class  BlockContext : public antlr4::ParserRuleContext {
  public:
    BlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockStatementsContext *blockStatements();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockContext* block();

  class  BlockStatementsContext : public antlr4::ParserRuleContext {
  public:
    BlockStatementsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<BlockStatementContext *> blockStatement();
    BlockStatementContext* blockStatement(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockStatementsContext* blockStatements();

  class  BlockStatementContext : public antlr4::ParserRuleContext {
  public:
    BlockStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LocalVariableDeclarationStatementContext *localVariableDeclarationStatement();
    ClassDeclarationContext *classDeclaration();
    StatementContext *statement();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockStatementContext* blockStatement();

  class  LocalVariableDeclarationStatementContext : public antlr4::ParserRuleContext {
  public:
    LocalVariableDeclarationStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LocalVariableDeclarationContext *localVariableDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LocalVariableDeclarationStatementContext* localVariableDeclarationStatement();

  class  LocalVariableDeclarationContext : public antlr4::ParserRuleContext {
  public:
    LocalVariableDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();
    VariableDeclaratorListContext *variableDeclaratorList();
    std::vector<VariableModifierContext *> variableModifier();
    VariableModifierContext* variableModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LocalVariableDeclarationContext* localVariableDeclaration();

  class  StatementContext : public antlr4::ParserRuleContext {
  public:
    StatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    StatementWithoutTrailingSubstatementContext *statementWithoutTrailingSubstatement();
    LabeledStatementContext *labeledStatement();
    IfThenStatementContext *ifThenStatement();
    IfThenElseStatementContext *ifThenElseStatement();
    WhileStatementContext *whileStatement();
    ForStatementContext *forStatement();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementContext* statement();

  class  StatementNoShortIfContext : public antlr4::ParserRuleContext {
  public:
    StatementNoShortIfContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    StatementWithoutTrailingSubstatementContext *statementWithoutTrailingSubstatement();
    LabeledStatementNoShortIfContext *labeledStatementNoShortIf();
    IfThenElseStatementNoShortIfContext *ifThenElseStatementNoShortIf();
    WhileStatementNoShortIfContext *whileStatementNoShortIf();
    ForStatementNoShortIfContext *forStatementNoShortIf();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementNoShortIfContext* statementNoShortIf();

  class  StatementWithoutTrailingSubstatementContext : public antlr4::ParserRuleContext {
  public:
    StatementWithoutTrailingSubstatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockContext *block();
    EmptyStatementContext *emptyStatement();
    ExpressionStatementContext *expressionStatement();
    AssertStatementContext *assertStatement();
    SwitchStatementContext *switchStatement();
    DoStatementContext *doStatement();
    BreakStatementContext *breakStatement();
    ContinueStatementContext *continueStatement();
    ReturnStatementContext *returnStatement();
    SynchronizedStatementContext *synchronizedStatement();
    ThrowStatementContext *throwStatement();
    TryStatementContext *tryStatement();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementWithoutTrailingSubstatementContext* statementWithoutTrailingSubstatement();

  class  EmptyStatementContext : public antlr4::ParserRuleContext {
  public:
    EmptyStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EmptyStatementContext* emptyStatement();

  class  LabeledStatementContext : public antlr4::ParserRuleContext {
  public:
    LabeledStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    StatementContext *statement();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LabeledStatementContext* labeledStatement();

  class  LabeledStatementNoShortIfContext : public antlr4::ParserRuleContext {
  public:
    LabeledStatementNoShortIfContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    StatementNoShortIfContext *statementNoShortIf();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LabeledStatementNoShortIfContext* labeledStatementNoShortIf();

  class  ExpressionStatementContext : public antlr4::ParserRuleContext {
  public:
    ExpressionStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    StatementExpressionContext *statementExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpressionStatementContext* expressionStatement();

  class  StatementExpressionContext : public antlr4::ParserRuleContext {
  public:
    StatementExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AssignmentContext *assignment();
    PreIncrementExpressionContext *preIncrementExpression();
    PreDecrementExpressionContext *preDecrementExpression();
    PostIncrementExpressionContext *postIncrementExpression();
    PostDecrementExpressionContext *postDecrementExpression();
    MethodInvocationContext *methodInvocation();
    ClassInstanceCreationExpressionContext *classInstanceCreationExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementExpressionContext* statementExpression();

  class  IfThenStatementContext : public antlr4::ParserRuleContext {
  public:
    IfThenStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    StatementContext *statement();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IfThenStatementContext* ifThenStatement();

  class  IfThenElseStatementContext : public antlr4::ParserRuleContext {
  public:
    IfThenElseStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    StatementNoShortIfContext *statementNoShortIf();
    StatementContext *statement();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IfThenElseStatementContext* ifThenElseStatement();

  class  IfThenElseStatementNoShortIfContext : public antlr4::ParserRuleContext {
  public:
    IfThenElseStatementNoShortIfContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    std::vector<StatementNoShortIfContext *> statementNoShortIf();
    StatementNoShortIfContext* statementNoShortIf(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  IfThenElseStatementNoShortIfContext* ifThenElseStatementNoShortIf();

  class  AssertStatementContext : public antlr4::ParserRuleContext {
  public:
    AssertStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssertStatementContext* assertStatement();

  class  SwitchStatementContext : public antlr4::ParserRuleContext {
  public:
    SwitchStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    SwitchBlockContext *switchBlock();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SwitchStatementContext* switchStatement();

  class  SwitchBlockContext : public antlr4::ParserRuleContext {
  public:
    SwitchBlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<SwitchBlockStatementGroupContext *> switchBlockStatementGroup();
    SwitchBlockStatementGroupContext* switchBlockStatementGroup(size_t i);
    std::vector<SwitchLabelContext *> switchLabel();
    SwitchLabelContext* switchLabel(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SwitchBlockContext* switchBlock();

  class  SwitchBlockStatementGroupContext : public antlr4::ParserRuleContext {
  public:
    SwitchBlockStatementGroupContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SwitchLabelsContext *switchLabels();
    BlockStatementsContext *blockStatements();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SwitchBlockStatementGroupContext* switchBlockStatementGroup();

  class  SwitchLabelsContext : public antlr4::ParserRuleContext {
  public:
    SwitchLabelsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<SwitchLabelContext *> switchLabel();
    SwitchLabelContext* switchLabel(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SwitchLabelsContext* switchLabels();

  class  SwitchLabelContext : public antlr4::ParserRuleContext {
  public:
    SwitchLabelContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConstantExpressionContext *constantExpression();
    EnumConstantNameContext *enumConstantName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SwitchLabelContext* switchLabel();

  class  EnumConstantNameContext : public antlr4::ParserRuleContext {
  public:
    EnumConstantNameContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EnumConstantNameContext* enumConstantName();

  class  WhileStatementContext : public antlr4::ParserRuleContext {
  public:
    WhileStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    StatementContext *statement();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  WhileStatementContext* whileStatement();

  class  WhileStatementNoShortIfContext : public antlr4::ParserRuleContext {
  public:
    WhileStatementNoShortIfContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    StatementNoShortIfContext *statementNoShortIf();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  WhileStatementNoShortIfContext* whileStatementNoShortIf();

  class  DoStatementContext : public antlr4::ParserRuleContext {
  public:
    DoStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    StatementContext *statement();
    ExpressionContext *expression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  DoStatementContext* doStatement();

  class  ForStatementContext : public antlr4::ParserRuleContext {
  public:
    ForStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BasicForStatementContext *basicForStatement();
    EnhancedForStatementContext *enhancedForStatement();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ForStatementContext* forStatement();

  class  ForStatementNoShortIfContext : public antlr4::ParserRuleContext {
  public:
    ForStatementNoShortIfContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BasicForStatementNoShortIfContext *basicForStatementNoShortIf();
    EnhancedForStatementNoShortIfContext *enhancedForStatementNoShortIf();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ForStatementNoShortIfContext* forStatementNoShortIf();

  class  BasicForStatementContext : public antlr4::ParserRuleContext {
  public:
    BasicForStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    StatementContext *statement();
    ForInitContext *forInit();
    ExpressionContext *expression();
    ForUpdateContext *forUpdate();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BasicForStatementContext* basicForStatement();

  class  BasicForStatementNoShortIfContext : public antlr4::ParserRuleContext {
  public:
    BasicForStatementNoShortIfContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    StatementNoShortIfContext *statementNoShortIf();
    ForInitContext *forInit();
    ExpressionContext *expression();
    ForUpdateContext *forUpdate();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BasicForStatementNoShortIfContext* basicForStatementNoShortIf();

  class  ForInitContext : public antlr4::ParserRuleContext {
  public:
    ForInitContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    StatementExpressionListContext *statementExpressionList();
    LocalVariableDeclarationContext *localVariableDeclaration();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ForInitContext* forInit();

  class  ForUpdateContext : public antlr4::ParserRuleContext {
  public:
    ForUpdateContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    StatementExpressionListContext *statementExpressionList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ForUpdateContext* forUpdate();

  class  StatementExpressionListContext : public antlr4::ParserRuleContext {
  public:
    StatementExpressionListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<StatementExpressionContext *> statementExpression();
    StatementExpressionContext* statementExpression(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementExpressionListContext* statementExpressionList();

  class  EnhancedForStatementContext : public antlr4::ParserRuleContext {
  public:
    EnhancedForStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();
    VariableDeclaratorIdContext *variableDeclaratorId();
    ExpressionContext *expression();
    StatementContext *statement();
    std::vector<VariableModifierContext *> variableModifier();
    VariableModifierContext* variableModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EnhancedForStatementContext* enhancedForStatement();

  class  EnhancedForStatementNoShortIfContext : public antlr4::ParserRuleContext {
  public:
    EnhancedForStatementNoShortIfContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();
    VariableDeclaratorIdContext *variableDeclaratorId();
    ExpressionContext *expression();
    StatementNoShortIfContext *statementNoShortIf();
    std::vector<VariableModifierContext *> variableModifier();
    VariableModifierContext* variableModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EnhancedForStatementNoShortIfContext* enhancedForStatementNoShortIf();

  class  BreakStatementContext : public antlr4::ParserRuleContext {
  public:
    BreakStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BreakStatementContext* breakStatement();

  class  ContinueStatementContext : public antlr4::ParserRuleContext {
  public:
    ContinueStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ContinueStatementContext* continueStatement();

  class  ReturnStatementContext : public antlr4::ParserRuleContext {
  public:
    ReturnStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ReturnStatementContext* returnStatement();

  class  ThrowStatementContext : public antlr4::ParserRuleContext {
  public:
    ThrowStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ThrowStatementContext* throwStatement();

  class  SynchronizedStatementContext : public antlr4::ParserRuleContext {
  public:
    SynchronizedStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    BlockContext *block();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  SynchronizedStatementContext* synchronizedStatement();

  class  TryStatementContext : public antlr4::ParserRuleContext {
  public:
    TryStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockContext *block();
    CatchesContext *catches();
    Finally_Context *finally_();
    TryWithResourcesStatementContext *tryWithResourcesStatement();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TryStatementContext* tryStatement();

  class  CatchesContext : public antlr4::ParserRuleContext {
  public:
    CatchesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<CatchClauseContext *> catchClause();
    CatchClauseContext* catchClause(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CatchesContext* catches();

  class  CatchClauseContext : public antlr4::ParserRuleContext {
  public:
    CatchClauseContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CatchFormalParameterContext *catchFormalParameter();
    BlockContext *block();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CatchClauseContext* catchClause();

  class  CatchFormalParameterContext : public antlr4::ParserRuleContext {
  public:
    CatchFormalParameterContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CatchTypeContext *catchType();
    VariableDeclaratorIdContext *variableDeclaratorId();
    std::vector<VariableModifierContext *> variableModifier();
    VariableModifierContext* variableModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CatchFormalParameterContext* catchFormalParameter();

  class  CatchTypeContext : public antlr4::ParserRuleContext {
  public:
    CatchTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannClassTypeContext *unannClassType();
    std::vector<ClassTypeContext *> classType();
    ClassTypeContext* classType(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CatchTypeContext* catchType();

  class  Finally_Context : public antlr4::ParserRuleContext {
  public:
    Finally_Context(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockContext *block();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Finally_Context* finally_();

  class  TryWithResourcesStatementContext : public antlr4::ParserRuleContext {
  public:
    TryWithResourcesStatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ResourceSpecificationContext *resourceSpecification();
    BlockContext *block();
    CatchesContext *catches();
    Finally_Context *finally_();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TryWithResourcesStatementContext* tryWithResourcesStatement();

  class  ResourceSpecificationContext : public antlr4::ParserRuleContext {
  public:
    ResourceSpecificationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ResourceListContext *resourceList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ResourceSpecificationContext* resourceSpecification();

  class  ResourceListContext : public antlr4::ParserRuleContext {
  public:
    ResourceListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ResourceContext *> resource();
    ResourceContext* resource(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ResourceListContext* resourceList();

  class  ResourceContext : public antlr4::ParserRuleContext {
  public:
    ResourceContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnannTypeContext *unannType();
    VariableDeclaratorIdContext *variableDeclaratorId();
    ExpressionContext *expression();
    std::vector<VariableModifierContext *> variableModifier();
    VariableModifierContext* variableModifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ResourceContext* resource();

  class  PrimaryContext : public antlr4::ParserRuleContext {
  public:
    PrimaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PrimaryNoNewArray_lfno_primaryContext *primaryNoNewArray_lfno_primary();
    ArrayCreationExpressionContext *arrayCreationExpression();
    std::vector<PrimaryNoNewArray_lf_primaryContext *> primaryNoNewArray_lf_primary();
    PrimaryNoNewArray_lf_primaryContext* primaryNoNewArray_lf_primary(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimaryContext* primary();

  class  PrimaryNoNewArrayContext : public antlr4::ParserRuleContext {
  public:
    PrimaryNoNewArrayContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LiteralContext *literal();
    TypeNameContext *typeName();
    ExpressionContext *expression();
    ClassInstanceCreationExpressionContext *classInstanceCreationExpression();
    FieldAccessContext *fieldAccess();
    ArrayAccessContext *arrayAccess();
    MethodInvocationContext *methodInvocation();
    MethodReferenceContext *methodReference();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimaryNoNewArrayContext* primaryNoNewArray();

  class  PrimaryNoNewArray_lf_arrayAccessContext : public antlr4::ParserRuleContext {
  public:
    PrimaryNoNewArray_lf_arrayAccessContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimaryNoNewArray_lf_arrayAccessContext* primaryNoNewArray_lf_arrayAccess();

  class  PrimaryNoNewArray_lfno_arrayAccessContext : public antlr4::ParserRuleContext {
  public:
    PrimaryNoNewArray_lfno_arrayAccessContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LiteralContext *literal();
    TypeNameContext *typeName();
    ExpressionContext *expression();
    ClassInstanceCreationExpressionContext *classInstanceCreationExpression();
    FieldAccessContext *fieldAccess();
    MethodInvocationContext *methodInvocation();
    MethodReferenceContext *methodReference();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimaryNoNewArray_lfno_arrayAccessContext* primaryNoNewArray_lfno_arrayAccess();

  class  PrimaryNoNewArray_lf_primaryContext : public antlr4::ParserRuleContext {
  public:
    PrimaryNoNewArray_lf_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassInstanceCreationExpression_lf_primaryContext *classInstanceCreationExpression_lf_primary();
    FieldAccess_lf_primaryContext *fieldAccess_lf_primary();
    ArrayAccess_lf_primaryContext *arrayAccess_lf_primary();
    MethodInvocation_lf_primaryContext *methodInvocation_lf_primary();
    MethodReference_lf_primaryContext *methodReference_lf_primary();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimaryNoNewArray_lf_primaryContext* primaryNoNewArray_lf_primary();

  class  PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext : public antlr4::ParserRuleContext {
  public:
    PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext* primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();

  class  PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext : public antlr4::ParserRuleContext {
  public:
    PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ClassInstanceCreationExpression_lf_primaryContext *classInstanceCreationExpression_lf_primary();
    FieldAccess_lf_primaryContext *fieldAccess_lf_primary();
    MethodInvocation_lf_primaryContext *methodInvocation_lf_primary();
    MethodReference_lf_primaryContext *methodReference_lf_primary();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext* primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();

  class  PrimaryNoNewArray_lfno_primaryContext : public antlr4::ParserRuleContext {
  public:
    PrimaryNoNewArray_lfno_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LiteralContext *literal();
    TypeNameContext *typeName();
    UnannPrimitiveTypeContext *unannPrimitiveType();
    ExpressionContext *expression();
    ClassInstanceCreationExpression_lfno_primaryContext *classInstanceCreationExpression_lfno_primary();
    FieldAccess_lfno_primaryContext *fieldAccess_lfno_primary();
    ArrayAccess_lfno_primaryContext *arrayAccess_lfno_primary();
    MethodInvocation_lfno_primaryContext *methodInvocation_lfno_primary();
    MethodReference_lfno_primaryContext *methodReference_lfno_primary();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimaryNoNewArray_lfno_primaryContext* primaryNoNewArray_lfno_primary();

  class  PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext : public antlr4::ParserRuleContext {
  public:
    PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext* primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();

  class  PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext : public antlr4::ParserRuleContext {
  public:
    PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LiteralContext *literal();
    TypeNameContext *typeName();
    UnannPrimitiveTypeContext *unannPrimitiveType();
    ExpressionContext *expression();
    ClassInstanceCreationExpression_lfno_primaryContext *classInstanceCreationExpression_lfno_primary();
    FieldAccess_lfno_primaryContext *fieldAccess_lfno_primary();
    MethodInvocation_lfno_primaryContext *methodInvocation_lfno_primary();
    MethodReference_lfno_primaryContext *methodReference_lfno_primary();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext* primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();

  class  ClassInstanceCreationExpressionContext : public antlr4::ParserRuleContext {
  public:
    ClassInstanceCreationExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Identifier();
    antlr4::tree::TerminalNode* Identifier(size_t i);
    TypeArgumentsContext *typeArguments();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);
    TypeArgumentsOrDiamondContext *typeArgumentsOrDiamond();
    ArgumentListContext *argumentList();
    ClassBodyContext *classBody();
    ExpressionNameContext *expressionName();
    PrimaryContext *primary();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassInstanceCreationExpressionContext* classInstanceCreationExpression();

  class  ClassInstanceCreationExpression_lf_primaryContext : public antlr4::ParserRuleContext {
  public:
    ClassInstanceCreationExpression_lf_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    TypeArgumentsContext *typeArguments();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);
    TypeArgumentsOrDiamondContext *typeArgumentsOrDiamond();
    ArgumentListContext *argumentList();
    ClassBodyContext *classBody();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassInstanceCreationExpression_lf_primaryContext* classInstanceCreationExpression_lf_primary();

  class  ClassInstanceCreationExpression_lfno_primaryContext : public antlr4::ParserRuleContext {
  public:
    ClassInstanceCreationExpression_lfno_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Identifier();
    antlr4::tree::TerminalNode* Identifier(size_t i);
    TypeArgumentsContext *typeArguments();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);
    TypeArgumentsOrDiamondContext *typeArgumentsOrDiamond();
    ArgumentListContext *argumentList();
    ClassBodyContext *classBody();
    ExpressionNameContext *expressionName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassInstanceCreationExpression_lfno_primaryContext* classInstanceCreationExpression_lfno_primary();

  class  TypeArgumentsOrDiamondContext : public antlr4::ParserRuleContext {
  public:
    TypeArgumentsOrDiamondContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    TypeArgumentsContext *typeArguments();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  TypeArgumentsOrDiamondContext* typeArgumentsOrDiamond();

  class  FieldAccessContext : public antlr4::ParserRuleContext {
  public:
    FieldAccessContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PrimaryContext *primary();
    antlr4::tree::TerminalNode *Identifier();
    TypeNameContext *typeName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FieldAccessContext* fieldAccess();

  class  FieldAccess_lf_primaryContext : public antlr4::ParserRuleContext {
  public:
    FieldAccess_lf_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FieldAccess_lf_primaryContext* fieldAccess_lf_primary();

  class  FieldAccess_lfno_primaryContext : public antlr4::ParserRuleContext {
  public:
    FieldAccess_lfno_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    TypeNameContext *typeName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FieldAccess_lfno_primaryContext* fieldAccess_lfno_primary();

  class  ArrayAccessContext : public antlr4::ParserRuleContext {
  public:
    ArrayAccessContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionNameContext *expressionName();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    PrimaryNoNewArray_lfno_arrayAccessContext *primaryNoNewArray_lfno_arrayAccess();
    std::vector<PrimaryNoNewArray_lf_arrayAccessContext *> primaryNoNewArray_lf_arrayAccess();
    PrimaryNoNewArray_lf_arrayAccessContext* primaryNoNewArray_lf_arrayAccess(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayAccessContext* arrayAccess();

  class  ArrayAccess_lf_primaryContext : public antlr4::ParserRuleContext {
  public:
    ArrayAccess_lf_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext *primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    std::vector<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext *> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
    PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext* primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayAccess_lf_primaryContext* arrayAccess_lf_primary();

  class  ArrayAccess_lfno_primaryContext : public antlr4::ParserRuleContext {
  public:
    ArrayAccess_lfno_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionNameContext *expressionName();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext *primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
    std::vector<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext *> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
    PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext* primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayAccess_lfno_primaryContext* arrayAccess_lfno_primary();

  class  MethodInvocationContext : public antlr4::ParserRuleContext {
  public:
    MethodInvocationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    MethodNameContext *methodName();
    ArgumentListContext *argumentList();
    TypeNameContext *typeName();
    antlr4::tree::TerminalNode *Identifier();
    TypeArgumentsContext *typeArguments();
    ExpressionNameContext *expressionName();
    PrimaryContext *primary();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodInvocationContext* methodInvocation();

  class  MethodInvocation_lf_primaryContext : public antlr4::ParserRuleContext {
  public:
    MethodInvocation_lf_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    TypeArgumentsContext *typeArguments();
    ArgumentListContext *argumentList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodInvocation_lf_primaryContext* methodInvocation_lf_primary();

  class  MethodInvocation_lfno_primaryContext : public antlr4::ParserRuleContext {
  public:
    MethodInvocation_lfno_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    MethodNameContext *methodName();
    ArgumentListContext *argumentList();
    TypeNameContext *typeName();
    antlr4::tree::TerminalNode *Identifier();
    TypeArgumentsContext *typeArguments();
    ExpressionNameContext *expressionName();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodInvocation_lfno_primaryContext* methodInvocation_lfno_primary();

  class  ArgumentListContext : public antlr4::ParserRuleContext {
  public:
    ArgumentListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArgumentListContext* argumentList();

  class  MethodReferenceContext : public antlr4::ParserRuleContext {
  public:
    MethodReferenceContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionNameContext *expressionName();
    antlr4::tree::TerminalNode *Identifier();
    TypeArgumentsContext *typeArguments();
    ReferenceTypeContext *referenceType();
    PrimaryContext *primary();
    TypeNameContext *typeName();
    ClassTypeContext *classType();
    ArrayTypeContext *arrayType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodReferenceContext* methodReference();

  class  MethodReference_lf_primaryContext : public antlr4::ParserRuleContext {
  public:
    MethodReference_lf_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    TypeArgumentsContext *typeArguments();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodReference_lf_primaryContext* methodReference_lf_primary();

  class  MethodReference_lfno_primaryContext : public antlr4::ParserRuleContext {
  public:
    MethodReference_lfno_primaryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionNameContext *expressionName();
    antlr4::tree::TerminalNode *Identifier();
    TypeArgumentsContext *typeArguments();
    ReferenceTypeContext *referenceType();
    TypeNameContext *typeName();
    ClassTypeContext *classType();
    ArrayTypeContext *arrayType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MethodReference_lfno_primaryContext* methodReference_lfno_primary();

  class  ArrayCreationExpressionContext : public antlr4::ParserRuleContext {
  public:
    ArrayCreationExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PrimitiveTypeContext *primitiveType();
    DimExprsContext *dimExprs();
    DimsContext *dims();
    ClassOrInterfaceTypeContext *classOrInterfaceType();
    ArrayInitializerContext *arrayInitializer();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayCreationExpressionContext* arrayCreationExpression();

  class  DimExprsContext : public antlr4::ParserRuleContext {
  public:
    DimExprsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<DimExprContext *> dimExpr();
    DimExprContext* dimExpr(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  DimExprsContext* dimExprs();

  class  DimExprContext : public antlr4::ParserRuleContext {
  public:
    DimExprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    std::vector<AnnotationContext *> annotation();
    AnnotationContext* annotation(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  DimExprContext* dimExpr();

  class  ConstantExpressionContext : public antlr4::ParserRuleContext {
  public:
    ConstantExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstantExpressionContext* constantExpression();

  class  ExpressionContext : public antlr4::ParserRuleContext {
  public:
    ExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LambdaExpressionContext *lambdaExpression();
    AssignmentExpressionContext *assignmentExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpressionContext* expression();

  class  LambdaExpressionContext : public antlr4::ParserRuleContext {
  public:
    LambdaExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LambdaParametersContext *lambdaParameters();
    LambdaBodyContext *lambdaBody();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaExpressionContext* lambdaExpression();

  class  LambdaParametersContext : public antlr4::ParserRuleContext {
  public:
    LambdaParametersContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Identifier();
    FormalParameterListContext *formalParameterList();
    InferredFormalParameterListContext *inferredFormalParameterList();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaParametersContext* lambdaParameters();

  class  InferredFormalParameterListContext : public antlr4::ParserRuleContext {
  public:
    InferredFormalParameterListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Identifier();
    antlr4::tree::TerminalNode* Identifier(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InferredFormalParameterListContext* inferredFormalParameterList();

  class  LambdaBodyContext : public antlr4::ParserRuleContext {
  public:
    LambdaBodyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionContext *expression();
    BlockContext *block();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LambdaBodyContext* lambdaBody();

  class  AssignmentExpressionContext : public antlr4::ParserRuleContext {
  public:
    AssignmentExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionalExpressionContext *conditionalExpression();
    AssignmentContext *assignment();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssignmentExpressionContext* assignmentExpression();

  class  AssignmentContext : public antlr4::ParserRuleContext {
  public:
    AssignmentContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    LeftHandSideContext *leftHandSide();
    AssignmentOperatorContext *assignmentOperator();
    ExpressionContext *expression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssignmentContext* assignment();

  class  LeftHandSideContext : public antlr4::ParserRuleContext {
  public:
    LeftHandSideContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExpressionNameContext *expressionName();
    FieldAccessContext *fieldAccess();
    ArrayAccessContext *arrayAccess();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  LeftHandSideContext* leftHandSide();

  class  AssignmentOperatorContext : public antlr4::ParserRuleContext {
  public:
    AssignmentOperatorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssignmentOperatorContext* assignmentOperator();

  class  ConditionalExpressionContext : public antlr4::ParserRuleContext {
  public:
    ConditionalExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionalOrExpressionContext *conditionalOrExpression();
    ExpressionContext *expression();
    ConditionalExpressionContext *conditionalExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalExpressionContext* conditionalExpression();

  class  ConditionalOrExpressionContext : public antlr4::ParserRuleContext {
  public:
    ConditionalOrExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConditionalAndExpressionContext *conditionalAndExpression();
    ConditionalOrExpressionContext *conditionalOrExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalOrExpressionContext* conditionalOrExpression();
  ConditionalOrExpressionContext* conditionalOrExpression(int precedence);
  class  ConditionalAndExpressionContext : public antlr4::ParserRuleContext {
  public:
    ConditionalAndExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    InclusiveOrExpressionContext *inclusiveOrExpression();
    ConditionalAndExpressionContext *conditionalAndExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConditionalAndExpressionContext* conditionalAndExpression();
  ConditionalAndExpressionContext* conditionalAndExpression(int precedence);
  class  InclusiveOrExpressionContext : public antlr4::ParserRuleContext {
  public:
    InclusiveOrExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ExclusiveOrExpressionContext *exclusiveOrExpression();
    InclusiveOrExpressionContext *inclusiveOrExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  InclusiveOrExpressionContext* inclusiveOrExpression();
  InclusiveOrExpressionContext* inclusiveOrExpression(int precedence);
  class  ExclusiveOrExpressionContext : public antlr4::ParserRuleContext {
  public:
    ExclusiveOrExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AndExpressionContext *andExpression();
    ExclusiveOrExpressionContext *exclusiveOrExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExclusiveOrExpressionContext* exclusiveOrExpression();
  ExclusiveOrExpressionContext* exclusiveOrExpression(int precedence);
  class  AndExpressionContext : public antlr4::ParserRuleContext {
  public:
    AndExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    EqualityExpressionContext *equalityExpression();
    AndExpressionContext *andExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AndExpressionContext* andExpression();
  AndExpressionContext* andExpression(int precedence);
  class  EqualityExpressionContext : public antlr4::ParserRuleContext {
  public:
    EqualityExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    RelationalExpressionContext *relationalExpression();
    EqualityExpressionContext *equalityExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EqualityExpressionContext* equalityExpression();
  EqualityExpressionContext* equalityExpression(int precedence);
  class  RelationalExpressionContext : public antlr4::ParserRuleContext {
  public:
    RelationalExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ShiftExpressionContext *shiftExpression();
    RelationalExpressionContext *relationalExpression();
    ReferenceTypeContext *referenceType();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RelationalExpressionContext* relationalExpression();
  RelationalExpressionContext* relationalExpression(int precedence);
  class  ShiftExpressionContext : public antlr4::ParserRuleContext {
  public:
    ShiftExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AdditiveExpressionContext *additiveExpression();
    ShiftExpressionContext *shiftExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ShiftExpressionContext* shiftExpression();
  ShiftExpressionContext* shiftExpression(int precedence);
  class  AdditiveExpressionContext : public antlr4::ParserRuleContext {
  public:
    AdditiveExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    MultiplicativeExpressionContext *multiplicativeExpression();
    AdditiveExpressionContext *additiveExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AdditiveExpressionContext* additiveExpression();
  AdditiveExpressionContext* additiveExpression(int precedence);
  class  MultiplicativeExpressionContext : public antlr4::ParserRuleContext {
  public:
    MultiplicativeExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnaryExpressionContext *unaryExpression();
    MultiplicativeExpressionContext *multiplicativeExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  MultiplicativeExpressionContext* multiplicativeExpression();
  MultiplicativeExpressionContext* multiplicativeExpression(int precedence);
  class  UnaryExpressionContext : public antlr4::ParserRuleContext {
  public:
    UnaryExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PreIncrementExpressionContext *preIncrementExpression();
    PreDecrementExpressionContext *preDecrementExpression();
    UnaryExpressionContext *unaryExpression();
    UnaryExpressionNotPlusMinusContext *unaryExpressionNotPlusMinus();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnaryExpressionContext* unaryExpression();

  class  PreIncrementExpressionContext : public antlr4::ParserRuleContext {
  public:
    PreIncrementExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnaryExpressionContext *unaryExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PreIncrementExpressionContext* preIncrementExpression();

  class  PreDecrementExpressionContext : public antlr4::ParserRuleContext {
  public:
    PreDecrementExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    UnaryExpressionContext *unaryExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PreDecrementExpressionContext* preDecrementExpression();

  class  UnaryExpressionNotPlusMinusContext : public antlr4::ParserRuleContext {
  public:
    UnaryExpressionNotPlusMinusContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PostfixExpressionContext *postfixExpression();
    UnaryExpressionContext *unaryExpression();
    CastExpressionContext *castExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UnaryExpressionNotPlusMinusContext* unaryExpressionNotPlusMinus();

  class  PostfixExpressionContext : public antlr4::ParserRuleContext {
  public:
    PostfixExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PrimaryContext *primary();
    ExpressionNameContext *expressionName();
    std::vector<PostIncrementExpression_lf_postfixExpressionContext *> postIncrementExpression_lf_postfixExpression();
    PostIncrementExpression_lf_postfixExpressionContext* postIncrementExpression_lf_postfixExpression(size_t i);
    std::vector<PostDecrementExpression_lf_postfixExpressionContext *> postDecrementExpression_lf_postfixExpression();
    PostDecrementExpression_lf_postfixExpressionContext* postDecrementExpression_lf_postfixExpression(size_t i);

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PostfixExpressionContext* postfixExpression();

  class  PostIncrementExpressionContext : public antlr4::ParserRuleContext {
  public:
    PostIncrementExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PostfixExpressionContext *postfixExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PostIncrementExpressionContext* postIncrementExpression();

  class  PostIncrementExpression_lf_postfixExpressionContext : public antlr4::ParserRuleContext {
  public:
    PostIncrementExpression_lf_postfixExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PostIncrementExpression_lf_postfixExpressionContext* postIncrementExpression_lf_postfixExpression();

  class  PostDecrementExpressionContext : public antlr4::ParserRuleContext {
  public:
    PostDecrementExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PostfixExpressionContext *postfixExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PostDecrementExpressionContext* postDecrementExpression();

  class  PostDecrementExpression_lf_postfixExpressionContext : public antlr4::ParserRuleContext {
  public:
    PostDecrementExpression_lf_postfixExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  PostDecrementExpression_lf_postfixExpressionContext* postDecrementExpression_lf_postfixExpression();

  class  CastExpressionContext : public antlr4::ParserRuleContext {
  public:
    CastExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    PrimitiveTypeContext *primitiveType();
    UnaryExpressionContext *unaryExpression();
    ReferenceTypeContext *referenceType();
    UnaryExpressionNotPlusMinusContext *unaryExpressionNotPlusMinus();
    std::vector<AdditionalBoundContext *> additionalBound();
    AdditionalBoundContext* additionalBound(size_t i);
    LambdaExpressionContext *lambdaExpression();

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  CastExpressionContext* castExpression();


  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;
  bool packageNameSempred(PackageNameContext *_localctx, size_t predicateIndex);
  bool packageOrTypeNameSempred(PackageOrTypeNameContext *_localctx, size_t predicateIndex);
  bool ambiguousNameSempred(AmbiguousNameContext *_localctx, size_t predicateIndex);
  bool conditionalOrExpressionSempred(ConditionalOrExpressionContext *_localctx, size_t predicateIndex);
  bool conditionalAndExpressionSempred(ConditionalAndExpressionContext *_localctx, size_t predicateIndex);
  bool inclusiveOrExpressionSempred(InclusiveOrExpressionContext *_localctx, size_t predicateIndex);
  bool exclusiveOrExpressionSempred(ExclusiveOrExpressionContext *_localctx, size_t predicateIndex);
  bool andExpressionSempred(AndExpressionContext *_localctx, size_t predicateIndex);
  bool equalityExpressionSempred(EqualityExpressionContext *_localctx, size_t predicateIndex);
  bool relationalExpressionSempred(RelationalExpressionContext *_localctx, size_t predicateIndex);
  bool shiftExpressionSempred(ShiftExpressionContext *_localctx, size_t predicateIndex);
  bool additiveExpressionSempred(AdditiveExpressionContext *_localctx, size_t predicateIndex);
  bool multiplicativeExpressionSempred(MultiplicativeExpressionContext *_localctx, size_t predicateIndex);

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

