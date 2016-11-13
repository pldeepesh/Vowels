/* This is a Code which will find the number of vowels in the inputed sentence or string 
 * It scans the input from the user and checks each and and every character in the same loop a 
 * integer variable is incremented if a vowel is found.  */
/*
 * This code is optimised and tested for all the exceptions.
 */
package vowels;
import java.util.Scanner;
// A class is created and main method is called.
public class Vowels 
{
	public static void main(String[] args) 
	{	
		int Vowel_Count = 0;//This is used as a counter,which counts the number of vowels
		@SuppressWarnings("resource")
		//Scans input from the user
		Scanner x =new Scanner(System.in);
		System.out.println("Enter a string:");
		/*This While loop checks for all the possible exception thaan an user can do while entering the sentence.
		 * If the input is a valid input then the entered value is assigned to the String variable and the process continues
		 */
		while(x.hasNextInt()||x.hasNextDouble()||x.hasNextLong()||x.hasNextBoolean()||x.hasNextFloat())
		{
			System.out.println("please enter a string,"+" The enterd value is not a string");
			System.out.println("Enter a string:");
			x.nextLine();
		}

		String Str=x.nextLine(); //assignig the user enterd text to a variable
		/*This forloop keeps on iterating till the length of the sentence/word enterd by the end user
		 * it divides the whole sentence into indexed characters.
		 * using the java inbuilt chatAt() function we can get each and every word in the sentence including spaces
		 * the if condition present in this loop will hep to check weather the character is a vowel or not.if it is vowel then the 
		 * counter will be incremented.if it is not a vowel the pointer moves to the next word*/
		for(int i=0;i<Str.length();i++)
		{
			char ch=Str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'||ch=='y'||ch=='Y')
			{
				Vowel_Count++;
			}
		}
		System.out.println("Count of vowels in the string enterd is:"+Vowel_Count);//Prints the vowel count with a message.
	}
}
