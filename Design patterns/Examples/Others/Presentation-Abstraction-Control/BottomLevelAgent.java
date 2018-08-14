package com.blueprint.patterns.buschmann.architectural.pac;

public class BottomLevelAgent
{
	private TopLevelAgent topAgent = null;
	private IntermediateLevelAgent intermediateAgent = null;

	public TopLevelAgent getTopAgent()
	{
		return topAgent;
	}

	public void setTopAgent( TopLevelAgent agent )
	{
		topAgent = agent;
	}

	public IntermediateLevelAgent getIntermediateAgent()
	{
		return intermediateAgent;
	}

	public void setIntermediateAgent( IntermediateLevelAgent agent )
	{
		intermediateAgent = agent;
	}
}