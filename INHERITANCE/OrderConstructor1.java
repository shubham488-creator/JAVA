//Order of Constructor Call in Multilevel Inheritance

class A
{
 A()
 {
  System.out.println("Constructor of A");
 }
 
}

class B extends A
{
 B()
 {
  System.out.println("Constructor of B");
 }
}

class C extends B
{
 C()
 {
  System.out.println("Constructor of C");
 }
}

class Main
{
 public static void main(String args[])
 {
    C objc = new C();
 }
}
