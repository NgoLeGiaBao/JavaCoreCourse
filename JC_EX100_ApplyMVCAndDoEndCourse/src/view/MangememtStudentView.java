package view;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Scrollbar;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.MangementStudentController;
import model.MangementStudentModel;
import model.Student;
import model.Town;

import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;

public class MangememtStudentView extends JFrame {
	private MangementStudentModel mangementStudentModel;
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldStudentIDAbove;
	private JTable tableStudent;
	private JTextField textFieldStudentID;
	private JTextField textFieldName;
	private JTextField textFieldBirthday;
	private JTextField textFieldFirstMark;
	private JTextField textFieldSecondMark;
	private JTextField textFieldThirdMark;
	private JComboBox comboBoxPartInf;
	private JComboBox comboBoxPartFind;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private ButtonGroup buttonGroupSex;
	private JButton btnInsert;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnSave;
	private JButton btnCancel;
	private JButton btnRecover;
	private JLabel lblThirdMark;
	private JLabel lblSecondMark;
	private JLabel lblFirstMark;
	private JLabel lblSex;
	private JLabel lblBirthday;
	private JLabel lblBirthPlace;
	private JLabel lblName;
	private JLabel lblId;
	private JButton btnFind;
	private JLabel lblStudentInf;
	private JLabel lblListStudent;
	private JLabel lblStudentid;
	private JLabel lblBirthplace;
	private JLabel lblStudentF;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MangememtStudentView frame = new MangememtStudentView();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
	public MangememtStudentView() {
		//Action Listener
		MangementStudentController mangementStudentController = new MangementStudentController(this);
		
		this.mangementStudentModel = new MangementStudentModel();
		this.setTitle("Mangement Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 778);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblStudentF = new JLabel("Student Filtre");
		lblStudentF.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStudentF.setBounds(5, 33, 150, 34);
		contentPane.add(lblStudentF);
		
		comboBoxPartFind = new JComboBox();
		this.addTownIntoJComBox(comboBoxPartFind);
		comboBoxPartFind.setBounds(130, 72, 136, 34);
		contentPane.add(comboBoxPartFind);
		
		lblBirthplace = new JLabel("BirthPlace");
		lblBirthplace.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBirthplace.setBounds(5, 72, 115, 34);
		contentPane.add(lblBirthplace);
		
		lblStudentid = new JLabel("StudentID");
		lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStudentid.setBounds(286, 72, 115, 34);
		contentPane.add(lblStudentid);
		
		lblListStudent = new JLabel("List Student");
		lblListStudent.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblListStudent.setBounds(5, 130, 131, 34);
		contentPane.add(lblListStudent);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(150, 50, 672, 1);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(130, 150, 696, 1);
		contentPane.add(separator_1_1);
		
		textFieldStudentIDAbove = new JTextField();
		textFieldStudentIDAbove.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldStudentIDAbove.setColumns(20);
		textFieldStudentIDAbove.setBounds(399, 72, 180, 34);
		contentPane.add(textFieldStudentIDAbove);
		
		btnFind = new JButton("Find");
		btnFind.addActionListener(mangementStudentController);
		btnFind.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFind.setBounds(589, 72, 100, 34);
		contentPane.add(btnFind);
		
		lblStudentInf = new JLabel("Student Information");
		lblStudentInf.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStudentInf.setBounds(5, 418, 214, 34);
		contentPane.add(lblStudentInf);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(216, 436, 604, 1);
		contentPane.add(separator_1_1_1);
		

		
		tableStudent = new JTable();
		tableStudent.setRowHeight(25);
		tableStudent.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Full Name", "Place", "Date", "Sex", "First Mark", "Second Mark", "Third Mark"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(tableStudent);
		scrollPane.setBounds(5, 164, 810, 240);
		contentPane.add(scrollPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 820, 33);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnFile);
		
		JMenuItem mntmFileOpen = new JMenuItem("File Open");
		mntmFileOpen.addActionListener(mangementStudentController);
		mntmFileOpen.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mntmFileOpen.setHorizontalAlignment(SwingConstants.CENTER);
		mnFile.add(mntmFileOpen);
		
		JMenuItem mntmFileSave = new JMenuItem("File Save");
		mntmFileSave.addActionListener(mangementStudentController);
		mntmFileSave.setHorizontalAlignment(SwingConstants.CENTER);
		mntmFileSave.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnFile.add(mntmFileSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(mangementStudentController);
		mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mntmExit.setHorizontalAlignment(SwingConstants.CENTER);
		mnFile.add(mntmExit);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mnAbout.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnAbout);
		
		JMenuItem mntmAboutMe = new JMenuItem("About Me");
		mntmAboutMe.addActionListener(mangementStudentController);
		mntmAboutMe.setFont(new Font("Segoe UI", Font.BOLD, 20));
		mntmAboutMe.setHorizontalAlignment(SwingConstants.CENTER);
		mnAbout.add(mntmAboutMe);
		
		lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblId.setBounds(5, 462, 150, 34);
		contentPane.add(lblId);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(5, 506, 150, 34);
		contentPane.add(lblName);
		
		lblBirthPlace = new JLabel("BirthPlace");
		lblBirthPlace.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBirthPlace.setBounds(5, 550, 150, 34);
		contentPane.add(lblBirthPlace);
		
		lblBirthday = new JLabel("Date");
		lblBirthday.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBirthday.setBounds(5, 594, 150, 34);
		contentPane.add(lblBirthday);
		
		textFieldStudentID = new JTextField();
		textFieldStudentID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldStudentID.setColumns(20);
		textFieldStudentID.setBounds(173, 462, 200, 34);
		contentPane.add(textFieldStudentID);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldName.setColumns(20);
		textFieldName.setBounds(173, 506, 200, 34);
		contentPane.add(textFieldName);
		
		textFieldBirthday = new JTextField();
		textFieldBirthday.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldBirthday.setColumns(20);
		textFieldBirthday.setBounds(173, 594, 200, 34);
		contentPane.add(textFieldBirthday);
		
		comboBoxPartInf = new JComboBox();
		comboBoxPartInf.setBounds(173, 550, 200, 34);
		this.addTownIntoJComBox(comboBoxPartInf);
		this.comboBoxPartInf.setFont(new Font("Arial", Font.BOLD, 20));
		contentPane.add(comboBoxPartInf);
		
		lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSex.setBounds(439, 462, 150, 34);
		contentPane.add(lblSex);
		
		lblFirstMark = new JLabel("Mark 1");
		lblFirstMark.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFirstMark.setBounds(439, 506, 150, 34);
		contentPane.add(lblFirstMark);
		
		lblSecondMark = new JLabel("Mark 2");
		lblSecondMark.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSecondMark.setBounds(439, 550, 150, 34);
		contentPane.add(lblSecondMark);
		
		lblThirdMark = new JLabel("Mark 3");
		lblThirdMark.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblThirdMark.setBounds(439, 594, 150, 34);
		contentPane.add(lblThirdMark);
		
		textFieldFirstMark = new JTextField();
		textFieldFirstMark.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldFirstMark.setColumns(20);
		textFieldFirstMark.setBounds(586, 506, 200, 34);
		contentPane.add(textFieldFirstMark);
		
		textFieldSecondMark = new JTextField();
		textFieldSecondMark.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldSecondMark.setColumns(20);
		textFieldSecondMark.setBounds(586, 550, 200, 34);
		contentPane.add(textFieldSecondMark);
		
		textFieldThirdMark = new JTextField();
		textFieldThirdMark.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldThirdMark.setColumns(20);
		textFieldThirdMark.setBounds(586, 594, 200, 34);
		contentPane.add(textFieldThirdMark);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnMale.setBounds(586, 462, 103, 21);
		contentPane.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFemale.setBounds(683, 462, 103, 21);
		contentPane.add(rdbtnFemale);
		
		buttonGroupSex = new ButtonGroup();
		buttonGroupSex.add(rdbtnFemale);
		buttonGroupSex.add(rdbtnMale);
		
		btnInsert = new JButton("Insert");
		btnInsert.addActionListener(mangementStudentController);
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnInsert.setBounds(36, 664, 144, 34);
		contentPane.add(btnInsert);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(mangementStudentController);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(190, 664, 144, 34);
		contentPane.add(btnDelete);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(mangementStudentController);
		btnUpdate.addActionListener(mangementStudentController);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBounds(344, 664, 144, 34);
		contentPane.add(btnUpdate);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(mangementStudentController);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setBounds(498, 664, 144, 34);
		contentPane.add(btnSave);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(mangementStudentController);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBounds(652, 664, 144, 34);
		contentPane.add(btnCancel);
		
		btnRecover = new JButton("Recover");
		btnRecover.addActionListener(mangementStudentController);
		btnRecover.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRecover.setBounds(699, 72, 121, 34);
		contentPane.add(btnRecover);

		this.setVisible(true);
	}
	
