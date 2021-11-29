package Gui.com;

import javax.swing.*; // for GUI components

public class  SwingOutput{

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello, world!");
        String name = JOptionPane.showInputDialog(null,"wats your name");
        String age= name;

        //ask the user a yes or no question

        int choice = JOptionPane.showConfirmDialog (null,
                "Do you like cake, "+name + "?");
        //shoe diffrence methods in the choice option

        if (choice==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"of course everone likes");

        }

        else//(choice== JOptionPane.NO_OPTION);
        {
            JOptionPane.showMessageDialog(null,"we ill have to agreee to disagree");
        }
    }

}