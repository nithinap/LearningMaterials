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

public class Test
{
	public static void main( String arg[] )
	{
		Subject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver();
		subject.attach( observer );
		subject.notify();
	}
}
