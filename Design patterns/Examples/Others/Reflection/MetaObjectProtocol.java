package com.blueprint.patterns.buschmann.architectural.reflection;

public class MetaObjectProtocol
{
	private MetaLevel metaLevel = null;
	private BaseLevel baseLevel = null;

	public MetaLevel getMetaLevel()
	{
		return metaLevel;
	}

	public void setMetaLevel( MetaLevel metaLevel )
	{
		this.metaLevel = metaLevel;
	}

	public BaseLevel getBaseLevel()
	{
		return baseLevel;
	}

	public void setBaseLevel( BaseLevel baseLevel )
	{
		this.baseLevel = baseLevel;
	}
}