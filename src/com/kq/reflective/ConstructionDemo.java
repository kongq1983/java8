package com.kq.reflective;

import java.lang.reflect.Constructor;

public class ConstructionDemo {
    private Long id;
    private String name;

    public ConstructionDemo(){

    }

    public ConstructionDemo(Long id){
        this.id = id;
    }

    public ConstructionDemo(Long id,String name){
        this.id = id;
        this.name = name;
    }


    public static void main(String[] args) throws Exception{
        Object[] objects = {1L,"king"};
//        Constructor constructor = ConstructionDemo.class.getConstructor(Long.class,String.class);
        Constructor<ConstructionDemo> constructor = ConstructionDemo.class.getConstructor(objects[0].getClass(),objects[1].getClass());
        ConstructionDemo obj = constructor.newInstance(objects);
        System.out.println(obj);

        constructor = ConstructionDemo.class.getConstructor(objects[0].getClass());
        obj = constructor.newInstance(objects[0]);
        System.out.println(obj);

        //默认构造函数
        constructor = ConstructionDemo.class.getConstructor();
        obj = constructor.newInstance();
        System.out.println(obj);
    }


    @Override
    public String toString() {
        return "ConstructionDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
