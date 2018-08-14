/**
 * See page 209 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.structural.proxy;

/**
 * Defines the common interface for RealSubject and Proxy so that
 * a Proxy can be used anywhere a RealSubject is expected.
 */

public interface Subject
{
	void request();
}
