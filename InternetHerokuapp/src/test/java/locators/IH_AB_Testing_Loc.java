package locators;

import testComponents.Baseclass;

public class IH_AB_Testing_Loc extends Baseclass{
public static String AB_testLink = "//a[text()='A/B Testing']";
public static String TestVarition = "//div[@id='content']/div/h3";
public static String TestVariation_Paragraph = "//div[@id='content']/div/p";
public static String Expected_TestVarition_Test = "A/B Test Control";
public static String Expected_TestParagraph = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
public static String Elemental_Selenium = "//a[normalize-space()='Elemental Selenium']";

}
