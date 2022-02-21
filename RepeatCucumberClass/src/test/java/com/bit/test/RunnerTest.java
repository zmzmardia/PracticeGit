package com.bit.test;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Mounia2016\\OneDrive\\Desktop\\BTC31072021M\\RepeatCucumberClass\\logIn.feature" },
glue = {"LogInStepDefinetion" }, 
tags = "@reg", monochrome = true)
public class RunnerTest {

}
