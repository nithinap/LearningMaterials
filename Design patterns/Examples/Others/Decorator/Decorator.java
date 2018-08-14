/**
 * See page 177 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.decorator;

/**
 * Maintains a reference to a Component object and defines
 * an interface that conforms to Component's interface.
 */

public class Decorator implements Component
{
	private Component component;

	public void setComponent( Component component )
	{
		this.component = component;
	}

	public Component getComponent()
	{
		return component;
	}

	public void operation()
	{
		component.operation();
	}
}