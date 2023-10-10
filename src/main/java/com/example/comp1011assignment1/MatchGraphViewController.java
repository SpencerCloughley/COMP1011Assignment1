package com.example.comp1011assignment1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;

import java.net.URL;
import java.util.ResourceBundle;

public class MatchGraphViewController implements Initializable {

    @FXML
    private BarChart<?, ?> barChart;

    @FXML
    private PieChart pieChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
