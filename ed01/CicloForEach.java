class CicloForEach{
    public static void main(String ...args){
        //foreach funciona para recorrer arrays
        //for(variable_temporal : array)

        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
        String[] nombres = new String[]{"Carlos", "Beto", "Fiorella", "Gabriel", "Barbara"};

        for(int item : numbers){
            System.out.println(item);
        }

        for(String item : nombres){
            System.out.println(item);
        }
    }
}