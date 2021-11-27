class Operadores{
    public static void main (String ... args){
        //Preincremento en 1
        int a = 0;
        ++a;
        System.out.println(a);

        //Post incremento
        int b = 0;
        b++;
        System.out.println(b);

        //Pre incremento vs post incremento
        int c = 3;
        int d = 2;
        int e = c * ++d;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        int m = 3;
        int n = 2;
        int o = m * n++;

        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
   

    }
}