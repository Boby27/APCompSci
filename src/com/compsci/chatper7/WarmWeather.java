// Chapter 7 Question 15
public class WarmWeather{
  
  public static void main(String[] args){
    boolean warm = true;
    if(location.isNorthPole() || location.isSouthPole())
      {
        warm = false;
      } 
    else if (time.getMonth()==4 || time.getMonth()==10)
      {
        if (!weather.isSunny())
          {
            warm = false;
          }
      }
    else if (location.isNorthernHemisphere())
      {
        if(time.getMonth() < 5 || time.getMonth() > 9) 
          {
            warm=false;
          }
      }
    else if(location.isSouthernHemisphere())
      {
        if(time.getMonth()< 11 && time.getMonth() > 3)
          {
            warm = false;
          }
      }
    boolean test = 
  }
}