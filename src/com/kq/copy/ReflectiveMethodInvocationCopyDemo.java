package com.kq.copy;

/**
 * @author kq
 * @date 2020-10-13 10:42
 * @since 2020-0630
 */
public class ReflectiveMethodInvocationCopyDemo {

    public static void main(String[] args) {
        ReflectiveMethodInvocation r = new ReflectiveMethodInvocation();
        Object[] arg = {"one","two"};
        r.setArguments(arg);

        r.proceed();r.proceed();r.proceed();

        System.out.println(r);

        ReflectiveMethodInvocation r1 = r.invocableClone();
        System.out.println(r1);

        r.proceed();
        r.proceed();
        r.proceed();

        r1.proceed();
        System.out.println("=============================================");
        System.out.println(r);
        System.out.println(r1);
    }

}
