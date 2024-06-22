import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Rough {
    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
         // Create the frame
         JFrame frame = new JFrame("Simple GUI");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(400, 200);
 
         // Create a panel to hold components
         JPanel panel = new JPanel();
         frame.add(panel);
         placeComponents(panel);
 
         // Set the frame to be visible
         frame.setVisible(true);

    }
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Create a label
        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);}
    
}






   

       


    
