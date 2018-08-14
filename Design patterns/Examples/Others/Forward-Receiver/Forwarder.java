package com.blueprint.patterns.buschmann.design.forwarder;

public class Forwarder
{
	private Receiver receiver;

	public Receiver getReceiver()
	{
		return receiver;
	}

	public void setReceiver( Receiver receiver)
	{
		this.receiver = receiver;
	}
}