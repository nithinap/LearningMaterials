/**
 * See page 119 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.prototype;

/**
 * Declares an interface for cloning itself.
 */

public interface Prototype
{
	Prototype copy();
}