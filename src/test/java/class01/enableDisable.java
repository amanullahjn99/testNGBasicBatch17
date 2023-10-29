package class01;

import org.testng.annotations.Test;

public class enableDisable {
    @Test
    public  void Atest(){
        System.out.println("i am first test case");
    }

    @Test
    public  void Btest(){
        System.out.println( "i am the second test case");
    }

//the below enable annotation is used to ignore this case until dev fix or u dont want to run it
@Test(enabled = false)
public  void Ctest(){
    System.out.println( "i am the third test case");
}

}