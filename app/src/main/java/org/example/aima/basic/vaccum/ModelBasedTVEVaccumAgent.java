package org.example.aima.basic.vaccum;

import org.example.aima.basic.Agent;

public class ModelBasedTVEVaccumAgent extends Agent {

	public ModelBasedTVEVaccumAgent() {
		super(new ModelBasedTVEVaccumAgentProgram(new VaccumEnvironmentModel()));

	}

}