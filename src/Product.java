public class Product {
    //3) create an object that represents a Product
    //state
    private String name;
    private long price;
    private long quantity;
    private String category;

    //constructors
    public Product() {

    }

    public Product(String nume, long pret, long cantitate, String categorie) {
        name = nume;
        price = pret;
        quantity = cantitate;
        category = categorie;
    }

    //behavior
    public String getName() {
        return this.name;
    }

    public long getPrice() {
        return price;
    }

    public long getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        if (this.quantity > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCategory(String category) {
        if (this.category == category) {
            return true;
        } else {
            return false;
        }
    }
}
