/**
 * See page 186 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.facade;

/**
 * Knows which subsystem classes are responsible for
 * a request. Delegates clients requests to appropriate
 * subsystem objects.
 */

public class Facade
{
	private Subsystem1 sub1 = new Subsystem1();
	private Subsystem2 sub2 = new Subsystem2();
	private Subsystem3 sub3 = new Subsystem3();

	public void go()
	{
		sub1.doWork();
		sub2.doWork();
		sub3.doWork();
	}
}