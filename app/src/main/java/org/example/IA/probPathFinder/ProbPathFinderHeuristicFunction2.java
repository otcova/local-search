package org.example.IA.probPathFinder;

import org.example.aima.search.framework.HeuristicFunction;

public class ProbPathFinderHeuristicFunction2 implements HeuristicFunction  {

  public boolean equals(Object obj) {
      boolean retValue;
      
      retValue = super.equals(obj);
      return retValue;
  }
  
  public double getHeuristicValue(Object state) {
   ProbPathFinderBoard board=(ProbPathFinderBoard)state;
   return (board.cityBlock());
  }
  
}
