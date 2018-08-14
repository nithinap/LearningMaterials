/**
 * See page 294 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.observer;

/**
 * Stores state fo interest to ConcreteObserver objects. Sends
 * a notification to its observers when its state change.
 */

public class ConcreteSubject extends Subject
{
	public int getState()
	{
		return 1;
	}
}