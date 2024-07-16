// comment
package com.google.checkstyle.test.chapter4formatting.rule4861blockcommentstyle;

import java.util.Arrays;

// some
public class InputCommentsIndentationSurroundingCode {
  private void foo1() {
    if (true) {
      // here initialize some variables
      int k = 0; // trailing comment
        // odd indentation comment
      // violation above '.* indentation should be the same level as line 14.'
      int b = 10;
      // sss
    }
  }

  private void foo2() {
    if (true) {
      /* some */
      int k = 0;
          /* // odd indentation comment
           */
      // violation 2 lines above '.* indentation should be the same level as line 26.'
      int b = 10;
          /* // odd indentation comment
           * */
      // violation 2 lines above '.* indentation should be the same level as line 30.'
      double d; /* trailing comment */
           /* // odd indentation comment
       *
       */
      // violation 3 lines above '.* indentation should be the same level as line 35.'
      boolean bb;
      /***/
      /* my comment*/
      /*
       *
       *
       *  some
       */
      /*
       * comment
       */
      boolean x;
    }
  }

  private void foo3() {
    int a = 5, b = 3, v = 6;
    if (a == b && v == b
            || (a == 1
                /// // odd indentation comment
          /* // odd indentation comment
           * one fine day ... */
            // violation 3 lines above '.* indentation should.* as line 59.'
            // violation 3 lines above '.* indentation should.* as line 59.'
            && b == 1)) {}
  }

  private static void com() {
    /* here's my weird trailing comment */ boolean b = true;
  }

  private static final String[][] mergeMatrix = {
          // This example of trailing block comments was found in PMD sources.
          /* TOP */ {
          "",
  },
          /* ALWAYS */ {
          "", "",
  },
          /* NEVER */ {
          "NEVER", "UNKNOWN", "NEVER",
  },
          /* UNKNOWN */ {"UNKNOWN", "UNKNOWN", "UNKNOWN", "UNKNOWN"},
  };

  private void foo4() {
    if (!Arrays.equals(new String[] {""}, new String[] {""})/* wierd trailing comment */ ) {}
  }

  /** some javadoc */
  private static void l() {}

  public void foid5() {
    String s = "";
    s.toString().toString().toString();
    // comment
  }

  public void foo6() {
    // comment
    // ...
    // block
    // ...
          // odd indentation comment
    // violation above '.* indentation should be the same level as line 100.'
    String someStr = new String();
  }

  public void foo7() {
    // comment
    // ...
    // block
        // odd indentation comment
    // comment
    // violation 2 lines above'.* indentation should be the same level as line 110.'
    String someStr = new String();
  }

  public void foo8() {
    String s = new String(); // comment
    // ...
    // block
    // ...
            // odd indentation comment
    // violation above '.* indentation should be the same level as line 120.'
    String someStr = new String();
  }

  public String foo9(String s1, String s2, String s3) {
    return "";
  }

  public void foo10() throws Exception {

    final String pattern = "^foo$";

    final String[] expected = {
            "7:13: " + foo9("", "", ""),
            // comment
    };
  }
} // The Check should not throw NPE here!
// The Check should not throw NPE here!
