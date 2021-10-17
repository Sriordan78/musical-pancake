package shabbadabba.main.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MealMakerPanel extends JPanel {

    public MainPanel mainPanel;
    public JButton exitButton;
    public MealMakerPanel(MainPanel mainMenuPanel)
    {
        mainPanel = mainMenuPanel;
        exitButton = new JButton();
        exitButton.setText("Exit");
        this.add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainPanel.setAsOnly();
            }
        });
    }
}
