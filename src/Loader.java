import javax.swing.*;

public class Loader {
    public static void main (String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400,120);

        MyForm myForm = new MyForm();
        frame.add(myForm.getPanelForm());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}