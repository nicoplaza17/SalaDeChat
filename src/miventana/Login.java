/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miventana;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author nico
 */
public class Login {
      JTextField username = new JTextField();
JTextField password = new JPasswordField();
Object[] message = {
    "Username:", username,
    "Password:", password,
        

};
public Login(){
Iniciar();
}

private void Iniciar(){
    int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
    if (option == JOptionPane.OK_OPTION) {
        if (username.getText().equals("Nico") && password.getText().equals("1723")) {
            Todo ventana = new Todo();
            System.out.println("Login successful");
                  
        } else {
            System.out.println("login failed");
            }
    } else {
        System.out.println("Login canceled");
}
}
}
