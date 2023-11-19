package arrayListProcess;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Using ArrayList Data Structure
//Advantage: you can use array of object with different data types
//Inconvenient: size of array must be known 

public class TestArrayList2  {
//Populate the arrayList divideArrList
	//from input data file divide.in
	
	public static void main(String[] args)throws FileNotFoundException {
	Scanner inFile= new Scanner (new FileReader ("divide.in"));
	List<Divide> divideArrList = new ArrayList<> ();
	
	
	double x;
	double y;
	while (inFile.hasNextLine()) {
		
		
		x=inFile.nextDouble();
		y=inFile.nextDouble();
		
		divideArrList.add(new Divide(x,y));
		
	}
	inFile.close();
	
		System.out.println("Printing ArrayList of object and perform processing");
		for (int i=0; i<divideArrList.size(); i++) {
			
			System.out.println("x = "+divideArrList.get(i).getX()+ ", y = "+ divideArrList.get(i).getY()+ ", Division is "+ divideArrList.get(i).doDivide());
		}
		
		/*System.out.println("Printing ArrayList using enhanced loop");
		for (Divide divobj: divideArrList) {
			
			System.out.println("x = "+divobj.getX()+ ", y = "+ divobj.getY()+ ", Division is "+ divobj.doDivide());
		}*/
	}
	
}

