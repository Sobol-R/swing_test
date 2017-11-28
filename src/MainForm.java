import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {

    private JButton clickMeButton;
    public JPanel rootPanel;
    public JTextField textField1;
    private JTextField textField2;

    public MainForm() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // отобразим диалог
                JOptionPane.showMessageDialog(rootPanel, "Ahahahahahahahhahahahaha!");
            }
        });
    }

}
