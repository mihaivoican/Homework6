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

    public String setOpen(boolean deschis) {
        this.open = deschis;
        if (open) {
            return "Bottle is opened. ";
        } else {
            return "Bottle is closed. ";
        }
    }


    public String setDrinks(float cantitate) {
        String raspuns = "";
        //deschid sticla
//        if (getOpen()== false){
//            rasp +="Bottle is closed. ";
//            setOpen(true);
//        }
        if (!getOpen()) {
            raspuns += setOpen(true);
        } else {
            raspuns += "Sticla era deschisa ";
        }
        //verific continutul
        if (!hasLiquid()) {
            raspuns +="Sticla NU mai are lichid. ";
        } else {
            if (availableLiquid >= cantitate) {
                availableLiquid -= cantitate;
                raspuns += "S-a baut " + cantitate + " litru. ";
            } else {
                availableLiquid = 0;
                raspuns += "S-a baut mai putin de " + cantitate + " litru. ";
            }
            raspuns += "A mai ramas in sticla " + getAvailableLiquid() + " litri. ";
        }
        //inchid sticla
        return raspuns += setOpen((false));

    }

    public boolean getOpen() {
        return this.open;
    }

}
