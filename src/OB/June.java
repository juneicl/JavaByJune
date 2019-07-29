/*
 * Created by JFormDesigner on Fri May 31 20:09:41 CST 2019
 */

package OB;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author unknown
 */
public class June extends JFrame {
    public June() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here

        textField1.setText("1568");
    }

    private void button1MousePressed(MouseEvent e) {
        // TODO add your code here
//        textField1.setText("Bingo");
    }

    private void textField1MouseClicked(MouseEvent e) {
        // TODO add your code here
//        textField1.setText("1568");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menu1 = new JMenu();
        button1 = new JButton();
        textField1 = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menu1 ========
        {
            menu1.setText("File");
        }
        contentPane.add(menu1);
        menu1.setBounds(7, 7, 75, 18);

        //---- button1 ----
        button1.setText("By June");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
                button1MouseClicked(e);
                button1MouseClicked(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                button1MousePressed(e);
                button1MousePressed(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(7, 55, 75, button1.getPreferredSize().height);

        //---- textField1 ----
        textField1.setName("txt");
        textField1.setText("By June");
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField1MouseClicked(e);
            }
        });
        contentPane.add(textField1);
        textField1.setBounds(107, 56, 103, textField1.getPreferredSize().height);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenu menu1;
    private JButton button1;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        JFrame june;
        june = new JFrame();

        june.add( new June() );
        june.setTitle( "CALCULATOR");
        june.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        june.setLocationRelativeTo( null);
        june.pack();
        june.setVisible( true);
    }

}
