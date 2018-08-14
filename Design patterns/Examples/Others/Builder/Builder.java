/**
 * See page 98 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.creational.builder;

/**
 * Specifies an abstract interface for creating parts of
 * a Product object.
 */

public interface Builder
{
	void buildPartA();
	void buildPartB();
	void buildPartC();
	Product getResult();
}