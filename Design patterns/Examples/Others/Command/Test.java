/**
 * See page 236 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.command;

/**
 * Test driver for the pattern.
 */

public class Test
{
	public static void main( String arg[] )
	{
		try
		{
			Client client = new Client();
			Command command = client.setup();
			command.execute();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}