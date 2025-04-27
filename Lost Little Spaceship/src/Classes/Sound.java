package Classes;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Vector;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineEvent.Type;

public class Sound /* implements Runnable */ {

	public boolean sound = false;

	public String url;

	public float loud;
	public int threadnum;
	
	public static boolean threadM = false;

	static Thread thread1;
	
	
	/*
	 * 
	 * 
	 * public void start() {
	 * 
	 * Thread thread = new Thread(this); thread.start();
	 * 
	 * }
	 * 
	 * public void playSound(final String Url, float Loud) {
	 * 
	 * url = Url; loud = Loud;
	 * 
	 * sound = true;
	 * 
	 * }
	 * 
	 * @Override public void run() {
	 * 
	 * while(true){
	 * 
	 * if (sound) {
	 * 
	 * try { Clip clip = AudioSystem.getClip();
	 * 
	 * InputStream audioSrc = getClass().getResourceAsStream("/Sounds/" + url);
	 * 
	 * InputStream bufferedIn = new BufferedInputStream(audioSrc);
	 * 
	 * AudioInputStream inputStream =
	 * AudioSystem.getAudioInputStream(bufferedIn);
	 * 
	 * clip.open(inputStream);
	 * 
	 * FloatControl gainControl = (FloatControl)
	 * clip.getControl(FloatControl.Type.MASTER_GAIN);
	 * gainControl.setValue(loud);
	 * 
	 * clip.start(); } catch (Exception e) { System.err.println(e.getMessage());
	 * }
	 * 
	 * sound = false;
	 * 
	 * }
	 * 
	 * try { Thread.sleep(0); } catch (InterruptedException e) {
	 * e.printStackTrace(); } }
	 * 
	 * }
	 * 
	 * 
	 */

	public static synchronized void playSound(final String url, float loud) {

		

		thread1 = new Thread(new Runnable() {
			public void run() {
				try {
					Clip clip = AudioSystem.getClip();

					InputStream audioSrc = getClass().getResourceAsStream("/Sounds/" + url);

					InputStream bufferedIn = new BufferedInputStream(audioSrc);

					AudioInputStream inputStream = AudioSystem.getAudioInputStream(bufferedIn);

					clip.open(inputStream);

					FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
					gainControl.setValue(loud);

					clip.start();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		});

		thread1.start();

		if(threadM){
			
		
		System.out.println("active ones: " + thread1.currentThread().getThreadGroup().activeCount());
		
		if (thread1.isAlive()) {
			
			thread1.currentThread().getThreadGroup().list();
			
		
		} 
		
	}
	}

}
