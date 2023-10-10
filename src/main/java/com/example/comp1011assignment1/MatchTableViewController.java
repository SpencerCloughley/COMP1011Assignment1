package com.example.comp1011assignment1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class MatchTableViewController implements Initializable {

    @FXML
    private TableColumn<Match, String> baronColumn;

    @FXML
    private TableColumn<Match, String> dragonColumn;

    @FXML
    private TableColumn<Match, Integer> durationColumn;

    @FXML
    private TableColumn<Match, Integer> gameIdColumn;

    @FXML
    private TableColumn<Match, String> heraldColumn;

    @FXML
    private TableColumn<Match, String> inhibitorColumn;

    @FXML
    private TableColumn<Match, String> killColumn;

    @FXML
    private TableColumn<Match, Integer> seasonColumn;

    @FXML
    private TableColumn<Match, String> towerColumn;

    @FXML
    private TableColumn<Match, String> winnerColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
