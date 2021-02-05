public class First {
    public static void main(String[] args){
        //System.out.println(args.length);
        int[] numberArray = new int[5];
        int[] numberArray2[] = new int[5];

        String[] stringArray = new String[5];
        String[] greetingsArray =new String[] {"Hello", "World", "!"};

        String name="Kirke";
        int year = 2021;

        //primitiivtüübid
        int myInt= Integer.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
        byte bait = Byte.MAX_VALUE;
        short myShort = Short.MAX_VALUE;
        double doubleNumber = 3.4;
        float floatNumber = 3.4f;
        boolean flag = true; // false
        char character = 'F';

        //for tsükkel
        for (int i = 0; i < greetingsArray.length; i++){ //args greetingsarray asemel
            System.out.println(greetingsArray[i]);//args greetingsarray asemel
        }

        //foreach tsükkel
        for(String text : greetingsArray){
            System.out.println(text);
        }

        //while tsükkel
        int length = greetingsArray.length; //args greetingsarray asemel
        while(length > 0){
            length--;
            System.out.println("Inside while");
        }

        if(year== 2021){
            System.out.println(year + "is equal to 2021");
        }else if (year > 2021){
            System.out.println(year + "is equal to 2021");
        }else{
            System.out.println(year + "is equal to 2021");
        }

        System.out.println("Hello world");
        System.out.println("Test one");
        System.out.println("Test two");
        System.out.println("\n");

        //String hello ="hello world!";
    }
}
// function main(args){}
//main tab 
//sysout tab ->

//javac First.java
//java 
