public class BonusMilesService {

    public int calculate(int price) {
        int expenses;
        if (price >= 20) {
            expenses = price / 20;
        } else {
            expenses = 0;
        }
        return expenses;
    }

}
