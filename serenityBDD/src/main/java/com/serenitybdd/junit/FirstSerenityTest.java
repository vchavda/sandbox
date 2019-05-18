package com.serenitybdd.junit;

import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class FirstSerenityTest {

	@Test
    public void test1 () {
		assert(true);
    }

}