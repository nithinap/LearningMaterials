/**
 * See page 164 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.composite;

/**
 * Imports
 */

import java.util.Vector;

/**
 * Defines behavior for components having children. Stores
 * child components. Implements child-related operations in
 * the Component interface.
 */

public class Composite implements Component
{
	private Vector children = new Vector();

	public void operation()
	{
		int i;
		for( i = 0; i < children.size(); ++i )
		{
			Component component = (Component) children.elementAt(i);
			component.operation();
		}
	}

	public void add( Component component )
	{
		children.addElement( component );
	}

	public boolean remove( Component component )
	{
		return children.removeElement( component );
	}

	public Component getChild( int index )
	{
		return (Component) children.elementAt(index);
	}
}
