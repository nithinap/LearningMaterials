/**
 * See page 209 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.proxy;

/**
 * Defines the real object that the proxy represents.
 */

public class RealSubject implements Subject
{
	public void request()
	{
		// Do something based on the interface.
	}
}