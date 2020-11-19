package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class AdressBook {

    HashMap<String, String> values = new HashMap<String,String>();
    File file = new File("D:\\Users\\marcn\\Desktop\\document.txt");

    public static Scanner t = new Scanner(System.in);
    public String Nombre;
    public String Numero;

    public AdressBook(){
        this.Nombre = Nombre;
        this.Numero = Numero;
    }

    public void load (String Numero, String Nombre){
        this.Numero = Numero;
        this.Nombre = Nombre;

        try{
            BufferedWriter in = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
            for(String i : values.keySet())
            in.write("{"+i+"}, {"+values.get(i)+"} || ");
            in.write("\n");

            System.out.println("La insersion fue realizada con exito. ");
            in.close();

        }catch (Exception e){
            System.out.println("Error E/S: " + e.getMessage());
        }
    }

    public void save(String Numero){
        this.Numero = Numero;

        FileWriter fw = null;
        try {
           // fw = new FileWriter("D:\\Users\\marcn\\Desktop\\document.txt");
            BufferedReader out = new BufferedReader(new FileReader("D:\\Users\\marcn\\Desktop\\document.txt"));
            String linea = "";
            while ((linea = out.readLine()) != null){
                if(linea.indexOf(Numero) != -1){
                    System.out.println("Registro: " + linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void list(String Numero){
        for(String i : values.keySet()){
            System.out.println("{"+i+"}, {"+values.get(i)+"}");
        }
    }

    public void create(String Numero, String Nombre){
        System.out.println("Ingtrese su numero: ");
        Numero = t.nextLine();
        System.out.println("Ingtrese su nombre: ");
        Nombre = t.nextLine();
        System.out.println("Values : "+ Numero+","+Nombre);
    }

    public void delete(String Numero){
        String del = "";

        System.out.println("Lista :");
        for(String i : values.keySet())
            System.out.println("{"+i+"}, {"+values.get(i)+"}");

        System.out.println("Ingrese Número a eliminar");
        del = t.nextLine();

        System.out.println("Numero eliminado: {"+del+"}, {"+values.get(del)+"}");
        values.remove(del);

        System.out.println("Lista restante:");
        for(String i : values.keySet())
            System.out.println("{"+i+"}, {"+values.get(i)+"}");
    }
}
