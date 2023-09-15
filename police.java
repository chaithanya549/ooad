

/**
 * Class Admin
 */
public class Admin {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Admin () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

}



/**
 * Class police
 */
public class police {

  //
  // Fields
  //

  public String station_name;
  private String area;
  
  //
  // Constructors
  //
  public police () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of station_name
   * @param newVar the new value of station_name
   */
  public void setStation_name (String newVar) {
    station_name = newVar;
  }

  /**
   * Get the value of station_name
   * @return the value of station_name
   */
  public String getStation_name () {
    return station_name;
  }

  /**
   * Set the value of area
   * @param newVar the new value of area
   */
  private void setArea (String newVar) {
    area = newVar;
  }

  /**
   * Get the value of area
   * @return the value of area
   */
  private String getArea () {
    return area;
  }

  //
  // Other methods
  //

  /**
   */
  public void verify()
  {
  }


  /**
   */
  public void grant()
  {
  }


}
