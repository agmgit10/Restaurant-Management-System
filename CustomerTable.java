import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerTable {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JLabel lblName;
	private JLabel lblSurname;
	private JLabel lblId;
	private JLabel lblPhone;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnADD;
	private JButton btnDELETE;
	private JButton btnUPDATE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		
		Object[] columns = {"Name","Surname","ID","Phone"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerTable window = new CustomerTable();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	class Data extends AbstractTableModel
	{

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		public Object getValueAt(int arg0, int arg1) {
			return null;
		}
		
	}
	/**
	 * Create the application.
	 */
	public CustomerTable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 865, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 0, 843, 0);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(51, 306, 719, 153);
		frame.getContentPane().add(table_1);
		
		Data table = new Data();
		table_1.setModel(table);
		
		lblName = new JLabel("Name");
		lblName.setBounds(79, 37, 89, 23);
		frame.getContentPane().add(lblName);
		
		lblSurname = new JLabel("Surname");
		lblSurname.setBounds(79, 76, 89, 23);
		frame.getContentPane().add(lblSurname);
		
		lblId = new JLabel("ID");
		lblId.setBounds(79, 121, 89, 24);
		frame.getContentPane().add(lblId);
		
		lblPhone = new JLabel("Phone");
		lblPhone.setBounds(79, 161, 69, 20);
		frame.getContentPane().add(lblPhone);
		
		textField = new JTextField();
		textField.setBounds(211, 34, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(211, 76, 146, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(211, 118, 146, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(208, 158, 45, 26);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(268, 158, 69, 26);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(352, 158, 146, 26);
		frame.getContentPane().add(textField_5);
		
		btnADD = new JButton("ADD");
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				model.addRow(new Object[]{lblName.getText(),lblSurname.getText(),lblId.getText(),lblPhone.getText()
				,textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText()});
			}
		});
		btnADD.setBounds(627, 30, 157, 37);
		frame.getContentPane().add(btnADD);
		
		btnDELETE = new JButton("DELETE");
		btnDELETE.setBounds(627, 203, 157, 37);
		frame.getContentPane().add(btnDELETE);
		
		btnUPDATE = new JButton("UPDATE");
		btnUPDATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				if(table_1.getSelectedRow()== -1)
				{
					if(table_1.getSelectedRow()== 0)
					{
					
					}
				}
				
				else
				{
					model.setValueAt(lblName.getText(), table_1.getSelectedRow(), 0);
					model.setValueAt(lblSurname.getText(), table_1.getSelectedRow(), 1);
					model.setValueAt(lblId.getText(), table_1.getSelectedRow(), 2);
					model.setValueAt(lblPhone.getText(), table_1.getSelectedRow(), 3);
					model.setValueAt(textField.getText(), table_1.getSelectedRow(), 4);
					model.setValueAt(textField_1.getText(), table_1.getSelectedRow(), 5);
					model.setValueAt(textField_2.getText(), table_1.getSelectedRow(), 6);
					model.setValueAt(textField_3.getText(), table_1.getSelectedRow(), 7);
					model.setValueAt(textField_4.getText(), table_1.getSelectedRow(), 8);
					model.setValueAt(textField_5.getText(), table_1.getSelectedRow(), 9);
					
				}
			}
		});
		btnUPDATE.setBounds(627, 115, 157, 37);
		frame.getContentPane().add(btnUPDATE);
		
		}

}
