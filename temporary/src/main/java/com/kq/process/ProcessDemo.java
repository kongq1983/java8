package com.kq.process;

import java.io.*;

/**
 * ProcessDemo
 *
 * @author kq
 * @date 2019-06-21
 */
public class ProcessDemo {

    public static void main(String[] args) throws Exception {

        String path = "E:\\zyzhworkspace\\dev";
//        String cmd="cmd /c svn status "+path;

        try {
            String[] cmds = new String[]{"cmd", "/c", "svn","status", path};

            // cmd[2]是要执行的dos命令
            System.out.println(cmds[2]);
            Process process = Runtime.getRuntime().exec(cmds);

            // 记录dos命令的返回信息
            StringBuffer resStr = new StringBuffer();
            // 获取返回信息的流
            InputStream in = process.getInputStream();
            Reader reader = new InputStreamReader(in);
            BufferedReader bReader = new BufferedReader(reader);
            for (String res = ""; (res = bReader.readLine()) != null; ) {
                resStr.append(res + "\n");
            }
            System.out.println(resStr.toString());
            bReader.close();
            reader.close();
            process.getOutputStream().close();  // 不要忘记了一定要关

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
