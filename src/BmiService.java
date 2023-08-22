public class BmiService {

    public int calculate (int weightInkg, double heightInMeters) {
        return (int) (weightInkg / heightInMeters / heightInMeters);
    }
}