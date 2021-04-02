package org.ocp.pag49;

public interface Run extends Walk{
	public abstract boolean canHuntWhileRunning();
	abstract double getMaxSpeed();
}
