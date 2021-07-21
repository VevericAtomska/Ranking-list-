package dz05;

public class Student {
    
    String ime;
    int kol1, kol2;
    public int uspeh;
    Student[] niz;
    public void printStudent()
    {
        System.out.println(ime + " " + kol1 + " " + kol2);
    }
    
    Student()
    {
        
    }
    
    Student (String ime, int kol1, int kol2)
    {
        this.ime = ime;
        this.kol1 = kol1;
        this.kol2 = kol2;
    }
    
    int prviKol = kol1;
    int drugiKol = kol2;
    
    public void print()
    {
        System.out.print(ime);
    }
    
    public int Uspeh(Student a)
    {
        uspeh = (int) (a.kol1 * 0.3 + a.kol2 * 0.7);
        return uspeh;
    }
    public void uporedi(Student a, Student b, Student c)
    {
        if(Uspeh(a)>Uspeh(b) && Uspeh(a)>Uspeh(c))
        {
           if(Uspeh(b)>Uspeh(c))
           {
               a.print();
               b.print();
               c.print();
           }
           else
           {
               System.out.println(a.ime + ", " + c.ime + ", " + b.ime);
           }
        }
        else if (Uspeh(b)>Uspeh(a) && Uspeh(b)>Uspeh(c))
        {
            if(Uspeh(a)>Uspeh(c))
           {
               System.out.println(b.ime + ", " + a.ime + ", " + c.ime);
           }
           else
           {
               System.out.println(b.ime + ", " + c.ime + ", " + a.ime);
           }
        }
        else if (Uspeh(c)>Uspeh(a) && Uspeh(c)>Uspeh(b))
        {
            if(Uspeh(a)>Uspeh(b))
           {
               System.out.println(c.ime + ", " + a.ime + ", " + b.ime);
           }
           else
           {
               System.out.println(c.ime + ", " + b.ime + ", " + a.ime);
           }
        }
        
    }
}
