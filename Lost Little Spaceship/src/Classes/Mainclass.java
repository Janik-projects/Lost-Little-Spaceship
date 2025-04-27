package Classes;

import java.applet.Applet;
import java.awt.AWTException;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;

import javax.imageio.ImageIO;
import javax.sound.sampled.LineEvent.Type;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.util.Random;
import java.util.Vector;

// g.rotate(Math.toRadians(rotation), img.getWidth() / 2, img.getHeight() / 2);     for rotating an image

@SuppressWarnings("serial")
public class Mainclass extends Applet implements Runnable {

	Startclass thisStart = new Startclass();

	public Sound Soundclass = new Sound();

	public int scenario;

	public int soundtrackCounter = 0;

	public int width = thisStart.width;
	public int height = thisStart.height;

	public int MaxDifferentBackgroundTypes;

	public boolean gameover;

	public long enemyWeaponID;

	private double opacity;

	public double sideMod;

	public int rocketcounter;

	public int WaveCounter;

	private Image IMG;
	private Graphics DB;
	private boolean initialized;

	private int PauseMenuCounter;

	public double pause;
	public boolean pausepressed;
	private boolean slowMo;

	private double PlayerHealth;

	public boolean left;
	public boolean right;
	private boolean fire1;
	private boolean fire2;

	private int fire1cooldown;

	public int enemyRocketCounter;

	private double MouseControllX;

	public Vector<Backgrounds> Backgrounds;

	public Vector<Backgrounds> Backgrounds2;

	public Vector<Backgrounds> BackgroundsBehind;

	public Vector<AnimatedObject> allObjects;

	public Vector<AnimatedObject> Enemies;

	public Vector<AnimatedObject> Explosions;

	public Vector<AnimatedObject> EnemyWeapons;

	public int state;
	public int chooseship;
	private int introrunningcounter;
	private int introduration;
	private boolean startgame;

	public long score;
	public long HighScore;

	private Rectangle MouseclickArea;
	private Rectangle MousemoveArea = new Rectangle();

	private Rectangle Spaceship1Area;
	private Rectangle Spaceship2Area;
	private Rectangle Spaceship3Area;

	private Rectangle StartButton;

	private Rectangle PauseMenuBack;
	private Rectangle PauseMenuCloseGame;

	private Rectangle GameOverMenuBack;
	private Rectangle GameOverMenuCloseGame;

	private Cursor blankCursor;

	private int menupicturecounter;

	public static Font RetroFont1;
	public static Font RetroFont2;
	public static Font RetroFont3;
	public static Font RetroFont4;

	public static BufferedImage menupart1;

	public static BufferedImage menuback;

	public static BufferedImage spaceship1;
	public static BufferedImage spaceship1_1;
	public static BufferedImage spaceship1_2;
	public static BufferedImage spaceship1_3;

	public static BufferedImage spaceship1_right_1;
	public static BufferedImage spaceship1_right_2;
	public static BufferedImage spaceship1_right_3;
	public static BufferedImage spaceship1_right_4;

	public static BufferedImage spaceship1_left_1;
	public static BufferedImage spaceship1_left_2;
	public static BufferedImage spaceship1_left_3;
	public static BufferedImage spaceship1_left_4;

	public static BufferedImage spaceship2;
	public static BufferedImage spaceship2_1;
	public static BufferedImage spaceship2_2;
	public static BufferedImage spaceship2_3;

	public static BufferedImage spaceship2_right_1;
	public static BufferedImage spaceship2_right_2;
	public static BufferedImage spaceship2_right_3;
	public static BufferedImage spaceship2_right_4;

	public static BufferedImage spaceship2_left_1;
	public static BufferedImage spaceship2_left_2;
	public static BufferedImage spaceship2_left_3;
	public static BufferedImage spaceship2_left_4;

	public static BufferedImage spaceship3;
	public static BufferedImage spaceship3_1;
	public static BufferedImage spaceship3_2;
	public static BufferedImage spaceship3_3;

	public static BufferedImage spaceship3_right_1;
	public static BufferedImage spaceship3_right_2;
	public static BufferedImage spaceship3_right_3;
	public static BufferedImage spaceship3_right_4;

	public static BufferedImage spaceship3_left_1;
	public static BufferedImage spaceship3_left_2;
	public static BufferedImage spaceship3_left_3;
	public static BufferedImage spaceship3_left_4;

	public static BufferedImage backgroundTest;

	public static BufferedImage aa1;
	public static BufferedImage aa2;
	public static BufferedImage aa3;
	public static BufferedImage aa4;
	public static BufferedImage aa5;
	public static BufferedImage aa6;

	public static BufferedImage ship3_rocket1;
	public static BufferedImage ship3_rocket2;

	public static BufferedImage smoke1;
	public static BufferedImage smoke2;
	public static BufferedImage smoke3;

	public static BufferedImage Background1;
	public static BufferedImage Background2;
	public static BufferedImage Background3;
	public static BufferedImage Background4;
	public static BufferedImage Background5;
	public static BufferedImage Background6;
	public static BufferedImage Background7;
	public static BufferedImage Background8;
	public static BufferedImage Background9;
	public static BufferedImage Background10;
	public static BufferedImage Background11;
	public static BufferedImage Background12;
	public static BufferedImage Background13;
	public static BufferedImage Background14;
	public static BufferedImage Background15;
	public static BufferedImage Background16;
	public static BufferedImage Background17;
	public static BufferedImage Background18;
	public static BufferedImage Background19;
	public static BufferedImage Background20;
	public static BufferedImage Background21;
	public static BufferedImage Background22;
	public static BufferedImage Background23;
	public static BufferedImage Background24;
	public static BufferedImage Background25;
	public static BufferedImage Background26;
	public static BufferedImage Background27;
	public static BufferedImage Background28;
	public static BufferedImage Background29;
	public static BufferedImage Background30;
	public static BufferedImage Background31;
	public static BufferedImage Background32;
	public static BufferedImage Background33;
	public static BufferedImage Background34;
	public static BufferedImage Background35;
	public static BufferedImage Background36;
	public static BufferedImage Background37;
	public static BufferedImage Background38;
	public static BufferedImage Background39;
	public static BufferedImage Background40;
	public static BufferedImage Background41;
	public static BufferedImage Background42;
	public static BufferedImage Background43;
	public static BufferedImage Background44;
	public static BufferedImage Background45;
	public static BufferedImage Background46;
	public static BufferedImage Background47;
	public static BufferedImage Background48;
	public static BufferedImage Background49;
	public static BufferedImage Background50;
	public static BufferedImage Background51;
	public static BufferedImage Background52;
	public static BufferedImage Background53;
	public static BufferedImage Background54;
	public static BufferedImage Background55;
	public static BufferedImage Background56;
	public static BufferedImage Background57;

	public static BufferedImage enemy_rocket1_1;
	public static BufferedImage enemy_rocket1_2;

	public static BufferedImage enemyRocket_steam1;
	public static BufferedImage enemyRocket_steam2;
	public static BufferedImage enemyRocket_steam3;

	public static BufferedImage Enemy_1_1;
	public static BufferedImage Enemy_1_2;
	public static BufferedImage Enemy_1_3;

	public static BufferedImage Enemy_2_1;
	public static BufferedImage Enemy_2_2;
	public static BufferedImage Enemy_2_3;

	public static BufferedImage Enemy_3_1;
	public static BufferedImage Enemy_3_2;
	public static BufferedImage Enemy_3_3;

	public static BufferedImage Enemy_3_exp1;
	public static BufferedImage Enemy_3_exp2;
	public static BufferedImage Enemy_3_exp3;
	public static BufferedImage Enemy_3_exp4;
	public static BufferedImage Enemy_3_exp5;
	public static BufferedImage Enemy_3_exp6;
	public static BufferedImage Enemy_3_exp7;
	public static BufferedImage Enemy_3_exp8;

	public static BufferedImage Enemy_2_exp1;
	public static BufferedImage Enemy_2_exp2;
	public static BufferedImage Enemy_2_exp3;
	public static BufferedImage Enemy_2_exp4;
	public static BufferedImage Enemy_2_exp5;
	public static BufferedImage Enemy_2_exp6;
	public static BufferedImage Enemy_2_exp7;
	public static BufferedImage Enemy_2_exp8;

	public static BufferedImage Enemy_1_exp1;
	public static BufferedImage Enemy_1_exp2;
	public static BufferedImage Enemy_1_exp3;
	public static BufferedImage Enemy_1_exp4;
	public static BufferedImage Enemy_1_exp5;
	public static BufferedImage Enemy_1_exp6;
	public static BufferedImage Enemy_1_exp7;
	public static BufferedImage Enemy_1_exp8;

	public static BufferedImage Explosion_Small_1;
	public static BufferedImage Explosion_Small_2;
	public static BufferedImage Explosion_Small_3;
	public static BufferedImage Explosion_Small_4;
	public static BufferedImage Explosion_Small_5;
	public static BufferedImage Explosion_Small_6;
	public static BufferedImage Explosion_Small_7;
	public static BufferedImage Explosion_Small_8;
	public static BufferedImage Explosion_Small_9;
	public static BufferedImage Explosion_Small_10;
	public static BufferedImage Explosion_Small_11;
	public static BufferedImage Explosion_Small_12;
	public static BufferedImage Explosion_Small_13;
	public static BufferedImage Explosion_Small_14;

	public static BufferedImage Explosion_medium_0;
	public static BufferedImage Explosion_medium_1;
	public static BufferedImage Explosion_medium_2;
	public static BufferedImage Explosion_medium_3;
	public static BufferedImage Explosion_medium_4;
	public static BufferedImage Explosion_medium_5;
	public static BufferedImage Explosion_medium_6;
	public static BufferedImage Explosion_medium_7;
	public static BufferedImage Explosion_medium_8;
	public static BufferedImage Explosion_medium_9;
	public static BufferedImage Explosion_medium_10;

	public static BufferedImage Explosion_ship_1_1;
	public static BufferedImage Explosion_ship_1_2;
	public static BufferedImage Explosion_ship_1_3;
	public static BufferedImage Explosion_ship_1_4;
	public static BufferedImage Explosion_ship_1_5;
	public static BufferedImage Explosion_ship_1_6;
	public static BufferedImage Explosion_ship_1_7;
	public static BufferedImage Explosion_ship_1_8;
	public static BufferedImage Explosion_ship_1_9;
	public static BufferedImage Explosion_ship_1_10;
	public static BufferedImage Explosion_ship_1_11;
	public static BufferedImage Explosion_ship_1_12;
	public static BufferedImage Explosion_ship_1_13;
	public static BufferedImage Explosion_ship_1_14;
	public static BufferedImage Explosion_ship_1_15;
	public static BufferedImage Explosion_ship_1_16;
	public static BufferedImage Explosion_ship_1_17;
	public static BufferedImage Explosion_ship_1_18;
	public static BufferedImage Explosion_ship_1_19;

