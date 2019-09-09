package com.learn.chapter5;

/**
 * @author : mashuainan
 * create at:  2019/9/9  下午10:33
 * @description: 打印50个素数，每行10，方法封装
 */
public class PrimeNumberMethod {
	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are\n");
		printPrimeNumbers(50);
	}

	/**
	 * description: 打印指定个数的素数
	 * @param numberOfPrimes
	 * @return void
	 * @author shnma
	 * @date 2019/9/9 下午10:45
	 */
	public static void printPrimeNumbers(int numberOfPrimes){
		// Display 10 per line
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		// Count the number of prime numbers
		int count = 0;
		// A number to be tested for primeness
		int number = 2;

		// Repeatedly find prime numbers
		while (count < numberOfPrimes){
			// Print the prime number and increase the count
			if(isPrime(number)){
				// Increase the count
				count++;
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0){
					// Print the number and advance to the new line ]
					System.out.printf("%-5s\n",number);
				} else {
					System.out.printf("%-5s",number);
				}
			}

			// next number
			number++;
		}
	}

	/**
	 * description: Checked whether number is prime
	 * @param number
	 * @return boolean
	 * @author shnma
	 * @date 2019/9/9 下午10:41
	 */
	public static boolean isPrime(int number){
		for(int divisor = 2; divisor <= number / 2; divisor++){
			// If true, number is not prime
			if(number % divisor == 0){
				// number is not a prime
				return false;
			}
		}
		// number is prime
		return true;
	}
}