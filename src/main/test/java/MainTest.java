
import org.junit.Assert;
import org.junit.Test;

public class MainTest extends Main{

   @Test
    public void separateValuesTest(){
       ItemParcel itemParcel = new ItemParcel();


       String adam = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016";

       String[] actual = itemParcel.separateValues(adam);

       String[] expected = {"naMe","Milk","price","3.23","type","Food","expiration","1/25/2016"};
       Assert.assertArrayEquals(actual,expected);

   }

   @Test
    public void separatePoundTest(){
       ItemParcel itemParcel = new ItemParcel();

       String adam = "naMe:Milk;price:3.23;type:Food;expiration:1/25/2016##";

       String[] actual = itemParcel.separatePound(adam);

       String[] expected = {"naMe:Milk;price:3.23;type:Food;expiration:1/25/2016"};

       Assert.assertArrayEquals(actual, expected);
   }

}
