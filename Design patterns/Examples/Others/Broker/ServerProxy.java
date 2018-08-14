package com.blueprint.patterns.buschmann.architectural.broker;

public class ServerProxy
{
	private Server server = null;
	private Broker broker = null;

	public Server getServer()
	{
		return server;
	}

	public void setServer( Server server )
	{
		this.server = server;
	}

	public Broker getBroker()
	{
		return broker;
	}

	public void setBroker( Broker broker )
	{
		this.broker = broker;
	}
}
