/*
import javax.swing.*;
import java.awt.*;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testingclass{

    public static void main(String[] args) {

         new SimpleJbutton("Standard");
         new SimpleJbutton("Privileged");

        }
        public static class SimpleJbutton {

        SimpleJbutton(String str) {

            JFrame f = new JFrame(str);
            JButton b = new JButton("Submit");
            b.setBounds(110, 170, 130, 30);

            JLabel label1 = new JLabel("Username: ");
            label1.setBounds(10, 50, 130, 30);

            JTextField textfield = new JFormattedTextField();
            textfield.setBounds(110, 50, 130, 30);

            JLabel label2 = new JLabel("Password: ");
            label2.setBounds(10, 100, 130, 30);

            JTextField textfield2 = new JFormattedTextField();
            textfield2.setBounds(110, 100, 130, 30);

            JLabel label3 = new JLabel("Please provide me with " + str + " account credentials");
            label3.setBounds(10, 250, 340, 30);

            f.add(label1);
            f.add(textfield);
            f.add(label2);
            f.add(textfield2);
            f.add(label3);
            f.add(b);
            f.setSize(350, 400);
            f.setLayout(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    b.setText("Thank You!");
                }
            });

        }

        }

}*/
