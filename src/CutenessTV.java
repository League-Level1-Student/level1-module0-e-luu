import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	static JFrame f = new JFrame();
	static JPanel p = new JPanel();
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();

	public static void main(String[] args) {
		CutenessTV tv = new CutenessTV();
		tv.showButton();
		f.add(p);
	}

	public void showButton() {
		f.setVisible(true);
		p.add(one);
		p.add(two);
		p.add(three);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		showDucks();
		showFrog();
		showFluffyUnicorns();
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
