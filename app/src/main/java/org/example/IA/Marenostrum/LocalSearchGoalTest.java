/***********************************************************************
 ***                                                                 ***
 ***   Pr�ctica IA Q1 / 2005                                         ***
 ***                                                                 ***
 ***   Alumno: Rafael Olivera Cano                                   ***
 ***   DNI:    47785413-S                                            ***
 ***   Grupo:  12                                                    ***
 ***                                                                 ***
 ***   LocalSearchGoalTest.java                                      ***
 ***                                                                 ***
 ***********************************************************************/
 
package org.example.IA.Marenostrum;

import java.util.ArrayList;
import org.example.aima.search.framework.GoalTest;

import org.example.aima.search.*;

public class LocalSearchGoalTest implements GoalTest 
{
  public boolean isGoalState(Object aState) 
  {
  	LocalSearchBoard LSBoard=(LocalSearchBoard) aState;
  	if (LSBoard.getProcesosSiAsignadosCount() == 168) return true;
  	return false;  	
  }
}