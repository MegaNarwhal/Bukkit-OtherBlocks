package com.gmail.zariust.bukkit.otherblocks.options.tool;

import com.gmail.zariust.bukkit.otherblocks.options.drop.ItemType;

public interface Agent {
	boolean matches(Agent other);

	ItemType getType();
	
	public void damage(int amount);

	public void damageTool(short amount);
	
	public void damageTool();
}