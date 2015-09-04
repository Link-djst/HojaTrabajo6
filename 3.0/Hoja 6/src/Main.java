import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("¿Qué Implementación de Set desea utilizar?");
		System.out.println("1. HashSet");
		System.out.println("2. TreeSet");
		System.out.println("3. LinkedHashSet");
		Scanner sc = new Scanner(System.in);
		String entry = sc.nextLine();
		//Se envia la opcion seleccionada por el usuario a sets.
		Sets J = new Sets<String>(entry);
		boolean op = true;
		
		/**
		 * Ciclo que se repite la cantidad de veces que el usuario desee ingresar desarrolladores web.
		 */
		while(op){
			System.out.println("¿A quién desea agregar como desarrollador Web?");
			entry = sc.nextLine();
			J.webSet(entry);
			System.out.println("¿Desea agregar a alguien mas?");
			System.out.println("1. Si");
			System.out.println("2. No");
			entry = sc.nextLine();
			if(entry.equals("1")){
				op = true;
			} else {
				op = false;
			}
		}
		J.webPrint();
		op = true;
		/**
		 * Ciclo que se repite la cantidad de veces que el usuario desee ingresar desarrolladores Java.
		 */
		while(op){
			System.out.println("¿A quién desea agregar como desarrollador Java?");
			entry = sc.nextLine();
			J.javaSet(entry);
			System.out.println("¿Desea agregar a alguien mas?");
			System.out.println("1. Si");
			System.out.println("2. No");
			entry = sc.nextLine();
			if(entry.equals("1")){
				op = true;
			} else {
				op = false;
			}
		}
		
		J.javaPrint();
		op = true;
		/**
		 * Ciclo que se repite la cantidad de veces que el usuario desee ingresar desarrolladores de celular.
		 */
		while(op){
			System.out.println("¿A quién desea agregar como desarrollador Celular?");
			entry = sc.nextLine();
			J.celSet(entry);
			System.out.println("¿Desea agregar a alguien mas?");
			System.out.println("1. Si");
			System.out.println("2. No");
			entry = sc.nextLine();
			if(entry.equals("1")){
				op = true;
			} else {
				op = false;
			}
		}
		
		/**
		 * Llamada a los diferentes metodos de sets los cuales imprimen diferente informacion acorde a los datos ingresados por el usuario.
		 */
		J.celPrint();
		J.p1();
		J.p2();
		J.p3();
		J.p4();
		J.p5();
		J.p6();
		sc.close();
	}

}