	public MangementStudentModel getMangementStudentModel() {
		return mangementStudentModel;
	}

	public void setMangementStudentModel(MangementStudentModel mangementStudentModel) {
		this.mangementStudentModel = mangementStudentModel;
	}

	// Add town into Jcombox
	public void addTownIntoJComBox (JComboBox<String> jComboBox) {
		for (Town t : Town.listTowns()) {
			jComboBox.addItem(t.getNameTown());
		}
	}
	
	// Clear information
	public void clearInformation () {
		this.textFieldStudentID.setText("");
		this.textFieldName.setText("");
		this.comboBoxPartInf.setSelectedIndex(-1);
		this.textFieldBirthday.setText("");
		this.buttonGroupSex.clearSelection();
		this.textFieldFirstMark.setText("");
		this.textFieldSecondMark.setText("");
		this.textFieldThirdMark.setText("");
	}
	
	// Check users want to Save or Update
	public void addStudentIntoTableSaveOrUpdate (Student st) {
		if (!this.mangementStudentModel.isExist(st)) {
			this.mangementStudentModel.addStudent(st);
			this.saveStudentIntoTable(st);
		} else {
//			this.mangementStudentModel.removeStudent(st);
			this.updateStudentIntoTable(st);
		}
	}
	
	// When user click into Insert
	public void userClickInsert () {
		this.clearInformation();
	}
	// When users click Save
	public void userSelectSave() throws IOException {
		
		int IDStudent = Integer.valueOf(textFieldStudentID.getText());
		if (IDStudent > 99999999 || IDStudent < 10000000) {
			throw new IOException("ID student is not valid");
		}
		String nameStudent = textFieldName.getText();
		int birthplaceIndex = this.comboBoxPartInf.getSelectedIndex();
		Town birthplace = Town.listTowns().get(birthplaceIndex);
		String birthday = textFieldBirthday.getText();
		boolean sex = rdbtnMale.isSelected() ? true : false;
		double firstMark = Double.valueOf(textFieldFirstMark.getText());
		double secondMark = Double.valueOf(textFieldSecondMark.getText());
		double thirdMark = Double.valueOf(textFieldThirdMark.getText());
		if (firstMark > 10 || firstMark < 0 || secondMark > 10 || secondMark < 0 || thirdMark > 10 || thirdMark < 0) {
			throw new IOException("Mark is not valid");
		}
	
		Student st = new Student(IDStudent, nameStudent, birthplace, birthday, sex, firstMark, secondMark, thirdMark);
		this.addStudentIntoTableSaveOrUpdate(st);
	}
	public void saveStudentIntoTable (Student st) {
		DefaultTableModel modelTable = (DefaultTableModel) tableStudent.getModel();
		modelTable.addRow(new Object[] {
				st.getIDStudent()+"",
				st.getNameStudent(),
				st.getTown().getNameTown(),
				st.getBirthday()+"",
				st.isSex()?"Male":"Female",
				st.getFirstMark()+"",
				st.getSecondMark()+"",
				st.getThirdMark()+""
		});
	}
	
