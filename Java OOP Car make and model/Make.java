
/**
 * Make represents the make of vehicle such as Ford
 * And to simplify things we have car name and the year of manufacture e.g. 2017
 * In the context of the make example, this is a component class
 * 
 * @author (Martyn Shirley H6867358) 
 * @version (a version number or a date)
 */
public class Make
{
   // instance variables
   public String makeOfVehicle; // a vehicle has-a name, e.g. "Ford"
   public String yearOfManufacture; // a vehicle has-a year of manufacture, e.g. "2017"
   
   /**
    * zero-argument constructor: if we don’t know the artist’s attributes.    
    */
   public Make()
   {
      this.makeOfVehicle = null; //indicates name of car is unknown
      this.yearOfManufacture = null; //indicates year of manufacture is unknown
   }

   /**
    * Constructor for objects of class Make
    * but not the year of manufacture
    */
   public Make(String aMakeofVehicle)
   {
      this.makeOfVehicle = makeOfVehicle;
      this.yearOfManufacture = null; //indicates year of manufacture is unknown
   }

  /**
    * A constructor for objects of class Make
    * if we know the name of car and year of manufacture.
    */
   public Make(String aMakeOfVehicle, String aYearOfManufacture)
   {
      this.makeOfVehicle = aMakeOfVehicle;
      this.yearOfManufacture = aYearOfManufacture;
   }
   
   /**
    * Setter for an Make of car.
    */
   public void setMakeOfVehicle(String aMakeOfVehicle)
   {
      this.makeOfVehicle = aMakeOfVehicle;
   }
   
   /**
    * Setter for an Makes year of manufacture.
    */
   public void setYearOfManufacture(String aYear)
   {
      this.yearOfManufacture = aYear;
   }
   
    /**
    * Getter for an Make of car. It could
    * return a string such as "unattributed" 
    * if the Makes name is not known, 
    */
   public String getMakeOfVehicle()
   {
      return this.makeOfVehicle;
   }
   
    /**
    * Getter for a vehicle make year of manufacture. 
    */
   public String getYearOfManufacture()
   {
      return this.yearOfManufacture;
   } 
   
   /**
    * Returns a description of this object as a string.
    */
    public String toString()
    {
       return this.makeOfVehicle + "(Year " + this.yearOfManufacture + ")";
    }
}
