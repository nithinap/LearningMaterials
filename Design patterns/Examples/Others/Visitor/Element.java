/**
 * Copyright 1998 by Blueprint Technologies, Inc.
 * All rights reserved.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.visitor;

/**
 * See page 334 of Design Patterns, 1995.
 */

public interface Element
{
	void accept( Visitor visitor );
}