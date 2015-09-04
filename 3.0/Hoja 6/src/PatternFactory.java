import java.util.*;
/**
 * 
 * @param <P> Es el parametro generico de entrada a la clase el cual servira para determinar que clase de objeto se desa crear.
 */
public class PatternFactory<P>{
	/**
	 * 
	 * @param entry Valor recibido desde sets que contine la opcion seleccionada por el usuario.
	 * @return Regresa la clase de objeto seleccionada por el usuario y que despues se utilizara en el resto del programa.
	 */
	public Set<P> option(String entry){
		if (entry.equals("1")){
			return new HashSet<P>();
		} else if (entry.equals("2")){
			return new TreeSet<P>();
		} else if (entry.equals("3")){
			return new LinkedHashSet<P>();
		}
		return null;
	}
	
}
