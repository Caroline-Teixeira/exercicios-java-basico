

public class Square implements Formula {
    
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // metodo para calcular a área do quadrado
    @Override
    public double calculateArea() {
        if (side < 0) {
            throw new IllegalArgumentException("Lado não pode ser negativo");
        }
        return side * side;
    }

    



}
