package com.learn.chapter10;

import java.util.Date;

/**
 * @author : mashuainan
 * create at:  2019/9/16  上午8:21
 * @description: 贷款类Loan
 */
public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	/**
	 * description: Default contract
	 * @param
	 * @return
	 * @author shnma
	 * @date 2019/9/16 上午8:27
	 */
	public Loan(){
		this(2.5,1,1000);
	}

	/**
	 * description: Contract a loan with specified annual interest rate,number of years,and loan amount
	 * @param annualInterestRate
	 * @param numberOfYears
	 * @param loanAmount
	 * @return 
	 * @author shnma
	 * @date 2019/9/16 上午8:26
	 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		this.loanDate = new Date();
	}

	/**
	 * description: Return annualInterestRate
	 * @param
	 * @return double
	 * @author shnma
	 * @date 2019/9/16 上午8:28
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * description: Set a new annualInterestRate
	 * @param annualInterestRate
	 * @return void
	 * @author shnma
	 * @date 2019/9/16 上午8:29
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * description: Return numberOfYears
	 * @param
	 * @return int
	 * @author shnma
	 * @date 2019/9/16 上午8:29
	 */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/**
	 * description: Set a new numberOfYears
	 * @param numberOfYears
	 * @return void
	 * @author shnma
	 * @date 2019/9/16 上午8:30
	 */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/**
	 * description: Return loanAmount
	 * @param
	 * @return double
	 * @author shnma
	 * @date 2019/9/16 上午8:30
	 */
	public double getLoanAmount() {
		return loanAmount;
	}

	/**
	 * description: Set a new loanAmount
	 * @param loanAmount
	 * @return void
	 * @author shnma
	 * @date 2019/9/16 上午8:30
	 */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**
	 * description: Return loanDate
	 * @param
	 * @return java.util.Date
	 * @author shnma
	 * @date 2019/9/16 上午8:30
	 */
	public Date getLoanDate() {
		return loanDate;
	}

	/**
	 * description: Find monthly payment
	 * @param
	 * @return double
	 * @author shnma
	 * @date 2019/9/16 上午8:33
	 */
	public double getMonthlyPayment(){
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthPayment = loanAmount * monthlyInterestRate / (
				1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		return monthPayment;
	}

	/**
	 * description: Find total payment
	 * @param
	 * @return double
	 * @author shnma
	 * @date 2019/9/16 上午8:34
	 */
	public double getTotalPayMent(){
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
}