package com.massivecraft.wess;

import com.massivecraft.massivecore.MassivePlugin;

public class WESS extends MassivePlugin
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static WESS i;
	public static WESS get() { return i; }
	public WESS() { WESS.i = this; }
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void onEnableInner()
	{
		// Activate
		this.activateAuto();
	}
	
}
