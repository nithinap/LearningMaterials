package com.blueprint.patterns.buschmann.architectural.broker;

public class Server
{
	private ServerProxy proxy = null;
	private Broker broker = null;

	/**
	 * Accessors for private members.
	 */

	public void setProxy( ServerProxy proxy )
	{
		this.proxy = proxy;
	}

	public ServerProxy getProxy()
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