import java.util.*;

public class main {
    static  void month(int month)
    {
        String[] name_of_month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] day_in_month = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Result #1: "+name_of_month[month-1]+" has " + day_in_month[month-1]+"days");
    }

    static void ten_num(int[] num)
    {
        boolean TF=true;
        int res;
        for (int i=0; i<5; i++)
        {
            if(num[i]<0)
            {
                TF=false;
            }
        }
        if(TF == true)
        {
            res=num[0]+num[1]+num[2]+num[3]+num[4];
        }
        else
        {
            res=num[5]*num[6]*num[7]*num[8]*num[9];
        }
        System.out.println("Result #2: "+ res);
    }

    static void five_num(int[] num)
    {
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<5; i++)
        {
            arr.add(num[i]);
        }
        int min = Collections.min(arr);
        int position1 = arr.indexOf(min);
        System.out.println("Result #3.1: min number = "+min+" on position: "+ (position1+1));
        int k=0;
        int i=0;
        int temp=0;
        do
        {
            if(num[i]>0)
                {
                    k++;
                    temp=num[i];
                }
            i++;
        }while (k<2);
        int position2 = arr.indexOf(temp);
        System.out.println("Result #3.2: second pos number = "+temp+" on position: "+ (position2+1));
    }

    static void until_first_negative (int[] num, int k)
    {
        int res=1;
        for (int i=0; i<k; i++)
        {
            if (num[i]%2==0)
            {
                res*=num[i];
            }
        }
        System.out.println("Result #4: "+ res);
    }



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ///#1
        System.out.print("Input number of month: ");
        month(Integer.parseInt(scanner.nextLine()));
        ///#2
        int[] ten_num = new int[10];
        System.out.println("Input 10 numbers: ");
        for (int i=0; i<10; i++)
        {
            System.out.print((i+1)+" = ");
            ten_num[i]=Integer.parseInt(scanner.nextLine());
        }
        ten_num(ten_num);
        ///#3
        int[] five_num = new int[5];
        System.out.println("Input 5 numbers: ");
        for (int i=0; i<5; i++)
        {
            System.out.print((i+1)+" = ");
            five_num[i]=Integer.parseInt(scanner.nextLine());
        }
        five_num(five_num);
        ///#4
        int[] nums = new int[101];
        int k=0;
        int temp = 0;
        System.out.println("Input numbers: ");
        for (int i=0; i<99; i++)
        {
            System.out.print((i+1)+" = ");
            temp=Integer.parseInt(scanner.nextLine());
            if(temp>0)
            {
                k++;
                nums[i]=temp;
            }
            else
                break;
        }
        until_first_negative(nums,k);
        ///#5
        Car Ferrari  = new Car("Ferrari ",1998,6.58f);
        Ferrari.displayInto();
        Car Bugatti = new Car("Bugatti",2001,5.6f);
        Bugatti.displayInto();
        Car Mercedes = new Car("Mercedes",2012,8.2f);
        Mercedes.displayInto();

        scanner.close();
    }
}

class Car{
    String brand;
    int year;
    float engine_capacity;

    Car(String brand, int year, float engine_capacity){
        this.brand = brand;
        this.year = year;
        this.engine_capacity = engine_capacity;
    }

    void displayInto(){
        System.out.println("Name: "+ brand + "\tYear: "+ year + "\tEngine Capacity: " + engine_capacity);
    }
}