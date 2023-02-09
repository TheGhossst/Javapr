package java2;

import javax.swing.*;
//import javax.swing.event.AncestorListener;
//import java.awt.font.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;

class Calculator extends JFrame implements ActionListener {
    static JFrame f;
    static JTextField t;
    String s0 = "", s1 = "", s2 = "", temp;
    double num1, num2, result;
    boolean flag;
    static JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, eq, br, c;
    char operator;

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        f = new JFrame("Calculator");
        // JLabel label = new JLabel("Enter stuff here: ");
        /*
         * Font font= new Font("Courier", Font.PLAIN, 20);
         * label.setFont();
         */
        t = new JTextField(20);

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        eq = new JButton("=");
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        br = new JButton("%");
        be = new JButton(".");
        c = new JButton("C");
        JPanel p = new JPanel();
        p.setBackground(Color.BLACK);
        c.addActionListener(calc);
        bm.addActionListener(calc);
        bd.addActionListener(calc);
        br.addActionListener(calc);
        bs.addActionListener(calc);
        ba.addActionListener(calc);
        b9.addActionListener(calc);
        b8.addActionListener(calc);
        b7.addActionListener(calc);
        b6.addActionListener(calc);
        b5.addActionListener(calc);
        b4.addActionListener(calc);
        b3.addActionListener(calc);
        b2.addActionListener(calc);
        b1.addActionListener(calc);
        b0.addActionListener(calc);
        be.addActionListener(calc);
        eq.addActionListener(calc);
        // p.add(label);
        p.add(t);
        p.add(c);
        p.add(ba);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(be);
        p.add(b0);
        p.add(br);
        p.add(eq);
        p.setLayout(new FlowLayout());
        // p.setLayout(new GridLayout(4, 4, 10, 20));
        f.add(p);
        f.setSize(200, 220);

        /*
         * GridLayout g = new GridLayout();
         * f.setLayout(g);
         */
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
            t.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == 'C') {
            s0 = s1 = s2 = "";
            t.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == '=') {
            double te;
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else if (s1.equals("*"))
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) % Double.parseDouble(s2));
            t.setText(s0 + s1 + s2 + "=" + te);
            s0 = Double.toString(te);
            s1 = s2 = "";
        } else {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else {
                double te;
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else if (s1.equals("*"))
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) % Double.parseDouble(s2));
                s0 = Double.toString(te);
                s1 = s;
                s2 = "";
            }
            t.setText(s0 + s1 + s2);
        }
    }
}