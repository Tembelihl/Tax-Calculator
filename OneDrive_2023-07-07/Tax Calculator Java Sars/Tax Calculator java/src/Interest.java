
public class Interest {

    public double setInterest(double income) {
        double newValue = 0.0;
        if (income <= 237100) {
            newValue = income * 0.18; // 10 * 0.18 =1.8,   tax = 1.8 +num
            return newValue;
        } else if (income >= 237101 && income <= 370500) {
            newValue = income * 0.26 + 42678;
            return newValue;
        } else if (income >= 370501 && income <= 512800) {
            newValue = income * 0.31 + 77362;
            return newValue;
        } else if (income >= 512801 && income <= 673000) {
            newValue = income * 0.36 + 121475;
            return newValue;
        } else if (income >= 673001 && income <= 857900) {
            newValue = income * 0.39 + 179147;
            return newValue;
        } else if (income >= 857901 && income <= 1817000) {
            newValue = income * 0.41 + 251258;
            return newValue;
        } else if (income >= 1817001) {
            newValue = income * 0.45 + 644489;
            return newValue;
        }
        return newValue;

    }
}
