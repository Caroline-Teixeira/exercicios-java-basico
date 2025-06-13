public class Rectangle implements Formula {

    private double length;
    private double width;

    // construtor da classe 
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // metodo para calcular a área do retângulo
    @Override
    public double calculateArea() {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Altura e largura não podem ser negativas");
        }
        return length * width;
    }

}
