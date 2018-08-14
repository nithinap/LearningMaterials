/**
 * See page 245 of DESIGN PATTERNS [1995].
 * Implemented by Blueprint Technologies, Inc.
 */

/**
 * Package
 */

package com.blueprint.patterns.gamma.behavioral.interpreter;

/**
 * One such class is required for every rule in the
 * grammar. Maintains instance variables of type AbstractExpression
 * for each of the symbols.
 */

public class NonterminalExpression implements AbstractExpression
{
	private AbstractExpression successor;

	public void setSuccessor( AbstractExpression successor )
	{
		this.successor = successor;
	}

	public AbstractExpression getSuccessor()
	{
		return successor;
	}

	public void interpret( Context context )
	{
	}
}