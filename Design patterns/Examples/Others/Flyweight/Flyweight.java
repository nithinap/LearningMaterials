/**
 * See page 198 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.flyweight;

/**
 * Declares an interface through which flyweights can receive
 * and act on extrinsic state.
 */

public interface Flyweight
{
	void operation( ExtrinsicState state );
}