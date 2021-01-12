//Written by JASON YIN
import java.util.ArrayList;
import java.util.Scanner;
public class DataSet {
   private ArrayList<Double> nums = new ArrayList<Double>();
   //Scanner input = new Scanner(System.in);
   public void add(double value){
      nums.add(value);
   }
   public double getAverage(){
      double sum = 0.0;
      for(int i = 0;i<this.nums.size();i++){
        sum += this.nums.get(i);
      }
      return sum/this.nums.size();
   }
   public double getStandardDeviation(){
       double sum = 0.0;
       double avg = this.getAverage();
       for(int i = 0;i<this.nums.size();i++){
            sum+=(this.nums.get(i)-avg) * (this.nums.get(i)-avg);
       }
       return sum/this.nums.size();
   }
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      DataSet data = new DataSet();
      String s = input.nextLine();
      while( !s.equals("stop")){
         //System.out.println(s);
         data.add(Double.parseDouble(s));
         s = input.nextLine();
      }
      /*
      for (int i = 0;i<data.nums.size();i++){
         System.out.println(data.nums.get(i));
      }*/
      System.out.println("Count = "+ data.nums.size());
      System.out.println("Average = "+data.getAverage());
      System.out.println("Standard Deviation = "+data.getStandardDeviation());
   }
}
