import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class Board {

    static boolean GRAPHICS = true;

    //static int playersNumber = 2; //numero di giocatori

    static int pxWidth = 600; //larghezza finestra
    static int pxHeight = 600; //altezza della finestra

    static int width = 8;
    static int height = 8;

    //static Cell[][] theBoard = new Cell[width][height]; //array di celle

    static double cellWidth = 1;
    static double cellHeight = 1;

    /*
    public static void init() { //inizializzazione della finestra
        if (GRAPHICS) {
            GraficaSemplice.setFinestra(pxWidth, pxHeight, "Dama of 3IC");

            for (int w = 0; w < 8; w++) {
                for (int h = 0; h < 8; h++) {
                    double xp = w / (double) width;
                    double yp = h / (double) height;
                    if ((w + h) % 2 == 0) {
                        GraficaSemplice.quadratoPieno(xp + cellWidth / 2, yp + cellWidth / 2, cellWidth, GRIGIO);
                    } else {
                        GraficaSemplice.quadratoPieno(xp + cellWidth / 2, yp + cellWidth / 2, cellWidth, BIANCO);
                    }
                }
            }
            disegnaPedine();
        }
    }
    public static void disegnaPedine(){ //ogni 0,125 vi è un quadrato, la scacchiera è lunga 1 divisa in 8 parti, ogni parte è lunga 75 pixel
        for(int w=0; w<8; w++) {
            for(int h=0; h<8; h++) {
                double xp = w / (double) width;
                double yp = h / (double) height;
                if((w+h)%2 == 0 && h < 3) {
                    GraficaSemplice.cerchioPieno(xp + cellWidth / 16, yp + cellWidth / 16, cellWidth/16, NERO);
                }
                if((w+h)%2 == 0 && h > 4) {
                    GraficaSemplice.cerchioPieno(xp + cellWidth / 16, yp + cellWidth / 16, cellWidth/16, GRIGIO_CHIARO);
                }
            }
        }
        pulsante();
    }

    /*public static void pulsante() {
        //JFrame f = new JFrame("Esempio pulsante");
        //JTextField tf = new JTextField();
        //tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Clicca qui");
>>>>>>> 21e9b04b8c0a7d9d9b90e5d699dcdf7a48718666
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("si mi hai premuto tutto");
            }
        });
        //GraficaSemplice.frame.add(b);
        Varie varia  = new Varie();
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        b.setSize(400, 400);
        b.setLayout(null);
        f.setLayout(null);
        f.setVisible(true);
        b.setVisible(true);

    }


    JFrame f = new JFrame("Esempio pulsante");
    JTextField tf = new JTextField();
    tf.setBounds(50, 50, 150, 20);
     */

    public static void pulsante(){
        JFrame f = new JFrame("Esempio Dama con Swing");
        f.setSize(650, 650);
        f.setVisible(true);
        Button bottoni[][] = new Button[8][8];

        for(int i=0; i<bottoni.length; i++){
            for(int j=0; j<bottoni[0].length; j++){
                Bottone.disegnaPulsante(Color.BLACK, 0, 0);
            }
        }

        //Button bottone = new Button();
        //bottone.setBounds(0, 0, 100, 30);
        //bottone.setVisible(true);
        //Bottone.disegnaPulsante(Color.BLACK, 0, 0);
        //Button bottoni[][] = new Button[8][8];


        /*
        for(int i=0; i<bottoni.length; i++){
            for(int j=0; j<bottoni[0].length; j++){
                bottoni[i][j] = new Button();
                bottoni[i][j].setBounds(0, 0, 100, 30);
            }
        }



        bottoni[0][0] = new Button();
        bottoni[0][0].setBounds(0, 0, 100, 30);

        bottoni[1][0] = new Button();
        bottoni[1][0].setBounds(100, 0, 100, 30);

        bottoni[2][0] = new Button();
        bottoni[2][0].setBounds(200, 0, 100, 30);

        bottoni[3][0] = new Button();
        bottoni[3][0].setBounds(300, 0, 100, 30);

        bottoni[4][0] = new Button();
        bottoni[4][0].setBounds(400, 0, 100, 30);

        bottoni[5][0] = new Button();
        bottoni[5][0].setBounds(500, 0, 100, 30);

        bottoni[6][0] = new Button();
        bottoni[6][0].setBounds(600, 0, 100, 30);

        bottoni[7][0] = new Button();
        bottoni[7][0].setBounds(700, 0, 100, 30);


        for(int i=0; i<bottoni.length; i++){
            for(int j=0; j<bottoni[0].length; j++){
                bottoni[i][j] = new Button("ciao");
                bottoni[i][j].setVisible(true);
                //bottoni[i][j].setBounds(0, 0, 100, 30);
            }
        }

        for(int i=0; i<bottoni.length; i++){
            for(int j=0; j<bottoni[0].length; j++){
                f.add(bottoni[i][j]);
                bottoni[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("si mi hai premuto tutto");
                    }
                });
            }


        }



        //bottoni[8][0] = new Button();
        //bottoni[8][0].setBounds(0, 0, 100, 30);




        //Button b = new Button("Clicca qui");
        //b.setBounds(0, 0, 100, 30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("si mi hai premuto tutto");
            }
        });
        //f.add(b);
        //f.add(tf);

        //b.setSize(100, 100);
        //b.setLayout(null);
        //f.setLayout(null);
        f.setVisible(true);
        b.setVisible(true);


     */
    }



}
