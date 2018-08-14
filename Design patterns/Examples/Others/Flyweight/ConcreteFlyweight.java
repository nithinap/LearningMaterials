/**
 * See page 198 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.flyweight;

/**
 * Implements the Flyweight interface and adds storage for
 * intrinsic state, if any. A ConcreteFlyweight object must be
 * sharable. Any state it stores must be intrinsic; that is, it
 * must be independent of the ConcreteFlyweight object's context.
 */

public class ConcreteFlyweight implements Flyweight
{
	private IntrinsicState state;

	public void operation( ExtrinsicState state )
	{
	}
}