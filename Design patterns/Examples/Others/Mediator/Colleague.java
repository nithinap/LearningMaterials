/**
 * See page 276 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.mediator;

/**
 * Each Colleague class knows its Mediator object. Each Colleague
 * communicates with its mediator whenever it would have otherwise
 * communicated with another colleague.
 */

public class Colleague
{
	private Mediator mediator;

	public Mediator getMediator()
	{
		return mediator;
	}

	public void setMediator( Mediator mediator )
	{
		this.mediator = mediator;
	}
}