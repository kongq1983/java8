package com.kq.xpath;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.InputStream;

public class XPathTest {

    public static void main(String[] args) throws  Exception{
        InputStream in = InventoryTest.class.getResourceAsStream("/inventory.xml");
        try {
            xpathTest(in);
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

    public static Document getDocument(InputStream in) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        factory.setValidating(true);
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document;
//        document = builder.parse(new File(filename));
        document = builder.parse(in);
        document.getDocumentElement().normalize();

       return document;

    }

//    <book year="2000">
//    <title>Snow Crash</title>
//        <author>King</author>
//        <publisher>pub1</publisher>
//        <isbn>10000</isbn>
//        <price>60.50</price>
//    </book>

    public static void xpathTest(InputStream in) throws Exception{
        XPathFactory xpFactory = XPathFactory.newInstance();
        XPath xPath = xpFactory.newXPath();
        Document doc = getDocument(in);

        String title = xPath.evaluate("/inventory/book[1]/title", doc);
        System.out.println("book[1].title="+title);

        //检索一个节点的属性
        String year = xPath.evaluate("/inventory/book[1]/@year", doc);
        System.out.println("book[1].year="+year);

    }


}
