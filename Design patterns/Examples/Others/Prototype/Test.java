/**
 * See page 119 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.prototype;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Client client = new Client();
			Prototype copy = client.operation();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}