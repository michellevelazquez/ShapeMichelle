public class square {
    private float lado;

    public double getArea(){
        return lado * lado;
    }

    public double getPerimeter(){
        return lado * 4;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}
