public class Bottle {
    //5) create an object that represents a bottle:
    //state
    private float totalCapacity;
    private float availableLiquid;
    private boolean open;


    //constructor
    public Bottle(float capacitate, float disponibil, boolean deschis) {
        totalCapacity = capacitate;
        availableLiquid = disponibil;
        open = deschis;
    }

    //behavior
    public boolean hasLiquid() {
        if (availableLiquid > 0) {
            return true;
        } else {
            return false;
        }
    }

    public float getAvailableLiquid() {
        return this.availableLiquid;
    }

    public float getEmptyCapacity() {
        if (totalCapacity - availableLiquid > 0) {
            return totalCapacity - availableLiquid;
        } else {
            return 0;
        }
    }

    public String setOpen() {
        this.open = true;
        return "Bottle is opened";
    }

    public String setClose() {
        this.open = false;
        return "Bottle is closed";
    }

    public String setDrinks(float cantitate) {
        if (getOpen()== false){
            System.out.println("Sticla e inchisa");
            setOpen();
        }
        if (availableLiquid >= cantitate) {
            availableLiquid -= cantitate;
            return "S-a baut cat s-a dorit!";
        } else {
            availableLiquid = 0;
            return "S-a baut mai putin decat s-a dorit";
        }
    }

    public boolean getOpen(){
        return this.open;
    }

}
