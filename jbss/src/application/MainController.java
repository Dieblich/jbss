package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;

public class MainController {
	
	private Storypoints myStorypoint = new Storypoints();
	
	private int result = 0;

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
    void setSliderLabel(MouseDragEvent event) {
    		System.out.println("Gezogen");
    }

    @FXML
    void calculateStoryPoints(ActionEvent event) {
    	// collect the values
    	double selectedPoints =   (double)(sliderClasses.getValue()) 
    							+ (double)(sliderDataModellChanges.getValue()) 
    							+ (double)(sliderDesignChanges.getValue())
    							+ (double)(sliderExternalHelp.getValue())
    							+ (double)(sliderInsecurity.getValue())
    							+ (double)(sliderNewTests.getValue())
    							+ (double)(sliderRegressionTests.getValue())
    							+ (double)(sliderRequirements.getValue());
    	
    	// add the manually set story points
    	selectedPoints += Double.valueOf(textFieldManualStoryPoints.getText());
    	// calculate the result
    	result = myStorypoint.getStorypoints((int)(selectedPoints));
    	setResult(result);
    }

    @FXML
    void calculateStoryPointsRng(ActionEvent event) {
    	// get a random number between 0 and 100
    	int myCustomStorypoints = (int) (100*Math.random());
    	// calculate the result
    	result = myStorypoint.getStorypoints(myCustomStorypoints);
    	setResult(result);
    	
    }
    

    @FXML
    void resetSliders(ActionEvent event) {
    	sliderClasses.setValue(0);
    	sliderDataModellChanges.setValue(0);
    	sliderDesignChanges.setValue(0);
    	sliderExternalHelp.setValue(0);
    	sliderInsecurity.setValue(0);
    	sliderNewTests.setValue(0);
    	sliderRegressionTests.setValue(0);
    	sliderRequirements.setValue(0);
    }
    
    void setResult(int result) {
    	labelResult.setText(String.valueOf(result));
    }
    
    public void initialize() {

        sliderClasses.valueProperty().addListener((observable, oldValue, newValue) -> {
            hintClasses.setText(Double.toString(newValue.intValue()));
        });
        sliderDataModellChanges.valueProperty().addListener((observable, oldValue, newValue) -> {
            hintDataModellChanges.setText(Double.toString(newValue.intValue()));
        });
        sliderDesignChanges.valueProperty().addListener((observable, oldValue, newValue) -> {
            hintDesignChanges.setText(Double.toString(newValue.intValue()));
        });
        sliderExternalHelp.valueProperty().addListener((observable, oldValue, newValue) -> {
            hintExternalHelp.setText(Double.toString(newValue.intValue()));
        });
        sliderInsecurity.valueProperty().addListener((observable, oldValue, newValue) -> {
            hintInsecurity.setText(Double.toString(newValue.intValue()));
        });
        sliderNewTests.valueProperty().addListener((observable, oldValue, newValue) -> {
            hintNewTests.setText(Double.toString(newValue.intValue()));
        });
        sliderRegressionTests.valueProperty().addListener((observable, oldValue, newValue) -> {
            hintRegressionTests.setText(Double.toString(newValue.intValue()));
        });
        sliderRequirements.valueProperty().addListener((observable, oldValue, newValue) -> {
            hintRequirements.setText(Double.toString(newValue.intValue()));
        });

    }

}
