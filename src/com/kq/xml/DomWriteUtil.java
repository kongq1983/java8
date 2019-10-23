package com.kq.xml;

import com.kq.data.StudentData;
import com.kq.entity.Student;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

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
public class DomWriteUtil {

    /**
     * 生成xml方法
     */
    public static void createXml(List<Student> list){
        try {
            // 创建解析器工厂
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = factory.newDocumentBuilder();
            Document document = db.newDocument();
            // 不显示standalone="no"
            document.setXmlStandalone(false);
            Element studentsEle = document.createElement("students");

            for(Student stu : list) {

                Element studentEle = document.createElement("student");
                // 为student节点添加属性
                studentEle.setAttribute("id", stu.getId()+"");

                // 向studentEle节点中添加子节点age
                Element ageEle = document.createElement("age");
                ageEle.setTextContent(stu.getAge()+"");
                Element nameEle = document.createElement("name");
                nameEle.setTextContent(stu.getName());
                studentEle.appendChild(ageEle);
                studentEle.appendChild(nameEle);

                studentsEle.appendChild(studentEle);
            }

            document.appendChild(studentsEle);

            // 创建xml文件并写入内容
            File file = new File("student1.xml");
            // 判断文件是否存在
            if(!file.exists()){
                file.createNewFile();
            }

            save(document,file);

            System.out.println("student1.xml成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("student1.xml失败");
        }
    }


    public static void save(Document document,File file) throws IOException {
        //写入格式
        OutputFormat format= new OutputFormat(document);
        //缩进两个单位
        format.setIndent(2);
        //开启缩进
        format.setIndenting(true);
        //写入的位置 以及格式
        XMLSerializer serializer=new XMLSerializer(new FileWriter(file),format);
        serializer.serialize(document);
    }




    public static void main(String[] args) {
        createXml(StudentData.getStudentList());
    }


}
