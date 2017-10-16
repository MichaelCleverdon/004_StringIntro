package StringPack;

import javax.swing.JOptionPane;

public class LearnStrings {
	private String word = "";
	public LearnStrings(String s) {
	
		// TODO Auto-generated constructor stub
		setString(s);
	}//End of Constructor

	private void setString(String s) {
		
		// TODO Auto-generated method stub
		 word = s;
		 JOptionPane.showMessageDialog(null, "String entered is " + word);
	}//End of Method
	public char getFirstLetter() {
		return word.charAt(0);
	}//End of Method
	public int getLength() {
		
		return word.length()-1;
		
	}//End of Method
	public char getLastLetter() {
		
		return word.charAt(getLength());
	}//End of Method
	/*
	 * start:
	 * index=1
	 * end:
	 * .length()-2
	 * 
	 * 
	 * use: .substring(int [beginIndex], int [endIndex])
	 * .substring(1, word.length()-2); inclusive exclusive
	 * .substring(1, word.length()-1);
	 */
	public String getMiddleLetters() {
		return word.substring(1, getLength());
	}//End of Method
	
}//End of Class



/*
*
*
*
*/