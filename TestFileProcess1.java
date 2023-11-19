package fileProcess;
import java.util.Scanner;
import java.io.*;

//Without array
//Inconvenient: you CANNOT use processing algorithms such as search (because the memory point just for the last numbers (89 and 6))
//outside loop

public class TestFileProcess1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		/*String filePath= "C:\\Users\\diana\\OneDrive\\Area de Trabalho\\Software development_ACS\\Programming Algorithms and Patterns\\Lab1\\FileProcessProject\\divide.in";
		File file =new File (filePath);
		
		try {
			
			Scanner sc = new Scanner (file);
			
			while (sc.hasNextLine()) {
				int i = sc.nextInt();
				//System.out.print(i);
				System.out.print("x=" + i + " ");
				int j =sc.nextInt();
				System.out.print("y=" + j+ " ");
				System.out.print("Division:" + (double) i/j);
				System.out.println();
				
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		
		Scanner inFile = new Scanner (new FileReader("divide.in"));
		double x,y;
		
		while (inFile.hasNextLine())
		{
			x = inFile.nextDouble(); //round 1: x = 45
			y = inFile.nextDouble();//round 1: y = 6
			
			//Printing data file
			System.out.println("x = "+ x + ", y = "+ y + ", Division is "+x/y);
			
		}
	}

}
