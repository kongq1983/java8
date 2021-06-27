package com.kq.lambda.demo1;

/**
 * @author kq
 * @date 2021-05-17 13:41
 * @since 2020-0630
 */
public class Demo1Test {

    public static void main(String[] args) {

        ServletContext servletContext = new MyServletContextImpl();

        ServletWebServerApplicationContext context = new ServletWebServerApplicationContext(servletContext);

        context.createWebServer();

    }

}
