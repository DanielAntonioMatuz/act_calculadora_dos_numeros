import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HelloWorld extends JFrame implements ActionListener{

    private JLabel mensaje;
    private JLabel mensaje2;
    private JButton boton;
    private JTextField caja,caja2;
    
    public HelloWorld(){
        super();
        configurarVentana();
        crearComponente();
    }
    
    private void configurarVentana(){
        this.setTitle("App Suma");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new java.awt.Color(130,224,170));
    }
    
    private void crearComponente(){
        mensaje = new JLabel();
        mensaje.setText("Valor (1 -):");
        mensaje.setBounds(50, 50, 200, 60);
        mensaje.setForeground(Color.black);
        this.add(mensaje);
        
        mensaje2 = new JLabel();
        mensaje2.setText("Valor (2 -):");
        mensaje2.setBounds(250, 50, 200, 60);
        mensaje2.setForeground(Color.black);
        this.add(mensaje2);
        
        boton = new JButton();
        boton.setText("Sumar");
        boton.setBounds(50, 130, 175, 25);
        boton.addActionListener(this);
        this.add(boton);
       
        caja = new JTextField();
        caja.setBounds(130,70,100,30);
        this.add(caja);
        
        caja2 = new JTextField();
        caja2.setBounds(330,70,100,30);
        this.add(caja2);
    }
 
    
    @Override
    public void actionPerformed(ActionEvent e){

        String resultado = caja.getText();
        float r1 = Float.parseFloat(resultado);
        String resultado2 = caja2.getText();
        float r2 = Float.parseFloat(resultado2);
        float resultadoSuma = (r1 + r2);
        String resultadoTotal = Float.toString(resultadoSuma);
        JOptionPane.showMessageDialog(this, "El valor es: " + resultadoTotal);
    	
    	
    }
    
    
    
    public static void main(String[] args){
        HelloWorld ventana = new HelloWorld();
        ventana.setVisible(true);
    }
    
}
