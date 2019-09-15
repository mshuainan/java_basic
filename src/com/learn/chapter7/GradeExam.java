package com.learn.chapter7;

/**
 * @author : mashuainan
 * create at:  2019/9/14  下午11:22
 * @description: 学生选择题正确率统计
 */
public class GradeExam {
	/**
	 * description: Main method
	 * @param args
	 * @return void
	 * @author shnma
	 * @date 2019/9/14 下午11:22
	 */
	public static void main(String[] args) {
		// Students answers to the questions
		char[][] answers = {
			{'A','B','A','C','C','D','E','E','A','D'},
			{'A','B','A','C','C','D','E','E','A','D'},
			{'A','B','A','C','C','D','E','E','A','D'},
			{'A','B','A','C','C','D','E','E','A','D'},
			{'A','B','A','C','C','D','E','E','A','D'},
			{'A','B','A','C','C','D','E','E','A','D'},
			{'A','B','A','C','C','D','G','E','A','D'},
			{'A','B','A','C','C','D','E','E','A','D'}
		};

		// Key to the questions
		char[] keys = {'A','B','C','C','C','C','E','E','A','D'};

		// Grade all answers
		for(int i = 0; i < answers.length; i++){
			// Grade one student
			int correctCount = 0;
			for(int j = 0; j < answers[i].length; j++){
				if(answers[i][j] == keys[j]){
					correctCount++;
				}
			}
			System.out.println("Student " + i + ",s correct count is " + correctCount);
		}
	}
}