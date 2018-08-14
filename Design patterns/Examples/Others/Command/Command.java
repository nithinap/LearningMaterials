/**
 * See page 236 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.command;

/**
 * Declares an interface for executing an operation.
 */

public interface Command
{
	void setReceiver( Receiver receiver );
	Receiver getReceiver();
	void execute();
}