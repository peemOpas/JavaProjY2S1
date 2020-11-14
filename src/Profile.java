import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JSeparator;

public class Profile
{

	private JFrame frmProfile;

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
					Profile window = new Profile();
					window.frmProfile.setVisible(true);
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
	public Profile()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmProfile = new JFrame();
		frmProfile.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmProfile.setTitle("Profile");
		frmProfile.setBounds(100, 100, 450, 361);
		frmProfile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProfile.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 61, 22);
		frmProfile.getContentPane().add(menuBar);
		
		JMenu profileMenu = new JMenu("Profile");
		menuBar.add(profileMenu);
		
		JMenuItem infoMenu = new JMenuItem("Info");
		profileMenu.add(infoMenu);
		
		JSeparator separator = new JSeparator();
		profileMenu.add(separator);
		
		JMenuItem historyMenu = new JMenuItem("History");
		profileMenu.add(historyMenu);
		
		JLabel profileLabel = new JLabel("Profile");
		profileLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		profileLabel.setBounds(10, 45, 122, 16);
		frmProfile.getContentPane().add(profileLabel);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(116, 100, 39, 16);
		frmProfile.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(93, 140, 71, 16);
		frmProfile.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(116, 180, 34, 16);
		frmProfile.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone");
		lblNewLabel_3.setBounds(116, 220, 61, 16);
		frmProfile.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setBounds(103, 259, 61, 16);
		frmProfile.getContentPane().add(lblNewLabel_4);
		
		JButton backButton = new JButton("Back");
		backButton.setBounds(327, 304, 117, 29);
		frmProfile.getContentPane().add(backButton);
		
		JLabel nameLabel = new JLabel(":");
		nameLabel.setForeground(Color.DARK_GRAY);
		nameLabel.setBackground(Color.WHITE);
		nameLabel.setBounds(202, 100, 210, 16);
		frmProfile.getContentPane().add(nameLabel);
		
		JLabel UserLabel = new JLabel(":");
		UserLabel.setBounds(202, 140, 210, 16);
		frmProfile.getContentPane().add(UserLabel);
		
		JLabel emailLabel = new JLabel(":");
		emailLabel.setBounds(202, 180, 210, 16);
		frmProfile.getContentPane().add(emailLabel);
		
		JLabel phoneLabel = new JLabel(":");
		phoneLabel.setBounds(202, 220, 210, 16);
		frmProfile.getContentPane().add(phoneLabel);
		
		JLabel addressLabel = new JLabel(":");
		addressLabel.setBounds(202, 259, 210, 16);
		frmProfile.getContentPane().add(addressLabel);
	}
}
