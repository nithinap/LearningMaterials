/**
 * See page 259 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.iterator;

/**
 * Implements the Iterator interface. Keeps track of the
 * current position in the traversal of the aggregate.
 */

public class ConcreteIterator implements Iterator
{
	private ConcreteAggregate aggregate;
	private int index = 0;
	
	public ConcreteIterator( ConcreteAggregate aggregate )
	{
		this.aggregate = aggregate;
	}

	public Object first()
			throws IndexOutOfBoundsException
	{
		Object object = null;
		if( !aggregate.storage.isEmpty() )
		{
			index = 0;
			object = aggregate.storage.firstElement();
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}
		return object;
	}

	public Object next()
			throws IndexOutOfBoundsException
	{
		Object object = null;
		if( index + 1 < aggregate.storage.size() )
		{
			index += 1;
			object = aggregate.storage.elementAt(index);
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}
		return object;
	}

	public boolean isDone()
	{
		boolean result = false;
		if( aggregate.storage.isEmpty() || 
			index == aggregate.storage.size() - 1 )
		{
			result = true;
		}
		return result;
	}

	public Object currentItem()
			throws IndexOutOfBoundsException
	{
		Object object = null;
		if( index < aggregate.storage.size() )
		{
			object = aggregate.storage.elementAt( index );
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}
		return object;
	}
}