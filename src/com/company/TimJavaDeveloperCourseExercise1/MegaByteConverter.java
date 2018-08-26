package com.company.TimJavaDeveloperCourseExercise1;

public class MegaByteConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(1024);
    }


    public static void printMegaBytesAndKiloBytes(int kiloByte){

        int megaBytes = kiloByte/1024;
        int remainingKiloBytes = kiloByte%1024;

        if(kiloByte<0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloByte + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB.");
        }

    }

}

