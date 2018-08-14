package com.blueprint.patterns.buschmann.architectural.reflection;

public class MetaLevel
{
	private BaseLevel baseLevel = null;

	public BaseLevel getBaseLevel()
	{
		return baseLevel;
	}

	public void setBaseLevel( BaseLevel baseLevel )
	{
		this.baseLevel = baseLevel;
	}
}
