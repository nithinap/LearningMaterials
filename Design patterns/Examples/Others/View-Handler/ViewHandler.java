package com.blueprint.patterns.buschmann.design.view_handler;

public class ViewHandler
{
	private SpecificView view;

	public SpecificView getView()
	{
		return view;
	}

	public void setView( SpecificView view )
	{
		this.view = view;
	}
}
