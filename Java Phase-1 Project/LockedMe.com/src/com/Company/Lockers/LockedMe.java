package com.Company.Lockers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe {
    static final String path = "D:\\My development projects\\Java Phase-1 Project\\CompanyLockersPvt.ltd\\LockedMeFiles";
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
		Display();

		
		System.out.println("Enter your choice:");
		 choice =Integer.parseInt(sc.nextLine()); 
		 
		 switch(choice)
		 {
		 case 1:getAllFiles();
		      break;
		 case 2:addFiles();
		      break;
		 case 3:deleteFiles();
		      break;
		 case 4: searchFiles();
		      break;
		 case 5: System.exit(choice);
		      break;
		 default:System.out.println("Invalid Option");
		      break;
		 
		 
		 }
		
	}
		while(choice>0);
	}
	
	public static void Display() {
		
		 
		 System.out.println("\tWelcome To Company Lockers Pvt. Ltd.:-  LockedMe.com");
		 System.out.println("\tDeveloper name:- Samson Gowalla");
		 System.out.println("\t*****************************************");
		 System.out.println("\t1.Display all files");
		 System.out.println("\t2.Add Files to the existing directory");
		 System.out.println("\t3.Delete files from existing directory");
		 System.out.println("\t4.Search a file from the main directory");
		 System.out.println("\t5.Exit");
		 System.out.println("\t*****************************************");
		
	}
	public static void getAllFiles() {
		File files= new File(path);
		File[] listOfFiles = files.listFiles();
		if(listOfFiles.length==0)
		{
			System.out.println(" The folder is empty");
		}else
		{
			for (File f : listOfFiles) {
				System.out.println(f.getName());
				
			}
		}
	}
	public static void addFiles() {
		try {
			Scanner sc = new Scanner(System.in); 
		
			String FileName;
			int LineCount;
			
			System.out.println("Enter File Name:");
			FileName = sc.nextLine();
			
			
			System.out.println("Enter number of lines to be added in file:");
			LineCount = Integer.parseInt(sc.nextLine());
			
		 FileWriter fw = new FileWriter(path + "\\"+ FileName); 
				
				for(int i=1;i<=LineCount;i++)
				{
					System.out.println("Enter the file content:");
					fw.write(sc.nextLine()+ " \n ");
					
					
				}
				System.out.println("File created Successfully");
				fw.close();
			
		}catch(Exception e) {
			System.out.println("Error occured");
		}
	
	}
		
	
	public static void deleteFiles() {
		Scanner sc = new Scanner(System.in);
		try
		{
		String FileName;
		
		System.out.println("Enter the file name to be deleted:");
		FileName = sc.nextLine();
		
		File f = new File(path + "\\" + FileName);
		
		if(f.exists()) {
			f.delete();
			System.out.println("File deleted successfully");
		}else
		{
			System.out.println("File not found");
		}
	}
	catch (Exception e) {
		System.out.println("Error occured in delete()");
	}
	}
	public static void searchFiles() {
		Scanner sc = new Scanner(System.in);
		try
		{
		String FileName;
		
		System.out.println("Enter the file name to be searched:");
		FileName = sc.nextLine();
		
		File f = new File(path + "\\" + FileName);
		
		if(f.exists()) {
			
			System.out.println("File is available");
		}else
		{
			System.out.println("File not available");
		}
	}
	catch (Exception e) {
		System.out.println("Some error occured in search()");
	}
	
		
	}

}
