public class policyHolder 
{

// step 2 creating string method
public String toString() {
   return "Policyholder's First Name: " + FirstName + "\n" +
          "Policyholder's Last Name: " + LastName + "\n" +
          "Policyholder's Age: " + age + "\n" +
          "Policyholder's Smoking Status (Y/N): " + smokingStatus + "\n" +
          "Policyholder's Height: " + height + " inches\n" +
          "Policyholder's Weight: " + weight + " pounds\n" +
          String.format("Policyholder's BMI: %.2f\n", getBMI());
}




 public policyHolder(String fName, String lName,int a, String sStatus, double h, double w)
   {
     
      FirstName = fName;
      LastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
      policyHolderCount++;
      
   }
// defensive
   public policyHolder(policyHolder other) {
   this.FirstName = other.FirstName;
   this.LastName = other.LastName;
   this.age = other.age;
   this.smokingStatus = other.smokingStatus;
   this.height = other.height;
   this.weight = other.weight;
}

   
 //fields
   private String FirstName;
   private String LastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   private static int policyHolderCount = 0; // STATIC COUNTER 

 /**
   @return The Policyholder's first name
   */
   public String getFirstName()
   {
      return FirstName;
   }
   
   /**
   @return The Policyholder's last name
   */
   public String getLastName()
   {
      return LastName;
   }
   
   /**
   @return The Policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   @return The Policyholder's smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   @return The Policyholder's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   @return The Policyholder's weight
   */
   public double getWeight()
   {
      return weight;
   }


 /**
   @param fName The Policy Provider's first name
   */
   public void setFirstName(String fName)
   {
      FirstName = fName;
   }
   
   /**
   @param lName The Policy Provider's last name
   */
   public void setLastName(String lName)
   {
      LastName = lName;
   }
   
   /**
   @param a The Policy Provider's age
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   @param sStatus The Policy Provider's smoking status
   */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   /**
   @param h The Policy Provider's height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
   @param w The Policy Provider's weight
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   /**
   Calculates the Policyholder's BMI
   @return The BMI of the Policyholder
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }


} 
