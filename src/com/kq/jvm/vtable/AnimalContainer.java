package com.kq.jvm.vtable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kq
 * @date 2021-11-17 10:21
 * @since 2020-0630
 */
public class AnimalContainer {

    private List<Animal> list = new ArrayList<>();

    public void add(Animal animal) {
        list.add(animal);
    }


}
