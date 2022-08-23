import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



    }

}
//        Staff s=new Staff("abdul","jd","a",50000);
//        System.out.println(s);
//        Student student=new Student("efwsfe","ert","jhf",4312,431);
//        System.out.println(student);

/*
zoo animal= new zoo("zaha",3,'f');

        System.out.println(animal.pr());
 */
/*
public class zoo {
    private String name;
    private int age;
    private char gender;

    public zoo(String name,int age,char gender) {
        this.name=name;
        this.gender=gender;
        this.age=age;

    }
    public void setName(String name)
    {
        this.name= name;

    }
    public String getName()
    {
        return this.name;
    }
    public void setAge(int age){
        this.age= age;

    }
    public int getAge (){
        return this.age;
    }
    public void setGender(){
        this.gender=gender;
    }
    public char getGender(){
        return this.gender;
    }
    public String pr(){
        return name+" "+age+" "+gender;

    }
}

  /*
        Scanner sc = new Scanner(System.in);
           calc();

    }
    public static void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("press any number to start ");
        for (int i =sc.nextInt(); i !=0;) {

            System.out.println("print the first number");
            int m1 = sc.nextInt();
            System.out.println("print the second number");
            int m2 = sc.nextInt();
            System.out.println("please enter the symbol   +,-,*,/");
            char y = sc.next().charAt(0);
            if(y == '+'){
                System.out.println(m1+m2);

            } else if (y== '-') {
                System.out.println(m1-m2);

            } else if (y == '*') {
                System.out.println(m1*m2);

            } else if ( y == '/') {
                System.out.println(m1/m2);

            }
            else{
                System.out.println("invaild");
            }
            System.out.println("if u want to exit choose 0");
            i= sc.nextInt();

        }

*/

/*
printkha("dsdfdsf");
    public static void printkha(String n){
        for (int i = 0; i < 10; i++) {
            System.out.println(n);

        }
    }

     */
 /*
        System.out.println("please enter your size");
        int size= sc.nextInt();
        int[] exercise=new int[size];
        for (int i = 0; i < exercise.length; i++) {
            System.out.println("please enter the number at index "+i);
            exercise[i]= sc.nextInt();
            System.out.println("the number you entered at index "+
                    i+" is: "+exercise[i]);
        }
        int sum2=0;
        for (int i = 0; i < exercise.length ; i++) {
            sum2 =sum2+ exercise[i];
        }
        System.out.println("the sum is "+sum2);
        double avg2=sum2/exercise.length;
        System.out.println("the avg is "+avg2);


*/

 /*
        int[] arr = {2, 4, 3, 7};
        int in = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == in) {
                System.out.println("it's here");
                break;
            }
            else{

                System.out.println("not found");
            }



        }
        */

      /*
        int[] arr= {2,3,4,4};
        int sum= 0;

        for (int i = 0; i < arr.length ; i++) {
            sum= sum+ arr[i];



        }

        System.out.println(sum/ arr.length);

*/
    /*
        int[] numb ={2,4,5,3};
        int sum =0;

        for (int i = 0; i < numb.length; i++) {
            sum = sum + numb[i];
        }
        System.out.println(sum);

*/
        /*
        int[] arr={23,342,234,24};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        String name="abdul";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.println(name.charAt(i));

        }
        int name1=sc.nextInt();
        int name2=sc.nextInt();
        int[] arrr ={name2,name1};
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);

        }
        String nm=sc.next();
        String nmm=sc.next();
        String[] aee={nm,nmm};
        for (int i = 0; i < aee.length ; i++) {
            System.out.println(aee[i]);

        }
        */

/*
        Scanner scan = new Scanner(System.in);
        System.out.println("choose:");
        String role = scan.next().toLowerCase();

        if (role.equals("admin")) {
            System.out.println("you are admin");
        } else if (role.equals("superuser")) {
            System.out.println("you are superuser");
        } else if (role.equals("user")) {
            System.out.println("you are user");

        } else {
            System.out.println("invaild");
        }

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + 1);
            }


        }
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else {
                System.out.println(i);
            }


        }
        */

/*
        for(int i=0; i<20; i ++) {
            if (i==9 || i==10) {
                System.out.println("con");

                break;

            }

           System.out.println(i);

        }
        System.out.println("-----------------------------");
for (int j=0; j<20; j++){
    if (j==10){

        System.out.println(j);
        break;
    }
    System.out.println(j);
}
*/

   /*     double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char ope = scanner.next().charAt(0);

        double output;
        switch (ope){
            case '+':
            output = num1 + num2;
                System.out.println(output);
            break;
            default:
                System.out.println("You have entered wrong operator");
                return;

           */

        /* Scanner scan = new Scanner(System.in);
        String operation = scan.next();
        int varible1= scan.nextInt();
        int varible2= scan.nextInt();
        System.out.println("Choose an operation: +, -, *, or /");

        System.out.println("Enter first number");
        varible1 = scan.nextInt();

        System.out.println("Enter second number");
        varible2 = scan.nextInt();
        if
/*


        /*Scanner scan=new Scanner(System.in);
            System.out.println("enter the number");
        int varible1=scan.nextInt();
        System.out.println("your number: " + +varible1);
        */

       /* int number1=5;
        double age=10.16;
        float float1=20.1022f;
        boolean boolean1=true;
        char symbol1='!';
        String name="abdul";
        String lastname=" alroumi";
        String full=name+lastname;
        System.out.println(full);
*/
