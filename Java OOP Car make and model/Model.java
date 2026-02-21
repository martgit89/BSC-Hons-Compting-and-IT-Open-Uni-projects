
/**
 * The model class model have attributes representing the title "ford" for example
 * the year of manufacture, and whether or not the stig is required.
 * @author (Martyn Shirley, H6867358)
 * (a version number or a date)
 */
public class Model
{
   // instance variables
   public String makeOfVehicle; // a vehicle has a name e.g. "Ford"
   public String yearOfManufacture; // a vehicle has-a year of manufacture, e.g. "2017"
   public int carPower; // the horsepower of the car e.g "1500bhp" as a maximum output
   public Model modelName; // a car has a model e.g "Mustang"
   
   /**
    * Constructor for objects of class Model
    * allowing specification of all the required attributes.
    */
   public Model(String aMake, String aYear, int aPower, Model theModel)
   {
      this.makeOfVehicle = aMake;     
      this.yearOfManufacture = aYear;
      this.carPower = aPower;
      this.modelName = theModel;
   }

    /**
    * Constructor for objects of class Model. 
    */
   public Model(String aMake)
   { 
      this.makeOfVehicle = makeOfVehicle;    
      this.yearOfManufacture = null; //null indicates an unknown year
      this.carPower = 0; //defaults to 0 value
      this.modelName = modelName;
   }
   
    /**
    * Setter for the cars model name.
    * The name is an attribute, 
    * So we have to forward the message
    * to the component object.
    */
    public void setModelName(String aModel)
    {
       this.modelName.setModelName(aModel);       
    }
    
    /**
    * Setter for the power of vehicle.
    */
   public void setCarPower(int aPower)
   {
      this.carPower = aPower;
   }
   
   /**
    * Setter for the vehicles year of manufacture.
    */
   public void setYearofManufacture(String aYear)
   {
      this.yearOfManufacture = aYear;
   }
   
   /**
    * Getter for the title of vehicle.
    */
   public String getMakeOfVehicle()
   {
      return this.makeOfVehicle;
   }
   
   /**
    * Getter for a painting's insured value.
    */
   public int getCarPower()
   {
      return this.carPower;
   }
   
   /**
    * Getter for the model iAmTheStig method.
    * This method displays state-dependent behaviour:
    * The value returned depends on part of the state of the receiver.
    * If the receiver's iAmTheStig is greater than or equal to 1500 true is returned.
    * Otherwise false is returned
    */
   public boolean iAmTheStig()
   {
      return this.getCarPower() >= 1500;
   }
   
   /**
    * Getter for the Vehicle year of manufacture.
    */
   public String getYearOfManufacture()
   {
      if (this.yearOfManufacture == null)
      {
         return "Does not exist";
      }

      return this.yearOfManufacture;
   }

   /**
    * Getter for the model of vehicle name.
    * This method returns a message if the model name 
    * is not known, otherwise returns the artist's name.
    */
   public String getModel()
   {
      if (this.modelName == null || this.modelName.getModel() == null) 
      {
        //no artist or no artist name was set up
         return "Does not exist"; 
      } 
      return this.modelName.getModel();
   }
   
   /**
    * This method returns true if the vehicle was manufactured in or before 2020
    * and otherwise returns false.
    */
   public boolean yearOfManufacture()
   {
      return(Integer.parseInt(this.modelName.getYearOfManufacture()) < 2020);
   }
   
    /**
    * Returns a string of the description 
    */
   public String toString()
   {
      return "Make: " + this.makeOfVehicle + ", Model: " + this.modelName + ", Vehicle power: " + this.getCarPower() + ".";                
   }  
}
