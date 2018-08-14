/**
 * See page 259 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.iterator;

/**
 * Imports
 */

import java.util.Vector;

/**
 * Implements the Iterator creation interface to return
 * an instance of the proper ConcreteIterator.
 *
 * This aggregate will built using a vector from
 * the JDK. Therefore,the Iterator for this aggregate
 * is fairly straightforward. Your aggregate may differ.
 */

public class ConcreteAggregate implements Aggregate
{
	public Vector storage = new Vector();

	public Iterator createIterator()
	{
		return new ConcreteIterator( this );
	}
}