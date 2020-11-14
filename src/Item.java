import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class Item extends JPanel
{
	private JLabel nameLabel;
	private JLabel ordIdLabel;
	private JLabel priceLabel;
	private JLabel dateLabel;
	
	private JLabel itemName;
	private JLabel itemOrdId;
	private JLabel itemPrice;
	private JLabel itemDate;
	
	private JPanel colOne;
	private JPanel colTwo;
	private JPanel colThree;
	private JPanel colFour;
	
	
	public Item(String name, String orderId, String price, String purchaseDate)
	{
		this.setLayout(new GridLayout(1, 4));
//		this.setSize(500, 100);
		this.setPreferredSize(new Dimension(500, 90));
		this.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		//this.setBounds(50,50,500,100);
		
		colOne = new JPanel(new GridLayout(2,1));
		colTwo = new JPanel(new GridLayout(2,1));
		colThree = new JPanel(new GridLayout(2,1));
		colFour = new JPanel(new GridLayout(2,1));
		
		this.add(colOne);
		this.add(colTwo);
		this.add(colThree);
		this.add(colFour);
		
		nameLabel = new JLabel("Item Name:");
		ordIdLabel = new JLabel("Order ID:");
		priceLabel = new JLabel("Price:");
		dateLabel = new JLabel("Purchase Date:");
		
		itemName = new JLabel(name);
		itemOrdId = new JLabel(orderId);
		itemPrice = new JLabel(price);
		itemDate = new JLabel(purchaseDate);
		
		colOne.add(nameLabel);
		colOne.add(ordIdLabel);
		
		colTwo.add(itemName);
		colTwo.add(itemOrdId);
		
		colThree.add(priceLabel);
		colThree.add(dateLabel);
		
		colFour.add(itemPrice);
		colFour.add(itemDate);
		
		
		
		
	}
	
//	public static void main(String[] arg) {
//		JFrame frame = new JFrame("History");
//		Item item = new Item("Test", "test", "test", "test");
//		frame.setSize(500, 100);
//		frame.add(item);
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
}
