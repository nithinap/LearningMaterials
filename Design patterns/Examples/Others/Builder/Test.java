/**
 * See page 98 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.builder;

/**
 * Test code for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			ConcreteBuilder builder = new ConcreteBuilder();
			Director director = new Director( builder );
			director.construct();
			Product product = builder.getResult();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
