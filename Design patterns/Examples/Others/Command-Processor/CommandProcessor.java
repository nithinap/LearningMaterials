package com.blueprint.patterns.buschmann.design.command_processor;

public class CommandProcessor
{
	private AbstractCommand command;

	public AbstractCommand getCommand()
	{
		return command;
	}

	public void setCommand( AbstractCommand command )
	{
		this.command = command;
	}
}