public  record Fraction(int numerator, int denominator) {

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int gcd(int a, int b){
        return b==0 ?a:gcd(b,a% b );
    }

    private Fraction reduce(){
        int gcd = gcd(numerator, denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }


    public Fraction add(Fraction fraction) {

            int newnumerator1=numerator*fraction.denominator;
            int newmerator2=fraction.numerator*denominator;
            return new Fraction((newnumerator1+newmerator2), (fraction.denominator*denominator)).reduce();
    }


}
