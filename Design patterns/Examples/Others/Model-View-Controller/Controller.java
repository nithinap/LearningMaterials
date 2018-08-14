package com.blueprint.patterns.buschmann.architectural.mvc;

public class Controller
{
	private View view = null;
	private Model model = null;

	public View getView()
	{
		return view;
	}

	public void setView( View view )
	{
		this.view = view;
	}

	public Model getModel()
	{
		return model;
	}

	public void setModel( Model model )
	{
		this.model = model;
	}
}