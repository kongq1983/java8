package com.kq.jvm.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author kq
 * @date 2021-12-27 14:13
 * @since 2020-0630
 */
public class JdkProxySourceClass {

    public static void writeClassToDisk(String path) throws Exception{

        byte[] classFile = ProxyGenerator.generateProxyClass("$proxy5", new Class[]{MyService.class});
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
            fos.write(classFile);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) throws Exception{
        JdkProxySourceClass.writeClassToDisk("D:/tmp/$Proxy5.class");
    }

}
