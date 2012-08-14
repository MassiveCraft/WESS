package com.massivecraft.wess;

import com.massivecraft.mcore4.MPlugin;

public class P extends MPlugin
{
	// Our single plugin instance
	public static P p;
	
	// Command
	public CmdWess cmdWess;
	
	public P()
	{
		P.p = this;
	}
	
	@Override
	public void onEnable()
	{
		if ( ! preEnable()) return;
		
		// Add Base Commands
		this.cmdWess = new CmdWess();
		this.cmdWess.register();
		
		postEnable();
	}
}
