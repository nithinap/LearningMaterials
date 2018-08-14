package com.blueprint.patterns.buschmann.architectural.microkernel;

public class ExternalServer
{
	private Microkernel kernel = null;

	public Microkernel getKernel()
	{
		return kernel;
	}

	public void setKernel( Microkernel kernel )
	{
		this.kernel = kernel;
	}
}
