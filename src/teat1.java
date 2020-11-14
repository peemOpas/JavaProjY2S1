import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class teat1 extends JFrame
{
	private JTextField textfield;
	private JLabel label;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					teat1 window = new teat1();
					window.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});

	}
	
	public teat1()
	{
		initialize();
	}

	public void initialize(){
		int posx =34,posy=16;
		int total =5;
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setBounds(100, 100, 450, 361);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		for(int i=0;i<total;i++) {
			JButton  bt =new JButton("Click me");
			JLabel test = new JLabel("test"+i);
			test.setBounds(34, posy, 117,29);
			bt.setBounds(86, posy, 117, 29);
			this.getContentPane().add(test);
			this.getContentPane().add(bt);
			
			posx+=40;
			posy+=30;
		}
//		JLabel test = new JLabel("test");
//		test.setBounds(113, 38, 34, 16);
//		getContentPane().add(test);
	}
}
