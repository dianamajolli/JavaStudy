package arrayListProcess;
import java.util.*;

public class TestArrayList1 {

	public static void main(String[] args) {
		
			List<String> nameList = new ArrayList<String> ();
			String [ ] names = {"Ann", "Bob", "Carol"};
			
			// Add to arrayList
			for (int k = 0; k < names.length; k++)
			nameList.add(names[k]);
			
			//nameList.set(1, "James");
			
			// Display name list
			for (int k = 0; k < nameList.size(); k++)
			System.out.println(nameList.get(k)); 
			

	}

}
