import java.util.List;
//import java.util.ArrayList;
//import java.util.Arrays;

public class Array {		
	//ArrayList<Integer> array;
	private List<Integer> array;
	//List<String> coolStringList = Arrays.asList("Java", "Scala", "Groovy");
	
	//Constructor
	public Array(List<Integer> array) {
		//this.array = array;
		this.setArray(array);
	}
	
	
	// Getter
	public List<Integer> getArray() {
		return this.array;
	}

	// Setter
	public void setArray(List<Integer> array) {
		this.array = array;
	}
	
	
}
