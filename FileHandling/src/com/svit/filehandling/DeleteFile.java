package com.svit.filehandling;


	import java.io.File;
	import java.io.IOException;
	public class DeleteFile {

		public static void main(String[] args) throws IOException{
			// TODO Auto-generated method stub
			try
			{
				File myFile = new File("Demo.txt");
				if(myFile.exists())
				{
					myFile.delete();
					System.out.println("File deleted Successfully...");
	;			}
				else
				{
					System.out.println("File DO NOT Exist");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

