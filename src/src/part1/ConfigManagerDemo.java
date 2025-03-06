package part1;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        System.out.println(ConfigurationManager.getInstance().toString());
        System.out.println(ConfigurationManager.getInstance().toString());
        //the output :
        //part1.ConfigurationManager@5b480cf9
        //part1.ConfigurationManager@5b480cf9
        //this shows us that this class returns us the same object


        //add configurations like characters and their houses
        ConfigurationManager.getInstance().addConfiguration("SpongeBob SquarePants","Pineapple House");
        ConfigurationManager.getInstance().addConfiguration("Patrick Star","Rock House");
        ConfigurationManager.getInstance().addConfiguration("Squidward Tentacles"," Easter Island Head House");
        ConfigurationManager.getInstance().addConfiguration("Mr.Krabs","Anchor House");
        ConfigurationManager.getInstance().addConfiguration("Sandy Cheeks","Treedome");

        //Display all data
        ConfigurationManager.getInstance().showConfiguration();

//      Return a specific configuration by key
        System.out.println("The house of Sandy Cheeks:");
        ConfigurationManager.getInstance().getConfiguration("Sandy Cheeks");

    }
}
