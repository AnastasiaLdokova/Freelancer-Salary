public class FreelancerService {
    public int calculate(int income,int expences, int threshold) {
        int money = 0;
        int counter=0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money-=expences;
                money/= 3;
                counter++;

            }else{
               //money = money + income;
               money += income;
               money -=expences;
            }

        }
        return counter;
    }
}
