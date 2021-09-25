package com.catcode.hellomaven.a02;

import java.util.Arrays;

public class A02 {

  public static void main(String[] args) {
    A02 test = new A02();
    
    System.out.println( test.distribute(2, 4) );
    System.out.println( test.distribute(3, 3) );
    System.out.println( test.distribute(4, 10) );
    System.out.println( test.distribute(3, 7) );
  }

  //-------------------------------------------------------------
  
  public String distribute(Integer servers, Integer jobs) {
    Integer[][] result = new Integer[servers][];
        
    // nodes per server
    Integer minNodes  = jobs / servers;
    
    for(Integer currentServer = 0, currentJob = 0 ; currentServer < servers ; currentServer++) {
      Integer realNodes = hasRestJob(servers, currentServer, minNodes, jobs, currentJob) ? (minNodes + 1) : minNodes;
      result[currentServer] = new Integer[realNodes];
      
      for(Integer currentNode = 0 ; currentNode < realNodes ; currentNode++) {
        result[currentServer][currentNode] = currentJob++;
      }
    }
    
    return Arrays.deepToString(result);
  }

  private boolean hasRestJob(
    Integer servers,
    Integer currentServer,
    Integer nodes,
    Integer jobs,
    Integer currentJob
  ) {
    Integer totalJob = ((servers - currentServer) * nodes ) + currentJob;    
    return totalJob < jobs;
  }
  
}

