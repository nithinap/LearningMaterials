/**
 * See page 306 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.state;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			State state = new ConcreteStateA();
			Context context = new Context();
			context.setState( state );
			context.request();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}
