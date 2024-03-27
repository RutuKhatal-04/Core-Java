import java.awt.*;
import javax.swing.JFrame.*;
public class FileExample extends implements ActionListener{
	JMenuBar mb;
	JMenuItem open;
	JMenu file;
	JTextArea ta;
	FileExample(){
	open=new JMenuItem("Open file");
	open.addActionListener(this);
	file=new JMenu("File");
	file.add(open);
	mb=new JMenuBar();
	mb.setBounds(0,0,800,20);
	mb.add(file);
	ta=new JTextArea(800,800);
	ta.setBounds(0,20,800,800);
	add(mb);
	add(ta);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==open)
	{
		JFileChooser fc=new JFileChooser();
		int i=fc.showOpenDialog(this);
		if(i==JFileChooser.APPROVE_OPTION)
		{
			File f=fc.getSelectedFile();
			String FilePath=f.getPath();
			try{
				BufferReader br=new BufferReader(new FileReader(filePath));
				String s1="",s2="";
				while((s1=br.readLine())!=null)
				{
					s2+=s1+"\n";
				}
				ta.setText(s2);
				br.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}	

	
	