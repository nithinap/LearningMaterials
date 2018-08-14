/**
 * See page 98 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.builder;

/**
 * Constructs and assembles parts of the product by
 * implementing the Builder interface. Defines and
 * keeps track of the representation it creates. Provides
 * an interface for retrieving the product.
 */

public class ConcreteBuilder implements Builder
{
	Part partA, partB, partC;

	public void buildPartA()
	{
		partA = null;
	};

	public void buildPartB()
	{ 
		partB = null;
	};

	public void buildPartC() 
	{ 
		partC = null;
	};

	public Product getResult()
	{ 
		return null;
	};
}