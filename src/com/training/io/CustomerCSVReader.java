package com.training.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CustomerCSVReader {
	public static void main(String[] args) throws IOException{
		//FileReader file = null;
		//BufferedReader br = null;
		//FileWriter fileW = null;
		//BufferedWriter bw = null;
		try(BufferedReader br = new BufferedReader(new FileReader("Customerinfo.csv"));
				BufferedWriter bw = new BufferedWriter
						(new FileWriter("male_customerinfo.csv")))
		
		{
		bw.write("customer_id, customer_name, gender, city");
		bw.newLine();
		br.readLine();
		String line;
		while((line = br.readLine())!= null) {
			String[] data = line.split(",");
			Customer customer = new Customer(data[0], data[1], data[2], data[3]);
			System.out.println(customer);
			
			if (data[2].equalsIgnoreCase("male")){
				bw.write(data[0]+","+data[1]+","+data[2]+","+data[3]);
				bw.newLine();
				
			}
			
			
		}
		
		}
		catch(FileNotFoundException e) {
			System.out.println("file is not available or incorrect");
			e.printStackTrace();
		}
		//finally{
			//file.close();
			//br.close();
			//fileW.close();
			//if(bw != null)
			//bw.close();
		
	}

}