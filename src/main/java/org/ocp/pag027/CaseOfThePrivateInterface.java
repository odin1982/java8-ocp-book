package org.ocp.pag027;

public class CaseOfThePrivateInterface {
	private interface Secret{
		public void shh();
	}
	
	class DontTell implements Secret{
		public void shh() {}
	}
}
