import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bottone {
    int x;
    int y;
    Color color;
    public Bottone(int x, int y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public static void disegnaPulsante(Color color, int x, int y){
        Button b = new Button("ciao");
        b.setBounds(x, y, 100, 30);
        b.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("mi hai premuto");
            }
        });
    }

}
