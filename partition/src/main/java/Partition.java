import java.util.List;
import java.util.logging.Logger;

/**
 * Created By SAIF Ed GHRAB on 24/02/2018
 */

public class Partition {

    private static final Logger LOGGER = Logger.getLogger("Partition");

    public static int[] listInput = new int[]{1, 2, 3, 4, 5, 6, 7};

    public static int listSize = 2;

    public static void main(String[] args) {
        List<List<Integer>> reloadedList = getListPartition(listInput, listSize);
    }

    public static List<List<Integer>> getListPartition(int[] listInput, int listSize) {
        List<List<Integer>> reloadedList = PartitionService.partition(listInput, listSize);
        LOGGER.info(PartitionConstants.DISPLAY_MSG + reloadedList.size());
        return reloadedList;
    }
}
