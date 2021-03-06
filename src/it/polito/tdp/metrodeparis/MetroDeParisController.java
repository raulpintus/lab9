/**
 * Sample Skeleton for 'MetroDeParis.fxml' Controller Class
 */

package it.polito.tdp.metrodeparis;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.metrodeparis.model.Fermata;
import it.polito.tdp.metrodeparis.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class MetroDeParisController {
	
	private Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="comboPartenza"
    private ComboBox<Fermata> comboPartenza; // Value injected by FXMLLoader

    @FXML // fx:id="comboArrivo"
    private ComboBox<Fermata> comboArrivo; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML
    void doCalcolaPercorso(ActionEvent event) {

    }

    @FXML
    void doCalcolaRaggiungibili(ActionEvent event) {
      	List<Fermata> list= model.getFermate();
      	comboArrivo.getItems().addAll(list);
      	comboArrivo.getItems().remove(comboPartenza.getValue());   	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert comboPartenza != null : "fx:id=\"comboPartenza\" was not injected: check your FXML file 'MetroDeParis.fxml'.";
        assert comboArrivo != null : "fx:id=\"comboArrivo\" was not injected: check your FXML file 'MetroDeParis.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'MetroDeParis.fxml'.";

    }
    
    public void setModel(Model model) {
		this.model = model;
		comboPartenza.getItems().addAll(this.model.getFermate());
	
	}
}
