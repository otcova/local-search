
package org.example.IA.probPathFinder;


import java.util.ArrayList;
import java.util.List;

import org.example.aima.search.framework.Successor;
import org.example.aima.search.framework.SuccessorFunction;
/**
 * @author Ravi Mohan
 *  
 */
public class ProbPathFinderSuccessorFunction implements SuccessorFunction {
 
    
  public List getSuccessors(Object aState) {
    ArrayList retVal= new ArrayList();
    ProbPathFinderBoard board=(ProbPathFinderBoard) aState;
    if (board.canMoveSouth()){
       ProbPathFinderBoard newBoard= new ProbPathFinderBoard(board.size(),board.dificultad(),board.getX(),board.getY(),board.getPlano());
       newBoard.moveSouth();
       String S=new String(ProbPathFinderBoard.SOUTH);
       retVal.add(new Successor(S,newBoard));
     }
    
     if (board.canMoveEast()){
       ProbPathFinderBoard newBoard= new ProbPathFinderBoard(board.size(),board.dificultad(),board.getX(),board.getY(),board.getPlano());
       newBoard.moveEast();
       String S=new String(ProbPathFinderBoard.EAST);
       retVal.add(new Successor(S,newBoard));
     }
    
     if (board.canMoveNorth()){
       ProbPathFinderBoard newBoard= new ProbPathFinderBoard(board.size(),board.dificultad(),board.getX(),board.getY(),board.getPlano());
       newBoard.moveNorth();
       String S=new String(ProbPathFinderBoard.NORTH);
       retVal.add(new Successor(S,newBoard));
     }

     if (board.canMoveWest()){
       ProbPathFinderBoard newBoard= new ProbPathFinderBoard(board.size(),board.dificultad(),board.getX(),board.getY(),board.getPlano());
       newBoard.moveWest();
       String S=new String(ProbPathFinderBoard.WEST);
       retVal.add(new Successor(S,newBoard));
     }
     
     return retVal;
  }

}