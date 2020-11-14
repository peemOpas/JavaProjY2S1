import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemCatalog extends JPanel {
    private JSpinner itemNumSpn;
    private JButton addToCartBtn;
    private JButton previewBtn;
//    private JLabel itemName;
    private JLabel picture;

    private JPanel rowOne;
    private JPanel rowTwo;
    private JPanel rowThree;

    public ItemCatalog(String name){

        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createTitledBorder(name));
        this.setPreferredSize(new Dimension(200, 250));

        GridBagConstraints gbc = new GridBagConstraints();

        picture = new JLabel();
        itemNumSpn = new JSpinner();
        addToCartBtn = new JButton("Add To Cart");
        previewBtn = new JButton("Preview");
//        itemName = new JLabel(name);

        rowOne = new JPanel();
        rowTwo = new JPanel(new FlowLayout());
        rowThree = new JPanel();
        picture.setIcon(new ImageIcon("tshirt.png"));


        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        this.add(rowOne, gbc);

        gbc.anchor = GridBagConstraints.BASELINE;
        gbc.gridy = 1;
        this.add(rowTwo,gbc);

        gbc.gridy = 2;
        this.add(rowThree,gbc);

        rowOne.add(picture);
        rowOne.setAlignmentX(Component.CENTER_ALIGNMENT);
        rowOne.setBorder(BorderFactory.createEmptyBorder(5, 5, 3, 5));

        rowTwo.add(itemNumSpn);
        rowTwo.setBorder(BorderFactory.createEmptyBorder(0, 5, 3, 5));
        rowTwo.add(addToCartBtn);

        rowThree.add(previewBtn);
        rowThree.setBorder(BorderFactory.createEmptyBorder(0, 5, 3, 5));

//        previewBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });

//        addToCartBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });

//        itemNumSpn.addChangeListener(new ChangeListener() {
//            @Override
//            public void stateChanged(ChangeEvent e) {
//
//            }
//        });
    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        JPanel myPanel = new JPanel();
//        frame.setSize(1000, 600);
//        frame.add(myPanel);
//        myPanel.add(new ItemCatalog("Test"));
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//    }
}