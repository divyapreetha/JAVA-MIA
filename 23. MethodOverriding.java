/*
 * Polymorphism is the ability of an object to take several forms.
 * The derivation of the word Polymorphism is from two different Greek words- poly and morphs. "Poly" means numerous, and "Morphs" means forms.
 * 
 * Polymorphism in Java allows us to perform the same action in many different ways.
 * 
 * Real Life Example of Polymorphism:
 * An individual can have different relationships with different people. A woman can be a mother, a daughter, a sister, and a friend, all at the same time, i.e. she performs other behaviors in different situations.
 * 
 * There are two types of Polymorphism
 * 1. Static Polymorphism (or) Method Overloading (or) Early Binding
 * 2. Dynamic Polymorphism (or) Method Overriding (or) Late Binding
 * 
 * 2. Method Overriding
 * Method overriding is the process when the subclass or a child class has the same method as declared in the parent class.
 * 
 * So, while calling that method, two scenarios can happen
 * 
 * Scenario 1: If that method is called using the PARENT class's OBJECT, the logic defined within the parent class for that method will be executed.
 * Scenario 2: If that method is called using the CHILD class's OBJECT, the logic defined within the child class for that method will be executed.
 * 
 * This decision will be made only at run-time. Hence it is called run-time polymorphism (or) late binding (or) method overriding [Since the child class overrides the logic written in parent class]
 * 
 * 
 */

//This is the parent class. This parent class has a method named "sound()"
class SoundAnimal  { 
    public void sound() { 
        System.out.println("Different sounds of animal"); 
    }
} 

//This child class Buffalo has the same method sound(). But, it has a different logic for sound() method.
class Buffalo extends SoundAnimal  { 
    public void sound()  { 
        System.out.println("The buffalo sound- gho,gho"); 
    } 
} 

class Snake extends SoundAnimal  { 
    public void sound() { 
        System.out.println("The snake sound- his,his"); 
    } 
 } 

class Tiger extends SoundAnimal  { 
    public void sound()  { 
        System.out.println("The tiger sounds- roooo, rooo"); 
    } 
 } 

 public class Overriding  { 
    public static void main(String[] args)  { 
        SoundAnimal animal = new SoundAnimal(); 
        SoundAnimal buffalo = new Buffalo(); 
        SoundAnimal snake = new Snake(); 
        SoundAnimal tiger = new Tiger(); 
        
        //This method will return the logic of sound() method mentioned in SoundAnimal class. 
        animal.sound(); 

        //Buffalo class has its own logic for sound() method. So, this will be executed at run-time. Here, child class overrides the logic written by parent class. Hence it is called "Method Overriding"
        buffalo.sound();
        snake.sound(); 
        tiger.sound(); 
    } 
 } 
