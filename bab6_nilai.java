/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_fauzan;
import javax.swing.*;
/**
 *
 * @author LAB-SI-PC
 */
public class bab6_nilai {
    public static void main(String[] args) {
        int [] a = new int [3];
        int total = 0;
        
        for(int i=0;i<a.length;i++){
            String input = JOptionPane.showInputDialog("Masukkan Nilai ke-" + (i+1) + ":");
            a[i] = Integer.parseInt(input);
            total += a[i];
        }
        double rata = total/3;
        String hasil = "NIla rata-rata : ";
        if (rata >= 60){
            hasil += "\n:-)";
        }else {
            hasil += "\n:-(";
        }
        JOptionPane.showMessageDialog(null,rata + hasil);
    }
}
