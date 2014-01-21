package Controller;

import javax.swing.JOptionPane;

/**
 *Start the Try/Catch project
 *@author Alex Johnson
 *@version 1.0 12/10/13 
 *
 **/
public class TryCatchRunner 
{
	public static void main(String [] args)
	{
		int testNumber = 15;
		double testFloatingPoint = 0.0000001;
		double errorTest = 0.0;
		int otherNumber = 0;
		
		try
		{
			testNumber = testNumber/otherNumber; //testNumber divided by 0.
		}
		catch(ArithmeticException currentError)
		{
			JOptionPane.showMessageDialog(null, currentError.getMessage()); //getMessage gives us error message.
			JOptionPane.showMessageDialog(null, currentError.getClass().toString()); //getClass gives us actual Exception
		}
		
		try
		{
			errorTest = errorTest/errorTest;
		}
		catch(ArithmeticException currentError)
		{
			JOptionPane.showMessageDialog(null, currentError.getMessage());
			JOptionPane.showMessageDialog(null, currentError.getClass().toString());
		}
		JOptionPane.showMessageDialog(null, "Funny Answer:" + errorTest/errorTest); //NaN means "not a number", which is a concept.
		JOptionPane.showMessageDialog(null, "Funny Answer:" + errorTest/-errorTest); //NaN means "not a number", which is a concept.
		JOptionPane.showMessageDialog(null, "Funny Answer:" + 1.0/errorTest); //NaN means "not a number", which is a concept.
	}	
}
