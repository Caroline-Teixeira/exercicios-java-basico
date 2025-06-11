public class FamilyTicked extends MovieTicket {

    private int familyMembers;

    public FamilyTicked(String name, double price, boolean subtitles, int familyMembers) {
        super(name, price, subtitles, 0); // A idade não é relevante para este tipo de ingresso
        this.familyMembers = familyMembers;
    }

    

    public int getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(int familyMembers) {
        this.familyMembers = familyMembers;
    }


    @Override
    public double calculatePrice() {
        if (familyMembers < 3) {
            System.out.println("Ingresso família: menos de 3 membros, preço normal.");
            return getPrice() * familyMembers; // Preço normal para menos de 3 membros
        } else {
           // desconto de 5% quando o número de pessoas for maior que 3.
            System.out.println("Ingresso família: 3 ou mais membros, aplicando desconto de 5%.");
            return getPrice() * familyMembers * 0.95; // 5% de desconto para 3 ou mais membros
        }
    }
}
