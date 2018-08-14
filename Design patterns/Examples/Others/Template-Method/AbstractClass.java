/**
 * Copyright 1998 by Blueprint Technologies, Inc.
 * All rights reserved.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.template_method;

/**
 * See page 327 of Design Patterns, 1995.
 */

public abstract class AbstractClass
{
	public void templateMethod()
	{
		primitiveOperation1();
		primitiveOperation2();
	}

	protected abstract void primitiveOperation1();
	protected abstract void primitiveOperation2();
}