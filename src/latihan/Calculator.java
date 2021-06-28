package latihan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private double total1=0.0;//menambahkan variabel baru untuk menyimpan value(nilai)
    private double total2=0.0;//mengatur variabel lain text Field untuk menyimpan hasil perhitungan
    private char mathOperator;//variabel baru untuk method operator
    private JTextField textDisplay;
    private JPanel JavaCalculator;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnExit;

    /*Membuat method getOperator mengatur untuk mendapatkan simbol pada tombol
    yg diklik untuk mengeksekusi kode. */
    private void getOperator(String btnText) {
        mathOperator = btnText.charAt( 0 ); //method charAt ini digunakan untuk mendapatkan karakter dari string
        total1 = total1 + Double.parseDouble( textDisplay.getText() );
        textDisplay.setText( " " );
    }

    public Calculator() {

        btnOne.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Method getText untuk mendapatkan teks dari form
                String btnOneText = textDisplay.getText() + btnOne.getText();
                //Method setText untuk memasukan sesuatu di text Field
                textDisplay.setText( btnOneText );


            }
        } );
        btnTwo.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText( btnTwoText );

            }
        } );
        btnThree.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText( btnThreeText );
            }
        } );
        btnFour.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText( btnFourText );
            }
        } );
        btnFive.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText( btnFiveText );

            }
        } );
        btnSix.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText( btnSixText );

            }
        } );
        btnSeven.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText( btnSevenText );

            }
        } );
        btnEight.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText( btnEightText );//thread

            }
        } );
        btnNine.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText( btnNineText );


            }
        } );
        btnZero.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText( btnZeroText );

            }
        } );
        btnPoint.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this will make it neater - "0." instead of "."
                if (textDisplay.getText().contains( "." )) ;
                {
                    textDisplay.setText( "." );
                }
                /*membantu untuk menghindari bug, 'cause ".." as well as "1.." atau ".8." tidak dapat menerima
                 untuk simple calculator, jadi dibuat impossible */
                 if (textDisplay.getText().contains( "." )) {
                    btnPoint.setEnabled( false );
                }
                else{
                    String btnPointText = textDisplay.getText() + btnPoint.getText();
                    textDisplay.setText( btnPointText );
                }
                btnPoint.setEnabled( true );
            }
        } );
        btnPlus.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnPlus.getText();//Untuk mendapatkan teks from dari simbol plus
                getOperator( buttonText );            // dan kemudian diserahkan ke method getOperator
            }
        } );
        btnEquals.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*switch(pengkondisian) untuk memeriksa simbol apa yang ada di dalam variabel mathOperator,
                jika diklik simbol "+" maka bisa menambahkan, jika diklik simbol "-" maka bisa mengurangkan
                jika diklik simbol "/" maka bisa membagi, dan jika diklik simbol "*" maka bisa mengalikan.
                dan  penjelasan kode dari total2 = total1 + Double.parseDouble( textDisplay.getText() );
                adalah kode ini mendapatkan teks dari text Field(textDisplay) dan mengubah string menjadi ganda,
                hasilnya ditambahkan ke total1 jawabannya disimpan ditotal2*/
                switch (mathOperator) {
                    case '+':
                        total2 = total1 + Double.parseDouble( textDisplay.getText() );
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble( textDisplay.getText() );
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble( textDisplay.getText() );
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble( textDisplay.getText() );
                        break;
                }
                textDisplay.setText( (Double.toString( total2 )) );
                total1 = 0;

            }
        } );
        //menggunakan method clear untuk menghapus semua data yang terdapat di text field(textDisplay)
        btnClear.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay.setText( " " );
            }
        } );

        btnMinus.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnMinus.getText();//Untuk mendapatkan teks from dari simbol minus
                getOperator( buttonText );             // dan kemudian diserahkan ke method getOperator

            }
        } );
        btnDivide.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnDivide.getText();//Untuk mendapatkan teks from dari simbol divide(bagi)
                getOperator( buttonText );             //dan kemudian diserahkan ke method getOperator

            }
        } );
        btnMultiply.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnMultiply.getText();//Untuk mendapatkan teks from dari simbol multiply(kali)
                getOperator( buttonText );               //dan kemudian diserahkan ke method getOperator
            }
        } );


        btnExit.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit( 0 );

            }
        } );
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame( "Calculator" );
        jFrame.setContentPane( new Calculator().getJavaCalculator() );
        jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        jFrame.setLocationRelativeTo( null );
        jFrame.setSize( 500, 400 );
        jFrame.setVisible( true );
        jFrame.pack();
        ImageIcon imageIcon = new ImageIcon("res/erni.jpg");
        jFrame.setIconImage(imageIcon.getImage());
    }

    public JPanel getJavaCalculator() {
        return JavaCalculator;


    }

}