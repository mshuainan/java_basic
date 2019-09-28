package com.learn.chapter19;

import java.io.*;

/**
 * @author : mashuainan
 * create at:  2019/9/27  上午8:32
 * @description: 复制源文件至目标文件里
 */
public class CopyFile {
	
	/**
	 * description:
	 * @param args
	 * 		  args[0] for sourceFile
	 * 		  args[1] for targetFile
	 * @return void
	 * @author shnma
	 * @date 2019/9/27 上午8:33
	 */
	public static void main(String[] args) throws IOException {
		// Check command-line parameter usage
		if(args.length != 2){
			System.out.println("usage:java copy sourceFile targetFile");
			System.exit(0);
		}

		// Check whether source file exists
		File sourceFile = new File(args[0]);
		if(!sourceFile.exists()){
			System.out.println("source file " + args[0] + " not exists");
			System.exit(0);
		}

		// Check whether target file exists
		File targetFile = new File(args[1]);
		if(!targetFile.exists()){
			System.out.println("target file " + args[1] + " not exists");
			System.exit(0);
		}

		// create an input stream
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(sourceFile));

		// create an output steam
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(targetFile));

		// continuously read a byte from input and write it to output
		int r;
		int numberOfByte = 0;
		while ((r = bufferedInputStream.read()) != -1){
			bufferedOutputStream.write((byte)r);
			numberOfByte++;
		}

		// close stream
		bufferedInputStream.close();
		bufferedOutputStream.close();

		// display the file size
		System.out.println(numberOfByte + " byte copied");

	}
}