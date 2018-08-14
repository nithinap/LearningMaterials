package com.blueprint.patterns.buschmann.architectural.reflection;

public class BaseLevel
{
	private MetaLevel metaLevel = null;

	public MetaLevel getMetaLevel()
	{
		return metaLevel;
	}

	public void setMetaLevel( MetaLevel metaLevel )
	{
		this.metaLevel = metaLevel;
	}
}
