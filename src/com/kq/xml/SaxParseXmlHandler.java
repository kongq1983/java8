package com.kq.xml;

import com.kq.entity.Student;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * SaxParseXml
 * @author kq
 */
public class SaxParseXmlHandler extends DefaultHandler {

    private List<Student> students;
    /** 记录当前解析到的节点名称 */
    private String currentTag;
    /** 记录当前的student*/
    private Student curStudent;

    /**
     * 文档解析结束后调用
     */
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("-endDocument()");
    }

    /**
     * 文档解析开始调用
     */
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("startDocument()");
        students = new ArrayList<Student>();
    }


    /**
     * 节点解析开始调用
     * @param uri : 命名空间的uri
     * @param localName : 标签的名称
     * @param qName : 带命名空间的标签名称
     */
    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        System.out.println("startElement "+localName + "-startElement()");
        // 是一个用户
//        if ("student".equals(localName)) {
        if ("student".equals(qName)) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.println("attributes attribute_name：" + attributes.getLocalName(i)
                        + "  attribute_value：" + attributes.getValue(i));
                curStudent = new Student();
                if("id".equals(attributes.getLocalName(i))){
                    curStudent.setId(Integer.parseInt(attributes.getValue(i)));
                }
            }
        }
        // 把当前标签记录下来
//        currentTag = localName;
        currentTag = qName;
    }


    /**
     * 节点解析结束后调用
     * @param uri : 命名空间的uri
     * @param localName : 标签的名称
     * @param qName : 带命名空间的标签名称
     */
    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        super.endElement(uri, localName, qName);
        System.out.println("endElement "+ localName + "-endElement()");
//        if("student".equals(localName)){
        if("student".equals(qName)){
            students.add(curStudent);
            curStudent = null;
        }
        currentTag = null;
    }


    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        super.characters(ch, start, length);
        // 将当前TextNode转换为String
        String value = new String(ch,start,length);
        System.out.println("characters "+value+"");
        // 当前标签为name标签，该标签无子标签，直接将上面获取到的标签的值封装到当前Student对象中
        if("name".equals(currentTag)){
            // 该节点为name节点
            curStudent.setName(value);
            // 当前标签为password标签，该标签无子标签，直接将上面获取到的标签的值封装到当前User对象中
        }else if("age".equals(currentTag)){
            // 该节点为curStudent节点
            curStudent.setAge(Integer.parseInt(value));
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) throws Exception{
        // 加载文件返回文件的输入流
//        InputStream is = SaxParseXmlHandler.class.getClassLoader().getResourceAsStream("/student.xml");
        InputStream is = SaxParseXmlHandler.class.getResourceAsStream("/student.xml");
        System.out.println("inputStream is = "+is);
        SaxParseXmlHandler handler = new SaxParseXmlHandler();
        // 1. 得到SAX解析工厂
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        // 2. 让工厂生产一个sax解析器
        SAXParser newSAXParser = saxParserFactory.newSAXParser();
        // 3. 传入输入流和handler，解析
        newSAXParser.parse(is, handler);
        is.close();
        List<Student>  list =  handler.getStudents();

        System.out.println("list.size="+list.size());

        list.forEach(System.out::println);

    }


}
