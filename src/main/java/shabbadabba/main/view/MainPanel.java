package shabbadabba.main.view;

import shabbadabba.main.model.Meal;

import javax.swing.*;
import java.util.List;

public class MainPanel extends JPanel {
    public JButton listMakerButton;
    public JButton mealMakerButton;

    public MainPanel()
    {
        listMakerButton = new JButton();
        listMakerButton.setText("List Manager");
        this.add(listMakerButton);

        mealMakerButton = new JButton();
        mealMakerButton.setText("Meal Maker");
        this.add(mealMakerButton);
    }

    public void setAsOnly()
    {
        this.setVisible(true);
    }
}
