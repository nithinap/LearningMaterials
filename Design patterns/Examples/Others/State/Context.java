/**
 * See page 306 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.state;

/**
 * Defines the interface of interest to clients. Maintains
 * an instance of a ConcreteState subclass that defines the
 * current state.
 */

public class Context
{
	private State state;

	public void setState( State state )
	{
		this.state = state;
	}

	public State getState()
	{
		return state;
	}

	public void request()
	{
		state.handle();
	}
}