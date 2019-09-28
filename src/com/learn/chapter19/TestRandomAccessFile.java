package com.learn.chapter19;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author : mashuainan
 * create at:  2019/9/28  下午4:20
 * @description: 测试随机访问类AccessFile
 */
public class TestRandomAccessFile {
	public static void main(String[] args) throws IOException {

		// create a random-access file
		RandomAccessFile randomAccessFile = new RandomAccessFile("randomFile.dat","rw");

		// clear the file to destroy the old contents,if any
		randomAccessFile.setLength(0);

		// write new integers to the file
		for(int i = 0; i < 200; i++){
			randomAccessFile.writeInt(i);
		}

		// display the current length of the file
		System.out.println("current file length is " + randomAccessFile.length());

		// retrieve the first number
		randomAccessFile.seek(0);
		System.out.println("the first number is " + randomAccessFile.readInt());

		// retrieve the second number
		randomAccessFile.seek(1 * 4);
		System.out.println("the first second is " + randomAccessFile.readInt());

		// retrieve the tenth number
		randomAccessFile.seek(9 * 4);
		System.out.println("the first tenth is " + randomAccessFile.readInt());

		// modify the eleventh number
		randomAccessFile.writeInt(555);

		// Append a new number
		randomAccessFile.seek(randomAccessFile.length());
		randomAccessFile.writeInt(999);

		// display the new length
		System.out.println("the new length is " + randomAccessFile.length());

		// retrieve the eleventh number
		randomAccessFile.seek(10 * 4);
		System.out.println("the first eleventh is " + randomAccessFile.readInt());

		randomAccessFile.close();
	}
}