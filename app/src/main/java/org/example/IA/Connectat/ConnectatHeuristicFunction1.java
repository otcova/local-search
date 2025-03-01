/*
 * ConnectatHeuristicFunction1.java
 *
 * Created on 22 de marzo de 2006, 17:18
 */

package org.example.IA.Connectat;

import java.util.Comparator;
import java.util.ArrayList;

import org.example.aima.search.framework.HeuristicFunction;

public class ConnectatHeuristicFunction1 implements HeuristicFunction  
{
  
  public double getHeuristicValue(Object state) 
  {
		ConnectatBoard CBoard=(ConnectatBoard)state;		
		return CBoard.getErrorTotal();						
	}
}

