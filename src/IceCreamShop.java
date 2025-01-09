public class IceCreamShop {

    String name;
    boolean isOpen;
    int numberOfFlavors;

    public static void main(String[] args) {
        IceCreamShop creamery = new IceCreamShop();
    }

    public IceCreamShop(){
        RandomDiscount();
        specialOfTheDay();
        countScoops();
        chefsChoice();


        IceCream halesorder = new IceCream(2,"Cookies and Cream",false);
        halesorder.PrintInfo();

        IceCream myOrder = new IceCream(4,"Vanilla",true);
        myOrder.PrintInfo();

        //System.out.println("Hello World! Good luck on your exams!");
        name = "Scoops & Loops: The Code Creamery";
        isOpen = true;
        numberOfFlavors = 32;

        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We were founded in " + numberOfFlavors + ".");
        numberOfFlavors = 1920;
        System.out.println("Welcome to " + name + "! It is " + isOpen + " that we are open. We were founded in " + numberOfFlavors + ".");
    }

    public void RandomDiscount(){
        int randomDiscount = (int)(Math.random() * 30);
        System.out.println("We spun the discount wheel and you get " +  randomDiscount +  " percent off your order!");

    }

    public void specialOfTheDay(){
        String flavor = "Vanilla";
        System.out.println("Today’s special is " + flavor + ".");
    }

    public void countScoops(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 2; i <= 11; i = i+3) {
            System.out.println(i);
        }

        for (int i = 8; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public void chefsChoice(){
        double randomNum = Math.random();

        if(randomNum < 0.25){
            System.out.println("The chef recommends a Banana Split");
        }
        else if(randomNum > 0.25 && randomNum < 0.5){
            System.out.println("The chef recommends a Turtle Sundae");
        }
        else if(randomNum > 0.5 && randomNum < 0.75){
            System.out.println("The chef recommends a Hot Fudge Sundae");
        }
        else{
            System.out.println("The chef recommends The Vermonster");
        }
    }
}