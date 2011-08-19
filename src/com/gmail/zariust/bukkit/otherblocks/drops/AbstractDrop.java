package com.gmail.zariust.bukkit.otherblocks.drops;

import java.util.Random;

import org.bukkit.Location;

import com.gmail.zariust.bukkit.otherblocks.options.action.Action;
import com.gmail.zariust.bukkit.otherblocks.options.target.Target;

public abstract class AbstractDrop {
	private Target block;
	private Action action;
	
	protected static Random rng = new Random();

	public AbstractDrop(Target targ, Action act) {
		block = targ;
		action = act;
	}
	
	public abstract boolean matches(AbstractDrop other);

	public void setTarget(Target targ) {
		this.block = targ;
	}

	public Target getTarget() {
		return block;
	}

	public void setAction(Action act) {
		this.action = act;
	}

	public Action getAction() {
		return action;
	}

	public boolean basicMatch(AbstractDrop other) {
		if(!block.matches(other.block)) return false;
		if(!action.equals(other.action)) return false;
		return true;
	}
	
	static public int hashCode(Object type, int v, int data) 	{
		short t = type == null ? (short) 0 : (short) type.hashCode();
		return (v << 16) | t | (data << 3);
	}
}