	public static BufferedImage Explosion_ship_2_1;
	public static BufferedImage Explosion_ship_2_2;
	public static BufferedImage Explosion_ship_2_3;
	public static BufferedImage Explosion_ship_2_4;
	public static BufferedImage Explosion_ship_2_5;
	public static BufferedImage Explosion_ship_2_6;
	public static BufferedImage Explosion_ship_2_7;
	public static BufferedImage Explosion_ship_2_8;
	public static BufferedImage Explosion_ship_2_9;
	public static BufferedImage Explosion_ship_2_10;
	public static BufferedImage Explosion_ship_2_11;
	public static BufferedImage Explosion_ship_2_12;
	public static BufferedImage Explosion_ship_2_13;
	public static BufferedImage Explosion_ship_2_14;
	public static BufferedImage Explosion_ship_2_15;
	public static BufferedImage Explosion_ship_2_16;
	public static BufferedImage Explosion_ship_2_17;
	public static BufferedImage Explosion_ship_2_18;
	public static BufferedImage Explosion_ship_2_19;

	public static BufferedImage Explosion_ship_3_1;
	public static BufferedImage Explosion_ship_3_2;
	public static BufferedImage Explosion_ship_3_3;
	public static BufferedImage Explosion_ship_3_4;
	public static BufferedImage Explosion_ship_3_5;
	public static BufferedImage Explosion_ship_3_6;
	public static BufferedImage Explosion_ship_3_7;
	public static BufferedImage Explosion_ship_3_8;
	public static BufferedImage Explosion_ship_3_9;
	public static BufferedImage Explosion_ship_3_10;
	public static BufferedImage Explosion_ship_3_11;
	public static BufferedImage Explosion_ship_3_12;
	public static BufferedImage Explosion_ship_3_13;
	public static BufferedImage Explosion_ship_3_14;
	public static BufferedImage Explosion_ship_3_15;
	public static BufferedImage Explosion_ship_3_16;
	public static BufferedImage Explosion_ship_3_17;
	public static BufferedImage Explosion_ship_3_18;
	public static BufferedImage Explosion_ship_3_19;

	public static BufferedImage Yamato_1;
	public static BufferedImage Yamato_2;
	public static BufferedImage Yamato_3;

	public boolean Pause;

	private double IntroOverOpa;
	private int IntroIDs;

	private double IntroOpa;

	private int IntroCounter1;
	private int IntroCounter2;
	private int IntroCounter3;
	private int IntroCounter4;

	private String HighScoreFS;

	private int WriteHS;

	private int CounterHS;

	private float VolumeStart = -25.0f;
	public float Volume = VolumeStart;

	private boolean controlPressed;
	private boolean upPressed;
	private boolean downPressed;

	private boolean VolumeUp;
	private boolean VolumeDown;

	private boolean DevPressed;

	private int VolumeCounter;
	private float VolumeOpa;

	private boolean DEV = false;

	static {
		try {

			Yamato_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/yamato/yamato_1.png"));
			Yamato_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/yamato/yamato_2.png"));

			Yamato_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/yamato/yamato_3.png"));

			menuback = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/background_menu.png"));

			RetroFont1 = Font.createFont(Font.TRUETYPE_FONT,
					ClassLoader.getSystemClassLoader().getResourceAsStream("Fonts/04B_30__.TTF"));
			RetroFont2 = Font.createFont(Font.TRUETYPE_FONT,
					ClassLoader.getSystemClassLoader().getResourceAsStream("Fonts/coders_crux.ttf"));
			RetroFont3 = Font.createFont(Font.TRUETYPE_FONT,
					ClassLoader.getSystemClassLoader().getResourceAsStream("Fonts/Pixeled.ttf"));
			RetroFont4 = Font.createFont(Font.TRUETYPE_FONT,
					ClassLoader.getSystemClassLoader().getResourceAsStream("Fonts/3Dventure.ttf"));

			menupart1 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/menupart1.png"));

			aa1 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/aa1.png"));
			aa2 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/aa2.png"));
			aa3 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/aa3.png"));
			aa4 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/aa4.png"));
			aa5 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/aa5.png"));
			aa6 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/aa6.png"));

			enemy_rocket1_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy_rocket1.png"));
			enemy_rocket1_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy_rocket2.png"));

			enemyRocket_steam1 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemyRocket_steam1.png"));
			enemyRocket_steam2 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemyRocket_steam2.png"));
			enemyRocket_steam3 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemyRocket_steam3.png"));

			spaceship1 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1.png"));
			spaceship1_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1_1.png"));
			spaceship1_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1_2.png"));
			spaceship1_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1_3.png"));

			spaceship1_right_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1 right_1.png"));
			spaceship1_right_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1 right_2.png"));
			spaceship1_right_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1 right_3.png"));
			spaceship1_right_4 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1 right_4.png"));

			spaceship1_left_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1 left_1.png"));
			spaceship1_left_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1 left_2.png"));
			spaceship1_left_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1 left_3.png"));
			spaceship1_left_4 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship1 left_4.png"));

			spaceship2 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2.png"));
			spaceship2_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2_1.png"));
			spaceship2_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2_2.png"));
			spaceship2_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2_3.png"));

			spaceship2_right_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2 right_1.png"));
			spaceship2_right_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2 right_2.png"));
			spaceship2_right_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2 right_3.png"));
			spaceship2_right_4 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2 right_4.png"));

			spaceship2_left_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2 left_1.png"));
			spaceship2_left_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2 left_2.png"));
			spaceship2_left_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2 left_3.png"));
			spaceship2_left_4 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship2 left_4.png"));

			spaceship3 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3.png"));
			spaceship3_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3_1.png"));
			spaceship3_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3_2.png"));
			spaceship3_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3_3.png"));

			spaceship3_right_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3 right_1.png"));
			spaceship3_right_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3 right_2.png"));
			spaceship3_right_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3 right_3.png"));
			spaceship3_right_4 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3 right_4.png"));

			spaceship3_left_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3 left_1.png"));
			spaceship3_left_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3 left_2.png"));
			spaceship3_left_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3 left_3.png"));
			spaceship3_left_4 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/spaceship3 left_4.png"));

			backgroundTest = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/background.png"));

			ship3_rocket1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ship3_rocket1.png"));

			ship3_rocket2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ship3_rocket2.png"));

			smoke1 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/rocket1_steam1.png"));

			smoke2 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/rocket1_steam2.png"));
			smoke3 = ImageIO.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/rocket1_steam3.png"));

			Background1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund1.png"));
			Background2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund2.png"));
			Background3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund3.png"));
			Background4 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund4.png"));
			Background5 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund5.png"));
			Background6 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund6.png"));
			Background7 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund7.png"));
			Background8 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund8.png"));
			Background9 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund9.png"));
			Background10 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund10.png"));
			Background11 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund11.png"));
			Background12 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund12.png"));
			Background13 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund13.png"));
			Background14 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund14.png"));
			Background15 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund15.png"));
			Background16 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund16.png"));
			Background17 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund17.png"));
			Background18 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund18.png"));
			Background19 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund19.png"));
			Background20 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund20.png"));
			Background21 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund21.png"));
			Background22 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund22.png"));
			Background23 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund23.png"));
			Background24 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund24.png"));
			Background25 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund25.png"));
			Background26 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund26.png"));
			Background27 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund27.png"));
			Background28 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund28.png"));
			Background29 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund29.png"));
			Background30 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund30.png"));
			Background31 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund31.png"));
			Background32 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund32.png"));
			Background33 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund33.png"));
			Background34 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund34.png"));
			Background35 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund35.png"));
			Background36 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund36.png"));
			Background37 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund37.png"));
			Background38 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund38.png"));
			Background39 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund39.png"));
			Background40 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund40.png"));
			Background41 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund41.png"));
			Background42 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund42.png"));
			Background43 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund43.png"));
			Background44 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund44.png"));
			Background45 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund45.png"));
			Background46 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund46.png"));
			Background47 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund47.png"));
			Background48 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund48.png"));
			Background49 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund49.png"));
			Background50 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund50.png"));
			Background51 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund51.png"));
			Background52 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund52.png"));
			Background53 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund53.png"));
			Background54 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund54.png"));
			Background55 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund55.png"));
			Background56 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund56.png"));
			Background57 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Background/Hintergrund57.png"));

			Enemy_1_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy1_1.png"));
			Enemy_1_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy1_2.png"));
			Enemy_1_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy1_3.png"));

			Enemy_2_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy2_1.png"));
			Enemy_2_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy2_2.png"));
			Enemy_2_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy2_3.png"));

			Enemy_3_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy3_1.png"));
			Enemy_3_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy3_2.png"));
			Enemy_3_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Enemies/enemy3_3.png"));

			Enemy_3_exp1 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy3_exp1.png"));
			Enemy_3_exp2 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy3_exp2.png"));
			Enemy_3_exp3 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy3_exp3.png"));
			Enemy_3_exp4 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy3_exp4.png"));
			Enemy_3_exp5 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy3_exp5.png"));
			Enemy_3_exp6 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy3_exp6.png"));
			Enemy_3_exp7 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy3_exp7.png"));
			Enemy_3_exp8 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy3_exp8.png"));

			Enemy_2_exp1 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy2_exp1.png"));
			Enemy_2_exp2 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy2_exp2.png"));
			Enemy_2_exp3 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy2_exp3.png"));
			Enemy_2_exp4 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy2_exp4.png"));
			Enemy_2_exp5 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy2_exp5.png"));
			Enemy_2_exp6 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy2_exp6.png"));
			Enemy_2_exp7 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy2_exp7.png"));
			Enemy_2_exp8 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy2_exp8.png"));

			Enemy_1_exp1 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy1_exp1.png"));
			Enemy_1_exp2 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy1_exp2.png"));
			Enemy_1_exp3 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy1_exp3.png"));
			Enemy_1_exp4 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy1_exp4.png"));
			Enemy_1_exp5 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy1_exp5.png"));
			Enemy_1_exp6 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy1_exp6.png"));
			Enemy_1_exp7 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy1_exp7.png"));
			Enemy_1_exp8 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/EnemyExplosions/enemy1_exp8.png"));

			Explosion_Small_1 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_1.png"));
			Explosion_Small_2 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_2.png"));
			Explosion_Small_3 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_3.png"));
			Explosion_Small_4 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_4.png"));
			Explosion_Small_5 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_5.png"));
			Explosion_Small_6 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_6.png"));
			Explosion_Small_7 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_7.png"));
			Explosion_Small_8 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_8.png"));
			Explosion_Small_9 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_9.png"));
			Explosion_Small_10 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_10.png"));
			Explosion_Small_11 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_11.png"));
			Explosion_Small_12 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_12.png"));
			Explosion_Small_13 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_13.png"));
			Explosion_Small_14 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_Small_14.png"));

			Explosion_medium_0 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_medium_0.png"));
			Explosion_medium_1 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_medium_1.png"));
			Explosion_medium_2 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_medium_2.png"));
			Explosion_medium_3 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_medium_3.png"));
			Explosion_medium_4 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_medium_4.png"));
			Explosion_medium_5 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_medium_5.png"));
			Explosion_medium_6 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_medium_6.png"));
			Explosion_medium_7 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_medium_7.png"));
			Explosion_medium_8 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_medium_8.png"));
			Explosion_medium_9 = ImageIO.read(
					Mainclass.class.getClassLoader().getResourceAsStream("Pictures/Explosions/Explosion_medium_9.png"));
			Explosion_medium_10 = ImageIO.read(Mainclass.class.getClassLoader()
					.getResourceAsStream("Pictures/Explosions/Explosion_medium_10.png"));

			Explosion_ship_1_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_1.png"));
			Explosion_ship_1_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_2.png"));
			Explosion_ship_1_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_3.png"));
			Explosion_ship_1_4 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_4.png"));
			Explosion_ship_1_5 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_5.png"));
			Explosion_ship_1_6 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_6.png"));
			Explosion_ship_1_7 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_7.png"));
			Explosion_ship_1_8 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_8.png"));
			Explosion_ship_1_9 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_9.png"));
			Explosion_ship_1_10 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_10.png"));
			Explosion_ship_1_11 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_11.png"));
			Explosion_ship_1_12 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_12.png"));
			Explosion_ship_1_13 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_13.png"));
			Explosion_ship_1_14 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_14.png"));
			Explosion_ship_1_15 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_15.png"));
			Explosion_ship_1_16 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_16.png"));
			Explosion_ship_1_17 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_17.png"));
			Explosion_ship_1_18 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_18.png"));
			Explosion_ship_1_19 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/1_19.png"));

			Explosion_ship_2_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_1.png"));
			Explosion_ship_2_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_2.png"));
			Explosion_ship_2_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_3.png"));
			Explosion_ship_2_4 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_4.png"));
			Explosion_ship_2_5 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_5.png"));
			Explosion_ship_2_6 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_6.png"));
			Explosion_ship_2_7 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_7.png"));
			Explosion_ship_2_8 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_8.png"));
			Explosion_ship_2_9 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_9.png"));
			Explosion_ship_2_10 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_10.png"));
			Explosion_ship_2_11 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_11.png"));
			Explosion_ship_2_12 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_12.png"));
			Explosion_ship_2_13 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_13.png"));
			Explosion_ship_2_14 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_14.png"));
			Explosion_ship_2_15 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_15.png"));
			Explosion_ship_2_16 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_16.png"));
			Explosion_ship_2_17 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_17.png"));
			Explosion_ship_2_18 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_18.png"));
			Explosion_ship_2_19 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/2_19.png"));

			Explosion_ship_3_1 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_1.png"));
			Explosion_ship_3_2 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_2.png"));
			Explosion_ship_3_3 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_3.png"));
			Explosion_ship_3_4 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_4.png"));
			Explosion_ship_3_5 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_5.png"));
			Explosion_ship_3_6 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_6.png"));
			Explosion_ship_3_7 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_7.png"));
			Explosion_ship_3_8 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_8.png"));
			Explosion_ship_3_9 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_9.png"));
			Explosion_ship_3_10 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_10.png"));
			Explosion_ship_3_11 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_11.png"));
			Explosion_ship_3_12 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_12.png"));
			Explosion_ship_3_13 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_13.png"));
			Explosion_ship_3_14 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_14.png"));
			Explosion_ship_3_15 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_15.png"));
			Explosion_ship_3_16 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_16.png"));
			Explosion_ship_3_17 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_17.png"));
			Explosion_ship_3_18 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_18.png"));
			Explosion_ship_3_19 = ImageIO
					.read(Mainclass.class.getClassLoader().getResourceAsStream("Pictures/ShipExplosions/3_19.png"));

		} catch (IOException e) {
			e.printStackTrace();
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void start() {

		Thread thread = new Thread(this);
		thread.start();

		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);

		// Create a new blank cursor.
		blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "blank cursor");

		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				if (state == 2) {
					if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						right = true;

					}
					if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						left = true;

					}

