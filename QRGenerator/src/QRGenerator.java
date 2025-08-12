import javax.swing.*;
import java.awt.*;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QRGenerator extends JFrame{

    public static JTextArea editTextArea = new JTextArea();     //linki aldığımız yer

    
    public static void QrGenerate(String data, String filePath, int width, int height){
        // ekle
    }

    public QRGenerator() {

        JFrame frame = new JFrame();
        frame.setTitle("QR Generator");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);      // hocam önemli tam ekran mevzusu


        JTextField editTextArea = new JTextField();
        editTextArea.setBounds(30, 30, 380, 30);
        frame.add(editTextArea);

        JButton generateButton = new JButton("Generate");
        generateButton.setFocusable(false);
        generateButton.setFocusPainted(false);
        generateButton.setBounds(150, 80, 150, 40);


     


        generateButton.addActionListener(e -> {
            String text = editTextArea.getText();

            if (text.isEmpty()) {
                //JOptionPane test = new JOptionPane();     bu olmuyo böyle
                //test.setMessage("hata");
                JOptionPane.showMessageDialog(this,"Link Girin!");
            }
          else {
              //  String filePath = "qrcode.png"; bu ne işe yarıyo tam çözemedim        muhtemeln önce qr kodu oluşturup bir yere kaydediyo ardından ekrana gösteriyo

                //generateqr code here

                QrGenerate(text,"qrcode.png",5,5);



            }

        });

        frame.add(generateButton);

        frame.setVisible(true);





    }


    public static void main(String[] args) {
            QRGenerator newQR = new QRGenerator();




    }
}
