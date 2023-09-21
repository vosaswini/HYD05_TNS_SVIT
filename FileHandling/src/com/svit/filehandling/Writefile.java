package com.svit.filehandling;
	import java.io.FileWriter;
	import java.io.IOException;
	public class Writefile {

		public static void main(String[] args) throws IOException{
			try
			{
				FileWriter myWriter = new FileWriter("Demo.txt");
				myWriter.write("WELCOME TO FILE HANDLING, lET'S LEARN HOW TO WRITE INTO A FILE");
			    myWriter.close();
			    System.out.println("Successfully written into the file");
			}
			catch(IOException e)
			{
				System.out.println("Error Occured!!!");
				e.printStackTrace();
			}
			
		}

	}

