import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class QRGenerator extends JFrame{

    public static JTextArea editTextArea = new JTextArea();     //linki aldığımız yer.



    public static void QrGenerate(String data, String filePath, int width, int height){

    }

    public QRGenerator() {

        JFrame frame = new JFrame();
        frame.setTitle("QR Generator");
        frame.setBounds(750, 340, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);      // hocam önemli tam ekran mevzusu.


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
              //  String filePath = "qrcode.png"; bu ne işe yarıyo tam çözemedim        muhtemeln önce qr kodu oluşturup bir yere kaydediyo ardından ekrana gösteriyo.

                //generateqr code here

                QrGenerate(text,"qrcode.png",5,5);
                try {
                    BufferedImage QrImage= ImageIO.read(new File("qrcode.png"));

                } catch (IOException ex) {
                    ex.printStackTrace();       //bunu yapınca düzeldi
                    JOptionPane.showMessageDialog(this,"Link Girin!"+ex.getMessage());      //working
                }


            }

        });

        frame.add(generateButton);
        frame.setVisible(true);




    }


    public static void main(String[] args) {
            QRGenerator newQR = new QRGenerator();



    }
}
