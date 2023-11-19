package fileProcess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//Using Array of Objects
//Advantage: you can use array of object with different data types
//Inconvenient: size of array must be known 
public class TestFileProcess3 {

	public static void main(String[] args)throws FileNotFoundException {
		//Populate the array of object myDivideArr
		//from input data file divide.in
		Scanner inFile= new Scanner (new FileReader ("divide.in"));
		Divide [] myDivideArr= new Divide [4];
		
		int index =0;
		double x;
		double y;
		
		//Loading data into Array of Object 
		while (inFile.hasNextLine()) {
		
		
			x=inFile.nextDouble();
			y=inFile.nextDouble();
			
			myDivideArr [index]= new Divide(x,y);
			//myDivideArr [index].setX(x);
			//myDivideArr [index].setY(y);
			
			index++;
		
		}
		inFile.close(); //free space memory
		
		System.out.println("Printing Array of object");
		for (int i=0; i<myDivideArr.length; i++) {
			
			System.out.println("x = "+myDivideArr[i].getX()+ ", y = "+ myDivideArr[i].getY()+ ", Division is "+ myDivideArr[i].doDivide());
		}
		
	}

}
