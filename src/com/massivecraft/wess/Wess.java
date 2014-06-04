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
	// FIELDS
	// -------------------------------------------- //
	
	// Commands
	private CmdWess cmdWess;
	public CmdWess getCmdWess() { return this.cmdWess; }
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void onEnable()
	{
		if ( ! preEnable()) return;
		
		// Commands
		this.cmdWess = new CmdWess();
		this.cmdWess.register();
		
		postEnable();
	}
	
}
