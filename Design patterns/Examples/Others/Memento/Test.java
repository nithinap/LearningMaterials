/**
 * See page 285 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.memento;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Caretaker caretaker = new Caretaker();
			Originator originator = new Originator();
			Memento memento = originator.createMemento();
			caretaker.addElement( memento );
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}