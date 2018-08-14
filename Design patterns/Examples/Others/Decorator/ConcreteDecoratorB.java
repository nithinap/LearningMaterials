/**
 * See page 177 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.decorator;

/**
 * Adds responsibilities to the component.
 */

public class ConcreteDecoratorB extends Decorator
{
	public void operation()
	{
		super.operation();
		addedBehavior();
	}

	protected void addedBehavior()
	{
		// Do something new.
	}
}