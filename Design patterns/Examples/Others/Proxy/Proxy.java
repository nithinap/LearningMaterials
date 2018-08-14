/**
 * See page 209 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.proxy;

/**
 * Maintains a reference that lets the proxy access the real
 * subject. Proxy may refer to a Subject if the RealSubject
 * and Subject interfaces are the same. Provides an interface
 * identical to Subject's so that a proxy can by substituted
 * for the real subject.
 */

public class Proxy implements Subject
{
	private Subject realSubject;

	public void setRealSubject( Subject subject )
	{
		realSubject = subject;
	}

	public Subject getRealSubject()
	{
		// This may not be possible if the 
		// proxy is communicating over a network.

		return realSubject;
	}

	public void request()
	{
		// This is very simplified.
		// 
		// This could actually be a call to a different 
		// run-time environment locally, a machine over a 
		// TCP socket, or something completely different.

		realSubject.request();
	}
}
