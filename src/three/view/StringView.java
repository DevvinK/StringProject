package three.view;

import javax.swing.JOptionPane;

public class StringView
{
	
//	Declaration Section

	
	
	public void displayRunTimeError()
	{
		int tempNumber;
		String tempString;
		
		JOptionPane.showMessageDialog(null, "Let's crash the program!!");
		tempString = JOptionPane.showInputDialog("Type in your favorite number!");
		tempNumber = Integer.parseInt(tempString);
		JOptionPane.showMessageDialog(null, "Yout favorite number is " + tempNumber);
	}
	
	public void usePassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, "You typed in this earlier: " + currentValue);
	}
	
	public String sendParameterMethod()
	{
		//When using a variable in a method you must first assign it a value.
		String temp = null;
		
		JOptionPane.showInputDialog("Let's pass values!!");
		temp = JOptionPane.showInputDialog("Type in your favorite words");
	
		return temp;
	}
	
	public void moreInteractive(String userName, String funnyPhrase)
	{
		JOptionPane.showMessageDialog( null, "Hi there, we are going to use two parameters");
		JOptionPane.showMessageDialog(null, userName + " thinks that " + "\n" + funnyPhrase + " is funny");
	}
	
	public void testStringMethods()
	{
//		testSubstring();
		testCopyValueOfCharacterData();
//		testByteGetBytes();
//		testCharacterToCharacterArray();
		
	}
	
	private void testSubstring()
	{
		JOptionPane.showMessageDialog(null, "Let's look at a substring" + "\n" + "or the part of a string");
		JOptionPane.showMessageDialog(null, "The string I am using is stored in testString");
		String testString = "supercallifragilisiticexpialidocius";
		JOptionPane.showMessageDialog(null, "Its value is: " + "\n" + testString);
		String temp = testString.substring(7);
		JOptionPane.showMessageDialog(null, "Here it is from the 7th letter on: " + temp);
	}
	
	private void testCopyValueOfCharacterData()
	{
//		
		char [] test = new char[5];
		test[0] = '3';
		test[1] = 'r';
		test[2] = '7';
		test[3] = 'g';
		test[4] = '4';
		String testStringCharData = String.copyValueOf(test);
		JOptionPane.showMessageDialog(null, "Let's look at a character array" + "\n" + "or the part of a character array");
		JOptionPane.showMessageDialog(null, "The string method I am using is copyValueOf ");
		JOptionPane.showMessageDialog(null, "Its value is: " + "\n" + testStringCharData);
		
	}
	
	private void testGetBytes()
	{
		String myString = "dfsdfsdfsda";
		
		byte [] test = myString.getBytes();
		JOptionPane.showMessageDialog(null, "Let's look at a byte array" + "\n" + "or the part of a byte array");
		JOptionPane.showMessageDialog(null, "The string method I am using is getbytes ");
		JOptionPane.showMessageDialog(null, "Its value is: " + "\n" + test);
	}
	
	
}
