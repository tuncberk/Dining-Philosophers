import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Semaphore;

class Table {

	// FOR GUI:
	static JFrame frame;
	private JLabel[] plates = new JLabel[5];
	private JLabel[] forks = new JLabel[5];
	static Table window;
	static BufferedImage fork;

	/**
	 * Launch the application.
	 * 
	 * /** Create the application.
	 */
	public Table() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		BufferedImage plate = null;
		try {
			plate = ImageIO.read(new File("spaghetti_blue.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame.getContentPane().setLayout(null);
		plates[0] = new JLabel(new ImageIcon(plate));
		plates[0].setBounds(185, 10, 100, 100);
		frame.getContentPane().add(plates[0]);
		plates[0].setVisible(false);

		plates[1] = new JLabel(new ImageIcon(plate));
		plates[1].setBounds(300, 100, 100, 100);
		frame.getContentPane().add(plates[1]);
		plates[1].setVisible(false);

		plates[2] = new JLabel(new ImageIcon(plate));
		plates[2].setBounds(230, 230, 100, 100);
		frame.getContentPane().add(plates[2]);
		plates[2].setVisible(false);

		plates[3] = new JLabel(new ImageIcon(plate));
		plates[3].setBounds(70, 210, 100, 100);
		frame.getContentPane().add(plates[3]);
		plates[3].setVisible(false);

		plates[4] = new JLabel(new ImageIcon(plate));
		plates[4].setBounds(50, 80, 100, 100);
		frame.getContentPane().add(plates[4]);
		plates[4].setVisible(false);

		try {
			fork = ImageIO.read(new File("fork_white_1.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		forks[0] = new JLabel(new ImageIcon(fork));
		forks[0].setBounds(250, 40, 100, 100);
		frame.getContentPane().add(forks[0]);

		try {
			fork = ImageIO.read(new File("fork_white_2.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		forks[1] = new JLabel(new ImageIcon(fork));
		forks[1].setBounds(280, 170, 100, 100);
		frame.getContentPane().add(forks[1]);

		try {
			fork = ImageIO.read(new File("fork_white_3.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		forks[2] = new JLabel(new ImageIcon(fork));
		forks[2].setBounds(150, 220, 100, 100);
		frame.getContentPane().add(forks[2]);

		try {
			fork = ImageIO.read(new File("fork_white_4.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		forks[3] = new JLabel(new ImageIcon(fork));
		forks[3].setBounds(60, 145, 100, 100);
		frame.getContentPane().add(forks[3]);

		try {
			fork = ImageIO.read(new File("fork_white_5.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		forks[4] = new JLabel(new ImageIcon(fork));
		forks[4].setBounds(95, 15, 100, 100);
		frame.getContentPane().add(forks[4]);
	}

	public void PutPlate_GUI(int i) {
		plates[i].setVisible(true);
	}

	public void StartDining_GUI(int i) {
		try {
			plates[i].setIcon(new ImageIcon(ImageIO.read(new File("spaghetti_white.jpg"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Hungry_GUI(int i) {

		try {
			plates[i].setIcon(new ImageIcon(ImageIO.read(new File("spaghetti_yellow.jpg"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void ForkTake_GUI(int i) {
		try {
			if (i == 0) {
				forks[0].setIcon(new ImageIcon(ImageIO.read(new File("fork_red_1.jpg"))));
				forks[4].setIcon(new ImageIcon(ImageIO.read(new File("fork_red_5.jpg"))));
			} else if (i == 1) {
				forks[0].setIcon(new ImageIcon(ImageIO.read(new File("fork_red_1.jpg"))));
				forks[1].setIcon(new ImageIcon(ImageIO.read(new File("fork_red_2.jpg"))));
			} else if (i == 2) {
				forks[1].setIcon(new ImageIcon(ImageIO.read(new File("fork_red_2.jpg"))));
				forks[2].setIcon(new ImageIcon(ImageIO.read(new File("fork_red_3.jpg"))));
			} else if (i == 3) {
				forks[2].setIcon(new ImageIcon(ImageIO.read(new File("fork_red_3.jpg"))));
				forks[3].setIcon(new ImageIcon(ImageIO.read(new File("fork_red_4.jpg"))));
			} else if (i == 4) {
				forks[3].setIcon(new ImageIcon(ImageIO.read(new File("fork_red_4.jpg"))));
				forks[4].setIcon(new ImageIcon(ImageIO.read(new File("fork_red_5.jpg"))));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void Eating_GUI(int i) {
		try {
			plates[i].setIcon(new ImageIcon(ImageIO.read(new File("spaghetti_red.jpg"))));
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public void ForkPut_GUI(int i) {
		try {
			if (i == 0) {
				forks[0].setIcon(new ImageIcon(ImageIO.read(new File("fork_white_1.jpg"))));
				forks[4].setIcon(new ImageIcon(ImageIO.read(new File("fork_white_5.jpg"))));
			} else if (i == 1) {
				forks[0].setIcon(new ImageIcon(ImageIO.read(new File("fork_white_1.jpg"))));
				forks[1].setIcon(new ImageIcon(ImageIO.read(new File("fork_white_2.jpg"))));
			} else if (i == 2) {
				forks[1].setIcon(new ImageIcon(ImageIO.read(new File("fork_white_2.jpg"))));
				forks[2].setIcon(new ImageIcon(ImageIO.read(new File("fork_white_3.jpg"))));
			} else if (i == 3) {
				forks[2].setIcon(new ImageIcon(ImageIO.read(new File("fork_white_3.jpg"))));
				forks[3].setIcon(new ImageIcon(ImageIO.read(new File("fork_white_4.jpg"))));
			} else if (i == 4) {
				forks[3].setIcon(new ImageIcon(ImageIO.read(new File("fork_white_4.jpg"))));
				forks[4].setIcon(new ImageIcon(ImageIO.read(new File("fork_white_5.jpg"))));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void StopEating_GUI(int i) {
		try {
			plates[i].setIcon(new ImageIcon(ImageIO.read(new File("spaghetti_white.jpg"))));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

public class Philosopher extends Thread {

	private static Table table;

	private int THINKING = 0;
	private int HUNGRY = 1;
	private int EATING = 2;

	private Semaphore[] sem;
	private Semaphore[] barriers;
	private Semaphore mutex;
	private int id;

	private int[] state;
	private int N;

	public Philosopher(int i, Semaphore[] s, int[] mystate, int philnumber, Semaphore mu, Semaphore[] bar) {
		id = i;
		sem = s;
		state = mystate;
		N = philnumber;
		mutex = mu;
		barriers = bar;
	}

	private void walkTowardsTable() {
		try {
			Random r = new Random();
			int x = r.nextInt(9000) + 1000; //between 1s and 10s
			
			System.out.println("philosopher " + id + " is walking to table");
			sleep(x);
			table.PutPlate_GUI(id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void waitForOthers() {
		try {
			for (int i = 0; i < 5; i++) {
				if (id != i) {
					barriers[id].release(); // up all semaphores excepts its own
				}
			}
			for (int i = 0; i < 5; i++) {
				if (id != i) // down its own semaphore 4 times
				{
					barriers[i].acquire();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void startDining() {
		for (int i = 0; i < 5; i++) {
			table.StartDining_GUI(i);
		}
	}

	private void think() {
		try {
			Random rand = new Random();
			int x = rand.nextInt(10000); //between 0s and 10s
			System.out.println("philosopher " + id + " is thinking");
			sleep(x);
			table.Hungry_GUI(id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void takeForks() {
		try {
			mutex.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		state[id] = HUNGRY;
		test(id);
		mutex.release();
		try {
			sem[id].acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void eat() {
		table.Eating_GUI(id);
		System.out.println("philosopher " + id + " is eating");
	}

	private void putForks() {
		try {
			mutex.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		state[id] = THINKING;
		table.ForkPut_GUI(id);
		table.StopEating_GUI(id);
		test((id + 4) % 5);
		test((id + 1) % 5);
		mutex.release();
	}

	// if i is hungry and left and right are not eating, change state to eating.
	private void test(int i) {
		if (state[i] == HUNGRY)
			System.out.println("philosopher " + id + " is hungry");
		
		if (state[i] == HUNGRY && state[(i + 4) % 5] != EATING && state[(i + 1) % 5] != EATING) {
			state[i] = EATING;
			table.ForkTake_GUI(i);
			sem[i].release();
		}
	}

	public static void main(String args[]) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table = new Table();
					table.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		});

		int N = 5;
		int[] state = new int[N];

		Semaphore mutex = new Semaphore(1);
		Semaphore[] semarray = new Semaphore[N];
		Semaphore[] bararray = new Semaphore[N];

		Philosopher[] oldies = new Philosopher[N];

		for (int i = 0; i < N; i++) {
			semarray[i] = new Semaphore(0, true);
			bararray[i] = new Semaphore(0, true);
		}
		for (int i = 0; i < N; i++) {
			oldies[i] = new Philosopher(i, semarray, state, N, mutex, bararray);
			oldies[i].start();
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		walkTowardsTable();
		waitForOthers();
		startDining();

		while (true) {
			think();
			takeForks();
			eat();
			putForks();
		}
	}
}
