/**
 * See page 119 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.prototype;

/**
 * Implements an operation for cloning itself.
 */

public class ConcretePrototype2 implements Prototype
{
	private int state1;
	private int state2;

	public Prototype copy()
	{
		ConcretePrototype2 duplicate = new ConcretePrototype2();
		duplicate.setState1( state1 );
		duplicate.setState2( state2 );
		return duplicate;
	}

	public void setState1( int state )
	{
		state1 = state;
	}

	public void setState2( int state )
	{
		state2 = state;
	}
}