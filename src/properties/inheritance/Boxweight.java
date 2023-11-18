package properties.inheritance;

public class Boxweight extends Box{

    double weight;

    public Boxweight() {
        this.weight = -1;
    }


    public Boxweight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    Box box5 = new Boxweight(2, 3, 4,8);

    Boxweight(Boxweight other) {
        super(other);
        this.weight = other.weight;
    }

    public Boxweight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    // there are many variable in both parent and child classes
    // you are given access to variables tha are in ref type i.e BOxweight
    // hence you should hace access to weight variable
     // this also means that the ones you are try to access should
    // be initialised
    // but here, when the obj itself is of type parent class, how wil you call the

}
