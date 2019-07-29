package OB;

import jdk.internal.org.xml.sax.SAXException;

import javax.swing.*;
import java.io.IOException;

public class Main
{

    public static void main(String[] args) throws IOException {

        FB FB=new FB();

        FB.BDST_FB1001_V1_0_Get_IP("www.baidu.com");

        String value =  TestProperties.GetValueByKey("C:\\Users\\Administrator\\IdeaProjects\\JavaByJune\\src\\OB\\Test.properties", "Pass");
        System.out.println(value);
        TestProperties.GetAllProperties("C:\\Users\\Administrator\\IdeaProjects\\JavaByJune\\src\\OB\\Test.properties");
        TestProperties.WriteProperties("C:\\Users\\Administrator\\IdeaProjects\\JavaByJune\\src\\OB\\Test.properties","long", "212");
        try {
            PropertiesTest.PropertiesTest();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        JFrame June;
        June = new JFrame();

        June.add( new June() );
        June.setTitle( "June");
        June.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        June.setLocationRelativeTo( null);
        June.pack();
        June.setVisible( true);
    }
}
