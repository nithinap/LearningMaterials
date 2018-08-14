package com.blueprint.patterns.buschmann.design.forwarder;

public class Receiver
{
	private Forwarder forwarder;

	public Forwarder getForwarder()
	{
		return forwarder;
	}

	public void setForwarder( Forwarder forwarder )
	{
		this.forwarder = forwarder;
	}
}