import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AddProductUI
{

	private JFrame frame;
	private JTextField productNameField;
	private JTextField priceField;
	private JTextField discriptionField;

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
					AddProductUI window = new AddProductUI();
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
	public AddProductUI()
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
		frame.setBounds(100, 100, 450, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product Name");
		lblNewLabel.setBounds(46, 36, 93, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Price");
		lblNewLabel_1.setBounds(104, 64, 35, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Category");
		lblNewLabel_2.setBounds(78, 92, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pictures");
		lblNewLabel_3.setBounds(86, 120, 53, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Description");
		lblNewLabel_4.setBounds(60, 148, 79, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		productNameField = new JTextField();
		productNameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String productName = priceField.getText();
			}
		});
		productNameField.setBounds(173, 31, 174, 26);
		frame.getContentPane().add(productNameField);
		productNameField.setColumns(10);
		
		priceField = new JTextField();
		priceField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String price = priceField.getText();
			}
		});
		priceField.setBounds(173, 59, 106, 26);
		frame.getContentPane().add(priceField);
		priceField.setColumns(10);
		
		JComboBox categotiescomboBox = new JComboBox();
		categotiescomboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		categotiescomboBox.setBounds(173, 88, 106, 27);
		frame.getContentPane().add(categotiescomboBox);
		
		JButton chooseFilebutton = new JButton("Choose File");
		chooseFilebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chooseFilebutton.setBounds(173, 115, 106, 29);
		frame.getContentPane().add(chooseFilebutton);
		
		discriptionField = new JTextField();
		discriptionField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String description = priceField.getText();
			}
		});
		discriptionField.setBounds(173, 143, 234, 117);
		frame.getContentPane().add(discriptionField);
		discriptionField.setColumns(10);
		
		JButton cancelButton = new JButton("CANCEL");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancelButton.setBounds(314, 272, 93, 29);
		frame.getContentPane().add(cancelButton);
		
		JButton saveButton = new JButton("SAVE");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		saveButton.setBounds(214, 272, 88, 29);
		frame.getContentPane().add(saveButton);
	}
}
