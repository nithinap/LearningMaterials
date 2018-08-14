package com.blueprint.patterns.buschmann.architectural.microkernel;

public class Client
{
	private Adapter adapter = null;

	public Adapter getAdapter()
	{
		return adapter;
	}

	public void setAdapter( Adapter adapter )
	{
		this.adapter = adapter;
	}
}