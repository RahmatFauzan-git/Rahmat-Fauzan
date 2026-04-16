/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_fauzan;
import java.io.*;
/**
 *
 * @author LAB-SI-PC
 */
public class bab6_CetakSeratus {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        int j =0;
        int k =0;
        
        try {
            System.out.print("Masukan Nama Anda : ");
            nama = dataIn.readLine();
        }catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Perulangan For");
        for (int i=0;i<100;i++){
            System.out.println("Nama Ke-"+ (i+1) +" = " +nama);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Perulangan while");
        while (j<100){
            System.out.println("Nama Ke-"+ (j+1) +" = " +nama);
            j++;
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Perulangan Do-While");
        do{
            System.out.println("Nama Ke-"+ (k+1) +" = " +nama);
            k++;
        }while (k<100);
        System.out.println("----------------------------------------------------");
    }
}
