import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    public static void main(String[] args) {
        // создаём окно, параметр title - заголовок
        JFrame mainFrame = new JFrame("Калькулятор");
        // завершаем приложение, если закрыли окно
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создаём главную форму
        MainForm mainForm = new MainForm();
        // присоединяем главную форму к окну
        mainFrame.setContentPane(mainForm.rootPanel);
        // обновляем размеры
        mainFrame.pack();
        // отображаём окно
        mainFrame.setVisible(true);
    }

}
