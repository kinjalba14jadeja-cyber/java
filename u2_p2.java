//Write a java program to use multi-level inheritance.

class Animal{
    String name = "Animal";
    void eat (){
          System.out.println("This animal eats food.");
    }
  
}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks:Woof!Woof!");
    }
}

class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy is weeping.");
    }
}

public class U2_P2{
    public static void main(String args[]){
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
