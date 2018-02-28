public class Bicycle{
  public static int wheel = 2;
  public string brand;
  public double mass;
  public double speed;
  
  public Bicycle(){
    this.brand = "";
    this.mass = 30.5;
    this.speed = 20.0;}
  
  public void accelerate(){
    speed += 3;}
  
  public Bicycle(int wheel, string brand, double mass){
  this.brand = brand;
  this.mass = mass;
  this.speed = speed;
  }
  
