/**
 * See page 294 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.observer;

/**
 * Maintains a reference to a ConcreteSubject object. Stores
 * state that should stay consistent with the subject's.
 * Implements the Observer updating interface to keep its
 * state consistent with the subject's.
 */

public class ConcreteObserver implements Observer
{
	public void update()
	{
		System.out.println( "update() called." );
	}
}