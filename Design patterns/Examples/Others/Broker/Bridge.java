package com.blueprint.patterns.buschmann.architectural.broker;

public class Bridge
{
	private Broker broker = null;
	private Bridge remoteBridge = null;

	public Broker getBroker()
	{
		return broker;
	}

	public void setBroker( Broker broker )
	{
		this.broker = broker;
	}

	public Bridge getRemoteBridge()
	{
		return remoteBridge;
	}

	public void setRemoteBridge( Bridge remoteBridge )
	{
		this.remoteBridge = remoteBridge;
	}
}