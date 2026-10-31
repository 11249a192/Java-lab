#Exp(12)- Cardlayout

#Aim
To create a Java AWT program that demonstrates the CardLayout manager by displaying different components as cards.

##Algorithm
1. Start the program.
2. Import the java.awt package.
3. Create a Frame.
4. Create a Panel and set its layout to CardLayout.
5. Create three buttons (Card 1, Card 2, Card 3).
6. Add the buttons to the panel as separate cards.
7. Add the panel to the frame.
8. Set the frame size and make it visible.
9. Stop the program.

##Program
import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample extends Frame implements ActionListener {

    CardLayout cl;
    Panel p;
    Button next;

    CardLayoutExample() {
        cl = new CardLayout();
        p = new Panel();
        p.setLayout(cl);

        p.add("1", new Button("Card 1"));
        p.add("2", new Button("Card 2"));
        p.add("3", new Button("Card 3"));

        next = new Button("Next");
        next.addActionListener(this);

        add(p, BorderLayout.CENTER);
        add(next, BorderLayout.SOUTH);

        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        cl.next(p);
    }

    public static void main(String[] args) {
        new CardLayoutExample();
    }
}

#Result
The program displays one card at a time. Each time the Next button is clicked, the display changes from Card 1 → Card 2 → Card 3, 
demonstrating the working of CardLayout.
