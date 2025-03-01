package org.example.IA.probPathFinder;

import org.example.aima.search.framework.HeuristicFunction;

public class ProbPathFinderHeuristicFunction3 implements HeuristicFunction  {

  public boolean equals(Object obj) {
      boolean retValue;
      
      retValue = super.equals(obj);
      return retValue;
  }
  
  public double getHeuristicValue(Object state) {
   ProbPathFinderBoard board=(ProbPathFinderBoard)state;
   return (board.cityBlock()+board.blocking());
  }
  
}
