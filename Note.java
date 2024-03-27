import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;

public class Note implements ActionListener {
    private JFrame f;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll, open, newFile, save, saveAs, exit;
    private JTextArea ta;
    private File currentFile;

    public Note() {
        f = new JFrame();
        
        currentFile = null;

        open = new JMenuItem("Open File");
        newFile = new JMenuItem("New");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save As");
        exit = new JMenuItem("Exit");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");

        open.addActionListener(this);
        newFile.addActionListener(this);
        save.addActionListener(this);
        saveAs.addActionListener(this);
        exit.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        mb.setBounds(5, 5, 600, 20);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        file.add(open);
        file.add(newFile);
        file.add(save);
        file.add(saveAs);
        file.add(exit);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        ta = new JTextArea(20, 40);  // Set rows and columns for JTextArea

        // Add the JTextArea to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(ta);
        f.setJMenuBar(mb);

      

        //f.add(mb, BorderLayout.NORTH);
        f.add(scrollPane, BorderLayout.CENTER);
       
        f.add(mb);
        f.add(ta);
        f.add(scrollPane);  // Add the JScrollPane to the JFrame

        f.setLayout(new BorderLayout());
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            openFile();
        } else if (e.getSource() == newFile) {
            newFile();
        } else if (e.getSource() == save) {
            saveFile();
        } else if (e.getSource() == saveAs) {
            saveFileAs();
        } else if (e.getSource() == exit) {
            System.exit(0);
        } else if (e.getSource() == cut) {
            ta.cut();
        } else if (e.getSource() == paste) {
            ta.paste();
        } else if (e.getSource() == copy) {
            ta.copy();
        } else if (e.getSource() == selectAll) {
            ta.selectAll();
        }
    }

    private void openFile() {
        JFileChooser fl = new JFileChooser();
        int i = fl.showOpenDialog(f);
        if (i == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fl.getSelectedFile();
            String filepath = selectedFile.getPath();
            try {
                BufferedReader br = new BufferedReader(new FileReader(filepath));
                String s1, s2 = "";
                while ((s1 = br.readLine()) != null) {
                    s2 += s1 + "\n";
                }
                ta.setText(s2);
                br.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void newFile() {
        ta.setText("");
        currentFile = null;
    }

    private void saveFile() {
        if (currentFile != null) {
            try {
                FileWriter fw = new FileWriter(currentFile);
                fw.write(ta.getText());
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            saveFileAs();
        }
    }

    private void saveFileAs() {
        JFileChooser fileChooser = new JFileChooser();
        int response = fileChooser.showSaveDialog(f);
        if (response == JFileChooser.APPROVE_OPTION) {
            try {
                currentFile = fileChooser.getSelectedFile();
                FileWriter fw = new FileWriter(currentFile);
                fw.write(ta.getText());
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Note();
    }
}