package com.massivecraft.wess;

import java.util.Iterator;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.util.BlockIterator;

import com.massivecraft.mcore.cmd.MCommand;
import com.massivecraft.mcore.cmd.req.ReqHasPerm;
import com.massivecraft.mcore.util.Txt;

public class CmdWess extends MCommand
{
	public CmdWess()
	{
		super();
		
		this.addAliases("ss", "wess");
		
		this.addRequirements(new ReqHasPerm(Permission.DO.node));
	}

	@Override
	public void perform()
	{
		// Find the sign we face
		Sign sign = findFacedSign(me, true);
		if (sign == null) return;
		
		// Extract the name by concatenating the lines on the sign
		String name = "";
		for (String line : sign.getLines())
		{
			name += line.trim();
		}
		
		// Check length
		if (name.length() == 0)
		{
			msg("<b>That sign is empty.");
			return;
		}
		
		// Make the player say the command
		msg("<c>//schematic save mcedit <h>%s", name);
		me.performCommand("/schematic save mcedit "+name);
	}
	
	public static Sign findFacedSign(Player player, boolean verboose)
	{
		Sign ret = null;
		
		Iterator<Block> itr = new BlockIterator(player, 128);
		while (itr.hasNext())
		{
			Block block = itr.next();
			if (block == null)
			{
				break;
			}
			
			if (block.getType() == Material.SIGN || block.getType() == Material.SIGN_POST)
			{
				ret = (Sign)block.getState();
				break;
			}
		}
		
		if (ret == null && verboose)
		{
			player.sendMessage(Txt.parse("<b>You are not facing any sign :/"));
		}
		
		return ret;
	}
	
}
