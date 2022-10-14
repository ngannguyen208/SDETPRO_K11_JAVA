package lab_10;

public abstract class Animal {

   private String name;
   int speed;

   public Animal() {
   }

   public Animal(String name, int speed) {
      this.name = name;
      this.speed = speed;
   }

   public abstract String getName();

   public abstract int getSpeed();

   public String getAnimalInfo() {
      return "Name: " + getName() + " & Speed: " + getSpeed();
   }

   @Override
   public String toString() {
      return "Animal{" +
              "name='" + name + '\'' +
              ", speed=" + speed +
              '}';
   }

}
