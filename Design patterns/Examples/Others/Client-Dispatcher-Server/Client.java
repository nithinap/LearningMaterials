package com.blueprint.patterns.buschmann.design.dispatcher;

public class Client
{
	private Dispatcher dispatcher;
	private Server server;

	public Dispatcher getDispatcher()
	{
		return dispatcher;
	}

	public void setDispatcher( Dispatcher dispatcher )
	{
		this.dispatcher = dispatcher;
	}

	public Server getServer()
	{
		return server;
	}

	public void setServer( Server server )
	{
		this.server = server;
	}
}
