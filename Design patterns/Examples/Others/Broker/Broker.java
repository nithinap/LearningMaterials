package com.blueprint.patterns.buschmann.architectural.broker;

public class Broker
{
	private Client client = null;
	private Server server = null;
	private ClientProxy clientProxy = null;
	private ServerProxy serverProxy = null;
	private Bridge bridge = null;

	public Client getClient()
	{
		return client;
	}

	public void setClient( Client client )
	{
		this.client = client;
	}

	public Server getServer()
	{
		return server;
	}

	public void setServer( Server server )
	{
		this.server = server;
	}

	public ClientProxy getClientProxy()
	{
		return clientProxy;
	}

	public void setClientProxy( ClientProxy clientProxy )
	{
		this.clientProxy = clientProxy;
	}

	public ServerProxy getServerProxy()
	{
		return serverProxy;
	}

	public void setServerProxy( ServerProxy serverProxy )
	{
		this.serverProxy = serverProxy;
	}

	public Bridge getBridge()
	{
		return bridge;
	}

	public void setBridge( Bridge bridge )
	{
		this.bridge = bridge;
	}
}