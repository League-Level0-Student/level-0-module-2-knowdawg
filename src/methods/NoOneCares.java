package methods;

import javax.swing.JOptionPane;

public class NoOneCares {

	public static void main(String[] args) {

		String meep = JOptionPane.showInputDialog("what is your age?");
		int age = Integer.parseInt(meep);
		if (age > 17) {
			JOptionPane.showMessageDialog(null, "you can vote.");

		} else {

			JOptionPane.showMessageDialog(null,
					"dont take this the rong way but... NO ONE CARES WHAT YOU THINK! YOU JUST A LITTLE NOBODY WHO WALKS AROUND AND DOES NMOTHING! DO SOMETHING WITH YOUR LIFE, FOR EXAMPLE, VOTE... A WAIT, YOU CANT!!!!!!!!! HAHAHAHAHAHAAHAHAHAHHAHAHAHAHA!");

		}

	}

}
