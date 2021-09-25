package com.catcode.hellomaven.helper;

public class RuleBuzz implements Rule {
  
  @Override
  public boolean isInRule(Integer val) {
    return val % 5 == 0;
  }

  @Override
  public String result(Integer val) {
    return "Buzz";
  }
  
}
