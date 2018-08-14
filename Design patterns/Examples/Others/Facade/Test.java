/**
 * See page 186 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.facade;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Facade facade = new Facade();
			facade.go();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}