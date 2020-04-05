import java.util.Random;

/**
 * Demonstrates how to use arrays.
 * @author marissaschmidt
 */
public class ArrayDemo
{
	public static void main(String[] args)
	{
		Random random = new Random();
		
		// Create an array of 5 quiz scores
		double[] scores = new double[1000];
		
//		scores[0] = 85.0;
//		scores[1] = 98.5;
//		scores[2] = 40;
		
		// Use a loop to fill the scores array with random grades
		for(int i = 0; i < scores.length; i++)
		{
			scores[i] = random.nextDouble() * 100;
		}
		
		// Use a for-each loop to print elements
		for(double score : scores)
		{
			System.out.println(score);
		}
		
		
		double score2 = scores[4];
		System.out.println("Quiz 2 score: " + score2);
		
		
		// Compute and print the average of all scores
		double sum = 0;
		
		for(int i = 0; i < scores.length; i++)
		{
			sum = sum + scores[i];
		}
		
		double average = sum / scores.length;
		System.out.println("Your average quiz score is: " + average);
		
		
		// Compute and print the average of all scores
//		double sum = 0;
//		
//		for(double score : scores)
//		{
//			sum += score;
//		}
//		
//		double average = sum / scores.length;
//		System.out.println("Your average quiz score is: " + average);
		
		
//		String[] names = new String[50];
//		
//		for(String name : names)
//		{
//			System.out.println(name);
//		}
	}
}
