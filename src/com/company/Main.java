package com.company;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner      t = new Scanner(System.in);
        AdressBook  ab = new AdressBook();

        int     x = 0;
        int     f = 0;
        String  Nombre = "";
        String  Numero = "";

        do{
            System.out.println("Menu: \n1. Load \n2. Save \n3. List \n4. Create \n5. Delete");
            x = t.nextInt();

            if(x==1){
                ab.load(Numero, Nombre);
            }
            if(x==2){
                ab.save(Numero);
            }
            if(x==3){
                ab.list(Numero);
            }
            if(x==4){
                ab.create(Numero,Nombre);
            }
            if(x==5){
                ab.delete(Numero);
            }

            System.out.println("Desea Continuar? \n1. SI, 2. NO");
            f = t.nextInt();
        }while (f==1);
            System.out.println("FIN");
    }
}