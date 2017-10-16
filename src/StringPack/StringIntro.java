package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {

	public static void main(String[] args) {
		boolean playAgain = true;
		String msg = "";
		while (playAgain == true){
		String passWord = JOptionPane.showInputDialog("Please pick a word.");
		LearnStrings getIt = new LearnStrings(passWord);
		
	
	//	System.out.println(getIt.getFirstLetter());
		msg = "First char is : " + getIt.getFirstLetter();
		JOptionPane.showMessageDialog(null, msg);
	//	System.out.println(getIt.getLastLetter());
		Character lastLetter = getIt.getLastLetter();
		msg = "Last char is: " + lastLetter;
		JOptionPane.showMessageDialog(null, msg);
		JOptionPane.showMessageDialog(null, "The Length is " + (getIt.getLength()+1));
		msg = "Middle letters are: " + getIt.getMiddleLetters();
		JOptionPane.showMessageDialog(null, msg);
		//System.out.println(getIt());
Object[] choiceOptions = {"Yes", "No"};

						//JOptionPane.showOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
		int choice = JOptionPane.showOptionDialog(null, "Do you want to play again?", null, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, choiceOptions, "Yes");

if(choice == 0) {
	
}else {
	playAgain = false;
	JOptionPane.showMessageDialog(null, "Thank you for playing!");
			}
		}//End of While
	}
}
