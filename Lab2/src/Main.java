import java.math.BigDecimal;
import java.math.RoundingMode;

void main() {
    //double productCost = 9.99;
    //double vatRate = 0.05;

    BigDecimal productCost = new BigDecimal("9.99");
    BigDecimal vatRate = new BigDecimal("0.05");

    BigDecimal vatValue = productCost.multiply(vatRate);
    System.out.println("VAT for the first unit: " + vatValue);

    for (int i = 1; i <= 10000; i++){
        break;
    }
}

double randomDouble() {
    double min = 4.99;
    double max = 14.99;
    return min + Math.random() * (max - min);
}
