package com.blueprint.patterns.buschmann.design.command_processor;

public class Command implements AbstractCommand
{
	private Supplier supplier;

	public Supplier getSupplier()
	{
		return supplier;
	}

	public void setSupplier( Supplier supplier )
	{
		this.supplier = supplier;
	}
}