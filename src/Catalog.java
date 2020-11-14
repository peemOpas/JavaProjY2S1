import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class Catalog
{

	private JFrame frame;
	private JTextField searchField;
	private ButtonGroup group;
	private ArrayList<Item> ItemCatalog;
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
					Catalog window = new Catalog();
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
	public Catalog()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1000, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton profileButton = new JButton("PROFILE");
		profileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		profileButton.setBounds(37, 6, 85, 45);
		frame.getContentPane().add(profileButton);
		
		JButton cartButton = new JButton("");
		cartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cartButton.setBounds(915, 6, 79, 45);
		frame.getContentPane().add(cartButton);
		
		cartButton.setIcon(new ImageIcon("shopping-cart.png"));
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(54, 86, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		searchField = new JTextField();
		searchField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchField.setBounds(17, 114, 130, 26);
		frame.getContentPane().add(searchField);
		searchField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sort By");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(54, 184, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox sortBox = new JComboBox();
		sortBox.setBounds(17, 212, 130, 27);
		frame.getContentPane().add(sortBox);
		
		sortBox.addItem("Price (Low to high)");
		sortBox.addItem("Price (High to low)");
		sortBox.addItem("Name(A-Z)");
		sortBox.addItem("Name(Z-A)");
		sortBox.addItem("Latest");
		sortBox.addItem("Newest");
		
		JRadioButton shirtRadioButton = new JRadioButton("Shirts");
		shirtRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		shirtRadioButton.setBounds(17, 300, 141, 23);
		frame.getContentPane().add(shirtRadioButton);
		
		JRadioButton pantRadioButton = new JRadioButton("Pants");
		pantRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pantRadioButton.setBounds(17, 335, 141, 23);
		frame.getContentPane().add(pantRadioButton);
		
		JRadioButton allRadioButton = new JRadioButton("All");
		allRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		allRadioButton.setBounds(17, 370, 141, 23);
		frame.getContentPane().add(allRadioButton);
		
		JButton applyButton = new JButton("Apply");
		applyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		applyButton.setBounds(15, 486, 130, 29);
		frame.getContentPane().add(applyButton);
		
		JLabel modelLabel = new JLabel("");
		modelLabel.setBounds(764, 80, 189, 403);
		frame.getContentPane().add(modelLabel);
		modelLabel.setIcon(new ImageIcon("model.png"));		
		
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		clearButton.setBounds(836, 508, 117, 29);
		frame.getContentPane().add(clearButton);
		
		group =new ButtonGroup();
		group.add(shirtRadioButton);
		group.add(pantRadioButton);
		group.add(allRadioButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(190, 18, 562, 305);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		for(int i=0;i<5;i++) {
			panel.add(new ItemCatalog("String test"));
		}
		
		scrollPane.setBorder(BorderFactory.createTitledBorder("T-shirt"));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(190, 335, 562, 305);
		frame.getContentPane().add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		for(int i=0;i<5;i++) {
			panel_1.add(new ItemCatalog("String test1"));
		}
		scrollPane_1.setBorder(BorderFactory.createTitledBorder("Pants"));
//		panel_1.setBorder(BorderFactory.createTitledBorder("Pants"));
	}
}
