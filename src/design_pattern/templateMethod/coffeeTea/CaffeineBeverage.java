package design_pattern.templateMethod.coffeeTea;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

     abstract void addCondiments();
     abstract void brew();

      void pourInCup(){
          System.out.println("Pour in cup");
      }
      void boilWater(){
          System.out.println("Boil water");
      }
}
