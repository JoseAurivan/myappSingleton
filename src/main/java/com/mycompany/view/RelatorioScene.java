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
import javafx.scene.layout.TilePane;


public class RelatorioScene extends AbstractScene {
    private final Config config = Config.getInstance();
    public RelatorioScene(App app) {
        super(app);
        
        Label label = new Label(" Formato de Relatorios " + config.getFormatRelatorios());
        Button bttn = new Button(" Voltar ");
        setRoot(new TilePane(label, bttn));
        
        bttn.setOnAction(event -> app.setScene(new MainScene(app)));
    }
    
}
