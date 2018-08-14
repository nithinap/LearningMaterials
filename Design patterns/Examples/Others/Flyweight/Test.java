/**
 * See page 198 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.flyweight;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			FlyweightFactory factory = new FlyweightFactory();
			Flyweight fly1 = factory.getFlyweight( "Fred" );
			Flyweight fly2 = factory.getFlyweight( "Wilma" );
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}