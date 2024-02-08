package com.satyam.generics;

public abstract class GenericInterface<I extends Number> {

    public abstract void display(Integer value);

    public interface genericinterface<T> {
        void display(T value);
    }
}
