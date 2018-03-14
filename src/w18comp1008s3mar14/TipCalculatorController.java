package w18comp1008s3mar14;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class TipCalculatorController implements Initializable
{
    //The @FXML is what links the variable name to the fx:id in the view
    @FXML    private TextField mealAmountTextField;
    @FXML    private TextField tipPercentageTextField;
    @FXML    private TextField tipAmountTextField;
    @FXML    private TextField totalCostTextField;
    @FXML    private Slider slider;

    @FXML
    void calculateTip(ActionEvent event) {
        double tipAmount = 0;
        double totalCost = 0;
        
        double mealAmount = Double.parseDouble(mealAmountTextField.getText());
        double tipPercent = Double.parseDouble(tipPercentageTextField.getText());
        
        if (tipPercent >= 0)
            tipPercent = tipPercent / 100;
        
        tipAmount = mealAmount * tipPercent;
        totalCost = mealAmount + tipAmount;
        
        tipAmountTextField.setText(String.format("$%.2f", tipAmount));
        totalCostTextField.setText(String.format("$%.2f", totalCost));
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        this.tipAmountTextField.setEditable(false);
        this.totalCostTextField.setEditable(false);
        
        //configure the slider and textfield
        this.tipPercentageTextField.setEditable(false);
        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(15);
        updateTipPercentage();
    }    
    
    @FXML
    public void updateTipPercentage()
    {
        tipPercentageTextField.setText(String.format("%.0f", 
                slider.getValue()));
    }
}
