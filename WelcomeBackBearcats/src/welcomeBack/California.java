
package welcomeBack;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class California {
    
    String place;
    String houseAddress;
    String placeOfWork;
    double pay;
    int hoursWorked;
    
    public California(String place,String houseAddress,String placeOfWork,double pay,int hoursWorked){
        this.place = place;
        this.houseAddress = houseAddress;
        this.placeOfWork = placeOfWork;
        this.pay = pay;
        this.hoursWorked = hoursWorked;
    }
    
    public String getPlace(){
        return place;
    }

    public String getHouseAddress() {
        return houseAddress;
    }
    
    public String getPlaceOfWork(){
        return placeOfWork;
    }
    
    public double getPay(){
        return pay;
    }
    
    public int getHoursWorked(){
        return hoursWorked;
    }
    
    public void setPlace(String place){
        this.place = place;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public double totalAmount(double pay,int hours){
        double totalAmount = pay*hours;
        return totalAmount;
    }
    
    @Override
    public String toString(){
        return "Place : "+place+"\nHouseAddress : "+houseAddress+"\nPlaceOfWork : "+placeOfWork+"\nPay : "+pay+"\nhoursWorked : "+hoursWorked;
    } 
}
