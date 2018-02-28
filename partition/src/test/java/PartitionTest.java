import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class PartitionTest {

    public static List<Integer> listInput= new ArrayList<Integer>(){{
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);
    }};

    private static final Logger LOGGER = Logger.getLogger("PartitionTest");

    @Test
    public void checkNegativeListSizeTest() {
        LOGGER.info("Accessing checkNegativeListSizeTest");
        int size = -1;
        assertFalse(Partition.checkListSize(size));
    }

    @Test
    public void checkZeroListSizeTest() {
        LOGGER.info("Accessing checkZeroListSizeTest");
        int size = 0;
        assertFalse(Partition.checkListSize(size));
    }

    @Test
    public void checkPositiveListSizeTest() {
        LOGGER.info("Accessing checkPositiveListSizeTest");
        int size = 3;
        assertTrue(Partition.checkListSize(size));
    }

    @Test
    public void partitionTestCaseSizeOne() {
        LOGGER.info("Accessing partitionTestCaseSizeOne");
        int listSize = 1;

        List<List<Integer>> reloadedList = new ArrayList<List<Integer>>();

        ArrayList<Integer> partielList1 = new ArrayList<Integer>();
        partielList1.add(1);
        reloadedList.add(partielList1);

        ArrayList<Integer> partielList2 = new ArrayList<Integer>();
        partielList2.add(2);
        reloadedList.add(partielList2);

        ArrayList<Integer> partielList3 = new ArrayList<Integer>();
        partielList3.add(3);
        reloadedList.add(partielList3);

        ArrayList<Integer> partielList4 = new ArrayList<Integer>();
        partielList4.add(4);
        reloadedList.add(partielList4);

        ArrayList<Integer> partielList5 = new ArrayList<Integer>();
        partielList5.add(5);
        reloadedList.add(partielList5);

        ArrayList<Integer> partielList6 = new ArrayList<Integer>();
        partielList6.add(6);
        reloadedList.add(partielList6);

        ArrayList<Integer> partielList7 = new ArrayList<Integer>();
        partielList7.add(7);
        reloadedList.add(partielList7);

        assertEquals(Partition.getListPartition(listInput,listSize),reloadedList);
    }

    @Test
    public void partitionTestCaseSizeTwo() {
        LOGGER.info("Accessing partitionTestCaseSizeTwo");
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
        partielList3.add(6);
        reloadedList.add(partielList3);

        ArrayList<Integer> partielList4 = new ArrayList<Integer>();
        partielList4.add(7);
        reloadedList.add(partielList4);

        assertEquals(Partition.getListPartition(listInput,listSize),reloadedList);
    }

    @Test
    public void partitionTestCaseSizeThree() {
        LOGGER.info("Accessing partitionTestCaseSizeThree");
        int listSize = 3;

        List<List<Integer>> reloadedList = new ArrayList<List<Integer>>();

        ArrayList<Integer> partielList1 = new ArrayList<Integer>();
        partielList1.add(1);
        partielList1.add(2);
        partielList1.add(3);
        reloadedList.add(partielList1);

        ArrayList<Integer> partielList2 = new ArrayList<Integer>();
        partielList2.add(4);
        partielList2.add(5);
        partielList2.add(6);

        reloadedList.add(partielList2);

        ArrayList<Integer> partielList3 = new ArrayList<Integer>();
        partielList3.add(7);
        reloadedList.add(partielList3);

        assertEquals(Partition.getListPartition(listInput,listSize),reloadedList);
    }

    @Test
    public void partitionTestCaseSizeFour() {
        LOGGER.info("Accessing partitionTestCaseSizeFour");
        int listSize = 4;

        List<List<Integer>> reloadedList = new ArrayList<List<Integer>>();

        ArrayList<Integer> partielList1 = new ArrayList<Integer>();
        partielList1.add(1);
        partielList1.add(2);
        partielList1.add(3);
        partielList1.add(4);
        reloadedList.add(partielList1);

        ArrayList<Integer> partielList2 = new ArrayList<Integer>();
        partielList2.add(5);
        partielList2.add(6);
        partielList2.add(7);
        reloadedList.add(partielList2);

        assertEquals(Partition.getListPartition(listInput,listSize),reloadedList);
    }
}
