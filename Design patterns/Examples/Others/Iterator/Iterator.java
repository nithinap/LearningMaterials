/**
 * See page 259 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.iterator;

/**
 * Defines an interface for accessing and traversing elements.
 */

public interface Iterator
{
	Object first() throws IndexOutOfBoundsException;
	Object next() throws IndexOutOfBoundsException;
	boolean isDone();
	Object currentItem() throws IndexOutOfBoundsException;
}