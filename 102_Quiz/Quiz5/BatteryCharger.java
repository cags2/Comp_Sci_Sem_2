public class BatteryCharger{
    private int[] rateTable;
    private int getChargingCost(int startHour, int chargeTime){
        startHour = this.startHour;
        int counter = 0;
        chargeTime = this.chargeTime;
        int[] number = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
        int total = number[startHour];
        while(counter != chargeTime){
             total = total + number[startHour] + 1;
             number[startHour] = number[startHour] + 1;
             counter++;
             if(number.length == number[startHour]){
                 number[startHour] = number[starthour] - 23;
             }
        }
        return total;
    }
    private int getChargeStartTime(int chargeTime){
        chargeTime = this.chargeTime;
        if(chargeTime == 1){
            System.out.println("Starting at 12 and charging it is the best");
        }
        else{
            System.out.println("Starting at hour 22 is the best time to charge");
        }
    }
}