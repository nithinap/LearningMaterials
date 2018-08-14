/**
 * See page 177 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.decorator;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Decorator decorator = new Decorator();
			decorator.setComponent( new ConcreteComponent() );
			decorator.operation();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}