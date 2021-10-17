package shabbadabba.main;
import shabbadabba.main.model.Model;
import shabbadabba.main.view.View;

/**
 * This class will contain all of the logic for GroceryMaster
 */
public class Controller {

    protected View view;
    protected Model model;

    public Controller()
    {
        view = new View();
        model = new Model();
    }

}
