package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
public class lwamba1{

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lwamba1 window = new lwamba1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lwamba1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 814, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Booking Id");
		lblNewLabel.setBounds(10, 65, 73, 34);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(80, 72, 285, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Event Type");
		String [] event = {"Default","KIPAIMARA","KOM","NDOA","UPADRI"};
		lblNewLabel_1.setBounds(10, 174, 73, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox(event);
		
		comboBox.setBounds(93, 173, 109, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Event Place");
		String [] place = {"Default","Dar es salaam", "Dodoma"};
		lblNewLabel_2.setBounds(10, 252, 73, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox(place);
	
		lblNewLabel.setBounds(93, 250, 109, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Food");
		lblNewLabel_3.setBounds(309, 105, 81, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Break Fast");
		chckbxNewCheckBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		chckbxNewCheckBox.setBounds(305, 133, 99, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Lunch");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		chckbxNewCheckBox_1.setBounds(424, 134, 81, 20);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Only Veg");
		rdbtnNewRadioButton.setBounds(309, 190, 96, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Tea & Snacks");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		chckbxNewCheckBox_2.setBounds(526, 133, 109, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Dinner");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		chckbxNewCheckBox_3.setBounds(652, 133, 109, 23);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Veg And Non Veg");
	
		rdbtnNewRadioButton_1.setBounds(424, 190, 132, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	    ButtonGroup all = new ButtonGroup();
	    all.add(rdbtnNewRadioButton );
	    all.add(rdbtnNewRadioButton_1  );
		
		JLabel lblNewLabel_4 = new JLabel("Dinner Type");
		String [] dinner = {"Default","NGUNA", "WALI", "CHIPSI","MAKENDE"};
		lblNewLabel_4.setBounds(309, 284, 73, 18);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox_2 = new JComboBox(dinner);
	
		
		comboBox_2.setBounds(424, 282, 109, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel_5 = new JLabel("EVENT MANAGEMENT SYSTEM ");
		lblNewLabel_5.setBounds(324, 11, 209, 34);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookId         =lblNewLabel.getText(); 
				String eventtype      = lblNewLabel_1.getText();
				String place           = lblNewLabel_2.getText();
				//String [] food            = lblNewLabel_3.getInputContext();
				String dinnertype         = lblNewLabel_4.getText();
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(360, 369, 89, 23);
		frame.getContentPane().add(btnNewButton);
	


	}
}


	
		
		

