/**
 * See page 198 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.flyweight;

/**
 * Not all Flyweight subclasses need to be shared. The Flyweight
 * interface enables sharing; it doesn't enforce it. It's common
 * for UnsharedConcreteFlyweight objects to have ConcreteFlyweight
 * objects as children at some level in the flyweight object
 * structure.
 */

public class UnsharedConcreteFlyweight implements Flyweight
{
	public void operation( ExtrinsicState state )
	{
	}
}