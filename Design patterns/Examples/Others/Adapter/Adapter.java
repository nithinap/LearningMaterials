/**
 * See page 141 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.class_adapter;

/**
 * Adapts the interface of Adaptee to the Target interface.
 */

public class Adapter extends Adaptee implements Target
{
	public void request()
	{
		specificRequest();
	}
}