package com.catcode.hellomaven.a01;

import java.util.ArrayList;
import java.util.List;

import com.catcode.hellomaven.helper.Rule;
import com.catcode.hellomaven.helper.RuleBuzz;
import com.catcode.hellomaven.helper.RuleDefault;
import com.catcode.hellomaven.helper.RuleFizz;
import com.catcode.hellomaven.helper.RuleFizzBuzz;
import com.catcode.hellomaven.helper.RuleManager;

public class A01 implements RuleManager {

  private List<Rule> ruleList;

  public A01() {
    ruleList = new ArrayList<Rule>();
    ruleList.add(new RuleFizzBuzz());
    ruleList.add(new RuleFizz());
    ruleList.add(new RuleBuzz());
    ruleList.add(new RuleDefault());
  }

  // ------------------------------------------------------

  public static void main(String[] args) {
    A01 test = new A01();
    
    System.out.println(test.fizzBuzz(21));
    System.out.println(test.fizzBuzz(25));
    System.out.println(test.fizzBuzz(45));
  }

  // ------------------------------------------------------

  @Override
  public String fizzBuzz(Integer val) {
    return ruleList.stream()
        .filter( rule -> rule.isInRule(val) )
        .findFirst()
        .get()
        .result( val );
    
    /*
    return  (val % 3 == 0 && val % 5 == 0) ? "FizzBuzz" : 
            (val % 3 == 0) ? "Fizz" : 
            (val % 5 == 0) ? "Buzz" : String.valueOf( val );  
    */
  }

}
