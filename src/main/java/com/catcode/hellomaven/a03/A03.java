package com.catcode.hellomaven.a03;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A03 {

  public static void main(String[] args) {
    A03 test = new A03();
    
    System.out.println( test.splitTheBill( "A:20", "B:15", "C:10" ) );
  }

  //-------------------------------------------------------------
  
  public String splitTheBill(String... group) {
    List<Friend> friendList = new ArrayList<Friend>();
    Arrays.stream( group ).forEach( friend -> { friendList.add( new Friend( friend ) ); } );
    
    Double total = friendList.stream().mapToDouble( friend -> friend.value ).sum();
    Double avg = setScale(total / Double.valueOf( friendList.size() ));
    friendList.forEach( friend -> { friend.calculate( avg ); } );
 
    String[] result = friendList.stream().map( friend -> friend.name + ":" + friend.display ).toArray( String[]::new );
    
    return Arrays.toString(result);
  }
  
  //--------------------------------------------------------------------
  
  private Double setScale(Double val) {
    return new BigDecimal( val ).setScale(2, RoundingMode.FLOOR).doubleValue() ;
  }
  
  //--------------------------------------------------------------------

  class Friend {
    
    String name;
    Double value;
    String display;
    
    Friend(String friend) {
      String[] nameValue = friend.split(":");
      this.name = nameValue[0];
      this.value = setScale( Double.valueOf( nameValue[1] ) );
    }

    void calculate(Double avg) {
      Double money = (this.value - avg);
      this.display = (money % 1.0 != 0) ? money.toString() : String.valueOf( money.intValue( ) );       
    }
    
  }
  
}

