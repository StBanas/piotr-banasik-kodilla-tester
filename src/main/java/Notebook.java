public class Notebook {

    int weight;
    String rename;
    int price;

    public Notebook (int weight, String rename, int price){

        this.weight = weight;
        this.price = price;
        this.rename = rename;
    }
    public void checkPrice(){
        if (this.price < 600) {
            System.out.println("This " + this.rename + " is very cheap.");
        }
        else if (this.price <= 1000 && this.price > 600){
            System.out.println("This price for  " + this.rename + " is good.");
        }

        else if (this.price > 1000){
            System.out.println("This " + this.rename + " is expensive.");
        }

    }
    public void checkWeight(){
        if (this.weight < 1000){
            System.out.println("This " + this.rename + " is not very heavy.");
        }

        else if (this.weight <= 1700 && this.weight > 1000){
            System.out.println("This " + this.rename + " is quite heavy.");
        }

        else if (this.weight >= 1700){
            System.out.println("This " + this.rename + " is very heavy.");
        }

    }
}
