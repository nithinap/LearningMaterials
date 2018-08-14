/**
 * See page 127 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.singleton;

/**
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Singleton instance = Singleton.getSingleton();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}