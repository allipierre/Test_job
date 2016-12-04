/**
 * 
 */
package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author yotti
 *
 */
public class AppTest {
App a =new App();
String t=a.Sample();
	@Test
	public void test() {
		assertEquals(t,"Sample");
		
	}

}
