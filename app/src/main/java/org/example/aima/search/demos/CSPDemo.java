package org.example.aima.search.demos;

import org.example.aima.search.csp.CSP;
import org.example.aima.search.csp.MapCSP;

/**
 * @author Ravi Mohan
 *  
 */
public class CSPDemo {
	public static void main(String[] args) {
		CSP csp = MapCSP.getMap();
		System.out.println("Map Coloring - Backtracking ");
		System.out.println(csp.backTrackingSearch());
		System.out.println("Map Coloring - Minimum Conflicts ");
		System.out.println(csp.mcSearch(100));
	}
}