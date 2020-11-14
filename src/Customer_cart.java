import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
public class Customer_cart
{

	private JFrame frame;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Customer_cart window = new Customer_cart();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Customer_cart()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton cancelbutton = new JButton("Cancel");
		cancelbutton.setBounds(877, 623, 117, 29);
		frame.getContentPane().add(cancelbutton);
		
		JButton confirmbutton = new JButton("Confirn ");
		confirmbutton.setBounds(760, 623, 117, 29);
		confirmbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(confirmbutton);
		
		JLabel Total_label = new JLabel("Total Cost");
		Total_label.setBounds(16, 623, 79, 16);
		frame.getContentPane().add(Total_label);
		
		JLabel Show_price = new JLabel("");
		Show_price.setBounds(120, 623, 299, 16);
		frame.getContentPane().add(Show_price);
		
		JLabel credit_message = new JLabel("Didn't have a credit card?");
		credit_message.setBounds(448, 628, 186, 16);
		frame.getContentPane().add(credit_message);
		
		JButton signupbutton = new JButton("Sign up");
		signupbutton.setBounds(616, 623, 117, 29);
		frame.getContentPane().add(signupbutton);
		
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBounds(16,10,930,540);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 45, 958, 566);
		scrollPane.add(table);
		frame.getContentPane().add(scrollPane);
		
		
		
	}
}
