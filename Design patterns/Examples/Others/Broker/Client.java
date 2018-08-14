package com.blueprint.patterns.buschmann.architectural.broker;

public class Client
{
	private ClientProxy proxy = null;
	private Broker broker = null;

	/**
	 * Accessors for private members.
	 */

	public void setProxy( ClientProxy proxy )
	{
		this.proxy = proxy;
	}

	public ClientProxy getProxy()
	{
		return proxy;
	}

	public void setBroker( Broker broker )
	{
		this.broker = broker;
	}

	public Broker getBroker()
	{
		return broker;
	}
}