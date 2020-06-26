//package com.example;

public class Wykorzystaniekonstruktorawkonstruktorze {

//    Jeżeli podczas implementacji zachowania jednego konstruktora,
//    chciałbyś skorzystać z działania, już wcześniej zaimplementowanego konstruktora
//    , język java daje Ci taką możliwość poprzez słowo kluczowe “this”,
//    po którym muszą wystąpić nawiasy okrągłe wraz z parametrami wejściowymi,
//    które chcesz przekazać do wywoływanego konstruktora.

        public class Tv {
            private String modelName;
            private long serialNumber;
            private float inches;

            public Tv(String modelName){
                this.modelName = modelName;
            }

            public Tv(String modelName, long serialNumber, double inches){
                this(modelName);//jak tak chcemy to zrobic,
                // to taka konstrukcja musi byc w pierwszej linii, else bedzie błąd
                this.serialNumber = serialNumber;
                this.inches = (float) inches;
            }
        }

}
