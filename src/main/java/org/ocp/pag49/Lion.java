package org.ocp.pag49;

public class Lion implements Run{

	@Override
	public boolean isQuadruped() {
		return true;
	}

	@Override
	public boolean canHuntWhileRunning() {
		return true;
	}

	@Override
	public double getMaxSpeed() {
		return 100;
	}

}
