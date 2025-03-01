/*
 * ProbIA1OrderingFunction.java
 *
 * Created on February 5, 2004, 12:58 PM
 */

package org.example.IA.probIA15;


import org.example.IA.probIA15.ProbIA15Board;

import org.example.aima.search.framework.HeuristicFunction;

/**
 *
 * @author  bejar
 */
public class ProbIA15HeuristicFunction implements HeuristicFunction{
    
    
    public double getHeuristicValue(Object n) {
       ProbIA15Board board=(ProbIA15Board)n;
       char [] conf;
       int sum=0;
       
       conf=board.getConfiguration();
       
       for(int i=0;i<5;i++) if (conf[i]=='B') sum++;
       
       return (sum);
    }
    

    public boolean equals(Object obj) {
        boolean retValue;
        
        retValue = super.equals(obj);
        return retValue;
    }
    
}
