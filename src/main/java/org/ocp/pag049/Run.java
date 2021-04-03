package org.ocp.pag049;

public interface Run extends Walk{
	public abstract boolean canHuntWhileRunning();
	abstract double getMaxSpeed();
}
