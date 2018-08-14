package com.blueprint.patterns.buschmann.architectural.blackboard;

public class KnowledgeSource
{
	private Blackboard blackboard = null;

	public Blackboard getBlackboard()
	{
		return blackboard;
	}

	public void setBlackboard( Blackboard blackboard )
	{
		this.blackboard = blackboard;
	}
}