	// When users click into Update
	public void updateStudentIntoTable (Student st) {
		int numberOfRow = this.tableStudent.getRowCount();
		for (int i = 0; i < numberOfRow; i++) {
			String checkID = this.tableStudent.getValueAt(i, 0)+"";
			if (checkID.equals(st.getIDStudent()+"")) {
				this.tableStudent.setValueAt(st.getNameStudent(), i, 1);
				this.tableStudent.setValueAt(st.getTown().getNameTown(), i, 2);
				this.tableStudent.setValueAt(st.getBirthday(), i, 3);
				this.tableStudent.setValueAt(st.isSex()?"Male":"Female", i, 4);
				this.tableStudent.setValueAt(st.getFirstMark(), i, 5);
				this.tableStudent.setValueAt(st.getSecondMark(), i, 6);
				this.tableStudent.setValueAt(st.getThirdMark(), i, 7);
			}
		}
		for (Student st1 : this.mangementStudentModel.getListStuent()) {
			String idSt = st.getIDStudent()+"";
			String idSt1 = st1.getIDStudent()+"";
			if (idSt.equals(idSt1)) {
				this.mangementStudentModel.removeStudent(st1);
				this.mangementStudentModel.addStudent(st);
			}
		}
	}
	public void userSelectUpdate () {
		this.showInforStudentIsSelected();
	}
	public Student getInforStudentIsSelected () {
		DefaultTableModel modelTable = (DefaultTableModel) tableStudent.getModel();
		int rowIsSelected = tableStudent.getSelectedRow();
		int IDStudent = Integer.valueOf(tableStudent.getValueAt(rowIsSelected, 0)+"");
		String nameStudent = tableStudent.getValueAt(rowIsSelected, 1) +"";
		String town = tableStudent.getValueAt(rowIsSelected, 2) +"";
		Town birthplace = Town.getTownBasedOnName(town);
		String birthday = tableStudent.getValueAt(rowIsSelected, 3)+"";
		String textSex = tableStudent.getValueAt(rowIsSelected, 4)+"";
		boolean sex = textSex.equals("Male")?true:false;
		double firstMark = Double.valueOf(tableStudent.getValueAt(rowIsSelected, 5)+"");
		double secondMark = Double.valueOf(tableStudent.getValueAt(rowIsSelected, 6)+"");
		double thirdMark = Double.valueOf(tableStudent.getValueAt(rowIsSelected, 7) + "");
		Student st = new Student(IDStudent, nameStudent, birthplace, birthday, sex, firstMark, secondMark, thirdMark);
		return st;
	}
	public void showInforStudentIsSelected () {
		Student st = this.getInforStudentIsSelected();
		this.textFieldStudentID.setText(st.getIDStudent()+"");
		this.comboBoxPartInf.setSelectedItem(st.getTown().getNameTown());
		this.textFieldName.setText(st.getNameStudent());
		if (st.isSex()) {
			this.rdbtnMale.setSelected(true); 
		} else {
			this.rdbtnFemale.setSelected(true);
		}
		this.textFieldBirthday.setText(st.getBirthday());
		this.textFieldFirstMark.setText(st.getFirstMark()+"");
		this.textFieldSecondMark.setText(st.getSecondMark()+"");
		this.textFieldThirdMark.setText(st.getThirdMark()+"");
	}
	
