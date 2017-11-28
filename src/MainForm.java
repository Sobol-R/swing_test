import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JButton НАЖМИНАМЕНЯButton;
    public JPanel rootPanel;
    private JTextField textField1;
    private JTextField textField2;

    public MainForm() {
        НАЖМИНАМЕНЯButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ЗДЕСЬСЬСЬСЬСЬС
                System.out.println(textField1.getText());
                System.out.println(textField2.getText());
            }
        });
    }
}
