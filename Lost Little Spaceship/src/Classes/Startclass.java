package Classes;

import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Startclass {

	public static int width = 735 + 15;
	public static int height = 945 + 15;

	public static void main(String[] args) {

		JFrame derFrame = new JFrame();
		derFrame.setBounds(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - width / 2,
				Toolkit.getDefaultToolkit().getScreenSize().height / 2 - height / 2, width, height);
		
		derFrame.setResizable(false);
 
		final Mainclass dieMainclass = new Mainclass();
		derFrame.getContentPane().add(dieMainclass);
		derFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dieMainclass.stop();
				dieMainclass.destroy();
				System.exit(0);
			}
		});

		derFrame.setTitle("Lost Little Spaceship // Version: 2.0.0 // -------- © Janik Heil");
		derFrame.setVisible(true);
		dieMainclass.init();
		dieMainclass.start();
		
	}

}
