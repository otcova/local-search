package org.example.aima.search.uninformed;

import java.util.List;

import org.example.aima.search.framework.Metrics;
import org.example.aima.search.framework.Problem;
import org.example.aima.search.framework.QueueSearch;
import org.example.aima.search.framework.Search;
import org.example.aima.search.nodestore.FIFONodeStore;

public class BreadthFirstSearch implements Search {

	private QueueSearch search;

	public BreadthFirstSearch(QueueSearch search) {
		this.search = search;
	}

	public List search(Problem p) {
		return search.search(p, new FIFONodeStore());
	}

	public Metrics getMetrics() {
		return search.getMetrics();
	}
        
        public Object getGoalState(){
            return(null);
        };

    public List getPathStates() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}