public class Pizza {
    private  int basePrice;
    private int toppingsPrice;
    private int cheesePrice;
    private String size;
    private boolean isVeg;
    private int carryBagPrice;
    private String bill;
    private int totalAmount;

    public Pizza(boolean isVeg,String size){
        if(size=="Regular"){
            if(isVeg){
                basePrice=100;
            }
            else{
                basePrice=130;
            }
        }
        else{
            if(isVeg){
                basePrice=200;
            }
            else{
                basePrice=250;
            }
        }
        toppingsPrice=50;
        cheesePrice=40;
        carryBagPrice=10;
        totalAmount=basePrice;
        bill=bill+"the base of the selected pizza is :"+basePrice+"\n";
    }
    public void addCheese(){
        totalAmount=totalAmount+cheesePrice;
        bill=bill+"Extra cheese added :"+cheesePrice;
    }
    public void addToppings(){
        totalAmount=totalAmount+toppingsPrice;
        bill=bill+"Extra topping added : "+toppingsPrice;
    }
}
