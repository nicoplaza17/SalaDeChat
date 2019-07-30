/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import main.ClienteChat;


/**
 *
 * @author nico
 */
public class Todo extends JFrame {
    public Todo(){
        iniciarVentana();
        iniciarComponentes();
        setVisible(true);
       
      
    }
private void iniciarVentana(){
this.setTitle("Mi Ventana");
this.setLayout(null);
this.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
this.setSize(500,500);
this.setResizable(false);
}    
private void iniciarComponentes(){    
JTextArea area = new JTextArea();
area.setBounds(20,20,460,360);
area.setEditable(false);
ClienteChat chat = new ClienteChat("192.168.61.11"," 2000", area);
chat.conectar();


JTextField texto = new JTextField();
texto.setBounds(20,400,460,30);

JCheckBox box = new JCheckBox();
box.setText("Agregar al final");
box.setBounds(18,450,145,30);
box.setSelected(true);

JButton enviar = new JButton();
enviar.setText("Enviar");
enviar.setBounds(380,450,100,30);

JButton salir = new JButton();
salir.setText("Salir");
salir.setBounds(165,450,100,30);

JButton borrar = new JButton();
borrar.setText("Borrar");
borrar.setBounds(273,450,100,30);



enviar.addActionListener(new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent ea){
       chat.EnviarMensaje("Nico",texto.getText());
       texto.setText("");
   /*if(box.isSelected()){    
   String guardar = area.getText();
   area.setText(guardar+"Nico:"+texto.getText()+"\n");
   texto.setText("");
   }else{
   String guardar = area.getText();
   area.setText("Nico:"+texto.getText()+"\n"+guardar);
   texto.setText("");}*/
   
       
   }}
);    


borrar.addActionListener(new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent ea){
   int optionPane = JOptionPane.showConfirmDialog(rootPane, "Estas Seguro?", "Cuidado!",JOptionPane.YES_NO_OPTION);
   if(optionPane == JOptionPane.YES_OPTION){
   area.setText("");
   texto.setText("");}
       
   }}
);  

salir.addActionListener(new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent ea){
    Todo.super.dispose();
       Login login = new Login();      
}    
   }
);  





add(box);
add(borrar);
add(enviar);
add(texto);
add(area);
add(salir);
    
}
}





