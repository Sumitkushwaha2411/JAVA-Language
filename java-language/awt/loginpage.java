import java.awt.*;
import java.awt.event.*;

public class loginpage extends Frame {
    loginpage() {
        Frame f = new Frame("Login form");
        Label l1 = new Label("USER-ID ");
        l1.setBounds(50, 50, 80, 30);
        f.add(l1);
        TextField tf1 = new TextField();
        tf1.setBounds(130, 55, 120, 30);
        f.add(tf1);
        Label l2 = new Label("PASSWORD ");
        l2.setBounds(50, 100, 80, 30);
        f.add(l2);
        TextField tf2 = new TextField();
        tf2.setBounds(130, 100, 120, 30);
        f.add(tf2);
        TextField tf = new TextField();
        tf.setBounds(50, 220, 200, 30);
        f.add(tf);
        Button b = new Button("SUBMIT");
        b.setBounds(50, 175, 200, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("SUCCESSFULLY SUBMITED");
            }
        });
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        loginpage s = new loginpage();
    }
}
