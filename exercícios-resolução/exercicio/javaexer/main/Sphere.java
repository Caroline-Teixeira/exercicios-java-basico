public class Sphere implements Formula{

    private double radius;

    // construtor da classe Sphere
    public Sphere(double radius) {
        this.radius = radius;
    }
   
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // metodo para calcular a área da esfera
    @Override
    public double calculateArea() {
        
        if (radius < 0) {
            throw new IllegalArgumentException("Raio não pode ser negativo");
        }
        return 4 * Math.PI * radius * radius;
    }



}
