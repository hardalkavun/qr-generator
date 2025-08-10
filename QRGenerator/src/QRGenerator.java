import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QRGenerator extends JFrame {

    public static JTextArea editTextArea = new JTextArea("Type Here!");


    public QRGenerator() {

        JFrame frame = new JFrame();
        frame.setTitle("QR Generator");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField editTextArea = new JTextField();
        editTextArea.setBounds(30, 30, 380, 30);
        frame.add(editTextArea);

        JButton generateButton = new JButton("Generate");
        generateButton.setFocusable(false);
        generateButton.setFocusPainted(false);
        generateButton.setBounds(150, 80, 150, 40);



        generateButton.addActionListener(e -> {
            String text = editTextArea.getText();
            System.out.println("Girilen metin: " + text);
            // qr thing
        });

        frame.add(generateButton);

        frame.setVisible(true);





    }

    public static void main(String[] args) {
           
                    // try forming an object here it does not work properly now

    }
}
