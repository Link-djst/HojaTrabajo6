import java.util.*;

public class sets<P> {
	private patternFactory<P> factory = new patternFactory<P>();
	private Set<P> web;
	private Set<P> java;
	private Set<P> cel;
	private Set<P> dummy;
	private Set<P> dummy2;
	
	public sets(String option){
		this.web = factory.option(option);
		this.java = factory.option(option);
		this.cel = factory.option(option);
		this.dummy = factory.option(option);
		this.dummy2 = factory.option(option);
	}
	
	public void webSet(P n){
		this.web.add(n);
	}
	public void webPrint(){
		System.out.println(this.web);
	}
	public void javaSet(P n){
		this.java.add(n);
	}
	public void javaPrint(){
		System.out.println(this.java);
	}
	public void celSet(P n){
		this.cel.add(n);
	}
	public void celPrint(){
		System.out.println(this.cel);
	}
	public void p1(){
		dummy.addAll(web);
		dummy.retainAll(java);
		dummy.retainAll(cel);
		System.out.println("Desarrolladores con experiencia en Java, web y celulares "+dummy);
	}
	public void p2(){
		dummy.clear();
		dummy.addAll(java);
		dummy.removeAll(web);
		System.out.println("Desarrolladores con experiencia en Java pero que no tengan experiencia en web. "+dummy);
	}
	public void p3(){
		dummy.clear();
		dummy.addAll(web);
		dummy.retainAll(cel);
		dummy.removeAll(java);
		System.out.println("Desarrolladores con experiencia en Web y Celulares, pero que no tengan experiencia en java. "+dummy);
	}
	public void p4(){
		dummy.clear();
		dummy.addAll(web);
		dummy.addAll(cel);
		dummy.removeAll(java);
		System.out.println("Desarrolladores con experiencia en Web o Celulares (unión de Web y Celulares), pero que no tengan experiencia en java. "+dummy);
	}
	public void p5(){
		dummy.clear();
		dummy.addAll(web);
		if(dummy.containsAll(java)){
			System.out.println("El conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web.");
		} else {
			System.out.println("El conjunto de desarrolladores Java NO es un subconjunto de Desarrolladores Web.");
		}
	}
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
