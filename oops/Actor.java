package org.example.oops;


//INHERITANCE
//Concreat
//abstract - concreat (must impl everything from abstract)
public class Actor extends Human {


    public Actor(){
        super();

    }
    public Actor(int x, int y) {
        super(x, y);
    }

    public Actor(String name, int id) {
        super(name, id);
    }

    //x,y
    @Override //polymorphism
    public  void earning(){
        System.out.println("I earn via acting..");
    }

    private static int noOfMovies =100;

    public void act(){
        System.out.println("Actor is acting..");
    }
   // @Override
    //public void eat(){
     //   System.out.println("Actor is eating..");
   // }


    //static method cant be overriden
    /*@Override
    public void walk(){
        System.out.println("Actor is run..");
    }*/

    public static void main(String[] args) {
       // Human human = new Human();
        //case -1
       Actor a = new Actor();//object of actor
        //a.eat();

        //Case -2
       /* Human h = new Human();
        h.eat();
        Human h2 = new Human("Ram", 101);
        System.out.println(h2);*/

        //Case -3
      Human h1 = new Actor();//upcasting
     //   h1.eat();

        //Case-3
         /*Actor a2 = (Actor)new Human();
         a2.eat();*/

        //case -4
       Actor a1 = (Actor)h1;
       //a1.eat();
        //System.out.println(a1.setName("SRK"));
        System.out.println(noOfMovies);
    }

    /**
     * @author -smriti
     * walk is the overriden method coming from species interface.
     */
    @Override
    public void walk() {
        System.out.println("Actor is walking on the ramp..");
    }

    /**
     *
     */
    @Override
    public void talk() {
        super.talk();
        System.out.println("Actor is talking..");
    }
}
