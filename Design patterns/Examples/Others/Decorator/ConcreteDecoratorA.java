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

public class ConcreteDecoratorA extends Decorator
{
	private int addedState = 42;

	public void operation()
	{
		super.operation();
		
		// Action with new state.
	}
}