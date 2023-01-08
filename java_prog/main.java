Getting Started with java

Every line of code that runs in Java must be inside a class.
java is case-sensitive
every Java program has a class name which must match the filename, and 
that every program must contain the main() method.
each code statement must end with a semicolon (;).


/*
A basic java programme
having a class ,name matches to file-name
inside it main method(function in class called methods) 
inside it our program is executed.
*/
public class main {
    public void main(String[] args ){
        System.out.println("hello everyone");
    }
}
///////////////////////////////////////////////

package and classes
/*
package are the group of classes having similar properties
 */
syntax:

import package.name.Class    //import single class

import package.name.*        // import whole package

/*
class are blueprint or set of instruction to build 
objects from it and these obj use its properties (i.e obj1.max....) 
*/
///////////////////////////////////////////////////
 Encapsulation
 /*
It is also called data hiding.
it is a mechanism to hide variable(data) and methods . so that 
it can only be used only on that class.
*/
syntax:
use private keyword
and also use (getter and setter method) to access and edit these encapsulated things.
////////////////////////////////////////////////////////

identifiers : variable name , method name 
keyword : special words which meaning known by computer.
////////////////////////////////////////////////////

method overloading 
/**
it means a class having many methods with same name but 
having different parameters */

public int add(int a ,int b){
    return a+b;
}
public int add(int a, int b ,int c){
    return a+b+c;
}
public string add(String a, String b){
    return a+b;
}
////////////////////////////////////////////////////////////

Inheritance
/*properties of a class can be used in other class
here notation used, 

superClass => subClass 
surname => name 
parentclass => childClass
*/
public class superClass{
    int a =7;
    public int add(int a , int b){
        return a+b;
    }
}

public class subClass extends superClass{
    public static void main(String[])
    
}
//////////////////////////////////////////////

method overriding 
//also called run time polymorphism
// if a subClass change the defination of methods of the Inherited superClass
// then it is called method overriding.
notation used : @Override in android studio.
//////////////////////////////////////////////

interface and implements
interface is a class of abstract method(i.e., method are only declared ,defination isnt given)

At new class implements these class by overriding these methods.
////////////////////////////////////////////

this keyword 

class myclass{
    int a; // a is of the class
    public static void main(String[] args )
    {
        int a; // a is of main method 
        a=8;
        this.a =9;  // able to differentiate between differen a's.
    }
}

static keyword 
// here memory is predefined allocated
// is there are many objects created of the class where static keyword is used
// then there will be single memory allocated whether copy of the memories.

final keyword 
final int v=9;
v=8;  //gives an error
// and final method can be inherited but can't be override.
// also final class can't be inherited.
//////////////////////////////////////////////////

for(int i:arr){    //for each loop
    cout << i << " ";
}

//THE END