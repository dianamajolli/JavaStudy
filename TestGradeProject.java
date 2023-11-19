package gradeProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class TestGradeProject {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner inFile= new Scanner (new FileReader ("Grade.in"));
		Grade [] all_sgrades = new Grade [6];
		
		int [] array_student_id = new int [6];
		
		String [] array_student_lname = new String [6];
		String [] array_student_fname = new String [6];
		
		int [] array_ass1 = new int [6];
		int [] array_ass2 = new int [6];
		int [] array_ass3 = new int [6];
		int [] array_mid_term = new int [6];
		int [] array_final = new int [6];
		
		double [][]array_ass = new double [6][5];
		
		int size =0;
		int index =0;
		int index1=0; //refer to line
		int index2=0; // refer to column
		
		int student_id;
		String student_lname;
		String student_fname;
		int s_grade_Assignment1;
		int s_grade_Assignment2;
		int s_grade_Assignment3;
		int s_grade_Mid_Term;
		int s_grade_Final_Term;
		
		while (inFile.hasNextLine()) {
			
		student_id = inFile.nextInt();
		student_lname = inFile.next();
		student_fname = inFile.next();
		s_grade_Assignment1 = inFile.nextInt();
		s_grade_Assignment2 = inFile.nextInt();
		s_grade_Assignment3 = inFile.nextInt();
		s_grade_Mid_Term = inFile.nextInt();
		s_grade_Final_Term = inFile.nextInt();
			
		all_sgrades [index]= new Grade();
		all_sgrades [index].setStudent_id(student_id);
		all_sgrades [index].setStudent_lname(student_lname);
		all_sgrades [index].setStudent_fname(student_fname);
		all_sgrades [index].setS_grade_Assignment1(s_grade_Assignment1);
		all_sgrades [index].setS_grade_Assignment2(s_grade_Assignment2);
		all_sgrades [index].setS_grade_Assignment3(s_grade_Assignment3);
		all_sgrades [index].setS_grade_Mid_Term(s_grade_Mid_Term);
		all_sgrades [index].setS_grade_Final_Term(s_grade_Final_Term);
		
		
		array_student_id[index] = student_id;
		array_student_lname [index] = student_lname;
		array_student_fname [index] = student_fname;
		array_ass1 [index] = s_grade_Assignment1 ;
		array_ass2 [index] = s_grade_Assignment2;
		array_ass3 [index] = s_grade_Assignment3;
		array_mid_term [index] = s_grade_Mid_Term;
		array_final [index] = s_grade_Final_Term;
		
		index2=0;
		
		array_ass [index1][index2++] = s_grade_Assignment1 ;
		array_ass [index1][index2++] = s_grade_Assignment2;
		array_ass [index1][index2++] = s_grade_Assignment3;
		array_ass [index1][index2++] = s_grade_Mid_Term;
		array_ass [index1][index2++] = s_grade_Final_Term;
		
		index++;
		index1++;
		
		size++;
			
	}
		inFile.close();
		
		
		for (int i=0; i<all_sgrades.length; i++) {
					
			System.out.println("s_id: "+all_sgrades[i].getStudent_id()+ ", Student Last Name: "+ all_sgrades[i].getStudent_lname()+ 
					", Student First Name: "+all_sgrades[i].getStudent_fname()+ "\n\nAssignment 1 : "+ all_sgrades[i].getS_grade_Assignment1()+ 
					"\nAssignment 2 : "+ all_sgrades[i].getS_grade_Assignment2() + "\nAssignment 3 : "+ all_sgrades[i].getS_grade_Assignment3()+
					"\nMid Term Exam : " +all_sgrades[i].getS_grade_Mid_Term() + "\nFinal Exam : " + all_sgrades[i].getS_grade_Final_Term()+ 
					"\n\nThe Average score for this Student is "+ String.format("%.2f", all_sgrades[i].Calculate_GradeAverage())+ "\n\n");
			
		}
		System.out.println("\n" + "Number of Students in the file is "+size);
		
		double sum=0;
		double result=0;
		for (int j=0; j<all_sgrades.length; j++) {
		
		sum += all_sgrades[j].Calculate_GradeAverage();
		result = sum/6;
		
		}
		System.out.println("\nThe Average score for all Students is "+ String.format("%.2f", result)+ "\n");
			
			
			
			for (int k =0; k<array_student_id.length; k++)
			{
				
				System.out.println (array_student_id[k]);
				
			}
			
			System.out.println();
			
			for (int k =0; k<array_student_lname.length; k++)
			{
				
				System.out.println (array_student_lname[k] + "     "+ array_student_fname[k]);
			}
			System.out.println();
			for (int row_id=0; row_id<array_ass.length; row_id++) {
				for (int col_id=0; col_id<array_ass[0].length; col_id++) {
					System.out.print((int)array_ass[row_id][col_id]+ "\t");
				}
				System.out.println();
			}
		}
	}


