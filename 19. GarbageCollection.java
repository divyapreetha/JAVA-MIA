/* Garbage Collections in Java

Garbage in real life = trash
Garbage in Java = unused objects
You know that we create new objects in Java using the "new" keyword
e.g., Scanner scan = new Scanner(System.in)

We create new objects, use them and leave them as it is without disposing it properly. These might accumulate as dust and waste the memory space of JVM. Technically, this might cause our system to hang

This is like buying a can of pepsi, drinking half the can, and then leaving the can as it. If you keep repeating this for every new item that you purchase, your house will be full of waste packets and half-empty cans, leaving no room to keep your other useful things.

So, what's the solution to avoid this?

Just like how we hire a housemaid to clean our house, we have a special person in Java called the GARBAGE COLLECTOR

What are the duties of this GARBAGE COLLECTOR?
1. Searching for any unused objects in our Java programs and releasing them from the JVM's memory space.
2. This cleaning process happens automatically at regular intervals
3. The Java developers don't have to worry about it

So, on what basis do the Garbage Collector declares our object as unused?
When will an object reach an unused state?
Can a Java developer himself/herself set it as unusable?

When is an object ready for Garbage Collection (GC)?
1. When we release that object from memory - Nullifying an Object
2. Re-assigning reference variables
3. Out-of-scope (Objects declared inside a method's definition can't be accessed outside the scope of that method)
4. Island of Isolation

We can also manually call the "Garbage Collector" to empty the unused space in our program
Method 1: This is done by calling the method "System.gc()"
Method 2: By using the class "Runtime"

Steps followed by a Garbage Collector while emptying the object's memory space
Step 1: Analyses the purpose of this object
Step 2: Checks if there is any database connection (or) network connection associated with that object
Step 3: If there is no such connection, it will execute the finalize() method for this object. This is like relieving the dependencies associated with that object. Similar to how your OS will save your progress and close all running applications before shutting down your PC
Step 4: Now, memory space for that object is emptied
Step 5: The same thing happens for all objects

Know this:
1. final - A variable declared as "final" can't be updated. A method declared as "final" can't be overridden. A class declared as "final" can't be inherited
2. finally - During exception handling, this code block will run always even if there is/isn't an exception 
3. finalize - Garbage Collector will call this method before removing the memory space for an object. This method is within the "Object" class of "lang" package.
 */
public class GarbageCollection {

    String name; //global variable
    public static void main(String[] args) {

        //SCENARIO 1: NULLIFYING AN OBJECT
        //A new object is created here
        GarbageCollection gc = new GarbageCollection();
        //Let's try printing what's in this memory space for our new object
        System.out.println("Object 1: " + gc);
        //The system will print some hashcode like this "GarbageCollection@15db9742"

        //Now, let me nullify the object "gc"
        gc = null;
        System.out.println("Object 1: " + gc);
        //The system will print "null"
        //Now that our object's value is declared null, the "Garbage Collector" can now come and release the memory space for this object from JVM's memory

        //SCENARIO 2: Reassigning reference values
        GarbageCollection gc2 = new GarbageCollection();
        GarbageCollection gc3 = new GarbageCollection();
        //Let's try printing what's in this memory space for our new object
        System.out.println("Object 2: " + gc2);
        System.out.println("Object 3: " + gc3);
        
        //Now, let me reassign "gc3" to store the values in "gc2"
        gc3 = gc2;
        System.out.println("Object 2: " + gc2);
        System.out.println("Object 3: " + gc3);
        //The system will print Object 2: GarbageCollection@6d06d69c
        //                      Object 3: GarbageCollection@6d06d69c
        //Prints the same memory location hashcode for both objects. Object 3 doesn't need a separate space in memory to store its values. It's just going to replicate whatever value is stored by "Object 2". Just like how some of you guys blindly copy Jaideep's code
        //Now that our object's value is reassigned, the "Garbage Collector" can now come and release the memory space for this object (Object 3) from JVM's memory


        //SCENARIO 4: ISLAND OF ISOLATION
        //Now we have two active objects "gc2" and "gc3". Please keep in mind that "gc" is already set to null
        gc2.name = "CSE1018"; //Assigning value to global variable using the object "gc2"
        //Works fine
        System.out.println("Name assigned by Object gc2 is" + gc2.name);
        gc2 = null; //Emptying the memory of object "gc2"
       // System.out.println("Name assigned by Object gc2 is" + gc2.name);
        //Now, this line with throw a run-time exception named "NullPointer Access" - because you are trying to point a value of a object that has been emptied by the Garbage Collector

        //Method 1: Calling the Garbage Collector manually
        //I am manually calling the Garbage collector here
        System.gc(); //static method
        System.out.println("After Calling Garbage Collector Manually");
        System.out.println("Object 1: " + gc);
        System.out.println("Object 2: " + gc2);
        System.out.println("Object 3: " + gc3);

        //Method 2: Calling the Garbage Collector manually
        Runtime rt = Runtime.getRuntime(); //Singleton class
        System.out.println("Calling Garbage Collector");
        rt.gc();
        System.out.println("Checking the free memory space");
        System.out.println(rt.freeMemory());
        System.out.println("Checking the total memory space");
        System.out.println(rt.totalMemory());
    }
    //SCENARIO 3: OUT-OF-SCOPE
    //The objects "gc1", "gc2", "gc3" were created within our main() method
    //We can't access it outside the main() method
    //Now, the Garbage Collector will release the memory space for these three objects

}
