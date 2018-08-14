package com.blueprint.patterns.buschmann.design.dispatcher;

public class Server
{
	private Client client;
	private Dispatcher dispatcher;

	public Client getClient()
	{
		return client;
	}

	public void setClient( Client client )
	{
		this.client = client;
	}

	public Dispatcher getDispatcher()
	{
		return dispatcher;
	}

	public void setDispatcher( Dispatcher dispatcher )
	{
		this.dispatcher = dispatcher;
	}
}
