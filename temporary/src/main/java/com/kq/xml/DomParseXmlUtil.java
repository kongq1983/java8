package com.kq.xml;

import com.kq.entity.Student;
import com.kq.xpath.InventoryTest;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * DomParseXmlUtil
 *
 * @author kq
 * @date 2019-10-24
 */
public class DomParseXmlUtil {

    private static boolean validating = false;

    private static void parseStudentContent(Element bookEle, Student stu) {

        NodeList list = bookEle.getChildNodes();

        StringBuilder str = new StringBuilder();
        for(int i=0;i<list.getLength();i++) {
            Node node = list.item(i);
            if(node.getNodeType()!=Node.ELEMENT_NODE){
                System.out.println("ignore node = "+node);
                continue;
            }
            String value = getBodyDada(node.getFirstChild());
            System.out.println("index="+i+"  node="+node+" nodeType="+node.getNodeType());
//            String value = node.getFirstChild().getNodeValue();
            if(node.getNodeName().equals("age")){
                str.append(" age="+value);
                stu.setAge(Integer.parseInt(value));
            }else if(node.getNodeName().equals("name")){
                str.append(" name="+value);
                stu.setName(value);
            }

        }
        System.out.println("student content="+str.toString());

    }

    private static String getBodyDada(Node n) {
        if(n.getNodeType()==Node.CDATA_SECTION_NODE||n.getNodeType()==Node.TEXT_NODE){
            String data = ((CharacterData)n).getData();
            return data;
        }
        return null;
    }

    public static List<Student> dealStudent(Node studentNode) {
        NodeList bookList = studentNode.getChildNodes();

        System.out.println("studentList.size="+bookList.getLength());

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < bookList.getLength(); i++) {
            Node item = bookList.item(i);
            String name = item.getNodeName();
            String value = item.getNodeValue();
            System.out.println("studentPos="+i + " node_name=" + name + " value=" + value+ " nodeType:"+item.getNodeType());
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                Element bookItem = (Element) item;

                Student stu = new Student();
                String id = bookItem.getAttribute("id");
                stu.setId(Integer.parseInt(id));
                System.out.println(bookItem);
                System.out.println("studentIndex="+i + " node_name=" + name + " value=" + value + " id=" + id + " nodeType=" + bookItem.getNodeType());

                parseStudentContent(bookItem,stu);

                list.add(stu);
            }
        }

        return list;

    }


    public static void read(InputStream in) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        factory.setValidating(validating);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(in);
        document.getDocumentElement().normalize();
        Node node = document.getFirstChild();

        System.out.println("first node=" + node);
        System.out.println("name=" + node.getNodeName() + " value=" + node.getNodeValue());

        List<Student> studentList = dealStudent(node);

        studentList.forEach(System.out::println);

    }


    public static void main(String[] args) throws Exception {

        InputStream in = InventoryTest.class.getResourceAsStream("/student.xml");
        try {
            read(in);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
