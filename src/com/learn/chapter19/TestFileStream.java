package com.learn.chapter19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author : mashuainan
 * create at:  2019/9/26  上午8:33
 * @description: 使用I/0将从1到10的字节值写入到temp.dat文件中，再从文件中读出
 */
public class TestFileStream {
	public static void main(String[] args) throws IOException {
		// Create an output stream to the file
		FileOutputStream fileOutputStream = new FileOutputStream("temp.dat");

		// Output values to the file
		for(int i = 1; i <= 10; i++){
			fileOutputStream.write(i);
		}

		// Close the output stream
		fileOutputStream.close();

		// Create an input stream to the file
		FileInputStream fileInputStream = new FileInputStream("temp.dat");


		// Read values for the file
		int value;
		while((value = fileInputStream.read()) != -1){
			System.out.println(value);
		}

		// Close the input stream
		fileInputStream.close();
	}
}