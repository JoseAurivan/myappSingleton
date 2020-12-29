/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.model.Config;
import com.mycompany.myapp.App;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;


public class ConfigScene extends AbstractScene {
    private final Config config = Config.getInstance();
    
    public ConfigScene(App app) {
        super(app);
        
        Label label1 = new Label("Formato de Relatorios: ");
        TextField fieldFormatRelatorio = new TextField(config.getFormatRelatorios());
        Label label2 = new Label("Titulo de Graficos: ");
        TextField fieldTipoGrafico = new TextField(config.getTipoGraficos());
        Button bttn = new Button(" Voltar");
        setRoot(new VBox(label1,fieldFormatRelatorio,label2,fieldTipoGrafico, bttn));
        
        bttn.setOnAction(event -> {
        config.setFormatRelatorios(fieldFormatRelatorio.getText());
        config.setTipoGraficos(fieldTipoGrafico.getText());
        app.setScene(new MainScene(app));
        });
    }
    
}
