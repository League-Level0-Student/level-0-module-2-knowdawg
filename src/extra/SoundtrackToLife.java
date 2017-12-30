//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
//
package extra;
// Angrey 2 , sad 1 , happy 0.
import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What is your mood", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Angrey" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
JOptionPane.showMessageDialog(null, "Your mood is	" + userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
String angrey = "http://bit.ly/video-for-angry";
String happy = "http://bit.ly/video-for-angry";
String sad = "http://bit.ly/video-for-sad";
if (userMood == 2) {
	playVideo(angrey);
}
if (userMood == 1) {
	playVideo(sad);
}
if (userMood == 0) {
	playVideo(happy);
}

		
		// 4. Play different songs for other moods.

/**
* If you can’t think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/
		
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



