package barmanager.gui;

import barmanager.be.Drink;
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

    @FXML
    private void orderDrink()
    {
        String proof = cbProof.getValue();
        Drink drink = createDrink(proof);
        lstOrderedProducts.getItems().add(drink.toString());
    }

    private void prepareProofs() {
        cbProof.getItems().addAll(
                MILD_PROOF,
                MEDIUM_PROOF,
                STRONG_PROOF
        );
    }

    private void prepareProducts()
    {
        lblProducts.setText(String.join(", ", getProducts()));
    }

    private String[] getProducts() {
        return new String[] {
            "Beer",
            "Wine",
            "Tequilla shot"
        };
    }

    private Drink createDrink(String proofDescription)
    {
        switch (proofDescription)
        {
            case MILD_PROOF:
                return new Drink("Beer", 33);
            case MEDIUM_PROOF:
                return new Drink("Wine", 75);
            case STRONG_PROOF:
                return new Drink("Tequilla shot", 2);
        }
        return null;
    }
}
