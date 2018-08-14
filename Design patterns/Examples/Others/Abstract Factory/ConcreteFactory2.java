/**
 * See page 88 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.abstract_factory;

/**
 * Implements the operations to create concrete product objects.
 */

public class ConcreteFactory2 implements AbstractFactory
{
	public AbstractProductA createProductA() { return new ProductA2(); };
	public AbstractProductB createProductB() { return new ProductB2(); };
}