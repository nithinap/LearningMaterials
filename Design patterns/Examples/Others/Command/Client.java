/**
 * See page 236 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.command;

/**
 * Creates a ConcreteCommand object and specifies its receiver.
 */

public class Client
{
	public Command setup()
	{
		Command command = new ConcreteCommand();
		Receiver receiver = new ConcreteReceiver();
		command.setReceiver( receiver );

		// We return the command so that the Invoker may use it.

		return command;
	}
}