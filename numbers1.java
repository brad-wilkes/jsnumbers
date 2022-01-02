import javax.swing.*;

public class numbers1 {
public static void main(String[] args)
{
	JFrame f = new JFrame(); //instance of JFrame
	JButton b = new JButton("Add"); //instance of JButton
	String title = new String("Math Tool");
	b.setBounds(130,100,100,40); //set axes, w, and h
	f.add(b); //add button to the JFrame
	//f.add()
	
	/*
	
	int inputValue1 = JOptionPane.showInputDialog("Please input a number");
	int inputValue2 = JOptionPane.showInputDialog("Please input another number");
	
	*/
	
	f.setSize(400,500); //set w then h
	f.setLayout(null); //using no layout managers
	f.setVisible(true); //making the frame visible
}
}