	// When users click into Delete
	public void userSelectDelete () {
		DefaultTableModel modelTable = (DefaultTableModel) tableStudent.getModel();
		int rowIsSelected = tableStudent.getSelectedRow();
		String id = this.tableStudent.getValueAt(rowIsSelected,0)+"";
		int selection = JOptionPane.showConfirmDialog(this, "Do you want to delete this student?");
		if (selection == JOptionPane.YES_OPTION) {
			modelTable.removeRow(rowIsSelected);
		}
		for (Student st : this.mangementStudentModel.getListStuent()) {
			if (id.equals(st.getIDStudent()+"")) {
				this.mangementStudentModel.removeStudent(st);
			}
		}
	}
	// When users click into Cancel
	public void userSelectCancel () {
		this.clearInformation();
	}
	
	// When users click into Find
	public void userClickFind () {
		int birthplaceIndex = this.comboBoxPartFind.getSelectedIndex();
		Town birthplace = Town.listTowns().get(birthplaceIndex);
		String id = this.textFieldStudentIDAbove.getText();

		DefaultTableModel modelTable = (DefaultTableModel) tableStudent.getModel();
		int countRows = tableStudent.getRowCount();
		for (int i = 0; i < countRows; i++) {
			String town = tableStudent.getValueAt(i, 2)+"";
			Town townPlace = Town.getTownBasedOnName(town);
			String idInTable = tableStudent.getValueAt(i, 0) + "";
			if (birthplace.getNameTown().equals("") && !(id.equals(""))) {
				if (!(id.equals(idInTable))) {
					modelTable.removeRow(i);
					i--;
				}
			} else if (id.equals("") && !(birthplace.getNameTown().equals(""))) {
				if (!(birthplace.getNameTown().equals(townPlace.getNameTown()))) {
					modelTable.removeRow(i);
					i--;	
				}
			}else  {
				if (!(birthplace.getNameTown().equals(townPlace.getNameTown())&& id.equals(idInTable))) {
					modelTable.removeRow(i);
					i--;
				}
			}

		}
	}
	// When users click into Recover
	public void userClickRecover () {
		DefaultTableModel modelTable = (DefaultTableModel) tableStudent.getModel();
		int countRows = tableStudent.getRowCount();
		for (int i = 0; i < countRows--; i++) {
			modelTable.removeRow(i--);
		}
		for (Student st : this.mangementStudentModel.getListStuent()) {
			this.saveStudentIntoTable(st);
		}
	}
	// When user click into About Me
	public void userClickAboutMe () {
		JOptionPane.showMessageDialog(this, "This is version mangement student 1.0");
	}
	public void userClickExit () {
		int selection = JOptionPane.showConfirmDialog(this, "Do you want to exit?");
		if (selection == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	// When user click into FileSave
	public void saveFile (String fileName) {
		File f = new File(fileName);
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Student st : this.mangementStudentModel.getListStuent()) {
				oos.writeObject(st);
			}
			oos.flush();
			fos.close();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void userClickFileSave () {
		if (!this.mangementStudentModel.getFileName().equals("")) {
			saveFile(this.mangementStudentModel.getFileName());
		} else {
			JFileChooser jFileChooser = new JFileChooser();
			int returnVal = jFileChooser.showOpenDialog(this);
			if (returnVal == jFileChooser.APPROVE_OPTION) {
				File f = jFileChooser.getSelectedFile();
				this.mangementStudentModel.setFileName(f.getAbsoluteFile()+"");
				System.out.println(f.getAbsoluteFile()+"");
				saveFile(f.getAbsoluteFile()+"");
			}
		}
	}
	// When user click FileOpen
	public void openFile (String fileName) {
		ArrayList<Student> listStudent = new ArrayList<>();
		try {
			File f = new File(fileName);
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = null;
			while (true) {
	            try {
	                obj = ois.readObject();
	                listStudent.add((Student)obj);
	            } catch (EOFException e) {
	                break; 
	            }
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		this.mangementStudentModel.setListStuent(listStudent);
		this.userClickRecover();
	}
	public void userClickFileOpen (){
		JFileChooser jFileChooser = new JFileChooser();
		int returnVal = jFileChooser.showOpenDialog(this);
		if (returnVal == jFileChooser.APPROVE_OPTION) {
			File f = jFileChooser.getSelectedFile();
			openFile(f.getAbsoluteFile()+"");
		}
	}
} 
