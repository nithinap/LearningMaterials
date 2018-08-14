package com.blueprint.patterns.buschmann.architectural.blackboard;

import java.util.Vector;

public class Control
{
	private Blackboard blackboard = null;
	private KnowledgeSource knowledgeSource = null;

	public Blackboard getBlackboard()
	{
		return blackboard;
	}

	public void setBlackboard( Blackboard blackboard )
	{
		this.blackboard = blackboard;
	}

	public  getKnowledgeSources()
	{
		return knowledgeSources;
	}

	public void setKnowledgeSources( Vector knowledgeSources )
	{
		this.knowledgeSources = knowledgeSources;
	}	
}
