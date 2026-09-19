package main;

import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		String message = args.length >0 && "on".equalsIgnoreCase(args[0]) ? "Turn on the light" : "Turn off the light";
		
		JOptionPane.showMessageDialog(null, message);
	}

}
