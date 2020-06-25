import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<frend> ar=new ArrayList<frend>();
        ar.add(new frend("radwan",24));
        ar.add(new frend("ahmed",50));
        ar.add(new frend("ibrahim",34));
        ar.add(new frend("fozia",19));
   // هنا قمنا بإستدعاء دالة sort من  اجل ترتيب
    Collections.sort(ar);
        
        //هنا نطبع ar
        for(frend fr:ar){
            System.out.println(fr.name);
            System.out.println(fr.age);
            
        }
        
	}
    
}



class frend implements Comparable<frend>
{
    String name;
    int age;
    public frend( String name,int age){
        this.name=name;
        this.age=age;
        
    }

    //هده اادالة تقوم بتحديد العنصر الدي سيتم ترتبيه
    @Override
    public int compareTo(frend p1){
 // p1.age-this.age;  من اجل ترتيب تصاعديا ضع هدة الكود 
    return this.age-p1.age;
    }
    
    

    
}
