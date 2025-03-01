package aima.search.csp;

import java.util.ArrayList;
import java.util.List;

import aima.basic.Util;

/**
 * @author Ravi Mohan
 * 
 */
public class CSP {

	// private Assignment assignment;

	private Domains domains;

	private Constraint constraints;

	private List variables;

	public CSP(List variables, Constraint constraints) {
		this.variables = variables;
		// this.assignment = new Assignment(variables);
		this.domains = new Domains(variables);
		this.constraints = constraints;
	}

	public CSP(List variables, Constraint constraints, Domains domains) {
		this.variables = variables;
		// this.assignment = new Assignment(variables);
		this.domains = domains;
		this.constraints = constraints;
	}

	public List defaultOrderDomainOf(String variable) {
		return domains.getDomainOf(variable);
	}

	public Assignment backTrackingSearch() {
		return recursiveBackTrackingSearch(new Assignment(variables));
	}

	private Assignment recursiveBackTrackingSearch(Assignment anAssignment) {
		if (anAssignment.isComplete()) {
			return anAssignment;
		}
		String variable = anAssignment.selectFirstUnassignedVariable();
		List domainValues = defaultOrderDomainOf(variable);
		for (int i = 0; i < domainValues.size(); i++) {
			Object value = domainValues.get(i);

			if (constraints.isSatisfiedWith(anAssignment, variable, value)) {
				anAssignment.setAssignment(variable, value);
				Assignment result = recursiveBackTrackingSearch(anAssignment);
				if (result != null) {
					return result;
				}
				anAssignment.remove(variable);
			}
		}
		return null;// failure
	}

	public Assignment mcSearch(int maxSteps) {
		Assignment randomAssignment = generateRandomAssignment();

		for (int i = 0; i < maxSteps; i++) {

			if (randomAssignment.satisfies(constraints)) {
				return randomAssignment;
			} else {
				String conflictedVariable = (String) Util
						.selectRandomlyFromList(randomAssignment
								.getConflictedVariables(constraints));
				Object minConflictValue = randomAssignment
						.getMinimumConflictingValueFor(conflictedVariable,
								domains.getDomainOf(conflictedVariable),
								constraints);
				randomAssignment.setAssignment(conflictedVariable,
						minConflictValue);
			}
		}
		return null;

	}

	private Assignment generateRandomAssignment() {
		List vars = new ArrayList();
		for (int i = 0; i < variables.size(); i++) {
			vars.add(variables.get(i));
		}
		Assignment assignment = new Assignment(vars);
		for (int i = 0; i < variables.size(); i++) {
			String variable = (String) variables.get(i);
			Object randomValue = Util.selectRandomlyFromList(domains
					.getDomainOf(variable));
			// System.out.println("in generate Assignment setting");
			assignment.setAssignment(variable, randomValue);
		}
		return assignment;
	}

}