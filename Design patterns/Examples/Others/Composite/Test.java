/**
 * See page 164 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.composite;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Composite composite = new Composite();
			Leaf leaf1 = new Leaf();
			Leaf leaf2 = new Leaf();
			composite.add( leaf1 );
			composite.add( leaf2 );
			composite.operation();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}
