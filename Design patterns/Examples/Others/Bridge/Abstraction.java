/**
 * See page 153 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.bridge;

/**
 * Defines the abstraction's interface. Maintains a reference
 * to an object of type Implementor.
 */

public class Abstraction
{
	private Implementor implementor;

	public void setImplementor( Implementor implementor )
	{
		this.implementor = implementor;
	}

	public Implementor getImplementor()
	{
		return implementor;
	}

	public void operation()
	{
		implementor.operation();
	}
}
