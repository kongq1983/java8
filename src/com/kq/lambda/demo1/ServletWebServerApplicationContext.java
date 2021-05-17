package com.kq.lambda.demo1;

/**
 * @author kq
 * @date 2021-05-17 13:38
 * @since 2020-0630
 */
public class ServletWebServerApplicationContext {

    private ServletContext servletContext;

    public ServletWebServerApplicationContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public void createWebServer() {

//        getSelfInitializer().onStartup(servletContext);

//        ServletContextInitializer initializer = getSelfInitializer();
        ServletContextInitializer initializer = getSelfInitializer1();
        initializer.onStartup(servletContext);

    }


    private ServletContextInitializer getSelfInitializer() {
        return this::selfInitialize;
    }

    private ServletContextInitializer getSelfInitializer1() {
        return (servletContext) ->{
            this.selfInitialize(servletContext);
        };
    }

    private void selfInitialize(ServletContext servletContext) {
        System.out.println("selfInitialize is called");
    }

}
