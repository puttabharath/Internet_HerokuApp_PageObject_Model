package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IH_AB_Testing_module;
import testComponents.Baseclass;

public class IH_AB_Testing_Test extends Baseclass{

@Test (priority = 1,retryAnalyzer = testComponents.RetryAnalyzer.class)
public void ABTesting_Test() {

    IH_AB_Testing_module Abt = new IH_AB_Testing_module(driver);
    Abt.ABTesting_Navigation();

}

@Test (priority = 2)
public void testFailure() {
    System.out.println("Executing testFailure...");
    Assert.fail("Intentional Failure");
}

@Test (priority = 3)
public void testSkip() {
    System.out.println("Executing testSkip...");
    throw new RuntimeException("Skipping this test");

}
}
