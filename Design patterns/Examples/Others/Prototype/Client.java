/**
 * See page 119 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.prototype;

/**
 * Creates a new object by asking a prototype to clone itself.
 */

public class Client
{
	public Prototype operation()
	{
		Prototype prototype = new ConcretePrototype1();
		Prototype copy = prototype.copy();
		return copy;
	}
}