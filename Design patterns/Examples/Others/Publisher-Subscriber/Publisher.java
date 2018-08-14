package com.blueprint.patterns.buschmann.design.publisher;

import java.util.Vector;

public class Publisher
{
	private Vector subscribers = new Vector();

	public void attach( Subscriber sub )
	{
		if( subscribers.contains(sub) == false )
		{
			subscribers.addElement( sub );
		}
	}

	public void detach( Subscriber sub )
	{
		subscribers.removeElement( sub );
	}

	public void updateAll()
	{
		for( int x = 0; x < subscribers.size(); ++x )
		{
			Subscriber sub = (Subscriber) subscribers.elementAt(x);
			sub.update();
		}
	}
}