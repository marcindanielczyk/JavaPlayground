//package com.example;

public class Main {

    public static void main(String[] args) {

        //moze zamiast public nie byc niczego
        class Tv {
            private String modelName;
            private long serialNumber;
            private float inches;

            //1 sposob na przeciazenie konstruktora, inna liczba parametrow
            public Tv(String modelName, long serialNumber, float inches) {
                this.modelName = modelName;
                this.serialNumber = serialNumber;
                this.inches = inches;
            }

            public Tv(String modelName, long serialNumber) {
                this.modelName = modelName;
                this.serialNumber = serialNumber;
                this.inches = 55.2f;
            }

            //2 sposob na przeciazenie konstruktora, zamiana np. float na double
            public Tv(String modelName, long serialNumber, double inches) {
                this.modelName = modelName;
                this.serialNumber = serialNumber;
                this.inches = (float) inches;//co to jest to (float) czy to jest to rzutowanie czy jak
            }
        }

        Domyslnainicjalizacjapol example = new Domyslnainicjalizacjapol();

        System.out.println(example.a);
        System.out.println(example.b);
        System.out.println(example.c);
        System.out.println(example.d);
        System.out.println(example.e);
        System.out.println(example.f);
        System.out.println(example.g);
        System.out.println(example.ch);// nie wyswietla \u0000
        System.out.println(example.getName());
    }
}