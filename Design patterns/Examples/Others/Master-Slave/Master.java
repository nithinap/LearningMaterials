package com.blueprint.patterns.buschmann.design.master_slave;

public class Master
{
	private Slave slaveA;
	private Slave slaveB;

	public Slave getSlaveA()
	{
		return slaveA;
	}

	public Slave getSlaveB()
	{
		return slaveB;
	}

	public void setSlaveA( Slave slave )
	{
		slaveA = slave;
	}

	public void setSlaveB( Slave slave )
	{
		slaveB = slave;
	}

	/**
	 * Add methods to delegate work to slaves.
	 */
}