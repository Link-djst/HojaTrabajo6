import java.util.*;

public class Sets<P> {
	private PatternFactory<P> factory = new PatternFactory<P>();
	private Set<P> web;
	private Set<P> java;
	private Set<P> cel;
	private Set<P> dummy;
	private Set<P> dummy2;
	
	/**
	 * 
	 * @param option Es el paramentro que recibe el constructor para enviar a factory el número de la opcion seleccionada por el usuario.
	 */
	public Sets(String option){
		this.web = factory.option(option);
		this.java = factory.option(option);
		this.cel = factory.option(option);
		this.dummy = factory.option(option);
		this.dummy2 = factory.option(option);
	}
	
	/**
	 * 
	 * @param n Es el parametro que se desea agregar a web.
	 */
	public void webSet(P n){
		this.web.add(n);
	}
	
	/**
	 * Imprime el arreglo de desarrolladores web.
	 */
	public void webPrint(){
		System.out.println(this.web);
	}
	
	/**
	 * 
	 * @param n Es el parametro que se desea agredar al arreglo de desarrolladores java.
	 */
	public void javaSet(P n){
		this.java.add(n);
	}
	
	/**
	 * Imprime el arreglo de desarrolladores java.
	 */
	public void javaPrint(){
		System.out.println(this.java);
	}
	
	/**
	 * 
	 * @param n Es el parametro que se desea agregar al arreglo de desarrolladores de celular.
	 */
	public void celSet(P n){
		this.cel.add(n);
	}
	
	/**
	 * Imprime el arreglo que contiene los desarrolladores de celular.
	 */
	public void celPrint(){
		System.out.println(this.cel);
	}
	
	/**
	 * Imprime el arreglo que contiene los desarrolladore que tienen experienia en java, web y celulares.
	 */
	public void p1(){
		dummy.addAll(web);
		dummy.retainAll(java);
		dummy.retainAll(cel);
		System.out.println("Desarrolladores con experiencia en Java, web y celulares "+dummy);
	}
	
	/**
	 * Imprime los desarroladores que tienen experiencia en java y que no tienen experiencia en web.
	 */
	public void p2(){
		dummy.clear();
		dummy.addAll(java);
		dummy.removeAll(web);
		System.out.println("Desarrolladores con experiencia en Java pero que no tengan experiencia en web. "+dummy);
	}
	
	/**
	 * Imprime los desarrolladores con experiencia en Web y Celulares, pero que no tengan experiencia en java.
	 */
	public void p3(){
		dummy.clear();
		dummy.addAll(web);
		dummy.retainAll(cel);
		dummy.removeAll(java);
		System.out.println("Desarrolladores con experiencia en Web y Celulares, pero que no tengan experiencia en java. "+dummy);
	}
	
	/**
	 * Imprime los desarrolladores con experiencia en Web o Celulares (unión de Web y Celulares), pero que no tengan experiencia en java.
	 */
	public void p4(){
		dummy.clear();
		dummy.addAll(web);
		dummy.addAll(cel);
		dummy.removeAll(java);
		System.out.println("Desarrolladores con experiencia en Web o Celulares (unión de Web y Celulares), pero que no tengan experiencia en java. "+dummy);
	}
	
	/**
	 * Imprime si el conjunto de desarrolladores Java ES o NO es un subconjunto de Desarrolladores Web.
	 */
	public void p5(){
		dummy.clear();
		dummy.addAll(web);
		if(dummy.containsAll(java)){
			System.out.println("El conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web.");
		} else {
			System.out.println("El conjunto de desarrolladores Java NO es un subconjunto de Desarrolladores Web.");
		}
	}
	
	/**
	 * Imprime que conjunto tiene mayor cantidad de programadores y los imprime en orden ascendente(De A a Z).
	 */
	public void p6(){
		if(web.size()<java.size()){
			if(java.size()<cel.size()){
				System.out.println("El conjunto de Desarrolladores de Celulares es el mayor");
				System.out.println(cel);
			} else {
				System.out.println("El conjunto de Desarrolladores de Java es el mayor");
				System.out.println(java);
			}
		} else {
			if(web.size()<cel.size()){
				System.out.println("El conjunto de Desarrolladores de Celulares es el mayor");
				System.out.println(cel);
			} else {
				System.out.println("El conjunto de Desarrolladores de Web es el mayor");
				System.out.println(web);
			}
		}
	}
}
