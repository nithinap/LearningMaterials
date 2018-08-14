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

public class ConcretePrototype1 implements Prototype
{
	private String state1 = "Blueprint";
	private Prototype state2;

	public Prototype copy()
	{
		ConcretePrototype1 duplicate = new ConcretePrototype1();
		duplicate.setState1( new String( state1 ));
		if( state2 != null )
		{
			duplicate.setState2( state2.copy() );
		}
		return duplicate;
	}

	void setState1( String state )
	{
		state1 = state;
	}

	void setState2( Prototype state )
	{
		state2 = state;
	}
}
