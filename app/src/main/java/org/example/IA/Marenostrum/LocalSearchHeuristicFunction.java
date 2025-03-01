/***********************************************************************
 ***                                                                 ***
 ***   Pr�ctica IA Q1 / 2005                                         ***
 ***                                                                 ***
 ***   Alumno: Rafael Olivera Cano                                   ***
 ***   DNI:    47785413-S                                            ***
 ***   Grupo:  12                                                    ***
 ***                                                                 ***
 ***   LocalSearchHeuristicFunction.java                             ***
 ***                                                                 ***
 ***********************************************************************/
 
package org.example.IA.Marenostrum;

import java.util.Comparator;
import java.util.ArrayList;

import org.example.aima.search.framework.HeuristicFunction;

public class LocalSearchHeuristicFunction implements HeuristicFunction  
{
  public boolean equals(Object obj) 
  {
      boolean retValue;
      
      retValue = super.equals(obj);
      return retValue;
  }
  
  public double getHeuristicValue(Object state) 
  {
		LocalSearchBoard LSBoard=(LocalSearchBoard)state;		
		return (LSBoard.getProcesosNoAsignadosCount());						
	}  
}
