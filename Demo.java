/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author Dhimas Ananta
 */
public class Demo {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("SuperClass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampikanNilaiXY();
        
        System.out.println("SubClass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.TampikanNilaiXY();
        
        subOb.z = 50;
        subOb.TampilkanJumlah();
    }
}
