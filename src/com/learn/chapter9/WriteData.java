package com.learn.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author : mashuainan
 * create at:  2019/9/15  下午4:46
 * description: 使用PrintWrite写数据
 */
public class WriteData {
	public static void main(String[] args) {
		File file = new File("scores.txt");
		if(file.exists()){
			System.out.println("File already exists");
			System.exit(0);
		}
		try{
			// Create a file
			PrintWriter output = new PrintWriter(file);

			// Write formatted output to the file
			output.print("John T Smith");
			output.println(90);
			output.print("Eric K Jones");
			output.println(85);

			// Closed the file
			output.close();
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}