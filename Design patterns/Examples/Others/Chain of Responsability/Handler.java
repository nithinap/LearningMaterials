/**
 * See page 225 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.chain_of_responsibility;

/**
 * Defines an interface for handling requests. Implements the
 * successor link.
 */

public class Handler
{
	private Handler successor;

	public void setSuccessor( Handler successor )
	{
		this.successor = successor;
	}

	public Handler getSuccessor()
	{
		return successor;
	}

	public void handleRequest()
	{
		successor.handleRequest();
	}
}