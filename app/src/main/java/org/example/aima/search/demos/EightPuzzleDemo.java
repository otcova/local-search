/*
 * Created on Sep 12, 2004
 *
 */
package org.example.aima.search.demos;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.example.aima.search.eightpuzzle.EightPuzzleBoard;
import org.example.aima.search.eightpuzzle.EightPuzzleGoalTest;
import org.example.aima.search.eightpuzzle.EightPuzzleSuccessorFunction;
import org.example.aima.search.eightpuzzle.ManhattanHeuristicFunction;
import org.example.aima.search.eightpuzzle.MisplacedTilleHeuristicFunction;
import org.example.aima.search.framework.GraphSearch;
import org.example.aima.search.framework.Problem;
import org.example.aima.search.framework.Search;
import org.example.aima.search.framework.SearchAgent;
import org.example.aima.search.framework.TreeSearch;
import org.example.aima.search.informed.AStarSearch;
import org.example.aima.search.informed.GreedyBestFirstSearch;
import org.example.aima.search.informed.SimulatedAnnealingSearch;
import org.example.aima.search.uninformed.DepthLimitedSearch;
import org.example.aima.search.uninformed.IterativeDeepeningSearch;

/**
 * @author Ravi Mohan
 *  
 */
public class EightPuzzleDemo {
	static EightPuzzleBoard boardWithThreeMoveSolution = new EightPuzzleBoard(
			new int[] { 1, 2, 5, 3, 4, 0, 6, 7, 8 });;

	static EightPuzzleBoard random1 = new EightPuzzleBoard(new int[] { 1, 4, 2,
			7, 5, 8, 3, 0, 6 });

	public static void main(String[] args) {
		eightPuzzleDLSDemo();
		eightPuzzleIDLSDemo();
		eightPuzzleGreedyBestFirstDemo();
		eightPuzzleGreedyBestFirstManhattanDemo();
		eightPuzzleAStarDemo();
		eightPuzzleAStarManhattanDemo();
		/* eightPuzzleSimulatedAnnealingDemo();*/
	}

	private static void eightPuzzleDLSDemo() {
		System.out.println("\nEightPuzzleDemo recursive DLS -->");
		try {
			Problem problem = new Problem(random1,
					new EightPuzzleSuccessorFunction(),
					new EightPuzzleGoalTest());
			Search search = new DepthLimitedSearch(9);
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void eightPuzzleIDLSDemo() {
		System.out.println("\nEightPuzzleDemo Iterative DLS -->");
		try {
			Problem problem = new Problem(random1,
					new EightPuzzleSuccessorFunction(),
					new EightPuzzleGoalTest());
			Search search = new IterativeDeepeningSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void eightPuzzleGreedyBestFirstDemo() {
		System.out
				.println("\nEightPuzzleDemo Greedy Best First Search (MisplacedTileHeursitic)-->");
		try {
			Problem problem = new Problem(boardWithThreeMoveSolution,
					new EightPuzzleSuccessorFunction(),
					new EightPuzzleGoalTest(),
					new MisplacedTilleHeuristicFunction());
			Search search = new GreedyBestFirstSearch(new GraphSearch());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void eightPuzzleGreedyBestFirstManhattanDemo() {
		System.out
				.println("\nEightPuzzleDemo Greedy Best First Search (ManhattanHeursitic)-->");
		try {
			Problem problem = new Problem(boardWithThreeMoveSolution,
					new EightPuzzleSuccessorFunction(),
					new EightPuzzleGoalTest(), new ManhattanHeuristicFunction());
			Search search = new GreedyBestFirstSearch(new TreeSearch());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void eightPuzzleAStarDemo() {
		System.out
				.println("\nEightPuzzleDemo AStar Search (MisplacedTileHeursitic)-->");
		try {
			Problem problem = new Problem(random1,
					new EightPuzzleSuccessorFunction(),
					new EightPuzzleGoalTest(),
					new MisplacedTilleHeuristicFunction());
			Search search = new AStarSearch(new GraphSearch());
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void eightPuzzleSimulatedAnnealingDemo() {
		System.out.println("\nEightPuzzleDemo Simulated Annealing  Search -->");
		try {
			Problem problem = new Problem(random1,
					new EightPuzzleSuccessorFunction(),
					new EightPuzzleGoalTest(), new ManhattanHeuristicFunction());
			Search search = new SimulatedAnnealingSearch();
			SearchAgent agent = new SearchAgent(problem, search);
			printActions(agent.getActions());
			printInstrumentation(agent.getInstrumentation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void eightPuzzleAStarManhattanDemo() {
		System.out
				.println("\nEightPuzzleDemo AStar Search (ManhattanHeursitic)-->");
		try {
			Problem problem = new Problem(random1,
					new EightPuzzleSuccessorFunction(),
					new EightPuzzleGoalTest(), new ManhattanHeuristicFunction());
			Search search = new AStarSearch(new TreeSearch());
			SearchAgent agent = new SearchAgent(problem, search);
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