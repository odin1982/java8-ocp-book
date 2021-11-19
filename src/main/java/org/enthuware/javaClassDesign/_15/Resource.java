package org.enthuware.javaClassDesign._15;

/*
 * Notes
 * - The statement new Resource().equals(new Object()); will not compile
 * 		Tenemos que ver que el metodo equals es un oveloading entonces no se esta llamando al metodo de la clase
 * 
 * - The statement new Resource().equals(new Object()); will throw a ClassCastException at runtime
 * 		No envia una excepcion ya que el metodo equals recibe un objeto tipo Object
 * 
 * - The statement new Resource().equals(new Resource); will always return true
 * 		Aqui si manda a llamar al metodo sobrecargado, pero notamos que es un metodo default si un objeto Resource esta en el mismo
 * 		paquete siempre devolveria true, pero si lo ponemos un objeto en otro paquete marcaria error por eso es incorrecta
*/
public class Resource {
	private String data = "DATA";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data = data == null ? "" : data;
	}
	
	boolean equals(Resource r) {
		return (r != null && r.getData().equals(this.getData()));
	}
	
}

