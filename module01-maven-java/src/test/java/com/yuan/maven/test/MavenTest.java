package com.yuan.maven.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @className: MavenTest
 * @package: com.yuan.maven.test
 * @description:
 * @author: liyuan
 * @create: 2024/01/28 14:39
 * @version: 1.0
 */
public class MavenTest {

  @Test
  public void testAssert() {
    int a = 10;
    int b = 20;
    Assertions.assertEquals(a + b, 30);
  }

}
