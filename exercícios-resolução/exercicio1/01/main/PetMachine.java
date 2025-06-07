public class PetMachine {

    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;


    public PetMachine(Pet pet) {
        this.pet = pet;
        this.clean = false;
        this.water = 100; // Initial water level
        this.shampoo = 50; // Initial shampoo level
    }

    public void receivePet() {
        if (this.pet == null) {
            System.out.println("Nenhum pet recebido. Coloque um pet na máquina.");
            return;
        }
        
        pet.setClean(true);
        this.clean = true;
        System.out.println("O pet " + pet.getName() + " foi limpo com sucesso!");
    }
    }
    


