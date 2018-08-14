package com.blueprint.patterns.buschmann.design.forwarder;

public class Peer
{
	private Forwarder forwarder;
	private Receiver receiver;

	public Forwarder getForwarder()
	{
		return forwarder;
	}

	public void setForwarder( Forwarder forwarder )
	{
		this.forwarder = forwarder;
	}

	public Receiver getReceiver()
	{
		return receiver;
	}

	public void setReceiver( Receiver receiver )
	{
		this.receiver = receiver;
	}
}