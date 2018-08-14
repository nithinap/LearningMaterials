/**
 * See page 164 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.composite;

/**
 * Represents leaf objects in the composition. A leaf
 * has no children. Defines behavior for primtive objects
 * in the composition.
 */

public class Leaf implements Component
{
	public void operation()
	{
	}

	public void add( Component component )
	{
	}

	public boolean remove( Component component )
	{
		return false;
	}

	public Component getChild( int index )
	{
		return null;
	}
}
