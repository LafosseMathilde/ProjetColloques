/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.colloques;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Mathilde
 */
public class connexionbdd {

    Connection connect;
   
    public connexionbdd(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd","root", "root");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Connexion échouée"+e);
            
        }
    }
    
}
