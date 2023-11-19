package fileProcess;
import java.util.Scanner;
import java.io.*;

//With array
//Implementing parallel Arrays x and y
//Advantage: you can apply processing algorithm outside while loop
// you can pick any portion of data for further processing
//Inconvenient: size of array must be known and 
public class TestFileProcess2 {

	public static void main(String[] args)throws FileNotFoundException {
		
		Scanner inFile= new Scanner (new FileReader ("divide.in"));
		double [] x = new double [4]; // first array storing the first column
		double [] y = new double [4]; // second parallel array storing the second column 
		
		int index =0;
		
		//loading data into parallel arrays
		while (inFile.hasNextLine()) {
			x [index]= inFile.nextDouble();
			y [index]= inFile.nextDouble();
			
			//printing data file
			//System.out.println ("x = " + x[index] + ", y =" +y[index]+ ", Division is "+x[index]/y[index]);
			
			index++;
			
		}
		//Further processing of arrays x and y
		System.out.println("Printing Parallel Arrays");
		for (int i =0; i<x.length; i++)
		{
			
			System.out.println ("x = " + x[i]+ ", y "+ y[i]+ ", Division is "+ x[i]/y[i]);
		}
	}
}