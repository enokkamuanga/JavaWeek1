package exampleProj;

public class Cat extends Animal {
boolean hasFur;
boolean hatesHumanity;

public Cat(String colour, int age, double size, boolean hasFur,
boolean hatesHumanity) {
super(colour, age, size);
this.hasFur = hasFur;
this.hatesHumanity = hatesHumanity;
}

public void eat() {
// TODO Auto-generated method stub
System.out.println("Nibbles");
}

public void makeNoise() {
// TODO Auto-generated method stub
System.out.println("meow");
}

}