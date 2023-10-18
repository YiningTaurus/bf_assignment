package week1day3.P1Shapes;
/*
* Write a Java Program to create an abstract class named shape
* that contains two integers and an empty method named printArea.
* Provide three classes named Rectangle, Triangle, and Circle subclass
* that each one of the classes extends the Class Shape.
* Each one of the classes contains only the method printArea() that prints the area of Shape.
*
* */
abstract class Shape {
    int num1;
    int num2;

    abstract void printArea(int num1, int num2);
}
