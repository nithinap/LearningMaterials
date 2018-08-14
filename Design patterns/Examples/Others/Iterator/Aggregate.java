/**
 * See page 259 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.iterator;

/**
 * Defines an interface for creating an Iterator object.
 */

public interface Aggregate
{
	Iterator createIterator();
}