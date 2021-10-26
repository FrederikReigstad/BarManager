package barmanager.gui;

import barmanager.be.Drink;
import bil.DrinkFactory;
import bil.IDrink;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class BarController implements Initializable {

    private static final String MILD_PROOF = "Mild";
    private static final String MEDIUM_PROOF = "Medium";
    private static final String STRONG_PROOF = "Strong";
    IDrink iDrink = DrinkFactory.iDrink();


    @FXML
    private ChoiceBox<String> cbProof;

    @FXML
    private Label lblProducts;

    @FXML
    private ListView<String> lstOrderedProducts;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        prepareProofs();
        prepareProducts();
    }

    private void prepareProducts()
    {
        lblProducts.setText(String.join(", ", iDrink.getProducts()));
    }

    @FXML
    private void orderDrink()
    {
        String proof = cbProof.getValue();
        Drink drink = iDrink.createDrink(proof);
        lstOrderedProducts.getItems().add(drink.toString());
    }

    private void prepareProofs() {
        cbProof.getItems().addAll(
                MILD_PROOF,
                MEDIUM_PROOF,
                STRONG_PROOF
        );
    }




}
