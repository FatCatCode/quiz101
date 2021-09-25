package com.catcode.hellomaven.helper;

public class RuleFizz implements Rule {
  
  @Override
  public boolean isInRule(Integer val) {
    return val % 3 == 0;
  }

  @Override
  public String result(Integer val) {
    return "Fizz";
  }
  
}
