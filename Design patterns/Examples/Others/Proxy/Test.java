/**
 * See page 209 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.proxy;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Subject real = new RealSubject();
			Proxy proxy = new Proxy();
			proxy.setRealSubject( real );
			proxy.request();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}