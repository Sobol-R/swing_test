import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {

    private JButton clickMeButton;
    public JPanel rootPanel;
    public JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JRadioButton сложить;
    private JRadioButton вычесть;
    private JRadioButton умножить;
    private JRadioButton разделить;

    public MainForm() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    if (сложить.isSelected()) {
                        int a = Integer.valueOf(textField1.getText());
                        int b = Integer.valueOf(textField2.getText());
                        int c = a + b;
                        String d = Integer.toString(c);
                        textField3.setText(d);
                    } else if (вычесть.isSelected()) {
                        int a = Integer.valueOf(textField1.getText());
                        int b = Integer.valueOf(textField2.getText());
                        int c = a - b;
                        String d = Integer.toString(c);
                        textField3.setText(d);
                    } else if (умножить.isSelected()) {
                        int a = Integer.valueOf(textField1.getText());
                        int b = Integer.valueOf(textField2.getText());
                        int c = a * b;
                        String d = Integer.toString(c);
                        textField3.setText(d);
                    } else if (разделить.isSelected()) {
                        int a = Integer.valueOf(textField1.getText());
                        int b = Integer.valueOf(textField2.getText());
                        int c = a / b;
                        String d = Integer.toString(c);
                        textField3.setText(d);
                    }

                } catch (Exception j) {
                    JOptionPane.showMessageDialog(rootPanel, "Ошибочка");
                    textField3.setText("Повторите попытку");
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
