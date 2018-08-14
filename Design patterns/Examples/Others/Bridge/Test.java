/**
 * See page 153 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.bridge;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Abstraction abstraction = new RefinedAbstraction();
			Implementor implementor = new ConcreteImplementorB();
			abstraction.setImplementor( implementor );
			abstraction.operation();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}
