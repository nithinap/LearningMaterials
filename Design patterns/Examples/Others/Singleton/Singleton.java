/**
 * See page 127 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.singleton;

/**
 * Defines an Instance operation that lets clients access
 * its unique instance. Instance is a class operation
 * (that is, a class method in Smalltalk and a static member
 * function is C++). May be responsible for creating its own
 * instance.
 */

public class Singleton
{
	private static Singleton instance = null;
	public static Singleton getSingleton()
	{
		if( instance == null )
		{
			instance = new Singleton();
		}
		return instance;
	}
}