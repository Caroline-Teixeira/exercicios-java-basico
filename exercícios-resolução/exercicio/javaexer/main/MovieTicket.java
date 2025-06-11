public abstract class MovieTicket {

    private double price;
    private final String name;
    private boolean subtitles;
    protected int age;

    // Construtor
    public MovieTicket(String name, double price, boolean subtitles, int age) {
        this.name = name;
        this.price = price;
        this.subtitles = subtitles;
        this.age = age;
    }

   
    public String getName() {
        return name;
    }
    
    public boolean hasSubtitles() {
        return subtitles;
    }
    

    public double getPrice() {
        return price;
    }


    public boolean isSubtitles() {
        return subtitles;
    }


    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }

    // método
    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }   
    

    // método pra calcular preço
    public abstract double calculatePrice();

    public void printTicketInfo() {
        System.out.println(" ");
        System.out.println("=== Informações do Ingresso ===");
        System.out.println("Nome do filme: " + name);
        System.out.printf("Preço do ingresso base: R$%.2f%n", price);
        System.out.println("Legendas: " + (subtitles ? "Sim. (Audio em inglês)" : "Não. (Áudio em português)"));
        System.out.printf("Total: R$%.2f%n", calculatePrice());
        System.out.println(" ");
    }


    
}
