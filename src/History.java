import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.util.ArrayList;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.border.EmptyBorder;

public class History
{
	private ArrayList<Item> items;
	private JFrame frmHistory;

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
					History window = new History();
					window.frmHistory.setVisible(true);
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
	public History()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		int posx=100;
		int posy=100;
		items = new ArrayList();
		//add purchase history to items ( all info is in type string )
//		items.add(new Item("Test", "Test", "Test", "Test"));
//		items.add(new Item("Test1", "Test1", "Test1", "Test1"));
//		items.add(new Item("Test2", "Test2", "Test2", "Test2"));
//		items.add(new Item("Test3", "Test3", "Test3", "Test3"));
//		items.add(new Item("Test4", "Test4", "Test4", "Test4"));
//		items.add(new Item("Test5", "Test4", "Test4", "Test4"));
//		items.add(new Item("Test4", "Test4", "Test4", "Test4"));
//		items.add(new Item("Test4", "Test4", "Test4", "Test4"));
		
		frmHistory = new JFrame();
		frmHistory.setTitle("History");
		frmHistory.setResizable(false);
		frmHistory.setBounds(posx, posy, 650, 361);
		frmHistory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHistory.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 650, 317);
		frmHistory.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(534, 282, 110, 29);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 39, 638, 235);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("History");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel.setBounds(6, 6, 132, 34);
		panel.add(lblNewLabel);
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(6, 6, 638, 272);
//		frmHistory.getContentPane().add(scrollPane);
		
		JMenuBar menuBar = new JMenuBar();
		frmHistory.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Profile");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Info");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("History ");
		mnNewMenu.add(mntmNewMenuItem);
		
		//JLabel ll=new JLabel("test");
		
		for(int i = 0; i < items.size(); i++) {
			panel_1.add(items.get(i));
		}
	}
}
