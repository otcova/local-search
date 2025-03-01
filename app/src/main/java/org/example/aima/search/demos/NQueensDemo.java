package org.example.aima.search.demos;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.example.aima.search.framework.GraphSearch;
import org.example.aima.search.framework.Problem;
import org.example.aima.search.framework.Search;
import org.example.aima.search.framework.SearchAgent;
import org.example.aima.search.framework.TreeSearch;
import org.example.aima.search.informed.HillClimbingSearch;
import org.example.aima.search.informed.SimulatedAnnealingSearch;
import org.example.aima.search.nqueens.NQueensBoard;
import org.example.aima.search.nqueens.NQueensGoalTest;
import org.example.aima.search.nqueens.NQueensSuccessorFunction;
import org.example.aima.search.nqueens.QueensToBePlacedHeuristic;
import org.example.aima.search.uninformed.BreadthFirstSearch;
import org.example.aima.search.uninformed.DepthFirstSearch;
import org.example.aima.search.uninformed.DepthLimitedSearch;
import org.example.aima.search.uninformed.IterativeDeepeningSearch;

public class NQueensDemo {

	public static void main(String[] args) {

		newNQueensDemo();
	}

	private static void newNQueensDemo() {

		nQueensWithDepthFirstSearch();
		nQueensWithBreadthFirstSearch();
		nQueensWithRecursiveDLS();
		nQueensWithIterativeDeepeningSearch();
		nQueensSimulatedAnnealingSearch();
		nQueensHillClimbingSearch();

	}

	private static void nQueensWithRecursiveDLS() {
		System.out.println("\nNQueensDemo recursive DLS -->");
		try {
			Problem problem =  new Problem(new NQueensBoard(8),new NQueensSuccessorFunction(), new NQueensGoalTest());
			Search search = new DepthLimitedSearch(8);
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void nQueensWithBreadthFirstSearch() {
		try {
			System.out.println("\nNQueensDemo BFS -->");
			Problem problem =  new Problem(new NQueensBoard(8),new NQueensSuccessorFunction(), new NQueensGoalTest());
			Search search = new BreadthFirstSearch(new TreeSearch());
			SearchAgent agent2 = new SearchAgent(problem, search);
			printActions(agent2.getActions());
			printInstrumentation(agent2.getInstrumentation());
		} catch (Exception e1) {

			e1.printStackTrace();
		}
	}

	private static void nQueensWithDepthFirstSearch() {
		System.out.println("\nNQueensDemo DFS -->");
		try {
			Problem problem =  new Problem(new NQueensBoard(8),new NQueensSuccessorFunction(), new NQueensGoalTest());
			Search search = new DepthFirstSearch(new GraphSearch());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void nQueensWithIterativeDeepeningSearch() {
		System.out.println("\nNQueensDemo Iterative DS  -->");
		try {
			Problem problem =  new Problem(new NQueensBoard(8),new NQueensSuccessorFunction(), new NQueensGoalTest());
			Search search =  new IterativeDeepeningSearch();
			SearchAgent agent = new SearchAgent(problem,search);

			System.out.println();
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void nQueensSimulatedAnnealingSearch() {
		System.out.println("\nNQueensDemo Simulated Annealing  -->");
		try {
			Problem problem =  new Problem(new NQueensBoard(8),new NQueensSuccessorFunction(), new NQueensGoalTest(),new QueensToBePlacedHeuristic());
			Search search =  new SimulatedAnnealingSearch();
			SearchAgent agent = new SearchAgent(problem,search);

			System.out.println();
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void nQueensHillClimbingSearch() {
		System.out.println("\nNQueensDemo HillClimbing  -->");
		try {
			Problem problem =  new Problem(new NQueensBoard(8),new NQueensSuccessorFunction(), new NQueensGoalTest(),new QueensToBePlacedHeuristic());
			Search search =  new HillClimbingSearch();
			SearchAgent agent = new SearchAgent(problem,search);

			System.out.println();
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void printInstrumentation(Properties properties) {
		Iterator keys = properties.keySet().iterator();
		while (keys.hasNext()) {
			String key = (String) keys.next();
			String property = properties.getProperty(key);
			System.out.println(key + " : " + property);
		}

	}

	private static void printActions(List actions) {
		for (int i = 0; i < actions.size(); i++) {
			String action = (String) actions.get(i);
			System.out.println(action);
		}
	}

}