package com.massivecraft.wess;

import org.bukkit.command.CommandSender;

import com.massivecraft.mcore5.util.PermUtil;

public enum Permission
{
	DO("do"),
	;
	
	public final String node;
	
	Permission(final String permissionNode)
	{
		this.node = "wess."+permissionNode;
    }
	
	public boolean has(CommandSender sender, boolean informSenderIfNot)
	{
		return PermUtil.has(sender, this.node, informSenderIfNot);
	}
	
	public boolean has(CommandSender sender)
	{
		return has(sender, false);
	}
}
