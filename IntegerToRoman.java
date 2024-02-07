class IntegerToRoman{
    public static void main(String[] args) {
        String res="";
        int n=150;
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        res+=(thousands[n / 1000]);
        res+=(hundreds[(n % 1000) / 100]);
        res+=(tens[(n % 100) / 10]);
        res+=(ones[n % 10]);
        System.out.println(res);
    }
}