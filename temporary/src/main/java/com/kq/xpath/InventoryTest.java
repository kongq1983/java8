package com.kq.xpath;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;
import java.io.InputStream;

public class InventoryTest {

    private static boolean validating = false;

    public static void dealBook(Node inventoryNode) {
        NodeList bookList = inventoryNode.getChildNodes();

        System.out.println("bookList.size="+bookList.getLength());

        for (int i = 0; i < bookList.getLength(); i++) {
            Node item = bookList.item(i);
            String name = item.getNodeName();
            String value = item.getNodeValue();
            System.out.println("bookPos="+i + " node_name=" + name + " value=" + value+ " nodeType:"+item.getNodeType());
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                Element bookItem = (Element) item;

//            String year = bookItem.getAttributes().getNamedItem("year").getNodeValue();
//            String year = bookItem.getAttribute("year");
                String year = bookItem.getAttribute("year");
//                String year = null;
                System.out.println(bookItem);
                System.out.println("bookIndex="+i + " node_name=" + name + " value=" + value + " year=" + year + " nodeType=" + bookItem.getNodeType());

               parseBookContent(bookItem);
//            bookItem.getNodeValue()
            }
        }

    }

    public static void read(InputStream in) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        factory.setValidating(validating);
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document;
//        document = builder.parse(new File(filename));
        document = builder.parse(in);
        document.getDocumentElement().normalize();
        Node node = document.getFirstChild();

        System.out.println("first node=" + node);
        System.out.println("name=" + node.getNodeName() + " value=" + node.getNodeValue());

        dealBook(node);

    }

    private static void parseBookContent(Element bookEle) {

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
            if(node.getNodeName().equals("title")){
                str.append(" title="+value);
            }else if(node.getNodeName().equals("author")){
                str.append(" author="+value);
            }else if(node.getNodeName().equals("publisher")){
                str.append(" publisher="+value);
            }else if(node.getNodeName().equals("isbn")){
                str.append(" isbn="+value);
            }else if(node.getNodeName().equals("price")){
                str.append(" price="+value);
            }

        }
        System.out.println("book content="+str.toString());

    }

    private static String getBodyDada(Node n) {
        if(n.getNodeType()==Node.CDATA_SECTION_NODE||n.getNodeType()==Node.TEXT_NODE){
            String data = ((CharacterData)n).getData();
            return data;
        }
        return null;
    }

    public static void main(String[] args) throws Exception {

        InputStream in = InventoryTest.class.getResourceAsStream("/inventory.xml");
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
//            in.close();
        }

    }

}
