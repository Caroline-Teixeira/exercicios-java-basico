public class Car {

    private boolean on;
    private int speed;
    private int gear; // marchas
    

    // Construtor
    public Car() {
        this.on = false;
        this.speed = 0;
        this.gear = 0; // Ponto morto
        
    }

    // Métodos
    // Verifica se o carro está ligado
    public boolean isOn() {
        return on;
    }

    // Liga o carro
    public void start() {
        if (!on) {
            on = true;
            System.out.println("Girando chave. Carro ligado.");
        } else {
            System.out.println("O Carro já está ligado.");
        }
    }
    
    // Desliga o carro
    public void stop() {
        if (!on){
            System.out.println("O Carro já está desligado.");
            return;
        }
        if (speed <= 0 && gear <=0) {
            on = false;
            System.out.println("Girando chave. Carro desligado.");
        
        }
        else {
            System.out.println("Para desligar o carro, ele deve estar em ponto morto (marcha 0) e velocidade 0 km/h!");
        }
    }
    // Acelera o carro
    public void accelerate(){
        if (!on) {
            System.out.println("O Carro está desligado. Ligue-o primeiro.");
            return;
        }
        if (gear == 0) {
            System.out.println("O Carro está em ponto morto. Mude a marcha para acelerar.");
            return;
        }

        if (speed < 120) {
            speed+=10;
            if (!speedCheck()) {
                speed -= 10; // Reverte a aceleração se a velocidade não for compatível com a marcha
                System.out.println("Velocidade incompatível com a marcha atual. Troque de marcha.");
                
            }
            else{System.out.println("Acelerando. Velocidade atual: " + speed + " km/h.");}
            
        } else {
            System.out.println("Velocidade máxima atingida (120 km/h).");
        }
    }

    // Verifica se a velocidade é compatível com a marcha atual
    private boolean speedCheck() {
        switch (gear) {
            case 1:
                return speed >= 0 && speed <= 20;
            case 2:
                return speed >= 21 && speed <= 40;
            case 3:
                return speed >= 41 && speed <= 60;
            case 4:
                return speed >= 61 && speed <= 80;
            case 5:
                return speed >= 81 && speed <= 100;
            case 6:
                return speed >= 101 && speed <= 120;
            case 0: // Ponto morto
                return speed == 0; // Ponto morto deve ter velocidade 0
            default:
                System.out.println("Marcha inválida, ");
                return false; // Marcha inválida
        }
    }
    // Verifica se a velocidade é compatível com a nova marcha
    private boolean speedCheckNewGear(int newGear) {
        switch (newGear) {
            case 1:
                return speed >= 0 && speed <= 25; // acelerar e frear
            case 2:
                return speed >= 20 && speed <= 45;
            case 3:
                return speed >= 40 && speed <= 65;
            case 4:
                return speed >= 60 && speed <= 85;
            case 5:
                return speed >= 80 && speed <= 105;
            case 6:
                return speed >= 100 && speed <= 120;
            case 0: // Ponto morto
                return speed == 0; // Ponto morto deve ter velocidade 0
            default:
                System.out.println("Marcha inválida, ");
                return false; // Marcha inválida
        }
    }

   

    // diminui a velocidade do carro
    public void brake() {
        if (!on) {
            System.out.println("O Carro está desligado. Ligue-o primeiro.");
            return;
        }
        if (speed > 0) {
            speed-=5; // Diminui a velocidade em 5 km/h
            if (!speedCheck()) {
                speed += 5; // Reverte a diminuição se a velocidade não for compatível com a marcha
                System.out.println("Velocidade incompatível com a marcha atual. Mude de marcha.");
            } else {
                System.out.println("Freando. Velocidade atual: " + speed + " km/h.");
            }
        }
    }

    // Vire para a direita
    public void turnRight() {
        if (!on) {
            System.out.println("O Carro está desligado. Ligue-o primeiro.");
            return;
        }
        if (speed >=1 && speed <=40){
            System.out.println("Virando à direita.");
        }
        else{
            System.out.println("Para virar à direita, a velocidade deve estar entre 1 e 40 km/h.");
        }
    }

    // Vire para a esquerda
    public void turnLeft() {
        if (!on) {
            System.out.println("O Carro está desligado. Ligue-o primeiro.");
            return;
        }
        if (speed >=1 && speed <=40){
            System.out.println("Virando à esquerda.");
        }
        else{
            System.out.println("Para virar à esquerda, a velocidade deve estar entre 1 e 40 km/h.");
        }
    }

    // Muda a marcha do carro
    public void changeGear(int newGear) {
        if (!on) {
            System.out.println("O Carro está desligado. Ligue-o primeiro.");
            return;
        }

        if (newGear < 0 || newGear > 6) {
            System.out.println("Marcha inválida. Use uma marcha entre 0 e 6.");
            return;
        }

        if (newGear - gear > 1 || gear - newGear > 1){
            System.out.println("Não pule marchas. Mude uma marcha de cada vez.");
            return;
        }
        if (!speedCheckNewGear(newGear)) {
            System.out.println("Velocidade atual (" + speed + " km/h) incompatível com a marcha " + newGear + ".");
            return;
        }

         
        if (newGear == 0 && speed > 0) {
            System.out.println("Para mudar para ponto morto, a velocidade deve ser 0 km/h.");
            return;
        }
        gear = newGear;
        System.out.println("Marcha alterada para: " + gear);
    }

    // Verificar velocidade atual
    public void checkSpeed() {
        System.out.println("Velocidade atual: " + speed + " km/h");
    }





    

}
