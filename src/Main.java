import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //2) create an application that creates 3 persons using the objects from exercise 1. Print them to the console
        Person p1 = new Person();

        Person p2 = new Person("Ion", 89, true);
        String nume = "Vasilescu Mihai";
        int varsta = 23;
        boolean casatorit = false;

        Person p3 = new Person(nume, varsta, casatorit);

        System.out.println(String.format("Persoana 1: nume: %s, varsta: %d, casatorit: %b", p1.getName(), p1.getAge(), p1.isMarried()));
        System.out.println(String.format("Persoana 2: nume: %s, varsta: %d, casatorit: %b", p2.getName(), p2.getAge(), p2.isMarried()));
        System.out.println(String.format("Persoana 3: nume: %s, varsta: %d, casatorit: %b", p3.getName(), p3.getAge(), p3.isMarried()));

//4 Create an application that creates 3 Products. Use each method of the object

        Product prd1 = new Product("cana", 10, 100, "vase");
        Product prd2 = new Product("calimara", 12, 20, "rechizite");
        Product prd3 = new Product("cartus", 250, 0, "consumabile");

        System.out.println(String.format("Produs1: %s, pret: %d, cantitate: %d, categorie: %s",prd1.getName(), prd1.getPrice(),prd1.getQuantity(), prd1.getCategory()));
        System.out.println(String.format("Produs2: %s, pret: %d, cantitate: %d, categorie: %s",prd2.getName(), prd2.getPrice(),prd2.getQuantity(), prd2.getCategory()));
        System.out.println(String.format("Produs3: %s, pret: %d, cantitate: %d, categorie: %s",prd3.getName(), prd3.getPrice(),prd3.getQuantity(), prd3.getCategory()));

        //e pe stoc?
        System.out.println(String.format("%s este pe stoc: %b",prd1.getName(), prd1.hasStock()));
        System.out.println(String.format("%s este pe stoc: %b",prd2.getName(), prd2.hasStock()));
        System.out.println(String.format("%s este pe stoc: %b",prd3.getName(), prd3.hasStock()));

        //e in categoria?
        System.out.println(String.format("Categoria vase: %s - %b", prd1.getName(),prd1.isCategory("vase")));
        System.out.println(String.format("Categoria vase: %s - %b", prd2.getName(),prd2.isCategory("vase")));
        System.out.println(String.format("Categoria vase: %s - %b", prd3.getName(),prd3.isCategory("vase")));

        //5 bem din sticla
        Bottle btl1 = new Bottle(2.5f,2.5f,false);
        Bottle btl2 = new Bottle(0.5f,0.25f,true);

        System.out.println(String.format("Sticla1: gol - %f, disponibil- %f, deschisa - %b",btl1.getEmptyCapacity(),btl1.getAvailableLiquid(),btl1.getOpen()));
        System.out.println(String.format("Sticla2: gol - %f, disponibil- %f, deschisa - %b",btl2.getEmptyCapacity(),btl2.getAvailableLiquid(),btl2.getOpen()));

        //bem 1l din prima sticla
        System.out.println("Dorim sa bem 1l din sticla 1");
        System.out.println(btl1.setDrinks(1f));
        System.out.println("A mai ramas in sticla 1: " + btl1.getAvailableLiquid());
        //incers sa beau 1 l din a doua sticla
        System.out.println("Dorim sa bem 1l din sticla 2");
        System.out.println(btl2.setDrinks(1f));
        System.out.println("A mai ramas in sticla 2: " + btl2.getAvailableLiquid());
    }

}
