public class HalfPriceTicked extends MovieTicket {



    public HalfPriceTicked(String name, double price, boolean subtitles, int age) {
        super(name, price, subtitles, age);
        
    }
    

    @Override
    public double calculatePrice() {
        if (age < 18) {
            System.out.println("Ingresso meia-entrada: aplicando desconto");
            return getPrice() / 2; // Retorna metade do preço do ingresso para menores de 18 anos
        } else {
            System.out.println("Ingresso normal: sem desconto");
            return getPrice(); // Preço normal para maiores de 18 anos
        }// Retorna metade do preço do ingresso
        
       

    }

    



}
