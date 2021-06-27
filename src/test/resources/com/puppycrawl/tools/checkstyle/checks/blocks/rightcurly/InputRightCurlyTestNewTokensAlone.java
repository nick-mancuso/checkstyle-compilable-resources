package com.puppycrawl.tools.checkstyle.checks.blocks.rightcurly;

/*
 * Config:
 * option = alone
 * tokens = { ENUM_DEF }
 */
public class InputRightCurlyTestNewTokensAlone {

    enum TestEnum{} // violation

    enum TestEnum1{
        SOME_VALUE;} // violation

    enum TestEnum2 { SOME_VALUE; } // violation

    enum TestEnum3{
        SOME_VALUE;
    }

    enum TestEnum4{ SOME_VALUE;
    }
}
