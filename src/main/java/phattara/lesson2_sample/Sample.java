/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phattara.lesson2_sample;

/**
 *
 * @author koonp
 */
public class Example {
    public static void ex11(){
        byte b = 100;
        short s =100;
        int i = 100;
        long l = 100L;
        System.out.println("b:" +b);
        System.out.println("s:" +s);
        System.out.println("i:" +i);
        System.out.println("l:" +l);
    }
    public static void ex12(){
        float f = 123.4f;
        double d1 = 123.4;
        double d2 = 1.234e2;
        System.out.println("f:" +f);
        System.out.println("d1:" +d1);
        System.out.println("d2:" +d2);
    }
    public static void ex13(){
        char ch = 'A';
        String st = "Hello World!";
        boolean flag = true;
        System.out.println("ch:" +ch);
        System.out.println("st:" +st);
        System.out.println("flag:" +flag);
    }
    public static void ex14(){
        int dec = 26;
        int bin = 0b11010;
        int oct = 032;
        int hex = 0x1a;
        System.out.println("dec:" +dec);
        System.out.println("bin:" +bin);
        System.out.println("oct:" +oct);
        System.out.println("hex:" +hex);
    }
    public static void ex15(){
        final float pi = 3.14159f;
        float r = 10.0f;
        float area;
        area = pi * r * r;
        System.out.println("r : " +r);
        System.out.println("area : " +area);
    }
    public static void ex16(){
        int a,b,c;
        float f = 7.2f;
        float g = 7.5f;
        float h = 7.7f;
        a = (int) f;
        b = (int) g;
        c = (int) h;
        System.out.println("a:" +a);
        System.out.println("b:" +b);
        System.out.println("c:" +c);
        System.out.println("f:" +f);
        System.out.println("g:" +g);
        System.out.println("h:" +h);
    }
    public static void ex17(){
        int a = 7;
        int b = 8;
        float f, g;
        f = a;
        g = (float) b;
        System.out.println("a:" +a);
        System.out.println("b:" +b);
        System.out.println("f:" +f);
        System.out.println("g:" +g);
    }
}
