import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ProductEdit
{

	private JFrame frame;
	private JTextField productNameField;
	private JTextField priceField;
	private JTextField description_textField;

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
					ProductEdit window = new ProductEdit();
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
	public ProductEdit()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(55, 40, 95, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(89, 68, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pictures");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(89, 96, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Description");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(43, 124, 107, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		productNameField = new JTextField();
		productNameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String productName = productNameField.getText();
			}
		});
		productNameField.setBounds(184, 35, 172, 26);
		frame.getContentPane().add(productNameField);
		productNameField.setColumns(10);
		
		priceField = new JTextField();
		priceField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String price = priceField.getText(); 
			}
			
		});
		priceField.setBounds(184, 63, 107, 26);
		frame.getContentPane().add(priceField);
		priceField.setColumns(10);
		
		description_textField = new JTextField();
		description_textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String description = priceField.getText();
			}
		});
		description_textField.setBounds(184, 119, 172, 108);
		frame.getContentPane().add(description_textField);
		description_textField.setColumns(10);
		
		JButton descriptionField = new JButton("Choose File");
		descriptionField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		descriptionField.setBounds(184, 91, 107, 29);
		frame.getContentPane().add(descriptionField);
		
		JButton saveButton = new JButton("SAVE");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		saveButton.setBounds(194, 239, 77, 29);
		frame.getContentPane().add(saveButton);
		
		JButton cancelButton = new JButton("CANCEL");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancelButton.setBounds(279, 239, 77, 29);
		frame.getContentPane().add(cancelButton);
	}

}
