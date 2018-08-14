/**
 * See page 236 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.command;

/**
 * Defines a binding between a Receiver object and an
 * action. Implements Execute by invoking the corresponding
 * operation on Receiver.
 */

public class ConcreteCommand implements Command
{
	private Receiver receiver;

	public void setReceiver( Receiver receiver )
	{
		this.receiver = receiver;
	}

	public Receiver getReceiver()
	{
		return receiver;
	}

	public void execute()
	{
		receiver.action();
	}
}