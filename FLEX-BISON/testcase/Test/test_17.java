package org.codehaus.commons.compiler.tests;

import java.util.Collection;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.commons.compiler.ICompilerFactory;
import org.codehaus.commons.compiler.IExpressionEvaluator;
import org.codehaus.commons.compiler.lang.ClassLoaders;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import for_sandbox_tests.ExternalClass;
import util.TestUtil;

/**
 * Tests for accessing and subclassing other classes on the classpath.
 */
@RunWith(Parameterized.class) public
class ExternalClassesTest {

    private final ICompilerFactory compilerFactory;

    @Parameters(name = "CompilerFactory={0}") public static Collection<Object[]>
    compilerFactories() throws Exception {
        return TestUtil.getCompilerFactoriesForParameters();
    }

    public
    ExternalClassesTest(ICompilerFactory compilerFactory) {
        this.compilerFactory = compilerFactory;
    }

    @Test public void
    testForbiddenClass() throws Exception {

        // Invoke method of a class that is on the CLASSPATH of this JVM, but not on the BOOTCLASSPATH.
        try {
            IExpressionEvaluator ee = this.compilerFactory.newExpressionEvaluator();
            ee.setParentClassLoader(ClassLoaders.BOOTCLASSPATH_CLASS_LOADER);
            ee.cook("for_sandbox_tests.ExternalClass.m1()");
            Assert.fail("Should have thrown a CompileException");
        } catch (CompileException ex) {
            ;
        }
    }

    @Test public void
    testAuxiliaryClass() throws Exception {

        // Invoke method of allowed external class.
        IExpressionEvaluator ee = this.compilerFactory.newExpressionEvaluator();
        ee.cook("for_sandbox_tests.ExternalClass.m1()");

        Integer result = (Integer) ee.evaluate(new Object[0]);
        assert result != null;
        Assert.assertEquals(7, result.intValue());
    }

    @Test public void
    testExternalBaseClass() throws Exception {

        // Invoke method of base class.
        IExpressionEvaluator ee = this.compilerFactory.newExpressionEvaluator();
        ee.setExtendedClass(ExternalClass.class);
        ee.cook("m1()");

        Integer result = (Integer) ee.evaluate(new Object[0]);
        assert result != null;
        Assert.assertEquals(7, result.intValue());
    }
}
