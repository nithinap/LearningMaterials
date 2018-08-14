/**
 * See page 153 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.bridge;

/**
 * Defines the interface for implementation classes. This
 * interface doesn't have to correspond exactly to Abstraction's
 * interface; in fact the two interfaces can be quite different.
 * Typically the Implementor interface provides only primitive
 * operations, and Abstraction defines higher-level operations
 * based on these primitives.
 */

public interface Implementor
{
	void operation();
}