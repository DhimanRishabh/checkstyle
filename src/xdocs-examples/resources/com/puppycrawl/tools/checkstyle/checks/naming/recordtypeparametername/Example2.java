/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="RecordTypeParameterName">
      <property name="format" value="^[a-zA-Z]$"/>
    </module>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.checks.naming.recordtypeparametername;

// xdoc section -- start
public class Example2 {
    record MyRecord1<T>() {} // OK
    record MyRecord2<t>() {} // OK
    record MyRecord3<abc>() {} // violation, the record type parameter
    // name should match the regular expression "^[a-zA-Z]$"
}
// xdoc section -- end
