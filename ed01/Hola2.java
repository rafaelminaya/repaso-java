class Hola2{
    public static void main(String ... args){
        int a = 23;
        int b = 12;
        int r = 4;

        //constante, no puede ser modficiado a futuro
        final int noCambia = 9;
        r = a + b;
        System.out.println(r);
        System.out.println(noCambia);
    }
}