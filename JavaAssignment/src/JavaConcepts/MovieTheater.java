/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaConcepts;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public abstract class MovieTheater {
    
    protected String theaterName;
    protected String movieName;
    
    /**
     * Constructor for class MovieTheater which takes String as parameter
     * @param theaterName - which depicts theater name 
     * @param movieName - which depicts movie name 
     */
    public MovieTheater(String theaterName, String movieName){
        this.theaterName = theaterName;
        this.movieName = movieName;
    }
    
    //getters
    
    /**
     * Method which returns Theater Name
     * @return - String 
     */
    public String getTheatername(){
        return theaterName;
    }
    
    /**
     * Method which returns Movie Name
     * @return - String
     */
    public String getMoviename(){
        return movieName;
    }
    
    
    //setters
    
    /**
     * Method which is used to set value for Theater Name
     * @param theaterName 
     */
    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }
    
    /**
     * Method which is used to set value for Movie Name
     * @param movieName 
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

  
    @Override
    public String toString() {
        return "Theatre name is : " + theaterName + ",\nMovie name is : " + movieName;
    }
    
    
    
    
}
