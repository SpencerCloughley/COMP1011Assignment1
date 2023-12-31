package com.example.comp1011assignment1;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MatchGraphViewController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private PieChart pieChart;

    @FXML
    void changeToTableView(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "match-table-view.fxml" );
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        int[] winners = DBUtility.getWinners();
        pieChart.getData().add(new PieChart.Data("Blue Wins",winners[0]));
        pieChart.getData().add(new PieChart.Data("Red Wins",winners[1]));

        int[] firstBloods = DBUtility.getFirstBloods();
        XYChart.Series<String, Integer> firstBloodData = new XYChart.Series<>();
        firstBloodData.getData().add(new XYChart.Data<>("Blue First Bloods",firstBloods[0]));
        firstBloodData.getData().add(new XYChart.Data<>("Red First Bloods",firstBloods[1]));
        firstBloodData.setName("First Bloods");

        barChart.getData().addAll(firstBloodData);
    }
}
