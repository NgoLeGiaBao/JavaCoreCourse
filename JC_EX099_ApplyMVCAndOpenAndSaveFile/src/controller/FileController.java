package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.FileView;

public class FileController implements ActionListener {
	private FileView fileView;
	public FileController(FileView fileView) {
		this.fileView = fileView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		JFileChooser jFileChooser = new JFileChooser();
		if (src.equals("OPEN")) {
			int returnVal = jFileChooser.showOpenDialog(this.fileView);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = jFileChooser.getSelectedFile();
				this.fileView.getFileModel().setNameFile(file.getAbsolutePath());
				this.fileView.addPath();
				String fileName = file.getName();
				if (fileName.endsWith(".txt")) {
					try {
						List <String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						int count = 0;
						String text = "";
						for (String textOnALine : allText) {
							text += textOnALine;
							count++;
							if (count == allText.size()) {
								break;
							}
							text += "\n";
						}
						this.fileView.getFileModel().setText(text);
						this.fileView.writTextFromFileIntoJTextArea();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}else if (src.equals("SAVE")){
			String data = this.fileView.getTextArea().getText();
			if (this.fileView.getFileModel().getNameFile().length() > 0) {
				try {
					PrintWriter pw = new PrintWriter(this.fileView.getFileModel().getNameFile(), "UTF8");
					pw.write(data);
					pw.flush();
					pw.close();
				} catch (FileNotFoundException | UnsupportedEncodingException e1) {
					e1.printStackTrace();
				}
			} else {
				int returnVal = jFileChooser.showSaveDialog(this.fileView);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = jFileChooser.getSelectedFile();
					this.fileView.getFileModel().setNameFile(file.getAbsolutePath());
					this.fileView.addPath();
					String getName = file.getName();
					if (getName.endsWith(".txt")) {
						try {
							PrintWriter pw = new PrintWriter(file, "UTF8");
							pw.write(data);
							pw.flush();
							pw.close();
						} catch (FileNotFoundException | UnsupportedEncodingException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		}
		
	}
	
	
}
