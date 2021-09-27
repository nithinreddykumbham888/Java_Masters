/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZooCost.Zoo.Kumbham;

/**
 *
 * @author Nithin Reddy Kumbham
 */
public class ZooCostCalculator {
    private int adventureNumber;
    private int visitorCount;
    private boolean isMember;
    private boolean isFirstTime;
    private boolean hasCoupon;
    private static final double couponSavings_dollars = 3.00;
    private static final double salesTax_percent = 8.50;
    
    /**
     * ZooCostCalculator constructor with parameters
     * @param adventureNumber1
     * @param visitorCount1
     * @param isMember1
     * @param isFirstTime1
     * @param hasCoupon1 
     */
    public ZooCostCalculator(int adventureNumber1,int visitorCount1,boolean isMember1,boolean isFirstTime1,boolean hasCoupon1){
        adventureNumber = adventureNumber1;
        visitorCount = visitorCount1;
        isMember = isMember1;
        isFirstTime = isFirstTime1;
        hasCoupon = hasCoupon1;
    }
    
    @Override
    public String toString(){
        return "Summary:"+"\n"+"ZooCostCalculator{"+"\n"+"adventureNumber="+adventureNumber+","+"\n"+"visitorCount="+visitorCount+","+"\n"+"isMember="+isMember+","+"\n"+"isFirstTime="+isFirstTime+","+"\n"+"hasCoupon="+hasCoupon+"}";
    }
    /**
     * Calculates Baseprice dollars
     * @param adventureNumber1
     * @param visitorCount1
     * @return 
     */
    public double calcBasePrice_dollars(int adventureNumber1,int visitorCount1){
        if(adventureNumber1==1){
            if(visitorCount1==1){
                return 40;
            }
            if(visitorCount1==2){
                return 75;
            }
            if(visitorCount1>2){
                return Math.round((visitorCount1*35.50)*100.0)/100.0;
            }
        }
        if(adventureNumber1==2){
            if(visitorCount1==1){
                return 42;
            }
            if(visitorCount1==2){
                return 77;
            }
            if(visitorCount1>2){
                return Math.round((visitorCount1*37.20)*100.0)/100.0;
            }
        }
        if(adventureNumber1==3){
            if(visitorCount1==1){
                return 48;
            }
            if(visitorCount1==2){
                return 93.22;
            }
            if(visitorCount1>2){
                return Math.round((visitorCount1*42.33)*100.0)/100.0;
            }
        }
        return 0;
    }
    /**
     * Calculates Membership discount
     * @param visitorCount1
     * @return 
     */
    public double calcMemberDiscount_dollars(boolean isMember1,int visitorCount1, int adventureNumber1){
        if(isMember1==true){
        if(visitorCount1==1){
            return Math.round(((4.0/100)*calcBasePrice_dollars(adventureNumber1,visitorCount1))*100.0)/100.0;
        }
        if(visitorCount1==2){
            return Math.round(((5.2/100)*calcBasePrice_dollars(adventureNumber1,visitorCount1))*100.0)/100.0;
        }
        if(visitorCount1>2){
            return Math.round(((7.5/100)*calcBasePrice_dollars(adventureNumber1,visitorCount1))*100.0)/100.0;
        }
    }  
        return 0.0;
    }
    /**
     * Calculates first time discount
     * @param visitorCount1
     * @return 
     */
    public double calcFirstTimeDiscount_dollars(boolean isFirstTime1,int visitorCount1,int adventureNumber1){
        if(isFirstTime1==true){
        if(visitorCount1==1){
          return Math.round((15.0/100)*(calcBasePrice_dollars(adventureNumber1,visitorCount1))*100.0)/100.0;
        }
        if(visitorCount1==2){
          return Math.round((10.0/100)*(calcBasePrice_dollars(adventureNumber1,visitorCount1))*100.0)/100.0;
        }
        if(visitorCount1>2){
          return Math.round((8.0/100)*(calcBasePrice_dollars(adventureNumber1,visitorCount1))*100.0)/100.0;
        }
     }
        return 0.0;
    }
    /**
     * Calculates coupon discount
     * @param hasCoupon1
     * @return 
     */
    public double calcCouponDiscount_dollars(boolean hasCoupon1){
        if(hasCoupon1==true){
            return 3.0;
        }
        return 0.0;
    }
    /**
     * Calculates total price before tax
     * @return 
     */
    public double totalPriceBeforeTax_dollars(int adventureNumber1,int visitorCount1,boolean isMember1, boolean hasCoupon1,boolean isFirstTime1){
         double bPrice = calcBasePrice_dollars(adventureNumber1,visitorCount1);
         double mDiscount = calcMemberDiscount_dollars(isMember1,visitorCount1,adventureNumber1);
         double fDiscount = calcFirstTimeDiscount_dollars(isFirstTime1,visitorCount1,adventureNumber1);
         double cDiscount = calcCouponDiscount_dollars(hasCoupon1);
              return  bPrice-(mDiscount+fDiscount+cDiscount);
    }
    /**
     * Calculates total price after tax
     * @return 
     */
    public double totalPriceAfterTax_dollars(double salesTax_percent1,int adventureNumber1,int visitorCount1,boolean isMember1,boolean hasCoupon1,boolean isFirstTime1){
        double A1 = (salesTax_percent)/100;
        double A2 = A1 * totalPriceBeforeTax_dollars(adventureNumber1,visitorCount1,isMember1,hasCoupon1,isFirstTime1);
        return Math.round((totalPriceBeforeTax_dollars(adventureNumber1,visitorCount1,isMember1,hasCoupon1,isFirstTime1) + A2)*100.0)/100.0;
    }
    /**
     * Prints receipt
     * @return 
     */
    public String printReceipt(){
        return "Receipt"
                +"\n"+"Base Cost for "+visitorCount+" visitors on Adventure "+adventureNumber+": $"
                +calcBasePrice_dollars(adventureNumber,visitorCount)+"\n"+"Membership Discount: $"
                +calcMemberDiscount_dollars(isMember,visitorCount,adventureNumber)+"\n"+"First Time Discount: $"
                +calcFirstTimeDiscount_dollars(isFirstTime,visitorCount,adventureNumber)+"\n"+"Coupon Discount: $"
                +calcCouponDiscount_dollars(hasCoupon)+"\n"+"Charges After Discount: $"+totalPriceBeforeTax_dollars(adventureNumber,visitorCount,isMember,hasCoupon,isFirstTime)
                +"\n"+"Sales Tax: $"+
                Math.round(((salesTax_percent)/100.0 )*totalPriceBeforeTax_dollars(adventureNumber,visitorCount,isMember,hasCoupon,isFirstTime)*100.0)/100.0
                +"\n"+"Total Amount Paid: $"+totalPriceAfterTax_dollars(salesTax_percent,adventureNumber,visitorCount,isMember,hasCoupon,isFirstTime);
    }
}
