class Rational {

    private double numerator, denominator;

    public Rational() {

        numerator = 0;
        denominator = 1;
    }

    public Rational(double num, double den) {

        numerator = num;
        denominator = den;
    }

    public void display() {

        System.out.println(numerator + " / " + denominator);
    }

    private Rational simplify(double numer, double denomer) {

        double num = numer, den = denomer;

        while (den != 0) {

            double temp = den;
            den = num % den;
            num = temp;
        }

        numer /= num;
        denomer /= num;

        return new Rational(numer, denomer);
    }

    public Rational add(Rational number) {

        double tempnum, tempden;

        tempnum = (numerator * number.denominator) + (number.numerator * denominator);
        tempden = denominator * number.denominator;

        return simplify(tempnum, tempden);
    }

    public Rational sub(Rational number) {

        double tempnum, tempden;

        tempnum = (numerator * number.denominator) - (number.numerator * denominator);
        tempden = denominator * number.denominator;

        return simplify(tempnum, tempden);
    }

    public Rational mul(Rational number) {

        double tempnum, tempden;

        tempnum = numerator * number.numerator;
        tempden = denominator * number.denominator;

        return simplify(tempnum, tempden);
    }

    public Rational div(Rational number) {

        double tempnum, tempden;

        tempnum = numerator * number.denominator;
        tempden = denominator * number.numerator;

        return simplify(tempnum, tempden);
    }
}

public class RationalDemo {

    public static void main(String[] args) {

        Rational frac1 = new Rational(4, 5), frac2 = new Rational(3, 4);

        frac1.add(frac2).display();
        frac1.sub(frac2).display();
        frac1.mul(frac2).display();
        frac1.div(frac2).display();
    }
}
