package IA.probTSP;

//~--- non-JDK imports --------------------------------------------------------

import IA.probTSP.ProbTSPHeuristicFunction;

import aima.search.framework.Successor;
import aima.search.framework.SuccessorFunction;

//~--- JDK imports ------------------------------------------------------------

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Javier Bejar
 *
 */
public class ProbTSPSuccessorFunctionSA implements SuccessorFunction {
    public List getSuccessors(Object aState) {
        ArrayList retVal = new ArrayList();
        ProbTSPBoard board = (ProbTSPBoard) aState;
        ProbTSPHeuristicFunction TSPHF = new ProbTSPHeuristicFunction();
        Random myRandom = new Random();
        int i, j;

        // Nos ahorramos generar todos los sucesores escogiendo un par de ciudades al
        // azar

        i = myRandom.nextInt(board.getNCities());

        do {
            j = myRandom.nextInt(board.getNCities());
        } while (i == j);

        ProbTSPBoard newBoard = new ProbTSPBoard(board.getNCities(), board.getPath(), board.getDists());

        newBoard.swapCities(i, j);

        double v = TSPHF.getHeuristicValue(newBoard);
        String S = ProbTSPBoard.INTERCAMBIO + " " + i + " " + j + " Coste(" + v + ") ---> " + newBoard.toString();

        retVal.add(new Successor(S, newBoard));

        return retVal;
    }
}

// ~ Formatted by Jindent --- http://www.jindent.com
