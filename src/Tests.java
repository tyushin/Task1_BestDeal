import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Tests {

    private List<Integer> array1 = new ArrayList<>(Arrays.asList(9,3,4,7,1,2,6,5,8,1,2));
    private List<Integer> array2 = new ArrayList<>(Arrays.asList(5,6,1,2,3));
    private List<Integer> array3 = new ArrayList<>(Arrays.asList(1,1,1));
    private List<Integer> array4 = new ArrayList<>(Arrays.asList(7,5,2,1));

    private Subarray example1 = new Subarray(array1);
    private Subarray example2 = new Subarray(array2);
    private Subarray example3 = new Subarray(array3);
    private Subarray example4 = new Subarray(array4);

    @Test
    public void bestDeal1(){
        assertEquals(7, example1.findBestDeal());
    }

    @Test
    public void bestDeal2(){
        assertEquals(2, example2.findBestDeal());
    }

    @Test
    public void bestDeal3(){
        assertEquals(0, example3.findBestDeal());
    }

    @Test
    public void bestDeal4(){
        assertEquals(-1, example4.findBestDeal());
    }
}
