package com.blueprint.patterns.buschmann.architectural.pac;

public class TopLevelAgent
{
	private IntermediateLevelAgent intermediateAgent = null;
	private BottomLevelAgent bottomAgent = null;

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