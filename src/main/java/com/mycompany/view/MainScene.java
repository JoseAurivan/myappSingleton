/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.myapp.App;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;


public class MainScene extends AbstractScene {

    public MainScene(App app) {
        super(app);
        
        Button btnRelatorios = new Button("Relatorios");
        Button btnConfig = new Button("Configuracoes");
        setRoot(new TilePane(btnRelatorios, btnConfig));
        
        btnRelatorios.setOnAction(event -> app.setScene(new RelatorioScene(app)));
        btnConfig.setOnAction(event -> app.setScene(new ConfigScene(app)));
    }
    
}
