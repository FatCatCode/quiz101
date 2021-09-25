package com.catcode.hellomaven.a04;

public class A04 {

  public static void main(String[] args) {
    A04 test = new A04();
    
    System.out.println( test.fibonacci( 2 ) );
    System.out.println( test.fibonacci( 9 ) );
  }

  //-------------------------------------------------------------
  
  public Integer fibonacci(Integer n) {
    return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
  }  
}

