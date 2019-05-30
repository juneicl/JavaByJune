package OB;

import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 读取xml中的数据：将xml文件File先读取进来，然后进行解析数据,主要就是一层一层遍历(可以提取出来重复的方法)
 */
public class XML_Read_And_Write {
    public static void XML_Read_And_Write {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
			/*Document document = builder.parse(
					new FileInputStream("/home/chenwei/eclipse-workspace/test/src/main/java/com/cww/xml/data.xml"));	*/
            Document document=builder.parse(XmlTest.class.getResourceAsStream("data.xml"));
            NodeList nos = document.getElementsByTagName("human");//根标签只能有一个
            for (int a = 0; a < nos.getLength(); a++) {
                Node item1 = nos.item(a);//person
                List<User> users=new ArrayList<User>();
                if (item1 != null && item1.getChildNodes().getLength() > 0) {
                    NodeList list1 = item1.getChildNodes();
                    for (int i = 0; i < list1.getLength(); i++) {
                        Node item = list1.item(i);
                        if (item != null && item.getChildNodes().getLength() > 0) {
                            NodeList list = item.getChildNodes();
                            User user=new User();
                            for (int j = 0; j < list.getLength(); j++) {
                                Node item2 = list.item(j);
                                if (item2 != null && item2.getChildNodes().getLength() > 0) {
                                    if ("name".equals(item2.getNodeName())) {
                                        String textContent = item2.getTextContent();
                                        user.setName(textContent);
                                    } else if ("type".equals(item2.getNodeName())) {
                                        String textContent = item2.getTextContent();
                                        user.setType(textContent);
                                    }
                                }
                            }
                            users.add(user);
                        }
                    }
                }
                System.out.println(users.toString());
            }
        } catch (Exception e) {
            throw new RuntimeException("读取xml异常");
        }
    }
}
class User {
    private String name;
    private String type;
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public User(String name, String type){
        this.name = name;
        this.type = type;
    }
    public User(){
    }
    @Override
    public String toString() {
        return "["+name+":"+type+"]";
    }

}
