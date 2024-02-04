package constructor;
public class Tommy extends Brand{
    String name;
    public Tommy(String name, String brandType) {
        super(brandType);
        this.name = name;
    }

    public Tommy(String name) {
        super("Dress");
        this.name = name;
    }

    public static void main(String[] args) {
        Tommy tommy = new Tommy("Shirt");
        System.out.println(tommy.brandType);
        System.out.println(tommy.name);

        tommy = new Tommy("Guess", "Tommy");
        System.out.println(tommy.name);
        System.out.println(tommy.brandType);
    }
}
