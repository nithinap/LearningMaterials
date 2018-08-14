/**
 * See page 306 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.state;

/**
 * Defines an interface for encapsulating the behavior
 * associated with a particular state of the Context.
 */

public interface State
{
	void handle();
}