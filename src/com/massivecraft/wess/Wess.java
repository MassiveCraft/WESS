package com.massivecraft.wess;

import com.massivecraft.massivecore.MassivePlugin;

public class Wess extends MassivePlugin
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static Wess i;
	public static Wess get() { return i; }
	public Wess() { Wess.i = this; }
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void onEnableInner()
	{
		// Activate
		this.activate(
			// Command
			CmdWess.class
		);
	}
	
}
