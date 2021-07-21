package dz05;

import java.util.Scanner;

public class Dz05 {

    public static void main(String[] args) {
        
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Unesite podatke za tri studenta, tj. ime i broj poena");
        System.out.println("osvojenih na dva kolokvijuma za svakog studenta:");
        System.out.println("");
        
        Student s1 = new Student();
        System.out.println("Unesite ime studenta: ");
        s1.ime = s.next();
        System.out.println("Unesite broj poena na prvom kolokviumu: ");
        s1.kol1 = s.nextInt();
        System.out.println("Unesite broj poena na drugom kolokvijumu: ");
        s1.kol2 = s.nextInt();
        
        Student s2 = new Student();
        System.out.println("Unesite ime studenta: ");
        s2.ime = s.next();
        System.out.println("Unesite broj poena na prvom kolokviumu: ");
        s2.kol1 = s.nextInt();
        System.out.println("Unesite broj poena na drugom kolokvijumu: ");
        s2.kol2 = s.nextInt();
        
        Student s3 = new Student();
        System.out.println("Unesite ime studenta: ");
        s3.ime = s.next();
        System.out.println("Unesite broj poena na prvom kolokviumu: ");
        s3.kol1 = s.nextInt();
        System.out.println("Unesite broj poena na drugom kolokvijumu: ");
        s3.kol2 = s.nextInt();
        
        
        System.out.print("Student1: ");
        s1.printStudent();
        
        System.out.print("Student2: ");
        s2.printStudent();
        
        System.out.print("Student3: ");
        s3.printStudent();
        
        System.out.print("Rang ovih studenata (najbolji, srednji, najgori) je: ");
        
        Student u1 = new Student();
        Student u2 = new Student();
        Student u3 = new Student();
        
        u1.Uspeh(s1);
        u2.Uspeh(s2);
        u3.Uspeh(s3);
        
        
        Student x1 = new Student();
        
        x1.uporedi(s1, s2, s3);

        
    }
}
