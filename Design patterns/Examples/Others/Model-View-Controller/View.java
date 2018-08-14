package com.blueprint.patterns.buschmann.architectural.mvc;

public class View
{
	private Controller controller = null;
	private Model model = null;

	public Controller getController()
	{
		return controller;
	}

	public void setController( Controller controller )
	{
		this.controller = controller;
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