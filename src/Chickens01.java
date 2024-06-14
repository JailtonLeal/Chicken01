public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken=4;
        int chickenCout=8; 
        int totalEggs;
        
        totalEggs= eggsPerChicken * chickenCout;//32
        System.out.println(totalEggs);
        chickenCout++;
        totalEggs+=eggsPerChicken*chickenCout;//68
        System.out.println(totalEggs);
        chickenCout = chickenCout/2; //4.5
        totalEggs+= eggsPerChicken*chickenCout;//84
         System.out.println(totalEggs);
        
    }   
}
