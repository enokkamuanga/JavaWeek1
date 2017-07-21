package exampleProj;

public abstract class Animal {

String colour;
int age;
double size;

public Animal(String colour, int age, double size) {
this.colour = colour;
this.age = age;
this.size = size;
}

public abstract void eat();
public abstract void makeNoise();

}