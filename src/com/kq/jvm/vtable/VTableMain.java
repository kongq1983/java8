package com.kq.jvm.vtable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * com.kq.jvm.vtable.VTableMain
 * @author kq
 * @date 2021-11-17 9:51
 * @since 2020-0630
 */
public class VTableMain {

    Animal animal = new Animal();
    Dog dog = new Dog();

    AnimalContainer container = new AnimalContainer();


    private List<Animal> list = new ArrayList<>();

    public VTableMain(){
        this.init();
    }

    public void init(){
        list.add(animal);
        list.add(dog);
        container.add(dog);
    }


    public static void main(String[] args) throws Exception{


        Cat cat = new Cat();
        cat.cry();

        VTableMain vTableMain = new VTableMain();

        TimeUnit.MINUTES.sleep(600);

    }

}
