import java.util.*;

public class patternFactory<P>{
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
