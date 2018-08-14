package com.blueprint.patterns.buschmann.design.dispatcher;

public class Dispatcher
{
	private Server server;
	private Client client;

	public Server getServer()
	{
		return server;
	}

	public void setServer( Server server )
	{
		this.server = server;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient( Client client )
	{
		this.client = client;
	}
}
