package org.example.oops;


//oops - POJO
//encapsulation
//inheritance
 abstract class Human implements Species{
    int x;
    int y;

    public Human() {}

    public static void walkSlow(){
        System.out.println("Human is walking..");
    }

    public Human(int x, int y ) {
        this.x = 20;
        this.y = 10;
    };

    void sum(int a, int b){
        System.out.println(a+b);
    }
    public Human(String name, int id) {
        this.id =  id;
        this.name = name;
    };
    //data
    //state
    private String name;
    private int id;

    //methods-- property
    //public-protected-default-private.
    @Override
    public void eat(){
        System.out.println("Human is eating..");
    }

     abstract void earning();

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //to string
}
