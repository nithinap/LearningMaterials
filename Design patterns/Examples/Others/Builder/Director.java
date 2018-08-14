/**
 * See page 98 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.builder;

/**
 * Constructs an object using the Builder interface.
 */

public class Director
{
	private Builder builder;

	public Director( Builder builder )
	{
		this.builder = builder;
	}

	public void construct()
	{
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
	}
}