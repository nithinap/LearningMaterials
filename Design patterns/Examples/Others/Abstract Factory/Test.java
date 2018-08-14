/**
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.abstract_factory;

/**
 * Test class for the abstract factory pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			AbstractFactory factory = new ConcreteFactory1();
			AbstractProductA productA = factory.createProductA();
			AbstractProductB productB = factory.createProductB();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}