public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet = null;



    // getters e setters
    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }
    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    // metodos
    public boolean hasPet() {
        return pet != null;
    }
    
    public void setPet(Pet pet) {
    if (!this.clean) {
        System.out.println("A máquina não está limpa. Por favor, limpe a máquina antes de adicionar um pet.");
        return;
    }

    if (this.pet != null) {
        System.out.println("O pet: " + this.pet.getName() + " já está na máquina."); 
        return;
    }

    this.pet = pet;
    System.out.println("Pet: " + pet.getName() + " adicionado à máquina.");
}


    public void addWater(){
        if (water >= 30) {
            System.out.println("A capacidade de água já está no máximo.");
            return;
        } 
        else if (water <= 0) {
            System.out.println("A máquina está sem água. Por favor, adicione água.");
            return;
        }
        else{
            System.out.println("Adicionando água à máquina...");
            water += 2;
        }
         
    }

    public void addShampoo() {
        if (shampoo >= 10) {
            System.out.println("A capacidade de shampoo já está no máximo.");
            return;
        } 
        else if (shampoo <= 0) {
            System.out.println("A máquina está sem shampoo. Por favor, adicione shampoo.");
            return;
        }else{
            System.out.println("Adicionando shampoo à máquina...");
            shampoo += 2; 
        }

        

    }

    public void shower() {
        if (this.pet == null) {
            System.out.println("Nenhum pet recebido. Coloque um pet na máquina.");
            return;
        }

        if (water < 10 || shampoo < 2) {
            System.out.println("Nível de a´gua e shampoo insuficiente. Necessário: 10L água, 2L shampoo.");
            return;
        }
        
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        this.clean = false; // A máquina fica suja após o banho
        System.out.println("O pet " + pet.getName() + " foi limpo com sucesso!");
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Nenhum pet na máquina para remover.");
            return;
        }
        
        System.out.println("O pet  " + pet.getName() + " retirado da máquina");
        this.pet = null;
    }

    public void cleanMachine() {
        if (this.pet != null) {
            System.out.println("A máquina não pode ser limpa com um pet dentro.");
            return;
        }
        if (this.water < 3 || this.shampoo < 1) {
            System.out.println("Nível de água ou shampoo insuficiente para limpeza. Necessário: 3L água, 1L shampoo.");
            return;
        }

        if (this.clean == true) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        this.clean = true;
        this.water -= 3; 
        this.shampoo -= 1; 
        System.out.println("A máquina foi limpa com sucesso!");


    } }
    


