package shabbadabba.main.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListMakerPanel extends JPanel {

    public MainPanel mainPanel;
    public JButton exitButton;
    public ListMakerPanel(MainPanel mainMenu)
    {
        mainPanel = mainMenu;
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
