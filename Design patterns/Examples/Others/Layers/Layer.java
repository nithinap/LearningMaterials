package com.blueprint.patterns.buschmann.architectural.layers;

public class Layer
{
	private Layer successor = null;

	public Layer getSuccessor()
	{
		return successor;
	}

	public void setSuccessor( Layer successor )
	{
		this.successor = successor;
	}
}