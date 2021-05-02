package org.ocp.pag109;

import org.ocp.pag110.Elephant;
import org.ocp.pag110.Robot;
import org.ocp.pag110.Zebra;

//crate = jaula
public class Crate<T> {
	private T contents;
	public T emptyCrate() {
		return contents;
	}
	
	public void packCrate(T contents) {
		this.contents = contents;
	}

	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate(elephant);
		Elephant inNewHome = crateForElephant.emptyCrate();
		
		Crate<Zebra> crateForZebra =  new Crate<>();
		
		Robot joeRobot =  new Robot();
		Crate<Robot> robotCrate = new Crate<>();
		robotCrate.packCrate(joeRobot);
		
		Robot atDestination = robotCrate.emptyCrate();
	}
}
