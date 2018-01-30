package methods;

import javax.swing.JOptionPane;

public class rollerCaoster {

	public static void main(String[] args) {

		String piontlessStringThatIHaveToMakeSoThatICanTurnItToAnInt = JOptionPane
				.showInputDialog("HOW TALL ARE YOU? ARRG!(feet or inches. Dont iclude 'feet' or 'inches')");
		int height = Integer.parseInt(piontlessStringThatIHaveToMakeSoThatICanTurnItToAnInt);
		if (height < 10) {
			height *= 12;

		}
		if (height > 47) {
			JOptionPane.showMessageDialog(null,
					"YOU CAN GO ON THE LEGENDARY RIDE!!!!!!!!!!!!!!!!!!!!!!! ARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRG!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		} else {
			JOptionPane.showMessageDialog(null,
					"YOU LITTLE TRICKER THEIF! ARRG! YOU CANNOT GO ON THIS RIDE! ARRRRRRRRRRG!!!!!!!!!!! YOU TRYING TO CHEAT yoUR WAY IN! ARRRRRRRRRRRRG!!!!!!! WHAT IS WRONG WITH YOU!!!!!! ARRRRRRRRRG!!!!!!!!!!!!!!!!!!!!! IM TELLING YOU... IM TELLING ON YOU!!!!!!!!!!!!!!!!!! ARRRRRRRRRRRRRRRRRRRRGGGGGGGG!!!!!!!!!");

		}

	}

}
