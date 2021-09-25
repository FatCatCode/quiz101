package com.catcode.hellomaven.helper;

public class RuleDefault implements Rule {
  
  @Override
  public boolean isInRule(Integer val) {
    return true;
  }

  @Override
  public String result(Integer val) {
    return val.toString();
  }
  
}
