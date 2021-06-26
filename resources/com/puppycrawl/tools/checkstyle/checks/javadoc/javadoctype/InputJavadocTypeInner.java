////////////////////////////////////////////////////////////////////////////////
// Test case file for checkstyle.
// Created: 2001
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks.javadoc.javadoctype;

/* Config: default*/

/**
 * Tests having inner types
 * @author Oliver Burn
 **/
class InputJavadocTypeInner // ok
{
    // ok , two violations
    class InnerInner2
    {
        // ok , Ignore
        public int fData;
    }


    interface InnerInterface2
    {

        String data = "zxzc";


        class InnerInterfaceInnerClass
        {

            public int rData;

            /** needs to be made private unless allowProtected. */
            protected int protectedVariable;

            /** needs to be made private unless allowPackage. */
            int packageVariable;
        }
    }

    /** demonstrate bug in handling static final **/
    protected static Object sWeird = new Object();
    /** demonstrate bug in handling static final **/
    static Object sWeird2 = new Object();

    /** demonstrate bug in local final variable */
    public interface Inter
    {
    }

     public static void main()
     {
        Inter m = new Inter()
        {
            private static final int CDS = 1;

            private int ABC;
        };
     }

    /** annotation field incorrectly named. */
    @interface InnerAnnotation
    {
        /** Ignore - should be all upper case. */
        String data = "zxzc";
    }

    /** enum with public member variable */
    enum InnerEnum
    {
        /** First constant */
        A,

        /** Second constant */
        B;

        /** Should be private */
        public int someValue;
    }
}
