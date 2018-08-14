/**
 * See page 225 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.chain_of_responsibility;

/**
 * Handles requests it is responsible for. Can access its
 * successor. If the ConcreteHandler can handle the request,
 * it does so; otherwise it forwards the request to its
 * successor.
 */

public class ConcreteHandler1 extends Handler
{
	public void handleRequest()
	{
		if( /* We should handle this == */ true )
		{
			// Handle the request.
		}
		else
		getSuccessor().handleRequest();
	}
}