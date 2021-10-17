package shabbadabba.main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class will represent the view that we use to interact with the user.s
 */
public class View extends JFrame {
    public MainPanel mainMenuPanel;
    public ListMakerPanel listMakerPanel;
    public MealMakerPanel mealMakerPanel;

    public View()
    {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Grocery Master");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        instantiatePanels();
        addPanelsAndSetInitialVisibility();
        addActionListeners();
        pack();
    }

    private void instantiatePanels() {
        mainMenuPanel = new MainPanel();
        listMakerPanel = new ListMakerPanel(mainMenuPanel);
        mealMakerPanel = new MealMakerPanel(mainMenuPanel);
    }

    public void addPanelsAndSetInitialVisibility()
    {
        this.add(mainMenuPanel);
        this.add(listMakerPanel);
        this.add(mealMakerPanel);
        listMakerPanel.setVisible(false);
        mealMakerPanel.setVisible(false);
    }

    public void addActionListeners()
    {
        mainMenuPanel.mealMakerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainMenuPanel.setVisible(false);
                mealMakerPanel.setVisible(true);
            }
        });

        mainMenuPanel.listMakerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mainMenuPanel.setVisible(false);
                listMakerPanel.setVisible(true);
            }
        });

        mealMakerPanel.exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mealMakerPanel.setVisible(false);
                mainMenuPanel.setVisible(true);
            }
        });

        listMakerPanel.exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                listMakerPanel.setVisible(false);
                mainMenuPanel.setVisible(true);
            }
        });
    }


}
