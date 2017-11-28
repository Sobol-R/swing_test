import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // создаём окно, параметр title - заголовок
        JFrame mainFrame = new JFrame("Ахахахаахахахахаахххх");
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