					if (e.getKeyCode() == KeyEvent.VK_SPACE) {

						if (fire1cooldown < 1) {
							fire1 = true;
						} else {
							fire1 = false;
						}

					}
				}

				if (e.getKeyCode() == KeyEvent.VK_D) {

					DevPressed = true;

				}

				if (e.getKeyCode() == KeyEvent.VK_UP) {

					upPressed = true;

				}

				if (e.getKeyCode() == KeyEvent.VK_DOWN) {

					downPressed = true;

				}

				if (e.getKeyCode() == KeyEvent.VK_CONTROL) {

					controlPressed = true;

				}

				if (DEV) {

					if (e.getKeyCode() == KeyEvent.VK_2) {
						fire2 = true;

						Soundclass.playSound("explosion.wav", Volume);

					}

					if (e.getKeyCode() == KeyEvent.VK_9) {

						gameover = true;

					}

					if (e.getKeyCode() == KeyEvent.VK_8) {

						if (Soundclass.threadM == true) {
							Soundclass.threadM = false;
						} else {
							Soundclass.threadM = true;

						/*	Process p;
							try {
								p = Runtime.getRuntime().exec("cmd /c start cmd.exe");
								p.waitFor();
								
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
							
							*/
							
						}
					}

					if (e.getKeyCode() == KeyEvent.VK_0) {

						if (state == 2) {
							score += 200;
						}

					}

					if (e.getKeyCode() == KeyEvent.VK_S) {
						if (slowMo) {
							slowMo = false;
							pause = 15;

						} else {
							pause = 1000;
							slowMo = true;

						}
					}

				}

				if (e.getKeyCode() == KeyEvent.VK_SPACE) {

					if (state == 0) {
						state = 1;
					}

				}

				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {

					if (state == 2) {

						if (gameover == false) {
							if (pausepressed) {

								Soundclass.playSound("pauseout.wav", Volume);
								PauseMenuCounter = 0;
								pausepressed = false;
								Pause = false;

								if (state == 2) {

									setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
								}

							} else {

								Soundclass.playSound("pause.wav", Volume);
								pausepressed = true;
								Pause = true;

								if (state == 2) {
									setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
								}
							}
						}

					}

				}

			}
		});

		this.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {

				if (state == 2) {
					if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						left = false;
					}

					if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						right = false;
					}

					if (e.getKeyCode() == KeyEvent.VK_SPACE) {

						fire1 = false;
					}

				}

				if (DEV) {
					if (e.getKeyCode() == KeyEvent.VK_2) {
						fire2 = false;
					}

				}

				if (e.getKeyCode() == KeyEvent.VK_D) {

					DevPressed = false;

				}

				if (e.getKeyCode() == KeyEvent.VK_UP) {

					upPressed = false;

				}

				if (e.getKeyCode() == KeyEvent.VK_DOWN) {

					downPressed = false;

				}

				if (e.getKeyCode() == KeyEvent.VK_CONTROL) {

					controlPressed = false;

				}

			}
		});

		this.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {

				if (state == 1) {

					MousemoveArea.setBounds(e.getX(), e.getY(), 1, 1);

					if (MousemoveArea.intersects(Spaceship1Area)) {
						setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

					} else if (MousemoveArea.intersects(Spaceship2Area)) {
						setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

					} else if (MousemoveArea.intersects(Spaceship3Area)) {
						setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

					} else if (MousemoveArea.intersects(StartButton)) {
						setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

					} else
						setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
					{

					}

				} else if (state == 2) {

					MouseControllX = e.getX();

					if (MouseControllX > width / 2 + 50) {
						left = false;
						right = true;

					} else if (MouseControllX < width / 2 - 50) {
						right = false;
						left = true;

					} else {
						right = false;
						left = false;
					}

					if (Pause) {
						MousemoveArea.setBounds(e.getX(), e.getY(), 1, 1);
						if (MousemoveArea.intersects(PauseMenuBack)) {
							setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						} else if (MousemoveArea.intersects(PauseMenuCloseGame)) {
							setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

						} else {
							setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));

						}

					}

					if (gameover) {
						MousemoveArea.setBounds(e.getX(), e.getY(), 1, 1);
						if (MousemoveArea.intersects(GameOverMenuBack)) {
							setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						} else if (MousemoveArea.intersects(GameOverMenuCloseGame)) {
							setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

						} else {
							setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));

						}

					}

				}

				// System.out.println("Mouse Moved" + e.getX() + e.getY());

			}

		});

	}

	public void init() {

		// sets the scenario
		// 0 = normal game
		// 1 = test1
		// 2 = test2
		// 3 = test3

		scenario = 0;

		try (BufferedReader br = new BufferedReader(new FileReader("HighScore.txt"))) {

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			sb.append(line);

			HighScoreFS = sb.toString();

			HighScore = Long.parseLong(HighScoreFS);

		} catch (FileNotFoundException e) {

			System.out.println("File not Found!");
			HighScore = 0;

		} catch (IOException e) {

			System.out.println("IO EXCEPTION!");
			HighScore = 0;
		}

		// Soundclass.start();

		System.out.println("High Score: " + HighScore);

		WriteHS = 0;

		CounterHS = 0;

		allObjects = new Vector<>();
		Enemies = new Vector<>();
		Explosions = new Vector<>();
		EnemyWeapons = new Vector<>();

		enemyWeaponID = 1;

		opacity = 0;

		rocketcounter = 0;

		gameover = false;

		slowMo = false;

		sideMod = 1.3;

		WaveCounter = 0;

		pause = 15;
		pausepressed = false;

		setSize(width, height);
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		setBackground(Color.BLACK);
		enableEvents(MouseEvent.MOUSE_EVENT_MASK);

		initialized = true;

		MouseclickArea = new Rectangle();

		Spaceship1Area = new Rectangle();
		Spaceship2Area = new Rectangle();
		Spaceship3Area = new Rectangle();

		StartButton = new Rectangle();

		PauseMenuBack = new Rectangle();
		PauseMenuCloseGame = new Rectangle();

		GameOverMenuBack = new Rectangle();
		GameOverMenuCloseGame = new Rectangle();

		state = 0;
		chooseship = 0;
		introrunningcounter = 0;
		introduration = 1800;

		menupicturecounter = 0;
		startgame = false;

		Pause = false;

		PauseMenuCounter = 0;

		MaxDifferentBackgroundTypes = 58;

		score = 0;

		IntroOverOpa = 0;
		IntroIDs = 0;
		IntroOpa = 0;

		IntroCounter1 = 0;
		IntroCounter2 = 0;
		IntroCounter3 = 0;
		IntroCounter4 = 0;

		upPressed = false;
		downPressed = false;
		controlPressed = false;

		VolumeUp = false;
		VolumeDown = false;

		VolumeCounter = 0;
		VolumeOpa = 1;

		DevPressed = false;

	}

	@Override
	public void paint(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		switch (state) {

		case (0): {

			// intro sequence

			// generating the yamato and the background
			if (introrunningcounter == 0) {

				allObjects.add(new Backgroundgenerator(0, 0, this));
				Soundclass.playSound("spaceship_engine.wav", Volume + 10);
				allObjects.add(new Yamato(width / 2 - Yamato_1.getWidth() / 2, height - (Yamato_1.getHeight() + 150)));

				introrunningcounter++;

			}

			if (introrunningcounter < introduration) {

				for (int i = 0; i < BackgroundsBehind.size(); i++) {

					if (!BackgroundsBehind.get(i).Draw(this, g2d)) {
						BackgroundsBehind.remove(i);
						i--;
					}
				}

				for (int i = 0; i < Backgrounds2.size(); i++) {

					if (!Backgrounds2.get(i).Draw(this, g2d)) {
						Backgrounds2.remove(i);
						i--;
					}
				}

				for (int i = 0; i < Backgrounds.size(); i++) {

					if (!Backgrounds.get(i).Draw(this, g2d)) {
						Backgrounds.remove(i);
						i--;
					}
				}

				for (int i = 0; i < allObjects.size(); i++) {
					if (!allObjects.get(i).Draw(this, g2d)) {
						allObjects.remove(i);
						i--;
					}
				}

				for (int i = 0; i < EnemyWeapons.size(); i++) {
					if (!EnemyWeapons.get(i).Draw(this, g2d)) {
						EnemyWeapons.remove(i);
						i--;
					}
				}

				for (int i = 0; i < Explosions.size(); i++) {
					if (!Explosions.get(i).Draw(this, g2d)) {
						Explosions.remove(i);
						i--;
					}
				}

				if (introrunningcounter < 200) {
					if (IntroOpa < 0.8) {

						g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) IntroOpa));

						g2d.setColor(Color.CYAN);

						g2d.setFont(RetroFont2.deriveFont(50f));

						g2d.drawString("THE UCAS YAMATO", 75, 75);

						g2d.setColor(Color.lightGray);
						g2d.setFont(RetroFont2.deriveFont(25f));
						g2d.drawString("Press space to skip", width / 2 - 80, 20);

						g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

						if (IntroOpa + 0.03 > 0.8) {
							IntroOpa = 1;
						} else {
							IntroOpa += 0.03;
						}

					} else {

						g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) IntroOpa));

						g2d.setColor(Color.CYAN);

						g2d.setFont(RetroFont2.deriveFont(50f));

						g2d.drawString("THE UCAS YAMATO", 75, 75);

						g2d.setColor(Color.lightGray);
						g2d.setFont(RetroFont2.deriveFont(25f));
						g2d.drawString("Press space to skip", width / 2 - 80, 20);

						g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

					}

				} else if (introrunningcounter > 200) {

					if (IntroOpa > 0) {

						g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) IntroOpa));

						g2d.setColor(Color.CYAN);

						g2d.setFont(RetroFont2.deriveFont(50f));

						g2d.drawString("THE UCAS YAMATO", 75, 75);

						g2d.setColor(Color.lightGray);
						g2d.setFont(RetroFont2.deriveFont(25f));
						g2d.drawString("Press space to skip", width / 2 - 80, 20);

						g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

						IntroOpa -= 0.03;

					} else {

						IntroOpa = 0;
					}

				}

				// explosions

				if (introrunningcounter > 280) {

					if (introrunningcounter == 281) {

						Explosions.add(new ExplosionMedium(width / 2 + 40 - Explosion_medium_0.getWidth() / 2,
								height - 320 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(width / 2 + 35 - Explosion_medium_0.getWidth() / 2,
								height - 300 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(width / 2 + 53 - Explosion_medium_0.getWidth() / 2,
								height - 333 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(width / 2 + 60 - Explosion_medium_0.getWidth() / 2,
								height - 345 - Explosion_medium_0.getHeight() / 2));

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					} else if (introrunningcounter == 286) {

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					} else if (introrunningcounter == 291) {

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					}

					if (IntroCounter1 > 5) {

						Explosions.add(new ExplosionSmall(width / 2 + 40, height - 320));
						IntroCounter1 = 0;

					} else {
						IntroCounter1++;
					}

				}

				if (introrunningcounter > 390) {

					if (introrunningcounter == 391) {

						Explosions.add(new ExplosionMedium(width / 2 - 75 - Explosion_medium_0.getWidth() / 2,
								height - 220 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(width / 2 - 70 - Explosion_medium_0.getWidth() / 2,
								height - 235 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(width / 2 - 60 - Explosion_medium_0.getWidth() / 2,
								height - 213 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(width / 2 - 50 - Explosion_medium_0.getWidth() / 2,
								height - 200 - Explosion_medium_0.getHeight() / 2));

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					} else if (introrunningcounter == 396) {

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					} else if (introrunningcounter == 401) {

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					}

					if (IntroCounter2 > 2) {

						Explosions.add(new ExplosionSmall(width / 2 - 75, height - 220));
						IntroCounter2 = 0;

					} else {
						IntroCounter2++;
					}

				}

				if (introrunningcounter > 620) {

					if (introrunningcounter == 621) {

						Explosions.add(new ExplosionMedium(width / 2 - 40 - Explosion_medium_0.getWidth() / 2,
								height - 350 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(width / 2 - 54 - Explosion_medium_0.getWidth() / 2,
								height - 365 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(width / 2 - 27 - Explosion_medium_0.getWidth() / 2,
								height - 330 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(width / 2 - 60 - Explosion_medium_0.getWidth() / 2,
								height - 310 - Explosion_medium_0.getHeight() / 2));

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					} else if (introrunningcounter == 626) {

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					} else if (introrunningcounter == 631) {

						Soundclass.playSound("exp_medium.wav", Volume + 3);
					}

					if (IntroCounter3 > 3) {

						Explosions.add(new ExplosionSmall(width / 2 - 40, height - 350));
						IntroCounter3 = 0;

					} else {
						IntroCounter3++;
					}

				}

				if (introrunningcounter > 740) {

					if (introrunningcounter == 741) {

						Explosions.add(new ExplosionMedium(
								width / 2 - Explosion_Small_1.getWidth() / 2 - Explosion_medium_0.getWidth() / 2,
								height - 430 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(
								width / 2 - Explosion_Small_1.getWidth() / 2 - Explosion_medium_0.getWidth() / 2 - 15,
								height - 417 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(
								width / 2 - Explosion_Small_1.getWidth() / 2 - Explosion_medium_0.getWidth() / 2 + 8,
								height - 410 - Explosion_medium_0.getHeight() / 2));
						Explosions.add(new ExplosionMedium(
								width / 2 - Explosion_Small_1.getWidth() / 2 - Explosion_medium_0.getWidth() / 2 + 20,
								height - 450 - Explosion_medium_0.getHeight() / 2));

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					} else if (introrunningcounter == 746) {

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					} else if (introrunningcounter == 751) {

						Soundclass.playSound("exp_medium.wav", Volume + 3);

					}

					if (IntroCounter4 > 2) {

						Explosions.add(new ExplosionSmall(width / 2 - Explosion_Small_1.getWidth() / 2, height - 430));
						IntroCounter4 = 0;

					} else {
						IntroCounter4++;
					}

				}

				Random y = new Random();

				if (introrunningcounter > 120) {
					switch (y.nextInt(3)) {

					case (0): {

						if (y.nextInt(20) < 10) {

							Soundclass.playSound("shootufo.wav", Volume);
							EnemyWeapons.add(new WeaponShotEnemy(y.nextInt(width), 0, 1, 0, 0));
						}

						break;
					}

					case (1): {
						if (y.nextInt(200) < 10) {

							Soundclass.playSound("enemy_medium.wav", Volume + 3);
							EnemyWeapons.add(new WeaponShotEnemy(y.nextInt(width), 0, 2, 0, 0));
						}
						break;
					}

					case (2): {
						if (y.nextInt(50) < 10) {

							Soundclass.playSound("rocket_fire1.wav", Volume + 10);
							EnemyWeapons.add(new WeaponShotEnemy(y.nextInt(width), 0, 3, IntroIDs, 0));
							IntroIDs++;
						}
						break;
					}

					}
				}

				if (introrunningcounter > introduration - 600) {

					if (IntroOverOpa < 1) {

						IntroOverOpa += 0.004;

						Volume -= 0.05;

					} else {

						Volume = VolumeStart;

						state++;

					}

					int rn = y.nextInt(30);

					if (rn < 10) {

						if (rn < 3)
							Soundclass.playSound("exp_big_3.wav", Volume);

						if (rn < 2)
							Soundclass.playSound("exp_big_2.wav", Volume);

						Explosions.add(new ExplosionMedium(
								(width / 2 - Yamato_1.getWidth() / 2) + y.nextInt(Yamato_1.getWidth()),
								(height - Yamato_1.getHeight()) - (150 - y.nextInt(Yamato_1.getHeight()))));

					}

					g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) IntroOverOpa));
					g2d.setColor(Color.BLACK);
					g2d.fillRect(0, 0, width, height);

					// g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
					// 1f));

				}

				introrunningcounter++;
			} else {

				for (int i = 0; i < BackgroundsBehind.size(); i++) {

					BackgroundsBehind.remove(i);
					i--;

				}

				for (int i = 0; i < Backgrounds2.size(); i++) {

					if (!Backgrounds2.get(i).Draw(this, g2d)) {
						Backgrounds2.remove(i);
						i--;
					}
				}

				for (int i = 0; i < Backgrounds.size(); i++) {

					Backgrounds.remove(i);
					i--;

				}

				for (int i = 0; i < allObjects.size(); i++) {

					allObjects.remove(i);
					i--;
				}

				for (int i = 0; i < Enemies.size(); i++) {

					Enemies.remove(i);
					i--;
				}

				for (int i = 0; i < EnemyWeapons.size(); i++) {

					EnemyWeapons.remove(i);
					i--;
				}

				Volume = VolumeStart;

				state++;
				System.out.println("Intro Over!");
			}

			break;
		}

		case (1): {

			// menu for choosing the ship

			g2d.drawImage(menuback, 0, 0, this);

			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.35f));

			g2d.setColor(new Color(50, 139, 0));
			g2d.fillRect((int) spaceship1.getWidth() - 77, (int) height / 2 - spaceship1.getHeight() / 2 - 74,
					(int) (spaceship1.getWidth() * 5) + 154, (int) spaceship1.getHeight() + 148);
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
			g2d.fillRect(0, 65, width + 5, 5);
			g2d.fillRect(0, 90, width + 5, 5);

			g2d.setColor(Color.GREEN);
			g2d.setFont(RetroFont1.deriveFont(25f));
			g2d.drawString("Choose your Ship, Spacemarine!", 70, 45);
			g2d.fillRect(0, 70, width + 5, 20);

			for (int i = 0; i < 900; i++) {
				g2d.setColor(new Color(50, 139, 0));
				Random r = new Random();
				g2d.fillRect(0 + r.nextInt(width), 70 + r.nextInt(19), 7, 1);
			}

			g2d.setColor(Color.RED);
			g2d.fillRect((int) spaceship1.getWidth() - 82, (int) height / 2 - spaceship1.getHeight() / 2 - 79,
					(int) (spaceship1.getWidth() * 5) + 164, 5);
			g2d.fillRect((int) spaceship1.getWidth() - 82, (int) height / 2 - spaceship1.getHeight() / 2 - 79, 5,
					(int) spaceship1.getHeight() + 158);
			g2d.fillRect((int) spaceship1.getWidth() - 82,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 79) + (int) spaceship1.getHeight() + 153,
					(int) (spaceship1.getWidth() * 5) + 164, 5);
			g2d.fillRect((int) spaceship1.getWidth() - 82 + (int) (spaceship1.getWidth() * 5) + 159,
					(int) height / 2 - spaceship1.getHeight() / 2 - 79, 5, (int) spaceship1.getHeight() + 158);

			g2d.setFont(RetroFont1.deriveFont(15f));
			g2d.drawString("Mk.2 Frigate", (int) spaceship1.getWidth() - 16, 370);
			g2d.drawString("Laser Corvette", (int) spaceship1.getWidth() * 3 - 33, 370);
			g2d.drawString("Missile Cruiser", (int) spaceship1.getWidth() * 5 - 33, 370);

			g2d.setColor(Color.BLUE);
			g2d.setFont(RetroFont4.deriveFont(30f));
			g2d.drawString("Your Mothership the UCAS Yamato...", (int) spaceship1.getWidth() - 82, 130);
			g2d.drawString("HAS BEEN DESTROYED!", (int) spaceship1.getWidth() - 82, 180);
			g2d.drawString("get Your Revenge... destroy those aliens!", (int) spaceship1.getWidth() - 82, 280);
			g2d.drawString("3 fighters are left.... get 1 of them and..", (int) spaceship1.getWidth() - 82, 230);

			g2d.setFont(RetroFont4.deriveFont(35f));
			g2d.setColor(Color.CYAN);

			g2d.drawString("Description:", (int) spaceship1.getWidth() - 81,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 91) + (int) spaceship1.getHeight() + 210);

			g2d.setColor(Color.BLUE);

			g2d.drawString("Description:", (int) spaceship1.getWidth() - 82,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 92) + (int) spaceship1.getHeight() + 210);

			g2d.setColor(Color.CYAN);

			g2d.setFont(RetroFont2.deriveFont(29f));
			g2d.drawString("Fires multiple small", (int) spaceship1.getWidth() - 72,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 78) + (int) spaceship1.getHeight() + 240);

			g2d.drawString("Particle projectiles", (int) spaceship1.getWidth() - 72,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 78) + (int) spaceship1.getHeight() + 260);

			g2d.drawString("Fires one constant", (int) spaceship1.getWidth() * 3 - 47,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 78) + (int) spaceship1.getHeight() + 240);

			g2d.drawString("laser beam", (int) spaceship1.getWidth() * 3 - 47,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 78) + (int) spaceship1.getHeight() + 260);

			g2d.drawString("Fires multiple", (int) spaceship1.getWidth() * 5 - 37,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 78) + (int) spaceship1.getHeight() + 240);

			g2d.drawString("explosive missiles", (int) spaceship1.getWidth() * 5 - 37,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 78) + (int) spaceship1.getHeight() + 260);

			g2d.setColor(Color.BLUE);

			g2d.drawString("Fires multiple small", (int) spaceship1.getWidth() - 73,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 79) + (int) spaceship1.getHeight() + 240);

			g2d.drawString("Particle projectiles", (int) spaceship1.getWidth() - 73,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 79) + (int) spaceship1.getHeight() + 260);

			g2d.drawString("Fires one constant", (int) spaceship1.getWidth() * 3 - 48,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 79) + (int) spaceship1.getHeight() + 240);

			g2d.drawString("laser beam", (int) spaceship1.getWidth() * 3 - 48,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 79) + (int) spaceship1.getHeight() + 260);

			g2d.drawString("Fires multiple", (int) spaceship1.getWidth() * 5 - 38,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 79) + (int) spaceship1.getHeight() + 240);

			g2d.drawString("explosive missiles", (int) spaceship1.getWidth() * 5 - 38,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 79) + (int) spaceship1.getHeight() + 260);

			g2d.fillRect((int) spaceship1.getWidth() * 2 + spaceship1.getWidth() / 2 - 3,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 79) + (int) spaceship1.getHeight() + 215, 3, 55);

			g2d.fillRect((int) spaceship1.getWidth() * 4 + spaceship1.getWidth() / 2 - 3,
					(int) (height / 2 - spaceship1.getHeight() / 2 - 79) + (int) spaceship1.getHeight() + 215, 3, 55);

			g2d.drawImage(menupart1, (int) spaceship1.getWidth() - 27,
					(int) height / 2 - spaceship1.getHeight() / 2 - 24, this);

			g2d.drawImage(menupart1, (int) (spaceship1.getWidth() * 3) - 27,
					(int) height / 2 - spaceship1.getHeight() / 2 - 24, this);

			g2d.drawImage(menupart1, (int) (spaceship1.getWidth() * 5) - 27,
					(int) height / 2 - spaceship1.getHeight() / 2 - 24, this);

			// setting Bounds of the Ship Area Rectangles in order to be
			// able to
			// choose between the ships

			Spaceship1Area.setBounds((int) spaceship1.getWidth(), (int) height / 2 - spaceship1.getHeight() / 2,
					spaceship1.getWidth(), spaceship1.getHeight());
			Spaceship2Area.setBounds((int) spaceship2.getWidth() * 3, (int) height / 2 - spaceship2.getHeight() / 2,
					spaceship2.getWidth(), spaceship2.getHeight());
			Spaceship3Area.setBounds((int) spaceship2.getWidth() * 5, (int) height / 2 - spaceship2.getHeight() / 2,
					spaceship2.getWidth(), spaceship2.getHeight());

			// animations of the shown ships

			if (menupicturecounter <= 15) {

				g2d.drawImage(spaceship1, (int) spaceship1.getWidth(), (int) height / 2 - spaceship1.getHeight() / 2,
						this);
				g2d.drawImage(spaceship2, (int) spaceship2.getWidth() * 3,
						(int) height / 2 - spaceship2.getHeight() / 2, this);
				g2d.drawImage(spaceship3, (int) spaceship3.getWidth() * 5,
						(int) height / 2 - spaceship3.getHeight() / 2, this);

			} else if (menupicturecounter <= 30) {
				g2d.drawImage(spaceship1_1, (int) spaceship1.getWidth(), (int) height / 2 - spaceship1.getHeight() / 2,
						this);
				g2d.drawImage(spaceship2_1, (int) spaceship2.getWidth() * 3,
						(int) height / 2 - spaceship2.getHeight() / 2, this);
				g2d.drawImage(spaceship3_1, (int) spaceship3.getWidth() * 5,
						(int) height / 2 - spaceship3.getHeight() / 2, this);

			} else if (menupicturecounter <= 45) {
				g2d.drawImage(spaceship1_2, (int) spaceship1.getWidth(), (int) height / 2 - spaceship1.getHeight() / 2,
						this);
				g2d.drawImage(spaceship2_2, (int) spaceship2.getWidth() * 3,
						(int) height / 2 - spaceship2.getHeight() / 2, this);
				g2d.drawImage(spaceship3_2, (int) spaceship3.getWidth() * 5,
						(int) height / 2 - spaceship3.getHeight() / 2, this);

			} else if (menupicturecounter < 60) {
				g2d.drawImage(spaceship1_3, (int) spaceship1.getWidth(), (int) height / 2 - spaceship1.getHeight() / 2,
						this);
				g2d.drawImage(spaceship2_3, (int) spaceship2.getWidth() * 3,
						(int) height / 2 - spaceship2.getHeight() / 2, this);
				g2d.drawImage(spaceship3_3, (int) spaceship3.getWidth() * 5,
						(int) height / 2 - spaceship3.getHeight() / 2, this);

			} else if (menupicturecounter >= 60) {
				menupicturecounter = 0;
				g2d.drawImage(spaceship1, (int) spaceship1.getWidth(), (int) height / 2 - spaceship1.getHeight() / 2,
						this);
				g2d.drawImage(spaceship2, (int) spaceship2.getWidth() * 3,
						(int) height / 2 - spaceship2.getHeight() / 2, this);
				g2d.drawImage(spaceship3, (int) spaceship3.getWidth() * 5,
						(int) height / 2 - spaceship3.getHeight() / 2, this);

			}

			menupicturecounter++;

			// visualisation of which ship currently is chosen by the player

			switch (chooseship) {

			case (1): {

				g2d.setColor(Color.RED);
				g2d.drawRect((int) spaceship1.getWidth() - 30, (int) height / 2 - spaceship1.getHeight() / 2 - 27,
						menupart1.getWidth() + 6, menupart1.getHeight() + 6);
				g2d.setFont(RetroFont1.deriveFont(15f));
				g2d.drawString("Selected!", spaceship1.getWidth(), 600);

				break;
			}

			case (2): {

				g2d.setColor(Color.RED);
				g2d.drawRect((int) spaceship1.getWidth() * 3 - 30, (int) height / 2 - spaceship1.getHeight() / 2 - 27,
						menupart1.getWidth() + 6, menupart1.getHeight() + 6);
				g2d.setFont(RetroFont1.deriveFont(15f));
				g2d.drawString("Selected!", spaceship1.getWidth() * 3, 600);

				break;
			}

			case (3): {

				g2d.setColor(Color.RED);
				g2d.drawRect((int) spaceship1.getWidth() * 5 - 30, (int) height / 2 - spaceship1.getHeight() / 2 - 27,
						menupart1.getWidth() + 6, menupart1.getHeight() + 6);
				g2d.setFont(RetroFont1.deriveFont(15f));
				g2d.drawString("Selected!", spaceship1.getWidth() * 5, 600);

				break;

			}

			}

			// control of the starting button. if one ship is chosen, the
			// startbutton is
			// enabled.

			if (chooseship > 0) {

				StartButton.setBounds(spaceship1.getWidth() * 3 - 10, 795, spaceship1.getWidth() + 20, 80);
				g2d.setColor(new Color(50, 139, 0));
				g2d.fillRect(spaceship1.getWidth() * 3 - 10, 795, spaceship1.getWidth() + 20, 80);
				g2d.setColor(Color.GREEN);
				g2d.fillRect(spaceship1.getWidth() * 3 - 5, 800, spaceship1.getWidth() + 10, 70);
				g2d.setColor(Color.RED);
				g2d.setFont(RetroFont4.deriveFont(30f));
				g2d.drawString("Start!", spaceship1.getWidth() * 3 + 1, 845);

			} else {

				StartButton.setBounds(-80, -80, 1, 1);
				g2d.setColor(Color.DARK_GRAY);
				g2d.fillRect(spaceship1.getWidth() * 3 - 10, 795, spaceship1.getWidth() + 20, 80);
				g2d.setColor(Color.GRAY);
				g2d.fillRect(spaceship1.getWidth() * 3 - 5, 800, spaceship1.getWidth() + 10, 70);
				g2d.setColor(Color.DARK_GRAY);
				g2d.setFont(RetroFont4.deriveFont(30f));
				g2d.drawString("Start!", spaceship1.getWidth() * 3 + 1, 845);

			}

			// creates everything important for the game and starts it

			if (startgame && chooseship > 0) {

				for (int i = 0; i < BackgroundsBehind.size(); i++) {

					BackgroundsBehind.remove(i);
					i--;

				}

				for (int i = 0; i < Backgrounds2.size(); i++) {

					Backgrounds2.remove(i);
					i--;
				}

				for (int i = 0; i < Backgrounds.size(); i++) {

					Backgrounds.remove(i);
					i--;

				}

				for (int i = 0; i < allObjects.size(); i++) {

					allObjects.remove(i);
					i--;
				}

				for (int i = 0; i < Enemies.size(); i++) {

					Enemies.remove(i);
					i--;
				}

				for (int i = 0; i < EnemyWeapons.size(); i++) {

					EnemyWeapons.remove(i);
					i--;
				}

				switch (chooseship) {

				case (1): {

					PlayerHealth = 100;
					System.out.println("ship 1 chosen!");
					allObjects.add(new Backgroundgenerator(0, 0, this));
					allObjects.add(new Spaceship1(width / 2, height - spaceship1.getHeight() * 3));

					break;
				}

				case (2): {

					PlayerHealth = 300;
					System.out.println("ship 2 chosen!");
					allObjects.add(new Backgroundgenerator(0, 0, this));
					allObjects.add(new Spaceship2(width / 2, height - spaceship2.getHeight() * 3));

					break;
				}

				case (3): {

					PlayerHealth = 250;
					System.out.println("ship 3 chosen!");
					allObjects.add(new Backgroundgenerator(0, 0, this));
					allObjects.add(new Spaceship3(width / 2, height - spaceship3.getHeight() * 3));

					break;

				}

				}

				Soundclass.playSound("spaceship_engine.wav", Volume + 10);
				Pause = false;
				state++;

			}

			break;
		}

		case (2): {

			// the game itself

			if (Pause == false) {

				// execution of all objects mainmethods. highest one is in
				// background, lowest one in foreground

				if (initialized) {
					for (int i = 0; i < BackgroundsBehind.size(); i++) {

						if (!BackgroundsBehind.get(i).Draw(this, g2d)) {
							BackgroundsBehind.remove(i);
							i--;
						}
					}

					for (int i = 0; i < Backgrounds2.size(); i++) {

						if (!Backgrounds2.get(i).Draw(this, g2d)) {
							Backgrounds2.remove(i);
							i--;
						}
					}

					for (int i = 0; i < Backgrounds.size(); i++) {

						if (!Backgrounds.get(i).Draw(this, g2d)) {
							Backgrounds.remove(i);
							i--;
						}
					}

					for (int i = 0; i < allObjects.size(); i++) {
						if (!allObjects.get(i).Draw(this, g2d)) {
							allObjects.remove(i);
							i--;
						}
					}

					for (int i = 0; i < Enemies.size(); i++) {
						if (!Enemies.get(i).Draw(this, g2d)) {
							Enemies.remove(i);
							i--;
						}
					}

					for (int i = 0; i < EnemyWeapons.size(); i++) {
						if (!EnemyWeapons.get(i).Draw(this, g2d)) {
							EnemyWeapons.remove(i);
							i--;
						}
					}

					for (int i = 0; i < Explosions.size(); i++) {
						if (!Explosions.get(i).Draw(this, g2d)) {
							Explosions.remove(i);
							i--;
						}
					}

				}

				// HUD control

				g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.2f));
				g2d.setColor(new Color(0, 250, 154));
				g2d.fillRect(0, 0, width, 80);
				g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
				g2d.setColor(new Color(0, 100, 0));
				g2d.fillRect(0, 80, width, 10);

				g2d.setColor(Color.RED);
				g2d.fillRect(10, 85, width - 35, 2);

				// score display
				g2d.setFont(RetroFont4.deriveFont(40f));
				g2d.setColor(Color.MAGENTA);
				g2d.drawString("Score: " + score, 52, 46);
				g2d.setColor(Color.RED);
				g2d.drawString("Score: " + score, 51, 45);
				g2d.setColor(Color.GREEN);
				g2d.drawString("Score: " + score, 50, 44);

				g2d.setColor(Color.RED);
				g2d.fillRect(50, 50, 140, 3);

				g2d.setColor(Color.RED);
				g2d.setFont(RetroFont2.deriveFont(45f));
				g2d.drawString("Health:", width - 350, 35);

				g2d.drawString("Health:", width - 351, 36);
				g2d.setColor(Color.CYAN);
				g2d.drawString("Health:", width - 352, 37);

				// Healthbar control

				if (PlayerHealth > 0) {

					if (chooseship == 3) {

						g2d.setColor(Color.RED);
						g2d.fillRect(width - 350, 50, (int) (3 * (PlayerHealth / 2.5)), 10);

					} else if (chooseship == 2) {

						g2d.setColor(Color.RED);
						g2d.fillRect(width - 350, 50, (int) (3 * (PlayerHealth / 3)), 10);

					}

					else {
						g2d.setColor(Color.RED);
						g2d.fillRect(width - 350, 50, (int) (3 * PlayerHealth), 10);

						// PlayerHealth -= 0.1;
					}

				} else {

					gameover = true;
				}

				g2d.setColor(Color.CYAN);
				g2d.fillRect(width - 350, 50, 300, 2);
				g2d.fillRect(width - 350, 50, 2, 10);
				g2d.fillRect(width - 50, 50, 2, 10);
				g2d.fillRect(width - 350, 58, 300, 2);

				// weapon cooldown

				if (fire1cooldown > 0) {
					fire1cooldown--;
				}

				if (!gameover) {

					// enemy spawning control/difficulty control

					switch (scenario) {

					// normal scenario. normal game
					case (0): {
						Random t = new Random();
						if (score <= 300) {

							if (t.nextInt(550) < 10) {

								Enemies.add(new Enemy_Small_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_1_1.getHeight()));

							}

						}

						else if (score > 300 && score <= 500) {
							if (t.nextInt(450) < 10) {

								Enemies.add(new Enemy_Small_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_1_1.getHeight()));

							}

							if (t.nextInt(1800) < 10) {

								Enemies.add(new Enemy_Medium_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_2_1.getHeight(), enemyWeaponID));
								enemyWeaponID++;

							}

						}

						else if (score > 500 && score <= 700) {
							if (t.nextInt(550) < 10) {

								Enemies.add(new Enemy_Small_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_1_1.getHeight()));

							}

							if (t.nextInt(800) < 10) {

								Enemies.add(new Enemy_Medium_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_2_1.getHeight(), enemyWeaponID));
								enemyWeaponID++;

							}

						} else if (score > 700 && score <= 850) {
							if (t.nextInt(500) < 10) {

								Enemies.add(new Enemy_Small_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_1_1.getHeight()));

							}

							if (t.nextInt(800) < 10) {

								Enemies.add(new Enemy_Medium_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_2_1.getHeight(), enemyWeaponID));
								enemyWeaponID++;

							}

						}

						else if (score > 850 && score <= 950) {
							if (t.nextInt(500) < 10) {

								Enemies.add(new Enemy_Small_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_1_1.getHeight()));

							}

							if (t.nextInt(700) < 10) {

								Enemies.add(new Enemy_Medium_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_2_1.getHeight(), enemyWeaponID));
								enemyWeaponID++;

							}

						}

						else if (score > 950 && score <= 1050) {
							if (t.nextInt(550) < 10) {

								Enemies.add(new Enemy_Small_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_1_1.getHeight()));

							}

							if (t.nextInt(650) < 10) {

								Enemies.add(new Enemy_Medium_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_2_1.getHeight(), enemyWeaponID));
								enemyWeaponID++;

							}

						}

						else if (score > 1050 && score <= 1450) {
							if (t.nextInt(700) < 10) {

								Enemies.add(new Enemy_Small_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_1_1.getHeight()));

							}

							if (t.nextInt(700) < 10) {

								Enemies.add(new Enemy_Medium_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_2_1.getHeight(), enemyWeaponID));
								enemyWeaponID++;

							}

							if (t.nextInt(1300) < 10) {

								Enemies.add(new Enemy_Heavy_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_3_1.getHeight()));

							}

						}

						else if (score > 1450 && score <= 1750) {
							if (t.nextInt(1000) < 10) {

								Enemies.add(new Enemy_Small_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_1_1.getHeight()));

							}

							if (t.nextInt(700) < 10) {

								Enemies.add(new Enemy_Medium_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_2_1.getHeight(), enemyWeaponID));
								enemyWeaponID++;

							}

							if (t.nextInt(1200) < 10) {

								Enemies.add(new Enemy_Heavy_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_3_1.getHeight()));

							}

						}

						else if (score > 1750 && score <= 2000) {
							if (t.nextInt(1100) < 10) {

								Enemies.add(new Enemy_Small_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_1_1.getHeight()));

							}

							if (t.nextInt(800) < 10) {

								Enemies.add(new Enemy_Medium_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_2_1.getHeight(), enemyWeaponID));
								enemyWeaponID++;

							}

							if (t.nextInt(1200) < 10) {

								Enemies.add(new Enemy_Heavy_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_3_1.getHeight()));

							}

						}

						// insert new waves here

						else if (score > 2000) {
							if (t.nextInt(2000) < 10) {

								Enemies.add(new Enemy_Small_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_1_1.getHeight()));

							}

							if (t.nextInt(700) < 10) {

								Enemies.add(new Enemy_Medium_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_2_1.getHeight(), enemyWeaponID));
								enemyWeaponID++;

							}

							if (t.nextInt(1000) < 10) {

								Enemies.add(new Enemy_Heavy_1(-300 + t.nextInt(width + 600),
										-300 + t.nextInt(300) - Enemy_3_1.getHeight()));

							}

						}

						break;
					}

					// for test. only small enemies.
					case (1): {

						if (WaveCounter < 1) {

							Random RandomE = new Random();

							for (int i = 0; i < 10; i++) {
								Enemies.add(new Enemy_Heavy_1(0 + RandomE.nextInt(width), 0 + RandomE.nextInt(300)));
							}

							WaveCounter++;
						}

						break;
					}

					// for test. only medium enemies;
					case (2): {

						if (WaveCounter < 1) {

							Random RandomE = new Random();

							for (int i = 0; i < 10; i++) {
								Enemies.add(new Enemy_Heavy_1(0 + RandomE.nextInt(width), 0 + RandomE.nextInt(300)));

							}

							WaveCounter++;
						}

						break;
					}

					// for test. both types
					case (3): {

						if (WaveCounter < 1) {

							Random RandomE = new Random();

							for (int i = 0; i < 15; i++) {
								Enemies.add(new Enemy_Small_1(0 + RandomE.nextInt(width), 0 + RandomE.nextInt(300)));
							}

							for (int i = 0; i < 15; i++) {
								Enemies.add(new Enemy_Medium_1(0 + RandomE.nextInt(width), 0 + RandomE.nextInt(300),
										enemyWeaponID));
								enemyWeaponID++;
							}

							WaveCounter++;
						}

						break;
					}

					}

				} else if (gameover) {

					double xspace;
					double yspace;

					for (int i = 0; i < allObjects.size(); i++) {

						if (allObjects.get(i) instanceof Spaceship1 || allObjects.get(i) instanceof Spaceship2
								|| allObjects.get(i) instanceof Spaceship3) {

							xspace = allObjects.get(i).getX();
							yspace = allObjects.get(i).getY();

							xspace = xspace - spaceship1.getWidth() / 2;
							yspace = yspace + spaceship1.getHeight() / 2;

							allObjects.remove(i);
							i--;

							Soundclass.playSound("exp_big_3.wav", Volume);
							Explosions.add(new ShipExplosion1(xspace, yspace, chooseship));
						}

					}

					if (opacity < 0.75) {
						opacity += 0.015;
					}

					g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) opacity));

					g2d.setColor(Color.DARK_GRAY);
					g2d.fillRect(0, 0, width, height);

					g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

					g2d.setFont(RetroFont4.deriveFont(65f));
					g2d.setColor(Color.MAGENTA);
					g2d.drawString("GAME OVER!!11!!!", width / 2 - 278, 192);
					g2d.setColor(Color.RED);

					g2d.drawString("GAME OVER!!11!!!", width / 2 - 279, 191);

					g2d.setColor(Color.GREEN);

					g2d.drawString("GAME OVER!!11!!!", width / 2 - 280, 190);

					// gt.setColor(new Color( 0, 100,0));
					g2d.setColor(Color.GRAY);
					g2d.fillRect(200, 250, width - 400, 75);
					g2d.setColor(new Color(0, 100, 0));
					g2d.fillRect(200, 250, width - 400, 5);
					g2d.fillRect(200, 250, 5, 75);
					g2d.fillRect(200, 320, width - 400, 5);
					g2d.fillRect(545, 250, 5, 75);
					g2d.setColor(Color.RED);
					g2d.setFont(RetroFont2.deriveFont(50f));
					g2d.drawString("Back to Main Menu", 215, 295);
					g2d.drawString("Back to Main Menu", 216, 296);
					g2d.drawString("Back to Main Menu", 217, 297);

					GameOverMenuBack.setBounds(200, 250, width - 400, 75);

					g2d.setColor(Color.GRAY);
					g2d.fillRect(200, 400, width - 400, 75);
					g2d.setColor(new Color(0, 100, 0));
					g2d.fillRect(200, 400, width - 400, 5);
					g2d.fillRect(200, 400, 5, 75);
					g2d.fillRect(200, 470, width - 400, 5);
					g2d.fillRect(545, 400, 5, 75);
					g2d.setColor(Color.RED);
					g2d.setFont(RetroFont2.deriveFont(50f));
					g2d.drawString("Close Game", 280, 445);
					g2d.drawString("Close Game", 281, 446);
					g2d.drawString("Close Game", 282, 447);

					GameOverMenuCloseGame.setBounds(200, 400, width - 400, 75);

					if (score < HighScore) {

						g2d.setColor(Color.MAGENTA);
						g2d.setFont(RetroFont4.deriveFont(50f));
						g2d.drawString("FINAL SCORE:  " + score + "  !!!!", 102, 622);
						g2d.setColor(Color.RED);
						g2d.drawString("FINAL SCORE:  " + score + "  !!!!", 101, 621);
						g2d.setColor(Color.GREEN);
						g2d.drawString("FINAL SCORE:  " + score + "  !!!!", 100, 620);

						g2d.setColor(Color.MAGENTA);
						g2d.setFont(RetroFont4.deriveFont(50f));
						g2d.drawString("High Score:  " + HighScore + "  !!!!", 62, 682);
						g2d.setColor(Color.RED);
						g2d.drawString("High Score:  " + HighScore + "  !!!!", 61, 681);
						g2d.setColor(Color.GREEN);
						g2d.drawString("High Score:  " + HighScore + "  !!!!", 60, 680);

					} else {

						if (CounterHS > 60) {

							if (WriteHS == 0) {
								saveHS();
								WriteHS++;
							}

						}

						CounterHS++;

						g2d.setColor(Color.CYAN);
						g2d.setFont(RetroFont4.deriveFont(50f));
						g2d.drawString("NEW HIGH SCORE! :", 142, 652);
						g2d.setColor(Color.DARK_GRAY);
						g2d.drawString("NEW HIGH SCORE! :", 141, 651);
						g2d.setColor(Color.RED);
						g2d.drawString("NEW HIGH SCORE! :", 140, 650);

						g2d.setColor(Color.CYAN);
						g2d.setFont(RetroFont4.deriveFont(50f));
						g2d.drawString("" + score, width / 2 + 2 - 70, 702);
						g2d.setColor(Color.DARK_GRAY);
						g2d.drawString("" + score, width / 2 + 1 - 70, 701);
						g2d.setColor(Color.RED);
						g2d.drawString("" + score, width / 2 - 70, 700);

					}

				}

			} else if (Pause == true && !gameover) {

				// Pause! here it does nothing!

			}
			break;
		}

		}

		VolumeControlDisplay(g2d);

		if (DEV) {
			g2d.setFont(RetroFont2.deriveFont(30f));

			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));

			g2d.setColor(Color.MAGENTA);

			g2d.fillRect(17, 100, 260, 27);

			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

			g2d.setColor(Color.RED);
			g2d.drawString("WARNING!!!", 20, 120);

			g2d.setFont(RetroFont2.deriveFont(20f));
			g2d.setColor(Color.WHITE);
			g2d.drawString("DEV MODE ACTIVE!!!", 130, 118);

		}
	}

	@Override
	public void update(Graphics g) {

		if (Pause == true && state == 2) {

			// Pause Menu

			Graphics2D gt = (Graphics2D) g;

			if (PauseMenuCounter < 30) {

				gt.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.05f));
				gt.setColor(Color.LIGHT_GRAY);
				gt.fillRect(0, 0, width, height);
				gt.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
				PauseMenuCounter++;
			}

			gt.setColor(Color.RED);
			gt.setFont(RetroFont4.deriveFont(55f));
			gt.drawString("PAUSE!", width / 2 - 100, 190);

			gt.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.05f));
			// gt.setColor(new Color( 0, 100,0));
			gt.setColor(Color.GRAY);
			gt.fillRect(200, 250, width - 400, 75);
			gt.setColor(new Color(0, 100, 0));
			gt.fillRect(200, 250, width - 400, 5);
			gt.fillRect(200, 250, 5, 75);
			gt.fillRect(200, 320, width - 400, 5);
			gt.fillRect(545, 250, 5, 75);
			gt.setColor(Color.RED);
			gt.setFont(RetroFont2.deriveFont(50f));
			gt.drawString("Back to Main Menu", 215, 295);
			gt.drawString("Back to Main Menu", 216, 296);
			gt.drawString("Back to Main Menu", 217, 297);
			gt.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));

			PauseMenuBack.setBounds(200, 250, width - 400, 75);

			gt.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.05f));
			gt.setColor(Color.GRAY);
			gt.fillRect(200, 400, width - 400, 75);
			gt.setColor(new Color(0, 100, 0));
			gt.fillRect(200, 400, width - 400, 5);
			gt.fillRect(200, 400, 5, 75);
			gt.fillRect(200, 470, width - 400, 5);
			gt.fillRect(545, 400, 5, 75);
			gt.setColor(Color.RED);
			gt.setFont(RetroFont2.deriveFont(50f));
			gt.drawString("Close Game", 280, 445);
			gt.drawString("Close Game", 281, 446);
			gt.drawString("Close Game", 282, 447);
			gt.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));

			PauseMenuCloseGame.setBounds(200, 400, width - 400, 75);

			gt.setColor(Color.RED);
			gt.setFont(RetroFont4.deriveFont(35f));
			gt.drawString("Press ESC to get back to the game!", width / 2 - 340, 570);

			// System.out.println("PAUSE!");

		} else {

			if (IMG == null) {
				IMG = createImage(this.getSize().width, this.getSize().height);
				DB = IMG.getGraphics();
			}
			DB.setColor(getBackground());
			DB.fillRect(0, 0, this.getSize().width, this.getSize().height);

			DB.setColor(getForeground());
			paint(DB);

			g.drawImage(IMG, 0, 0, this);
		}

	}

	public void addObject(AnimatedObject animatedthing) {
		allObjects.add(animatedthing);
	}

	@Override
	public void run() {

		if (initialized)
			while (true) {

				try {
					Thread.sleep((int) pause);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (state > 0) {

					if (soundtrackCounter == 12000) {
						soundtrackCounter--;
						Soundclass.playSound("RA - GLU.wav", Volume + 5);

					} else {

						soundtrackCounter--;

					}

					if (soundtrackCounter < 0) {

						soundtrackCounter = 12000;
					}
				}

				if (controlPressed == true && upPressed == true)

				{

					VolumeUp = true;

				} else {

					VolumeUp = false;

				}

				if (controlPressed == true && downPressed == true) {

					VolumeDown = true;

				} else {

					VolumeDown = false;

				}

				if (DevPressed == true && controlPressed == true) {

					if (DEV == false) {

						DEV = true;

						DevPressed = false;

					} else if (DEV == true) {

						DEV = false;

						if (slowMo == true) {
							slowMo = false;
							pause = 15;
						}

						DevPressed = false;
					}

				}

				if (Pause == false) {

					repaint();

					if (left == true && gameover == false) {

						for (int i = 0; i < allObjects.size(); i++) {
							try {
								if (allObjects.get(i) instanceof Backgroundgenerator) {
									allObjects.get(i).setX(sideMod);

								}
								if (allObjects.get(i) instanceof Spaceship1) {
									allObjects.get(i).unsetright();
									allObjects.get(i).setleft();
								}

								if (allObjects.get(i) instanceof Spaceship2) {
									allObjects.get(i).unsetright();
									allObjects.get(i).setleft();
								}

								if (allObjects.get(i) instanceof Spaceship3) {
									allObjects.get(i).unsetright();
									allObjects.get(i).setleft();
								}

								if (allObjects.get(i) instanceof WeaponShot) {
									allObjects.get(i).setX(sideMod);
								}

							} catch (ArrayIndexOutOfBoundsException e) {
								i--;
							}

						}

						for (int i = 0; i < Enemies.size(); i++) {

							try {
								Enemies.get(i).setX(sideMod);
							} catch (ArrayIndexOutOfBoundsException e) {
								i--;
							}

						}

						for (int i = 0; i < EnemyWeapons.size(); i++) {

							try {
								if (EnemyWeapons.get(i).getType() != 2) {
									EnemyWeapons.get(i).setX(sideMod);
								} else {
									// EnemyWeapons.get(i).setX(-sideMod);
								}
							} catch (ArrayIndexOutOfBoundsException e) {
								i--;
							}

						}

						for (int i = 0; i < Explosions.size(); i++) {

							try {
								Explosions.get(i).setX(sideMod);
							} catch (ArrayIndexOutOfBoundsException e) {
								i--;
								Explosions.get(i).setX(sideMod);
							}
						}

						// System.out.println("left");

					}

					else if (right == true && gameover == false) {

						for (int i = 0; i < allObjects.size(); i++) {

							try {

								if (allObjects.get(i) instanceof Backgroundgenerator) {
									allObjects.get(i).setX(-sideMod);

								}
								if (allObjects.get(i) instanceof Spaceship1) {
									allObjects.get(i).unsetleft();
									allObjects.get(i).setright();
								}

								if (allObjects.get(i) instanceof Spaceship2) {
									allObjects.get(i).unsetleft();
									allObjects.get(i).setright();
								}

								if (allObjects.get(i) instanceof Spaceship3) {
									allObjects.get(i).unsetleft();
									allObjects.get(i).setright();
								}

								if (allObjects.get(i) instanceof WeaponShot) {
									allObjects.get(i).setX(-sideMod);
								}
							} catch (ArrayIndexOutOfBoundsException e) {
								i--;
							}

						}

						for (int i = 0; i < Enemies.size(); i++) {

							try {
								Enemies.get(i).setX(-sideMod);
							} catch (ArrayIndexOutOfBoundsException e) {
								i--;
							}

						}

						for (int i = 0; i < EnemyWeapons.size(); i++) {

							try {
								if (EnemyWeapons.get(i).getType() != 2) {

									EnemyWeapons.get(i).setX(-sideMod);
								} else {

									// EnemyWeapons.get(i).setX(sideMod);

								}
							} catch (ArrayIndexOutOfBoundsException e) {
								i--;
							}

						}

						for (int i = 0; i < Explosions.size(); i++) {

							try {

								Explosions.get(i).setX(-sideMod);
							} catch (ArrayIndexOutOfBoundsException e) {
								i--;
							}
						}

						// System.out.println("right");

					} else {
						for (int i = 0; i < allObjects.size(); i++) {
							try {

								if (allObjects.get(i) instanceof Spaceship1) {
									allObjects.get(i).unsetright();
									allObjects.get(i).unsetleft();

								}

								if (allObjects.get(i) instanceof Spaceship2) {
									allObjects.get(i).unsetright();
									allObjects.get(i).unsetleft();

								}

								if (allObjects.get(i) instanceof Spaceship3) {
									allObjects.get(i).unsetright();
									allObjects.get(i).unsetleft();

								}
							} catch (ArrayIndexOutOfBoundsException e) {
								i--;
							}
						}
					}

					if (fire1 == true) {

						switch (chooseship) {

						case (1): {

							// weaponcontrol of ship type 1

							fire1cooldown = 20;

							Soundclass.playSound("particle_shot.wav", Volume);

							fire1 = false;
							int hold = 0;
							int holdy = 0;
							for (int i = 0; i < allObjects.size(); i++) {
								if (allObjects.get(i) instanceof Spaceship1) {
									hold = (int) allObjects.get(i).getX();
									holdy = (int) allObjects.get(i).getY();
									allObjects
											.add(new WeaponShot(hold - 1, holdy + spaceship1.getWidth() / 2 + 9, 1, 0));
									allObjects.add(
											new WeaponShot(hold - 25, holdy + spaceship1.getWidth() / 2 + 29, 1, 0));
									allObjects.add(
											new WeaponShot(hold + 23, holdy + spaceship1.getWidth() / 2 + 29, 1, 0));

								}

							}

							// System.out.println("Mainweapon");

							break;
						}

						case (2): {

							// weaponcontrol of ship type 2

							fire1cooldown = 240;

							Soundclass.playSound("spaceship2.wav", Volume);

							fire1 = false;
							int hold = 0;
							int holdy = 0;
							for (int i = 0; i < allObjects.size(); i++) {
								if (allObjects.get(i) instanceof Spaceship2) {
									hold = (int) allObjects.get(i).getX() - 2;
									holdy = 0;
									allObjects.add(new WeaponShot(hold, holdy, 2, 0));
								}

							}

							// System.out.println("Mainweapon");

							break;
						}

						case (3): {

							// weaponcontrol of ship type 3

							fire1cooldown = 60;

							Soundclass.playSound("rocket_fire.wav", Volume);

							fire1 = false;
							int hold = 0;
							int holdy = 0;
							for (int i = 0; i < allObjects.size(); i++) {
								if (allObjects.get(i) instanceof Spaceship3) {
									hold = (int) allObjects.get(i).getX();
									holdy = (int) allObjects.get(i).getY();
									rocketcounter++;
									allObjects.add(new WeaponShot(hold - ship3_rocket1.getWidth() / 2, holdy + 80, 3,
											rocketcounter));
									rocketcounter++;
									allObjects.add(new WeaponShot(hold - ship3_rocket1.getWidth() / 2 - 20, holdy + 100,
											3, rocketcounter));
									rocketcounter++;
									allObjects.add(new WeaponShot(hold - ship3_rocket1.getWidth() / 2 + 20, holdy + 100,
											3, rocketcounter));
								}
							}

							break;
						}

						}

					}

					if (fire2 == true) {
						System.out.println("secondary weapon");
					}

				} else if (Pause == true) {

					repaint();

				}
			}

	}

	public void changePlayerHealth(double change) {

		for (int i = 0; i < allObjects.size(); i++) {

			if (allObjects.get(i) instanceof Spaceship1 || allObjects.get(i) instanceof Spaceship2
					|| allObjects.get(i) instanceof Spaceship3) {

				allObjects.get(i).setHealth(change);

			}

		}

		PlayerHealth = PlayerHealth + change;

	}

	public void processMouseEvent(MouseEvent e) {

		if (MouseEvent.MOUSE_PRESSED == e.getID()) {

			int x = e.getX();
			int y = e.getY();

			if (state == 1) {

				MouseclickArea.setBounds(x, y, 1, 1);

				if (MouseclickArea.intersects(Spaceship1Area)) {
					chooseship = 1;
					System.out.println("ship 1 selected!");
					Soundclass.playSound("menu_1.wav", Volume);
				} else if (MouseclickArea.intersects(Spaceship2Area)) {
					chooseship = 2;
					System.out.println("ship 2 selected!");
					Soundclass.playSound("menu_1.wav", Volume);
				} else if (MouseclickArea.intersects(Spaceship3Area)) {
					chooseship = 3;
					System.out.println("ship 3 selected!");
					Soundclass.playSound("menu_1.wav", Volume);
				} else if (MouseclickArea.intersects(StartButton)) {

					Soundclass.playSound("start_2.wav", Volume);
					setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
					startgame = true;

				} else

				{
					Soundclass.playSound("ship_unselected_1.wav", Volume);
					System.out.println("no ship selected!");
					chooseship = 0;
				}

			} else if (state == 2) {

				if (Pause) {

					MouseclickArea.setBounds(x, y, 1, 1);

					if (MouseclickArea.intersects(PauseMenuBack)) {

						Soundclass.playSound("menu_2.wav", Volume + 5);

						if (score > HighScore)
							saveHS();
						backToGameMenu();

					}

					if (MouseclickArea.intersects(PauseMenuCloseGame)) {

						Soundclass.playSound("menu_2.wav", Volume + 5);

						if (score > HighScore)
							saveHS();
						closeGame();
					}

				}

				if (gameover) {

					MouseclickArea.setBounds(x, y, 1, 1);

					if (MouseclickArea.intersects(GameOverMenuBack)) {

						Soundclass.playSound("menu_2.wav", Volume + 5);

						if (score > HighScore)
							saveHS();

						backToGameMenu();

					}

					if (MouseclickArea.intersects(GameOverMenuCloseGame)) {

						Soundclass.playSound("menu_2.wav", Volume + 5);

						if (score > HighScore)
							saveHS();

						closeGame();
					}

				} else {

					if (e.getButton() == 1) {
						if (fire1cooldown < 1) {
							fire1 = true;
						} // *
						else {
							fire1 = false;
						} // */
					}

					if (e.getButton() == 2) {
						fire2 = true;

					}
				}

			}

			// System.out.println("*click* x: " + x + " y: " + y);

		}

	}

	private void closeGame() {
		this.stop();
		this.destroy();
		System.exit(0);

	}

	private void saveHS() {

		try (PrintWriter out = new PrintWriter("HighScore.txt")) {

			out.flush();

			out.println(score);
		} catch (FileNotFoundException e) {

			System.out.println("File not Found!");

		}

	}

	private void VolumeControlDisplay(Graphics2D g2d) {

		if (VolumeUp) {

			Volume += 0.05;

			VolumeCounter = 120;
			VolumeOpa = 1;

		} else if (VolumeDown) {

			Volume -= 0.05;

			VolumeCounter = 120;
			VolumeOpa = 1;
		}

		if (VolumeCounter > 0) {

			double Vol = (int) (Volume * 10 - VolumeStart * 10);

			double pVol = Vol / 10;

			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) VolumeOpa));
			g2d.setColor(Color.WHITE);
			g2d.setFont(RetroFont2.deriveFont(30f));
			g2d.drawString("Volume:", 20, 840);

			if (pVol >= 0) {

				g2d.drawString("+" + pVol + "  dB", 20, 860);
			} else {

				g2d.drawString("" + pVol + "  dB", 20, 860);

			}

			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) 1f));

			if (VolumeOpa > 0.01) {
				VolumeOpa -= 0.01;

			}

			VolumeCounter--;
		} else if (VolumeCounter < 0) {

			VolumeOpa = 1;
			VolumeCounter = 0;

		}

	}

	private void backToGameMenu() {
		fire1cooldown = 1;
		PlayerHealth = 0;
		score = 0;
		WaveCounter = 0;
		rocketcounter = 0;
		state = 1;
		chooseship = 0;
		PauseMenuCounter = 0;

		enemyWeaponID = 1;

		opacity = 0;

		Pause = false;
		startgame = false;
		gameover = false;
		pausepressed = false;

		try (BufferedReader br = new BufferedReader(new FileReader("HighScore.txt"))) {

			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			sb.append(line);

			HighScoreFS = sb.toString();

			HighScore = Long.parseLong(HighScoreFS);

		} catch (FileNotFoundException e) {

			System.out.println("File not Found!");
			HighScore = 0;

		} catch (IOException e) {

			System.out.println("IO EXCEPTION!");
			HighScore = 0;
		}

		System.out.println("High Score: " + HighScore);

		WriteHS = 0;

		CounterHS = 0;

		for (int i = 0; i < BackgroundsBehind.size(); i++) {

			BackgroundsBehind.remove(i);
			i--;

		}
		for (int i = 0; i < Backgrounds.size(); i++) {

			Backgrounds.remove(i);
			i--;

		}

		for (int i = 0; i < Backgrounds2.size(); i++) {

			Backgrounds2.remove(i);
			i--;

		}

		for (int i = 0; i < allObjects.size(); i++) {

			allObjects.remove(i);
			i--;
		}

		for (int i = 0; i < Enemies.size(); i++) {

			Enemies.remove(i);
			i--;
		}

		for (int i = 0; i < EnemyWeapons.size(); i++) {

			EnemyWeapons.remove(i);
			i--;
		}

		for (int i = 0; i < Explosions.size(); i++) {

			Explosions.remove(i);
			i--;
		}
	}

}
