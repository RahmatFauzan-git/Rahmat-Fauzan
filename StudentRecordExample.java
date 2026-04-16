/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_rahmat.fauzan;

/**
 *
 * @author LAB-SI-PC
 */
public class StudentRecordExample {
    public static void main( String[] args ){
    StudentRecord aliRecord= new StudentRecord();   
    StudentRecord aniRecord= new StudentRecord();
    StudentRecord deniRecord = new StudentRecord("Deni","Padang",20);
 
    aliRecord.setName("ali");
    aliRecord.setAddress("Padang");
    aliRecord.setAge(20);
    aliRecord.setMathGrade(80);
    aliRecord.setEnglishGrade(85);
    aliRecord.setScienceGrade(90);
    
    System.out.println("Data 1  ");
    System.out.println("Nama              : "+aliRecord.getName());
    System.out.println("Alamat            : "+aliRecord.getAddress());
    System.out.println("Umur              : "+aliRecord.getAge());
    System.out.println("Matematika        : "+aliRecord.getMathGrade());
    System.out.println("B.Inggris         : "+aliRecord.getEnglishGrade());
    System.out.println("ilmu Pengetahuan  : "+aliRecord.getScienceGrade());
    System.out.println("Rata Rata         : "+aliRecord.getAverage());
    
    System.out.println();
    System.out.println("Data 2  ");
    
    aniRecord.setName("ani");
    aniRecord.setAddress("Bukittinggi");
    aniRecord.setAge(18);
    aniRecord.setMathGrade(90);
    aniRecord.setEnglishGrade(95);
    aniRecord.setScienceGrade(85);
    aniRecord.print("");
    System.out.println();
    aniRecord.print(80,90,100);
    System.out.println();
    System.out.println();
        deniRecord.print("");
    
    System.out.println("Jumlah Siswa = "+StudentRecord.getStudentCount());
    }
    
}
