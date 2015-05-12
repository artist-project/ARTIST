package eu.artist.migration.ct.ui;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;

import eu.artist.migration.ct.controller.ClassificationController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainForm extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 172850889979882569L;
	private JTextField txtTrFile;
	private JTextField txtTSFile;
	private JLabel lblNewLabel;
	private JLabel lblPidstatFile;
	private JTextField txtPTFile;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JButton btnStart;
	private JLabel lblNewLabel_4;
	private JTextField txtClass;
	private ClassificationController controller;
	
	private static MainForm window;
	private JButton btnCalcProvider;
	private JLabel lblNewLabel_5;
	private JTextField txtBestProvider;

	public MainForm() {
		setResizable(false);
		setTitle("Classification Tool");
		this.setSize(800, 600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {70, 200, 100, 0};
		gridBagLayout.rowHeights = new int[] {20, 20, 20, 20, 20, 30, 20, 20, 20, 30, 290};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		lblNewLabel_3 = new JLabel("Benchmarks Profile");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 3;
		gbc_lblNewLabel_3.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		lblNewLabel = new JLabel("Training file:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		txtTrFile = new JTextField();
		GridBagConstraints gbc_txtTrFile = new GridBagConstraints();
		gbc_txtTrFile.insets = new Insets(0, 0, 5, 5);
		gbc_txtTrFile.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTrFile.gridx = 1;
		gbc_txtTrFile.gridy = 1;
		getContentPane().add(txtTrFile, gbc_txtTrFile);
		txtTrFile.setColumns(10);
		
		JButton btnBrowseDbFile = new JButton("Browse...");
		btnBrowseDbFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final JFileChooser fc = new JFileChooser(".");
				int returnVal = fc.showOpenDialog(window);
				
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fc.getSelectedFile();
					txtTrFile.setText(selectedFile.getPath());
				}
			}
		});
		GridBagConstraints gbc_btnBrowseDbFile = new GridBagConstraints();
		gbc_btnBrowseDbFile.insets = new Insets(0, 0, 5, 0);
		gbc_btnBrowseDbFile.gridx = 2;
		gbc_btnBrowseDbFile.gridy = 1;
		getContentPane().add(btnBrowseDbFile, gbc_btnBrowseDbFile);
		
		lblNewLabel_2 = new JLabel("Application Profile");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 3;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("TShark file:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtTSFile = new JTextField();
		GridBagConstraints gbc_txtTSFile = new GridBagConstraints();
		gbc_txtTSFile.insets = new Insets(0, 0, 5, 5);
		gbc_txtTSFile.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTSFile.gridx = 1;
		gbc_txtTSFile.gridy = 3;
		getContentPane().add(txtTSFile, gbc_txtTSFile);
		txtTSFile.setColumns(10);
		
		JButton btnBrowseQyFile = new JButton("Browse...");
		btnBrowseQyFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final JFileChooser fc = new JFileChooser(".");
				int returnVal = fc.showOpenDialog(window);
				
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fc.getSelectedFile();
					txtTSFile.setText(selectedFile.getPath());
				}
			}
		});
		GridBagConstraints gbc_btnBrowseQyFile = new GridBagConstraints();
		gbc_btnBrowseQyFile.insets = new Insets(0, 0, 5, 0);
		gbc_btnBrowseQyFile.gridx = 2;
		gbc_btnBrowseQyFile.gridy = 3;
		getContentPane().add(btnBrowseQyFile, gbc_btnBrowseQyFile);
		
		lblPidstatFile = new JLabel("Pidstat file:");
		GridBagConstraints gbc_lblPidstatFile = new GridBagConstraints();
		gbc_lblPidstatFile.anchor = GridBagConstraints.EAST;
		gbc_lblPidstatFile.insets = new Insets(0, 0, 5, 5);
		gbc_lblPidstatFile.gridx = 0;
		gbc_lblPidstatFile.gridy = 4;
		getContentPane().add(lblPidstatFile, gbc_lblPidstatFile);
		
		txtPTFile = new JTextField();
		GridBagConstraints gbc_txtPTFile = new GridBagConstraints();
		gbc_txtPTFile.insets = new Insets(0, 0, 5, 5);
		gbc_txtPTFile.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPTFile.gridx = 1;
		gbc_txtPTFile.gridy = 4;
		getContentPane().add(txtPTFile, gbc_txtPTFile);
		txtPTFile.setColumns(10);
		
		btnNewButton = new JButton("Browse...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final JFileChooser fc = new JFileChooser(".");
				int returnVal = fc.showOpenDialog(window);
				
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fc.getSelectedFile();
					txtPTFile.setText(selectedFile.getPath());
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 4;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		btnStart = new JButton("Calculate classification!");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtTrFile.getText().length() == 0) {
					JOptionPane.showMessageDialog(window, "Please provide a Training file!");
				}
				else if (txtTSFile.getText().length() == 0) {
					JOptionPane.showMessageDialog(window, "Please provide a TShark file!");
				}
				else if (txtPTFile.getText().length() == 0) {
					JOptionPane.showMessageDialog(window, "Please provide a Pidstat file!");
				}
				else {
					controller = new ClassificationController(txtPTFile.getText(), txtTSFile.getText(), txtTrFile.getText());
					try {
						txtClass.setText(controller.calculateClassification());
						btnCalcProvider.setEnabled(true);
					}
					catch (Exception ex) {
						ex.printStackTrace();
						JOptionPane.showMessageDialog(window, ex.getMessage());
					}
				}
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.insets = new Insets(0, 0, 5, 5);
		gbc_btnStart.gridx = 1;
		gbc_btnStart.gridy = 6;
		getContentPane().add(btnStart, gbc_btnStart);
		
		lblNewLabel_4 = new JLabel("Class:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 7;
		getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		txtClass = new JTextField();
		txtClass.setEditable(false);
		GridBagConstraints gbc_txtClass = new GridBagConstraints();
		gbc_txtClass.insets = new Insets(0, 0, 5, 5);
		gbc_txtClass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtClass.gridx = 1;
		gbc_txtClass.gridy = 7;
		getContentPane().add(txtClass, gbc_txtClass);
		txtClass.setColumns(10);
		
		btnCalcProvider = new JButton("Calculate best instance type!");
		btnCalcProvider.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcProvider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					txtBestProvider.setText(controller.calculateBestProvider(txtClass.getText()));
					//DaCapo	fop
					//txtBestProvider.setText(controller.calculateBestProvider("DaCapo	fop"));
				}
				catch (Exception ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(window, ex.getMessage());
				}
			}
		});
		btnCalcProvider.setEnabled(false);
		GridBagConstraints gbc_btnCalcProvider = new GridBagConstraints();
		gbc_btnCalcProvider.insets = new Insets(0, 0, 5, 5);
		gbc_btnCalcProvider.gridx = 1;
		gbc_btnCalcProvider.gridy = 8;
		getContentPane().add(btnCalcProvider, gbc_btnCalcProvider);
		
		lblNewLabel_5 = new JLabel("Instance:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 9;
		getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		txtBestProvider = new JTextField();
		txtBestProvider.setEditable(false);
		GridBagConstraints gbc_txtBestProvider = new GridBagConstraints();
		gbc_txtBestProvider.insets = new Insets(0, 0, 0, 5);
		gbc_txtBestProvider.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBestProvider.gridx = 1;
		gbc_txtBestProvider.gridy = 9;
		getContentPane().add(txtBestProvider, gbc_txtBestProvider);
		txtBestProvider.setColumns(10);
	}
	
	public static void showForm() {
		window = new MainForm();
		//window.pack();
		window.setLocationRelativeTo(null);  // *** this will center your app ***
		window.setVisible(true);
	}
}
