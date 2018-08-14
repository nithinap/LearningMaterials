/**
 * See page 236 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.command;

/**
 * Knows how to perform the operations associated with
 * carrying out a request. Any class may serve as a Receiver.
 */

public interface Receiver
{
	void action();
}
