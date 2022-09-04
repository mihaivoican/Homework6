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
            return "Bottle is opened";
        }else{
            return "Bottle is closed";
        }
    }



    public String setDrinks(float cantitate) {
//        if (getOpen()== false){
//            System.out.println("Sticla e inchisa");
//            setOpen();
//        }
        //deschid sticla
        if (!open){
            setOpen(true);
        }else{
            System.out.println("Sticla era deschisa");
        }
        String rasp1 ="";
        if (availableLiquid >= cantitate) {
            availableLiquid -= cantitate;
            rasp1= "S-a baut cat s-a dorit!";
        } else {
            availableLiquid = 0;
            rasp1= "S-a baut mai putin decat s-a dorit";
        }
        //inchid sticla
        setOpen((false));
        return rasp1;
    }

    public boolean getOpen(){
        return this.open;
    }

}
