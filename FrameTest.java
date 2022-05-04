import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

import javax.swing.JFrame;

public class FrameTest {
	public static void main(String[] args) {
		MyCarFrame mcf = new MyCarFrame("Car");
		MyTrainFrame mtf = new MyTrainFrame("Train");
		MyFlightFrame mff = new MyFlightFrame("Flight");
		
		mcf.setVisible(true);
		mtf.setVisible(true);
		mff.setVisible(true);
		
		Thread t1 = new Thread(mcf);
		Thread t2 = new Thread(mtf);
		Thread t3 = new Thread(mff);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

class MyCarFrame extends JFrame implements Runnable //1
{
	TextField t = new TextField(30);
	MyCarFrame(String title) {
		super(title);
		setSize(400,100);
		setLocation(100,100);
		setLayout(new FlowLayout());
		add(t);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void run() { //2
		for (int i = 1; i <= 200; i++) {
			t.setText(""+i);
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


class MyTrainFrame extends JFrame implements Runnable //1
{
	TextField t = new TextField(30);
	MyTrainFrame(String title) {
		super(title);
		setSize(400,100);
		setLocation(200,200);
		setLayout(new FlowLayout());
		add(t);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void run() { //3
		for (int i = 1; i <= 500; i++) {
			t.setText(""+i);
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class MyFlightFrame extends JFrame implements Runnable //1
{
	TextField t = new TextField(30);
	MyFlightFrame(String title) {
		super(title);
		setSize(400,100);
		setLocation(300,300);
		setLayout(new FlowLayout());
		add(t);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void run() { //2
		for (int i = 1; i <= 1200; i++) {
			t.setText(""+i);
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

/*

	1. write a class that implements Runnable interface	
	2. implement the public void run() { }



*/