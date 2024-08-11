package com.kq.xml;

import com.kq.data.StudentData;
import com.kq.entity.Student;
import org.xml.sax.helpers.AttributesImpl;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/**
 * SaxWriteUtil
 *
 * @author kq
 * @date 2019-10-23
 */
public class SaxWriteUtil {


    // 生成xml
    public static void createXml(List<Student> bList){

        // 1、创建一个SAXTransformerFactory类的对象
        SAXTransformerFactory tff = (SAXTransformerFactory) SAXTransformerFactory.newInstance();

        try {
            // 2、通过SAXTransformerFactory创建一个TransformerHandler的对象
            TransformerHandler handler = tff.newTransformerHandler();
            // 3、通过handler创建一个Transformer对象
            Transformer tr = handler.getTransformer();
            // 4、通过Transformer对象对生成的xml文件进行设置
            // 设置编码方式
            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            // 设置是否换行
            tr.setOutputProperty(OutputKeys.INDENT, "yes");
            //缩进
            tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            // 5、创建一个Result对象
            File f = new File("student.xml");
            // 判断文件是否存在
            if(!f.exists()){
                f.createNewFile();
            }

            System.out.println("student.xml path = "+f.getAbsolutePath());

            Result result = new StreamResult(new FileOutputStream(f));
            // 6、使RESULT与handler关联
            handler.setResult(result);

            // 打开document
            handler.startDocument();
            AttributesImpl attr = new AttributesImpl();
            handler.startElement("", "", "students", attr);
            attr.clear();

            for (Student stu : bList) {
                String id = String.valueOf(stu.getId());
                String age = String.valueOf(stu.getAge());
                attr.clear();
                attr.addAttribute("", "", "id", "", id);
                handler.startElement("", "", "student", attr);

                // 创建name
                attr.clear();
                handler.startElement("", "", "name", attr);
                handler.characters(stu.getName().toCharArray(), 0, stu.getName().length());
                handler.endElement("", "", "name");


                // age
                attr.clear();
                handler.startElement("", "", "age", attr);
                handler.characters(age.toCharArray(), 0, age.length());
                handler.endElement("", "", "age");

                handler.endElement("", "", "student");

            }

            handler.endElement("", "", "students");
            // 关闭document
            handler.endDocument();
            System.out.println("创建student.xml成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("创建student.xml失败");
        }
    }

    public static void main(String[] args) {
        createXml(StudentData.getStudentList());
    }



}
