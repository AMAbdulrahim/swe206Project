package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.example.programJFiles.Game;
import com.example.programJFiles.Student;
import com.example.programJFiles.Team;
import com.example.programJFiles.Tournament;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class notStuController extends App implements Initializable{

    Team team0;
    Student stu;
    Student addstu;
    Tournament tour;
    Game game;


    @FXML
    static
    ArrayList<String> teams = new ArrayList<>();

    @FXML
    private Button addTeam;

    @FXML
    private Button viewArchivedTournamentButton;

    @FXML
    private Button createtours;

    @FXML
    private Button createToursE;

    @FXML
    private Button createTournamentBtn;



    @FXML
    void addTeamBtnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sbFiles/addteamscene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void viewArchivedTournamentBtnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sbFiles/viewArchivedToursScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void createTournamentBtnAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sbFiles/createTournamentScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

    
}
