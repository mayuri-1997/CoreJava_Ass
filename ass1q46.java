/*instance of operator-secure downcasting*/

class Animal {
}

class Dog extends Animal {
  public void displayInfo() {
     System.out.println("I am a dog");
  }
}

class Main {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    Animal a1 = d1;    // Upcasting

    if (a1 instanceof Dog){
       Dog d2 = (Dog)a1;    // Downcasting
       d2.displayInfo();
    }
  }
}