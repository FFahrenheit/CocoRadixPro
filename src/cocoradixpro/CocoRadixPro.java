package cocoradixpro;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ivxn
 */
public class CocoRadixPro 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Bienvenido al método Radix. Ingese los elementos y coloque un número menor a 0 para indicar que ha acabado.\nIngrese el elemento: ");
        while((temp = input.nextInt())>0)
        {
            System.out.print("Ingrese el elemento: ");
            list.add(temp);
        }
        Radix radix = new Radix(list);
        radix.print();
    }
}
