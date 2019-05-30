package OB;

import java.io.IOException;

public class Main
{
    public static int b;

    public static void main(String[] args) throws IOException {
        b=Value_Table_Input.a;

        FB FB=new FB();

        FB.BDST_FB1001_V1_0_Get_IP("www.baidu.com");

        String value =  TestProperties.GetValueByKey("C:\\Users\\Administrator\\IdeaProjects\\JavaByJune\\src\\OB\\Test.properties", "Pass");
        System.out.println(value);
        TestProperties.GetAllProperties("C:\\Users\\Administrator\\IdeaProjects\\JavaByJune\\src\\OB\\Test.properties");
        TestProperties.WriteProperties("C:\\Users\\Administrator\\IdeaProjects\\JavaByJune\\src\\OB\\XML_based_properties.xml","long", "212");
    }
}
