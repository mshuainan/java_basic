package com.learn.chapter5;

/**
 * @author : mashuainan
 * create at:  2019/9/10  上午8:42
 * @description: 获取定义区间内的随机字符
 */
public class TestRandomCharacter {

	/**
	 * description:	Main method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/10 上午8:43
	 */
	public static void main(String[] args) {
		final int NUMBER_OF_CHARS = 175;
		final int CHARS_PER_LINE = 25;

		// Print random characters between 'a' and 'z', 25 chars per line
		for (int i = 1; i <= NUMBER_OF_CHARS; i++){
			char ch = getRandomLowerCaseLetter();
			if(i % CHARS_PER_LINE == 0){
				System.out.println(ch);
			} else {
				System.out.print(ch);
			}
		}
	}

	/**
	 * description: Generate a random character between ch1 and ch2
	 * @param ch1
	 * @param ch2
	 * @return char
	 * @author shnma
	 * @date 2019/9/10 上午8:50
	 */
	public static char getRandomCharacter(char ch1, char ch2){
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/**
	 * description: Generate a random lowercase letter
	 * @return char
	 * @author shnma
	 * @date 2019/9/10 上午8:50
	 */
	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a','z');
	}
	/**
	 * description: Generate a random uppercase letter
	 * @return char
	 * @author shnma
	 * @date 2019/9/10 上午8:50
	 */
	public static char getRandomUpperCaseLetter(){
		return getRandomCharacter('A','Z');
	}

	/**
	 * description: Generate a random digit letter
	 * @return char
	 * @author shnma
	 * @date 2019/9/10 上午8:50
	 */
	public static char getRandomDigitCharacter(){
		return getRandomCharacter('0','9');
	}

	/**
	 * description: Generate a random letter
	 * @return char
	 * @author shnma
	 * @date 2019/9/10 上午8:50
	 */
	public static char getRandomCharacter(){
		return getRandomCharacter('\u0000','\uFFFF');
	}
}