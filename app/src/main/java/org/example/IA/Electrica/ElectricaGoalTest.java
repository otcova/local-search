package org.example.IA.Electrica;
import org.example.aima.search.framework.GoalTest;

import org.example.aima.search.*;

public class ElectricaGoalTest implements GoalTest{

   public boolean isGoalState(Object aState) {
    Electrica board=(Electrica) aState;
    return(board.isGoalState());
  }
}