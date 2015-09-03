import java.util.*;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("¿Qué Implementación de Set desea utilizar?");
		System.out.println("1. HashSet");
		System.out.println("2. TreeSet");
		System.out.println("3. LinkedHashSet");
		Scanner sc = new Scanner(System.in);
		String entry = sc.nextLine();
		sets J = new sets<String>(entry);
		boolean op = true;
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
