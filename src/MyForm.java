import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm {
    int a,b;
    private JPanel panelForm;
    private JButton red1Button;
    private JButton blue1Button;
    private JButton gameOverButton;
    private JLabel redScore;
    private JLabel blueScore;
    private JLabel X;

    public JPanel getPanelForm(){return panelForm;}
    MyForm(){
        red1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a+=1;
                        redScore.setText(Integer.toString(a));
            }
        });
        blue1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b+=1;
                blueScore.setText(Integer.toString(b));
            }
        });
    gameOverButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            red1Button.hide();
            blue1Button.hide();
            X.setText("Final Score "+'\n'+a +":"+ b );
            redScore.hide();
            blueScore.hide();
        }
    });

    }
}
