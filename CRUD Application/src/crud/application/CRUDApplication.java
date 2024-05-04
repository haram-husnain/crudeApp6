/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud.application;

import com.databaseCon.DB;
import com.home.HomeJFrame;

/**
 *
 * @author Daniel
 */
public class CRUDApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HomeJFrame homeObj = new HomeJFrame();
        homeObj.show();
        
        DB.loadConnection();
    }
    
}
