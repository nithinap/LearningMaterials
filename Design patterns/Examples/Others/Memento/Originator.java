/**
 * See page 285 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.memento;

/**
 * Creates a memento containing a snapshot of its current
 * internal state. Uses the memento to restore its internal
 * state.
 */

public class Originator
{
	private State state;

	public void setMemento( Memento memento )
	{
		state = memento.getState();
	}

	public Memento createMemento()
	{
		return new Memento( state );
	}
}