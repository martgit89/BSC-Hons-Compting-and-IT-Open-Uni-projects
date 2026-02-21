
/**
 * This Javascript program is to calculate the price and labour costs in £.
 * to fit a new carpet per square meter per postcode
 * @author (Martyn Shirley,) 
 * @version (V1 12/12/19)
 */

public class CarpetCostEstimator
/**
 * Instance variable declaration for price, labourCharge, and postCode.
 */

{
  public double price;
  public double labourCharge;
  public String postCode;

  /**
   * Constructor for CarpetCostEstimator to take a single double argument.
   * To set the instance variable labourCharge to the value of this argument.
   * Whilst declaring the three instance variables and their types.
   */
 public CarpetCostEstimator(String aPrice, String aPostcode, double aFittingCost){
  {
    this.price = 33.40;
    this.labourCharge = 15.45;
    this.postCode = "YO304US";
}
}

/**
 * Getter method for price as a double.
 */
public double getPrice()
{
   return this.price;
}
/**
 * Setter method for price as a double.
 */
public double setPrice()
{
   return this.price = 33.40 * 2;
}

/**
 * Getter method for labour charge as a double.
 */
public double getLabourCharge()
{
   return this.labourCharge;
}
/**
 * Setter method for labour charge as a double.
 */
public double setLabourCharge()
{
   return this.labourCharge = 15.45 * 2;
}

/**
 * Getter method for postcode as a string.
 */
public String getPostCode()
{
   return this.postCode;
}
/**
 * Setter method for postcode as a string.
 */
public String setPostCode()
{
   return this.postCode = "YO304US";
}

/**
 * Calculate the carpet cost in width and length per meter, returning the cost as a double, and multiplying by the price
 */
public class calculateCarpetCost {
   private double length;
   private double width;
   private double price;

   public calculateCarpetCost(double length, double width, double price) {
   super();
   this.length = length;
   this.width = width;
   this.price = price;

}
public double getLength() {
   return length;
}
public double getWidth() {
   return width; 
}
public double getArea() {
   return length * width;
}
public double getPrice() {
   return length * width + price;
}
   public String toString() {
   return "calculateCarpetCost [length=" + ", width=" + width + ", price=" + price +"]";
}
}

/**
 * Calculate the fitting cost in width and length per meter, returning the cost as a double, and multiplying by the fitting cost price.
 */
public class calculateFittingCost {
   private double length;
   private double width;
   private double fittingCost;
   
   public calculateFittingCost(double length, double width, double fittingCost) {
      super();
      this.length = length;
      this.width = width;
      this.fittingCost = fittingCost;
   
}
public double getLength() {
   return length; 
}
public double getWidth() {
   return width;
}
public double getArea() {
   return length * width;
}
public double getFittingCost() {
   return length * width + fittingCost;
}
public String toString() {
   return "calculateFittingCost [length=" + ", width=" + width + ", fittingCost=" + fittingCost +"]";
}
}  
}


 