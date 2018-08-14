/**
 * See page 225 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.chain_of_responsibility;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Handler handler1 = new ConcreteHandler1();
			Handler handler2 = new ConcreteHandler1();
			Handler handler3 = new ConcreteHandler1();
			Handler handler4 = new ConcreteHandler1();

			handler1.setSuccessor( handler2 );
			handler2.setSuccessor( handler3 );
			handler3.setSuccessor( handler4 );

			handler1.handleRequest();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}