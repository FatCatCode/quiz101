package com.catcode.hellomaven.a05;

import java.util.stream.IntStream;

public class A05 {

  public static void main(String[] args) {
    A05 test = new A05();
    
    System.out.println( test.isPalindrome( "Anna" ) );
    System.out.println( test.isPalindrome( "civic" ) );
    System.out.println( test.isPalindrome( "kayak" ) );
    System.out.println( test.isPalindrome( "level" ) );
    System.out.println( test.isPalindrome( "madam" ) );
    System.out.println( test.isPalindrome( "mom" ) );
    System.out.println( test.isPalindrome( "noon" ) );
    System.out.println( test.isPalindrome( "racecar" ) );
    System.out.println( test.isPalindrome( "radar" ) );
    System.out.println( test.isPalindrome( "redder" ) );
    System.out.println( test.isPalindrome( "refer" ) );
    System.out.println( test.isPalindrome( "repaper" ) );
    System.out.println( test.isPalindrome( "rotator" ) );
    System.out.println( test.isPalindrome( "12321" ) );
    System.out.println( test.isPalindrome( "15651" ) );
  }

  //-------------------------------------------------------------
  
  public String isPalindrome(String val) {
    String result = val.replaceAll("\\s+", "").toLowerCase();
    boolean isPalindrome = IntStream.range( 0, result.length() / 2)
                          .noneMatch( i -> result.charAt(i) != result.charAt( result.length() - i - 1) );
    
    return String.format( "\"%s\" is %sPalindrome.",  val, isPalindrome ? "" : "not " );
  }  
}

