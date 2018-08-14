/**
 * See page 245 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.interpreter;

/**
 * Declares an abstract Interpret operation that is common
 * to all nodes in the abstract syntax tree.
 */

public interface AbstractExpression
{
	void interpret( Context context );
}
