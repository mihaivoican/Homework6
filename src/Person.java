public class Person {
//1) create an object that represents a Person
    private String name;
    private  int age;
    private boolean married;

    public Person(){

    }

    public Person(String nume,int varsta,boolean casatorit){
        name = nume;
        age= varsta;
        married=casatorit;
    }

    public  String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isMarried(){
        return married;
    }
}
