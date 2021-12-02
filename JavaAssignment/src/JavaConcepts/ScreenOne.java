/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaConcepts;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class ScreenOne extends MovieTheater implements Runnable{
    
    private final double ticketPrice = 12.5;
    private int members;
    private final int seatingCapacity = 55;
    
    /**
     * Constructor for AvengersInfinityWar class
     * @param theaterName - depicts theater name 
     * @param movieName - depicts movie name  
     * @param members - depicts number of people visiting from a family
     */
    public ScreenOne(String theaterName, String movieName,int members){
        super(theaterName,movieName);
        this.members = members;
    }
    
    @Override
    public String getTheatername(){
        return theaterName;
    }
    
    @Override
    public String getMoviename(){
        return movieName;
    }
    
    public int getSeatingcapacity(){
        return seatingCapacity;
    }
    
    public double getTicketPrice(){
        return ticketPrice;
    }
    
    public int getMembers(){
        return members;
    }
    
    /**
     * Method which returns Total ticket price 
     * @param ticketPrice - double
     * @param members - int
     * @return - double finalPrice
     */
    public double getTotalticketPrice(double ticketPrice,int members){
        double finalPrice = ticketPrice * members;
        return finalPrice;
    }
    
    /**
     * Method which returns enumerated value
     * @return - showDay
     */
    public DaysOfWeek getShowday(){
        DaysOfWeek showDay = DaysOfWeek.SATURDAY;
        return showDay;
    }
    

    @Override
    public String toString() {
        return (super.toString() + ",\nTicket Price for one unit is : " + ticketPrice + ",\nSeating capacity of screen is : "+seatingCapacity 
                +",\nNo of people going to visit theatre from a family is : " + members+ ",\nTicket price for "+members+" people is : "+getTotalticketPrice(ticketPrice, members)+"$"
                +",\nShow day for "+movieName+" is : "+getShowday());
    }
    
    @Override
    public void run(){
        System.out.println("Theatre name : "+this.getTheatername()+"\n"+"Movie Name : "+this.getMoviename()
                +"\n"+"Seating Capacity : "+this.getSeatingcapacity()+"\n"+"No of members : "+this.getMembers()
                +"\n"+"Show day : "+this.getShowday());
    }
    
    
}
