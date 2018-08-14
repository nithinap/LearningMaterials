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

public class ConcreteElementA
{
	public void accept( Visitor visitor )
	{
		visitor.visitConcreteElementA( this );
	}

	public void operationA()
	{
	}
}