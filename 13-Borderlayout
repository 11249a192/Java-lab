#Exp(13)-Borderlayout

#Aim: 
To write a Java program to demonstrate the BorderLayout manager using AWT.

#Algorithm
1. Start the program.
2. Import the java.awt package.
3. Create a Frame.
4. Set the layout manager to BorderLayout.
5. Create five buttons.
6. Add the buttons to five regions: North, South, East, West and Center.
7. Set the frame size.
8. Make the frame visible.
9. Stop the program.

#Program

import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample extends Frame
{
    BorderLayoutExample()
    {
        setTitle("BorderLayout Example");

        setLayout(new BorderLayout());

        Button b1 = new Button("North");
        Button b2 = new Button("South");
        Button b3 = new Button("East");
        Button b4 = new Button("West");
        Button b5 = new Button("Center");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }

    public static void main(String args[])
    {
        new BorderLayoutExample();
    }
}

Result
Thus, the Java program to demonstrate the BorderLayout manager was executed successfully.
