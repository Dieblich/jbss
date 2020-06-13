package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label labelTitle;

    @FXML
    private Label labelClasses;

    @FXML
    private Slider sliderClasses;

    @FXML
    private Label hintClasses;

    @FXML
    private Label labelNewTests;

    @FXML
    private Slider sliderNewTests;

    @FXML
    private Label hintNewTests;

    @FXML
    private Label labelRegressionTests;

    @FXML
    private Slider sliderRegressionTests;

    @FXML
    private Label hintRegressionTests;

    @FXML
    private Label lableInsecurity;

    @FXML
    private Slider sliderInsecurity;

    @FXML
    private Label hintInsecurity;

    @FXML
    private Label lableRequirements;

    @FXML
    private Slider sliderRequirements;

    @FXML
    private Label hintRequirements;

    @FXML
    private Label labelDataModellChanges;

    @FXML
    private Slider sliderDataModellChanges;

    @FXML
    private Label hintDataModellChanges;

    @FXML
    private Label labelDesignChanges;

    @FXML
    private Slider sliderDesignChanges;

    @FXML
    private Label hintDesignChanges;

    @FXML
    private Label labelManualStoryPoints;

    @FXML
    private TextField textFieldManualStoryPoints;

    @FXML
    private Label labelExternalHelp;

    @FXML
    private Slider sliderExternalHelp;

    @FXML
    private Label hintExternalHelp;

    @FXML
    private Button buttonCalculateStoryPoints;

    @FXML
    private Label labelResultTitle;

    @FXML
    private Label labelResult;

    @FXML
    private Button buttonCalculateStoryPointsRng;

    @FXML
    void calculateStoryPoints(ActionEvent event) {
    	

    }

    @FXML
    void calculateStoryPointsRng(ActionEvent event) {
    	Storypoints myStorypoint = new Storypoints();
    	int result = myStorypoint.getStorypoints((int) (100*Math.random()));
    	labelResult.setText(String.valueOf(result));
    	
    }

}