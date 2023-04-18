public class RewardValue {

    private double cash = 0;
    private int miles = 0;

    public RewardValue(int milesValue){
        this.miles = milesValue;
        this.cash = milesValue * 0.0035;
    };

    public RewardValue(double cashValue){
        this.cash = cashValue;
        this.miles = (int) (cashValue / 0.0035);
    };

    public double getCashValue(){
        return this.cash;
    }

    public double getMilesValue(){
        return this.miles;
    }

}
