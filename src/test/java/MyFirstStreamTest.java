import org.junit.Test;

import static org.junit.Assert.*;

public class MyFirstStreamTest {

    @Test
    public void cpuLoadTest(){
        MyFirstStream classUnderTest = new MyFirstStream();
        classUnderTest.endlessStream();
    }

    @Test
    public void calclatePiTest(){
        MyFirstStream classUnderTest = new MyFirstStream();
        classUnderTest.sequencePi();
    }

}