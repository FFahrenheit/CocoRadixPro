package cocoradixpro;

import java.util.ArrayList;

/**
 *
 * @author ivxn
 */
public class Radix 
{
    private ArrayList<Integer> list;
    
    Radix(){};
    
    Radix(ArrayList list)
    {
        this.list = list;
        getOrdered();
    }
    
   private void getOrdered()
   {
       Integer max = list.get(0), exponent = 1; 
       for (int i = 1; i < list.size(); i++) 
       {
           if(max < list.get(i))
           {
               max = list.get(i);
           }
       }
       do
       {
           exponent*=10;
           ArrayList<Integer> temp = new ArrayList<Integer>();
           for (int i = 0; i <=9; i++) 
           {
               for (int j = 0; j < list.size(); j++) 
               {
                   if((list.get(j)%exponent - (list.get(j)%(exponent/10)))/(exponent/10)==i)
                   {
                       temp.add(list.get(j));
                   }
               }
           }
           this.list = temp;
       }while((max%exponent)!=max);
   }
    
    public void print()
    {
        for (int i = 0; i < list.size() ; i++) 
        {
            System.out.println("["+(i+1)+"] -> "+list.get(i));
        }
    }
}
