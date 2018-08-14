/**
 * See page 88 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.abstract_factory;

/**
 * Declares an interface for operations that create
 * abstract product objects.
 */

public interface AbstractFactory
{
	AbstractProductA createProductA();
	AbstractProductB createProductB();
}
