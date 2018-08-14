/**
 * See page 259 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.iterator;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Aggregate aggregate = new ConcreteAggregate();
			Iterator iterator = aggregate.createIterator();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}