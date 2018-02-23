import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;

/**
 * Created By SAIF Ed GHRAB on 24/02/2018
 */

public class PartitionTest {

    private int[] listInput = new int[]{1, 2, 3, 4, 5};

    private static final Logger LOGGER = Logger.getLogger("PartitionTest");

    @Test
    public void testPartition(){
        LOGGER.info("Accessing testPartition");
        int listSize = 2;

        List<List<Integer>> reloadedList = new ArrayList<List<Integer>>();

        ArrayList<Integer> partielList1 = new ArrayList<Integer>();
        partielList1.add(1);
        partielList1.add(2);
        reloadedList.add(partielList1);

        ArrayList<Integer> partielList2 = new ArrayList<Integer>();
        partielList2.add(3);
        partielList2.add(4);
        reloadedList.add(partielList2);

        ArrayList<Integer> partielList3 = new ArrayList<Integer>();
        partielList3.add(5);
        reloadedList.add(partielList3);

        assertEquals(Partition.getListPartition(listInput,listSize),reloadedList);
    }
}
