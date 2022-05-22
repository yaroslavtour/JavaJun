public class Rect {
    double length;
    double width;

    void setDimensions(double lenght, double widght) {
        this.length = lenght;
        this.width = widght;
    }

    double perim() {
        return (length + width) * 2;
    }

    double sqrt() {
        return length * width;
    }
}
