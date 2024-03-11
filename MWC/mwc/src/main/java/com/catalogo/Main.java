package com.catalogo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){

        List<Object> lista = new ArrayList<>();

        lista.add(new Smartphone("Huawei", "A50",300,"EMUI", false, false));
        lista.add(new Smartphone("Iphone", "14",500,"IOS",true, true));
        lista.add(new Tablet("Samsung", "Tab6", 400, 10));
        lista.add(new OtroDispositivo("Apple", " Watch16", 100, " Reloj Inteligente"));
        lista.add(new OtroDispositivo("HP", " Victus", 800, " Portatil gaming"));

        System.out.println("Los dispositivos de la lista son : ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
   }
}