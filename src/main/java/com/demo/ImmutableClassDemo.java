package com.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

final class ImmutableClass {                //Final class to stop inheritance.

    private final String name;                //Final member variable to stop changing the value later after object creation.
    private final MutableDataClass mutableDataClass;

    public ImmutableClass(String name, MutableDataClass mutableDataClass) {    //A parameterized constructor
        this.name = name;
        this.mutableDataClass = new MutableDataClass(mutableDataClass.getData()); // Defensive copy of mutable class
    }

    //Getters for all member variables and no setters
    public String getName() {
        return name;
    }

    public MutableDataClass getMutableDataClass() {
        return new MutableDataClass(this.mutableDataClass.getData()); // Defensive copy of mutable class
    }

}

@Getter
@Setter
class MutableDataClass {
    private int data;

    MutableDataClass(int data) {
        this.data = data;
    }
}

@Slf4j
public class ImmutableClassDemo {

    public static void main(String[] args) {
        MutableDataClass mdc = new MutableDataClass(10);
        ImmutableClass ic = new ImmutableClass("Immutable Class Demo", mdc);
        //ImmutableClass ic1 = new ImmutableClass();       //Not Working.

        //ic.name = "Trying to change Variable";           //Not Working.

        log.info("This is a {} containing mutable class data: {}", ic.getName(), ic.getMutableDataClass().getData());

        ic.getMutableDataClass().setData(20);

        log.info("After changing the value to 20 immutable class has mutable data: {}",
                ic.getMutableDataClass().getData());
    }

}
