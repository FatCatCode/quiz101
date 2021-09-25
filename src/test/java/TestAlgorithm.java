import com.catcode.hellomaven.a01.A01;
import com.catcode.hellomaven.a02.A02;
import com.catcode.hellomaven.a03.A03;
import com.catcode.hellomaven.a04.A04;
import com.catcode.hellomaven.a05.A05;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestAlgorithm {
  
  @Test
  public void testA01() {
    A01 test = new A01();
    
    assertEquals( "Fizz",      test.fizzBuzz( 21 ) );
    assertEquals( "Buzz",      test.fizzBuzz( 25 ) );
    assertEquals( "FizzBuzz",  test.fizzBuzz( 45 ) );
  }
  
  @Test
  public void testA02() {
    A02 test = new A02();
    
    assertEquals( "[[0, 1], [2, 3]]",                        test.distribute( 2, 4 ) );
    assertEquals( "[[0], [1], [2]]",                         test.distribute( 3, 3 ) );
    assertEquals( "[[0, 1, 2], [3, 4, 5], [6, 7], [8, 9]]",  test.distribute( 4, 10 ) );
  }
  
  @Test
  public void testA03() {
    A03 test = new A03();
    
    assertEquals( "[A:5, B:0, C:-5]", test.splitTheBill( "A:20", "B:15", "C:10" ));
  }
  
  @Test
  public void testA04() {
    A04 test = new A04();
    
    assertEquals( Integer.valueOf( 1 ),  test.fibonacci( 2 ) );
    assertEquals( Integer.valueOf( 34 ), test.fibonacci( 9 ) );
  }
  
  @Test
  public void testA05() {
    A05 test = new A05();
    
    assertEquals( "\"Anna\" is Palindrome.",    test.isPalindrome( "Anna" ) );
    assertEquals( "\"civic\" is Palindrome.",   test.isPalindrome( "civic" ) );
    assertEquals( "\"kayak\" is Palindrome.",   test.isPalindrome( "kayak" ) );
    assertEquals( "\"level\" is Palindrome.",   test.isPalindrome( "level" ) );
    assertEquals( "\"madam\" is Palindrome.",   test.isPalindrome( "madam" ) );
    assertEquals( "\"mom\" is Palindrome.",     test.isPalindrome( "mom" ) );
    assertEquals( "\"noon\" is Palindrome.",    test.isPalindrome( "noon" ) );
    assertEquals( "\"racecar\" is Palindrome.", test.isPalindrome( "racecar" ) );
    assertEquals( "\"radar\" is Palindrome.",   test.isPalindrome( "radar" ) );
    assertEquals( "\"redder\" is Palindrome.",  test.isPalindrome( "redder" ) );
    assertEquals( "\"refer\" is Palindrome.",   test.isPalindrome( "refer" ) );
    assertEquals( "\"repaper\" is Palindrome.", test.isPalindrome( "repaper" ) );
    assertEquals( "\"rotator\" is Palindrome.", test.isPalindrome( "rotator" ) );
    assertEquals( "\"12321\" is Palindrome.",   test.isPalindrome( "12321" ) );
    assertEquals( "\"15651\" is Palindrome.",   test.isPalindrome( "15651" ) );
  }

}