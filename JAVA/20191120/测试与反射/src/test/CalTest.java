package test;

import com.Cal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalTest {

    @Before
    public void before(){
        System.out.println("begin");
    }

    @Test
    public void testAdd(){
        System.out.println(new Cal().add(8,7));
    }

}
