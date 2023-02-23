class Main {
    public static void main(String[] args) {
        System.out.println(7 + 7);  // PRINT AND GO TO NEXT LINE OF TEXT
        System.out.println(2*2);

        System.out.print("Hello World ");  // PRINT AND REMAIN IN SAME LINE OF TEXT
        System.out.println(2*2);

        // string num = "22"; syntax error... S - capital
        String num = "22";
        System.out.println(num);
        long l = 1233l;     // l at end of number to specify... as in float
        System.out.println(l);

        char c = 'k';
        // char cc = "k"; if use "" -- string type
        // char ccc = 'kk';     only 1 character allowed
        System.out.println(c);

        int numb = 33 + 2;
        System.out.println(numb);

        double dval = 2.2;      //double is by-default
        float fval = (float) 3.2;  //hv to define float explicitly .. conversion
        float fval1 = 34.2f;    //hv to define float
        System.out.println(dval);
        System.out.println(fval);
        System.out.println(fval1);

        //Literalas

        int lit = 0b101;    //binary number
        int lit1 = 0x7E;    //hexadecimal number
        int lit2 = 10_00_00_000;    // number
        System.out.println(lit + " -- binary");
        System.out.println(lit1 + " -- hexadecimal");
        System.out.println(lit2);

        //Conversion of data type

        float fval3 = 39.22f;
        int int1 =  (int)fval3;
        System.out.println(int1);  // decimal values get lost on converting from float to int

        // Operators

        int int2 = 33;
        // int2 = int2 + 1;
        int2++;     // post-increment **
        //  ++int2;  // pre-increment **
        System.out.println(int2);
        // **
            int rn = 23;
            int result = rn++;  // = 23   value incremented after assigning it to result... hence thats printed
            //int result = ++rn;    // = 24  value incremented before assigning it to result
            System.out.println(result);

        int quot = int2 / 4;
        int rem = int2 % 4;
        System.out.println(quot + " quotient");
        System.out.println(rem + " remainder");

    }

}
