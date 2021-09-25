package com.catcode.hellomaven.helper;

public class RuleFizzBuzz implements Rule {

  private RuleFizz ruleFizz;

  private RuleBuzz ruleBuzz;

  public RuleFizzBuzz() {
    ruleFizz = new RuleFizz();
    ruleBuzz = new RuleBuzz();
  }

  @Override
  public boolean isInRule(Integer val) {
    return (ruleFizz.isInRule(val) == true) && (ruleBuzz.isInRule(val) == true);
  }

  @Override
  public String result(Integer val) {
    return ruleFizz.result(val) + ruleBuzz.result(val);
  }

}
