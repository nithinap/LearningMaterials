/**
 * See page 198 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.flyweight;

/**
 * Imports
 */

import java.util.Hashtable;

/**
 * Creates and manages flyweight objects. Ensures that flyweights
 * are shared properly. When a client requests a flyweight, the
 * Flyweight Factory object supplies an existing instance or
 * creates one, if none exists.
 */

public class FlyweightFactory
{
	private Hashtable flyweights = new Hashtable();

	public Flyweight getFlyweight( Object key )
	{
		Flyweight flyweight = (Flyweight) flyweights.get(key);
		if( flyweight == null )
		{
			flyweight = new ConcreteFlyweight();
			flyweights.put( key, flyweight );
		}
		return flyweight;
	}
}
