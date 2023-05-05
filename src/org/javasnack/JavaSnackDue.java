package org.javasnack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class JavaSnackDue {
    public static void main(String[] args) {
    	   String[] nomi = {"luigi", "paolo", "marco", "antonio"};
           String[] cognomi = {"scionti", "ruggieri", "petris", "taliano"};

           ArrayList<String> listaNomi = new ArrayList<>(Arrays.asList(nomi));
           ArrayList<String> listaCognomi = new ArrayList<>(Arrays.asList(cognomi));

           Collections.shuffle(listaNomi);
           Collections.shuffle(listaCognomi);

           String[] nomiMisti = new String[nomi.length];
           for (int i = 0; i < nomi.length; i++) {
               nomiMisti[i] = listaNomi.get(i) + " " + listaCognomi.get(i);
           }

           System.out.println(Arrays.toString(nomiMisti));
       }}

