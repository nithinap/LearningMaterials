/**
 * See page 294 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.observer;

/**
 * Defines an updating interface for objects that should
 * be notified of changes in a subject.
 */

public interface Observer
{
	void update();
}