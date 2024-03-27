import javax.swing.*;  
public class OptionPaneExampler{  
JFrame f;  
OptionPaneExampler(){  
    f=new JFrame();  
    JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);     
}  
public static void main(String[] args) {  
    new OptionPaneExampler();  
}  
}  