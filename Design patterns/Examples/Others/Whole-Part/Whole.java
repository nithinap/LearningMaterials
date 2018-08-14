package com.blueprint.patterns.buschmann.design.whole_part;

public class Whole
{
	private Part partA;
	private Part partB;

	public void setPartA( Part part )
	{
		partA = part;
	}

	public void setPartB( Part part )
	{
		partB = part;
	}

	public Part getPartA()
	{
		return partA;
	}

	public Part getPartB()
	{
		return partB;
	}

	/**
	 * Add public methods to support using the parts.
	 */
}
