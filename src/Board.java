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
        JFrame f =new JFrame("Dama di Nico");
        f.setSize(816,838);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);

        //ISTANZIAZIONE BOTTONI

        //PRIMA RIGA
        JButton unouno =new JButton();
        unouno.setBounds(0,0,100,100);
        unouno.setBackground(Color.black);

        JButton unodue =new JButton();
        unodue.setBounds(100,0,100,100);


        JButton unotre =new JButton();
        unotre.setBounds(200,0,100,100);
        unotre.setBackground(Color.black);

        JButton unoquattro =new JButton();
        unoquattro.setBounds(300,0,100,100);

        JButton unocinque =new JButton();
        unocinque.setBounds(400,0,100,100);
        unocinque.setBackground(Color.black);

        JButton unosei =new JButton();
        unosei.setBounds(500,0,100,100);

        JButton unosette =new JButton();
        unosette.setBounds(600,0,100,100);
        unosette.setBackground(Color.black);

        JButton unootto =new JButton();
        unootto.setBounds(700,0,100,100);


        //SECONDA RIGA
        JButton dueuno =new JButton();
        dueuno.setBounds(0,100,100,100);

        JButton duedue =new JButton();
        duedue.setBounds(100,100,100,100);
        duedue.setBackground(Color.black);

        JButton duetre =new JButton();
        duetre.setBounds(200,100,100,100);

        JButton duequattro =new JButton();
        duequattro.setBounds(300,100,100,100);
        duequattro.setBackground(Color.black);

        JButton duecinque =new JButton();
        duecinque.setBounds(400,100,100,100);

        JButton duesei =new JButton();
        duesei.setBounds(500,100,100,100);
        duesei.setBackground(Color.black);

        JButton duesette =new JButton();
        duesette.setBounds(600,100,100,100);

        JButton dueotto =new JButton();
        dueotto.setBounds(700,100,100,100);
        dueotto.setBackground(Color.black);


        //TERZA RIGA
        JButton treuno =new JButton();
        treuno.setBounds(0,200,100,100);
        treuno.setBackground(Color.black);

        JButton tredue =new JButton();
        tredue.setBounds(100,200,100,100);

        JButton tretre =new JButton();
        tretre.setBounds(200,200,100,100);
        tretre.setBackground(Color.black);

        JButton trequattro =new JButton();
        trequattro.setBounds(300,200,100,100);

        JButton trecinque =new JButton();
        trecinque.setBounds(400,200,100,100);
        trecinque.setBackground(Color.black);

        JButton tresei =new JButton();
        tresei.setBounds(500,200,100,100);

        JButton tresette =new JButton();
        tresette.setBounds(600,200,100,100);
        tresette.setBackground(Color.black);

        JButton treotto =new JButton();
        treotto.setBounds(700,200,100,100);


        //QUARTA RIGA
        JButton quattrouno =new JButton();
        quattrouno.setBounds(0,300,100,100);

        JButton quattrodue =new JButton();
        quattrodue.setBounds(100,300,100,100);
        quattrodue.setBackground(Color.black);

        JButton quattrotre =new JButton();
        quattrotre.setBounds(200,300,100,100);

        JButton quattroquattro =new JButton();
        quattroquattro.setBounds(300,300,100,100);
        quattroquattro.setBackground(Color.black);

        JButton quattrocinque =new JButton();
        quattrocinque.setBounds(400,300,100,100);

        JButton quattrosei =new JButton();
        quattrosei.setBounds(500,300,100,100);
        quattrosei.setBackground(Color.black);

        JButton quattrosette =new JButton();
        quattrosette.setBounds(600,300,100,100);

        JButton quattrootto =new JButton();
        quattrootto.setBounds(700,300,100,100);
        quattrootto.setBackground(Color.black);


        //QUINTA RIGA
        JButton cinqueuno =new JButton();
        cinqueuno.setBounds(0,400,100,100);
        cinqueuno.setBackground(Color.black);

        JButton cinquedue =new JButton();
        cinquedue.setBounds(100,400,100,100);

        JButton cinquetre =new JButton();
        cinquetre.setBounds(200,400,100,100);
        cinquetre.setBackground(Color.black);

        JButton cinquequattro =new JButton();
        cinquequattro.setBounds(300,400,100,100);

        JButton cinquecinque =new JButton();
        cinquecinque.setBounds(400,400,100,100);
        cinquecinque.setBackground(Color.black);

        JButton cinquesei =new JButton();
        cinquesei.setBounds(500,400,100,100);

        JButton cinquesette =new JButton();
        cinquesette.setBounds(600,400,100,100);
        cinquesette.setBackground(Color.black);

        JButton cinqueotto =new JButton();
        cinqueotto.setBounds(700,400,100,100);


        //SESTA RIGA
        JButton seiuno =new JButton();
        seiuno.setBounds(0,500,100,100);

        JButton seidue =new JButton();
        seidue.setBounds(100,500,100,100);
        seidue.setBackground(Color.black);

        JButton seitre =new JButton();
        seitre.setBounds(200,500,100,100);

        JButton seiquattro =new JButton();
        seiquattro.setBounds(300,500,100,100);
        seiquattro.setBackground(Color.black);

        JButton seicinque =new JButton();
        seicinque.setBounds(400,500,100,100);

        JButton seisei =new JButton();
        seisei.setBounds(500,500,100,100);
        seisei.setBackground(Color.black);

        JButton seisette =new JButton();
        seisette.setBounds(600,500,100,100);

        JButton seiotto =new JButton();
        seiotto.setBounds(700,500,100,100);
        seiotto.setBackground(Color.black);


        //SETTIMA RIGA
        JButton setteuno =new JButton();
        setteuno.setBounds(0,600,100,100);
        setteuno.setBackground(Color.black);

        JButton settedue =new JButton();
        settedue.setBounds(100,600,100,100);

        JButton settetre =new JButton();
        settetre.setBounds(200,600,100,100);
        settetre.setBackground(Color.black);

        JButton settequattro =new JButton();
        settequattro.setBounds(300,600,100,100);

        JButton settecinque =new JButton();
        settecinque.setBounds(400,600,100,100);
        settecinque.setBackground(Color.black);

        JButton settesei =new JButton();
        settesei.setBounds(500,600,100,100);

        JButton settesette =new JButton();
        settesette.setBounds(600,600,100,100);
        settesette.setBackground(Color.black);

        JButton setteotto =new JButton();
        setteotto.setBounds(700,600,100,100);


        //OTTAVA RIGA
        JButton ottouno =new JButton();
        ottouno.setBounds(0,700,100,100);

        JButton ottodue =new JButton();
        ottodue.setBounds(100,700,100,100);
        ottodue.setBackground(Color.black);

        JButton ottotre =new JButton();
        ottotre.setBounds(200,700,100,100);

        JButton ottoquattro =new JButton();
        ottoquattro.setBounds(300,700,100,100);
        ottoquattro.setBackground(Color.black);

        JButton ottocinque =new JButton();
        ottocinque.setBounds(400,700,100,100);

        JButton ottosei =new JButton();
        ottosei.setBounds(500,700,100,100);
        ottosei.setBackground(Color.black);

        JButton ottosette =new JButton();
        ottosette.setBounds(600,700,100,100);

        JButton ottootto =new JButton();
        ottootto.setBounds(700,700,100,100);
        ottootto.setBackground(Color.black);




        //F ADD BUTTON

        //PRIMA RIGA
        f.add(unouno);
        f.add(unodue);
        f.add(unotre);
        f.add(unoquattro);
        f.add(unocinque);
        f.add(unosei);
        f.add(unosette);
        f.add(unootto);

        //SECONDA RIGA
        f.add(dueuno);
        f.add(duedue);
        f.add(duetre);
        f.add(duequattro);
        f.add(duecinque);
        f.add(duesei);
        f.add(duesette);
        f.add(dueotto);

        //TERZA RIGA
        f.add(treuno);
        f.add(tredue);
        f.add(tretre);
        f.add(trequattro);
        f.add(trecinque);
        f.add(tresei);
        f.add(tresette);
        f.add(treotto);

        //QUARTA RIGA
        f.add(quattrouno);
        f.add(quattrodue);
        f.add(quattrotre);
        f.add(quattroquattro);
        f.add(quattrocinque);
        f.add(quattrosei);
        f.add(quattrosette);
        f.add(quattrootto);

        //QUINTA RIGA
        f.add(cinqueuno);
        f.add(cinquedue);
        f.add(cinquetre);
        f.add(cinquequattro);
        f.add(cinquecinque);
        f.add(cinquesei);
        f.add(cinquesette);
        f.add(cinqueotto);

        //SESTA RIGA
        f.add(seiuno);
        f.add(seidue);
        f.add(seitre);
        f.add(seiquattro);
        f.add(seicinque);
        f.add(seisei);
        f.add(seisette);
        f.add(seiotto);

        //SETTIMA RIGA
        f.add(setteuno);
        f.add(settedue);
        f.add(settetre);
        f.add(settequattro);
        f.add(settecinque);
        f.add(settesei);
        f.add(settesette);
        f.add(setteotto);

        //OTTAVA RIGA
        f.add(ottouno);
        f.add(ottodue);
        f.add(ottotre);
        f.add(ottoquattro);
        f.add(ottocinque);
        f.add(ottosei);
        f.add(ottosette);
        f.add(ottootto);






        //Button bottoni[][] = new Button[8][8];
        /*
        for(int i=0; i<bottoni.length; i++){
            for(int j=0; j<bottoni[0].length; j++){
                Bottone.disegnaPulsante(Color.BLACK, 0, 0);
            }
        }

         */

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
