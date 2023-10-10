package com.example.comp1011assignment1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
    @FXML
    private TableView<Match> tableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        baronColumn.setCellValueFactory(new PropertyValueFactory<>("firstBaron"));
        dragonColumn.setCellValueFactory(new PropertyValueFactory<>("firstDragon"));
        durationColumn.setCellValueFactory(new PropertyValueFactory<>("gameDuration"));
        gameIdColumn.setCellValueFactory(new PropertyValueFactory<>("gameId"));
        heraldColumn.setCellValueFactory(new PropertyValueFactory<>("firstRiftHerald"));
        inhibitorColumn.setCellValueFactory(new PropertyValueFactory<>("firstInhibitor"));
        killColumn.setCellValueFactory(new PropertyValueFactory<>("firstBlood"));
        seasonColumn.setCellValueFactory(new PropertyValueFactory<>("seasonId"));
        towerColumn.setCellValueFactory(new PropertyValueFactory<>("firstTower"));
        winnerColumn.setCellValueFactory(new PropertyValueFactory<>("winner"));

        tableView.getItems().addAll((DBUtility.getMatches()));
    }
}
