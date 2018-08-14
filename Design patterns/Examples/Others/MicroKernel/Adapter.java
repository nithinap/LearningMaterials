package com.blueprint.patterns.buschmann.architectural.microkernel;

public class Adapter
{
	private ExternalServer server = null;
	private Microkernel kernel = null;

	public ExternalServer getServer()
	{
		return server;
	}

	public void setServer( ExternalServer server )
	{
		this.server = server;
	}

	public Microkernel getKernel()
	{
		return kernel;
	}

	public void setKernel( Microkernel kernel )
	{
		this.kernel = kernel;
	}
}