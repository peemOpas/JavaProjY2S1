import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restock
{

	private JFrame frame;
	private JTextField amountField;

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
					Restock window = new Restock();
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
	public Restock()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 274, 187);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amount");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(27, 56, 73, 17);
		frame.getContentPane().add(lblNewLabel);
		
		amountField = new JTextField();
		amountField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = amountField.getText();
			}
			
		});
		amountField.setBounds(121, 52, 107, 26);
		frame.getContentPane().add(amountField);
		amountField.setColumns(10);
		
		JButton saveButton = new JButton("SAVE");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		saveButton.setBounds(143, 90, 85, 29);
		frame.getContentPane().add(saveButton);
	}

}
