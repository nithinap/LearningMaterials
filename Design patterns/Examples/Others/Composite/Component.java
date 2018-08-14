/**
 * See page 164 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.composite;

/**
 * Declares the interface for objects in the composition. Declares
 * an interface for accessing and managing its child components.
 */

public interface Component
{
	void operation();
	void add( Component component );
	boolean remove( Component component );
	Component getChild( int index );
}
