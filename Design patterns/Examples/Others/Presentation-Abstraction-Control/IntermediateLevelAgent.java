package com.blueprint.patterns.buschmann.architectural.pac;

public class IntermediateLevelAgent
{
	private TopLevelAgent topAgent = null;
	private IntermediateLevelAgent intermediateAgent = null;
	private BottomLevelAgent bottomAgent = null;

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

	public BottomLevelAgent getBottomAgent()
	{
		return bottomAgent;
	}

	public void setBottomAgent( BottomLevelAgent agent )
	{
		bottomAgent = agent;
	}
}