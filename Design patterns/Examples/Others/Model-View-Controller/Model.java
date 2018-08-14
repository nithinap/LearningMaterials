package com.blueprint.patterns.buschmann.architectural.mvc;

public class Model
{
	private View view = null;
	private Controller controller = null;

	public View getView()
	{
		return view;
	}

	public void setView( View view )
	{
		this.view = view;
	}

	public Controller getController()
	{
		return controller;
	}

	public void setController( Controller controller )
	{
		this.controller = controller;
	}
}