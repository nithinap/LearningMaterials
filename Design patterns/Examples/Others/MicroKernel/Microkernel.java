package com.blueprint.patterns.buschmann.architectural.microkernel;

public class Microkernel
{
	private InternalServer internalServer = null;

	public InternalServer getInternalServer()
	{
		return internalServer;
	}

	public void setInternalServer( InternalServer server )
	{
		internalServer = server;
	}
}