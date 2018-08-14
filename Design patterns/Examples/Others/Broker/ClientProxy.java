package com.blueprint.patterns.buschmann.architectural.broker;

public class ClientProxy
{
	private Client client = null;
	private Broker broker = null;

	public Client getClient()
	{
		return client;
	}

	public void setClient( Client client )
	{
		this.client = client;
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
