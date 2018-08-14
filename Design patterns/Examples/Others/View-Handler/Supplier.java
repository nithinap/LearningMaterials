package com.blueprint.patterns.buschmann.design.view_handler;

public class Supplier
{
	private SpecificView view;
	private ViewHandler handler;

	public SpecificView getView()
	{
		return view;
	}

	public void setView( SpecificView view )
	{
		this.view = view;
	}

	public ViewHandler getHandler()
	{
		return handler;
	}

	public void setHandler( ViewHandler handler )
	{
		this.handler = handler;
	}
}