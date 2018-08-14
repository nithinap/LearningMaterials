/**
 * See page 294 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.observer;

/**
 * Imports
 */

import java.util.Vector;

/**
 * Knows its observers. Any number of Observer objects may
 * observe a subject.
 */

public class Subject
{
	private Vector observers = new Vector();

	public void attach( Observer observer )
	{
		if( observers.contains( observer ) == false )
		{
			observers.addElement( observer );
		}
	}

	public boolean detach( Observer observer )
	{
		return observers.removeElement( observer );
	}

	public void notifyObservers()
	{
		// Synchronous update. Beware, this mechanism will block
		// as each observer is updated. Depending on how sensitive your
		// code is to blocking, you may want to kick-off a thread for
		// each observer that requires notification and then wait for
		// all threads to complete.

		for( int i = 0; i < observers.size(); ++i )
		{
			Observer observer = (Observer) observers.elementAt(i);
			observer.update();
		}
	}
}