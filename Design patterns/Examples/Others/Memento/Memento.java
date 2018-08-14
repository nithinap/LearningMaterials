/**
 * See page 285 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.memento;

/**
 * Stores internal state of the Originator object. The memento
 * may store as much or as little of the originator's internal
 * state as necessary at its originator's discretion.
 */

public class Memento
{
	private State state = null;

	public Memento( State state )
	{
		this.state = state;
	}

	public State getState()
	{
		return state;
	}

	public void setState( State state )
	{
		this.state = state;
	}
}
