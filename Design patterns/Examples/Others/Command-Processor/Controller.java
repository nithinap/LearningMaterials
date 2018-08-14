package com.blueprint.patterns.buschmann.design.command_processor;

public class Controller
{
	private CommandProcessor processor;
	private Command command;

	public CommandProcessor getProcessor()
	{
		return processor;
	}

	public void setProcessor( CommandProcessor processor )
	{
		this.processor = processor;
	}

	public Command getCommand()
	{
		return command;
	}

	public void setCommand( Command command )
	{
		this.command = command;
	}
}