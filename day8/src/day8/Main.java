package day8;
class BC {
    public void Print() {
        System.out.println("Base");
    }         
}

class DC extends BC {    
    public void Print() {
        System.out.println("Derived");
    }
}

class Main{
    public static void DoPrint( BC o ) {
        o.Print();   
    }
    public static void main(String[] args) {
        BC b = new BC();
        b.Print();
        DC d = new DC();
        d.Print();
        d.Print();
    }
}