package StructuralDecorator.Decorator;

public class Client {
    public static void main(String[] args) {
      //  Cone cone=new ChocoScoop(null);
        // Choco Cones + Vanilla + Choco + Vanilla + Strawberry

        Cone cone= new Strawberry(new VanillaScoop(new VanillaScoop(new ChocoWafers())));

        System.out.println(cone.getPrice());
        cone.printComposition();
    }
}
