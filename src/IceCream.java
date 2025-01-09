public class IceCream {

        int numberOfScoops;
        String flavor;
        boolean hasSprinkles;

        public IceCream(int ParamNumberOfScoops, String ParamFlavor, boolean ParamHasSprinkles){
            numberOfScoops = ParamNumberOfScoops;
            flavor = ParamFlavor;
            hasSprinkles = ParamHasSprinkles;
        }

        public void PrintInfo(){
            System.out.println("Flavor: " + flavor);
            System.out.println("Sprinkles: " + hasSprinkles);
            System.out.println("# of Scoops: " + numberOfScoops);
        }

}

