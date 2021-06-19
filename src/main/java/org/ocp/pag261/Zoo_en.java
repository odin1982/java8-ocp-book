package org.ocp.pag261;

import java.util.ListResourceBundle;

//APUNTES-Usar una clase como properties o resurce boundle
public class Zoo_en extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{"hello","Hello"},
			{"open","The zoo is open"}
		};
	}
	
}
