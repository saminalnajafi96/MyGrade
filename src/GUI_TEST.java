import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JButton;

public class GUI_TEST {

	private JFrame frmMygrade;
	private JTextField nameField;
	private JTextField creditsField;
	private JTable table;
	private JButton btnAdd;
	private JButton btnCalculateGrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_TEST window = new GUI_TEST();
					window.frmMygrade.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_TEST() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMygrade = new JFrame();
		frmMygrade.setTitle("MyGrade");
		frmMygrade.setResizable(false);
		frmMygrade.setBounds(100, 100, 700, 450);
		frmMygrade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMygrade.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Module details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 250, 428);
		frmMygrade.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel nameLabel = new JLabel("Name");
		GridBagConstraints gbc_nameLabel = new GridBagConstraints();
		gbc_nameLabel.anchor = GridBagConstraints.LINE_END;
		gbc_nameLabel.weightx = 0.5;
		gbc_nameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_nameLabel.gridx = 0;
		gbc_nameLabel.gridy = 0;
		panel.add(nameLabel, gbc_nameLabel);
		
		nameField = new JTextField();
		GridBagConstraints gbc_nameField = new GridBagConstraints();
		gbc_nameField.anchor = GridBagConstraints.LINE_START;
		gbc_nameField.weightx = 0.5;
		gbc_nameField.insets = new Insets(0, 0, 5, 5);
		gbc_nameField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nameField.gridx = 2;
		gbc_nameField.gridy = 0;
		panel.add(nameField, gbc_nameField);
		nameField.setColumns(10);
		
		JLabel creditsLabel = new JLabel("Credits");
		GridBagConstraints gbc_creditsLabel = new GridBagConstraints();
		gbc_creditsLabel.weightx = 0.5;
		gbc_creditsLabel.weighty = 0.5;
		gbc_creditsLabel.anchor = GridBagConstraints.LINE_END;
		gbc_creditsLabel.insets = new Insets(0, 0, 5, 5);
		gbc_creditsLabel.gridx = 0;
		gbc_creditsLabel.gridy = 1;
		panel.add(creditsLabel, gbc_creditsLabel);
		
		creditsField = new JTextField();
		GridBagConstraints gbc_creditsField = new GridBagConstraints();
		gbc_creditsField.anchor = GridBagConstraints.LINE_START;
		gbc_creditsField.weighty = 0.5;
		gbc_creditsField.insets = new Insets(0, 0, 5, 5);
		gbc_creditsField.fill = GridBagConstraints.HORIZONTAL;
		gbc_creditsField.gridx = 2;
		gbc_creditsField.gridy = 1;
		panel.add(creditsField, gbc_creditsField);
		creditsField.setColumns(10);
		
		btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc_btnAdd.weighty = 10.0;
		gbc_btnAdd.insets = new Insets(0, 0, 0, 5);
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 3;
		panel.add(btnAdd, gbc_btnAdd);
		
		btnCalculateGrade = new JButton("Calculate grade");
		GridBagConstraints gbc_btnCalculateGrade = new GridBagConstraints();
		gbc_btnCalculateGrade.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc_btnCalculateGrade.insets = new Insets(0, 0, 0, 5);
		gbc_btnCalculateGrade.gridx = 2;
		gbc_btnCalculateGrade.gridy = 3;
		panel.add(btnCalculateGrade, gbc_btnCalculateGrade);
		
		table = new JTable();
		table.setBounds(250, 0, 0, 450);
		frmMygrade.getContentPane().add(table);
	}
}
