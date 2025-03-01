/*
 * ConnectatGoalTest.java
 *
 * Created on 5 de abril de 2006, 18:33
 */

package org.example.IA.Connectat;

/**
 *
 * @author  e7709254
 */

import org.example.aima.search.framework.GoalTest;

import org.example.aima.search.*;

public class ConnectatGoalTest implements GoalTest 
{
  public boolean isGoalState(Object state) 
  {
  	ConnectatBoard CBoard=(ConnectatBoard) state;
        //if (CBoard.getErrorTotal()==0 && CBoard.getNumRepetidors()==0) return true;
  	return false;  	
  }
}