package com.kq.xml;

import com.kq.data.StudentData;
import com.kq.entity.Student;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * DomWriteUtil
 *
 * @author kq
 * @date 2019-10-23
 */
public class DomWrite1Util {

    /**
     * 生成xml方法
     */
    public static void createXml(List<Student> list) {
        try {
            // 创建解析器工厂
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = factory.newDocumentBuilder();
            Document document = db.newDocument();
            // 不显示standalone="no"
            document.setXmlStandalone(false);
            Element studentsEle = document.createElement("students");

            for (Student stu : list) {

                Element studentEle = document.createElement("student");
                // 为student节点添加属性
                studentEle.setAttribute("id", stu.getId() + "");

                // 向studentEle节点中添加子节点age
                Element ageEle = document.createElement("age");
                ageEle.setTextContent(stu.getAge() + "");
                Element nameEle = document.createElement("name");
                nameEle.setTextContent(stu.getName());
                studentEle.appendChild(ageEle);
                studentEle.appendChild(nameEle);

                studentsEle.appendChild(studentEle);
            }

            document.appendChild(studentsEle);

            // 创建TransformerFactory对象
            TransformerFactory tff = TransformerFactory.newInstance();

            // 创建 Transformer对象
            Transformer tf = tff.newTransformer();
            // 输出内容是否使用换行
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            // 创建xml文件并写入内容
            File file = new File("student2.xml");
            // 判断文件是否存在
            if (!file.exists()) {
                file.createNewFile();
            }
            System.out.println("student2.xml path = " + file.getAbsolutePath());
            tf.transform(new DOMSource(document), new StreamResult(file));

            System.out.println("student2.xml成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("student2.xml失败");
        }
    }


    public static void main(String[] args) {
        createXml(StudentData.getStudentList());
    }


}
