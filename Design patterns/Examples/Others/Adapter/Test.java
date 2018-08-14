/**
 * See page 141 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.class_adapter;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Adapter adapter = new Adapter();
			adapter.request();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}
