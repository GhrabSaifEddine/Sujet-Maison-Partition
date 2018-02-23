import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created By SAIF Ed GHRAB on 24/02/2018
 */

public class PartitionService {

    private static final Logger LOGGER = Logger.getLogger("PartitionService");


    public static List<List<Integer>> partition(int[] listInput, int listSize) {
        List<List<Integer>> reloadedList = new ArrayList<List<Integer>>();
        if (checkListSize(listSize)) {
            int accessCounter = 0;
            int listInputCounter = 0;
            float nbrAccesWithPrecision = ((float) listInput.length) / ((float) listSize);
            int nbrAcces = listInput.length / listSize;
            if (nbrAccesWithPrecision > ((float) nbrAcces)) {
                nbrAcces++;
            }
            while (accessCounter < nbrAcces) {
                List<Integer> partielList = new ArrayList<Integer>();
                int partielListCounter = 0;
                while (listInputCounter < listInput.length && partielListCounter < listSize) {
                    partielList.add((listInput[listInputCounter]));
                    listInputCounter++;
                    partielListCounter++;
                }
                reloadedList.add(partielList);
                accessCounter++;
            }
        }
        return reloadedList;
    }

    public static boolean checkListSize(int size) {
        if (size <= 0) {
            LOGGER.warning(PartitionConstants.INVALID_SIZE);
            return false;
        }
        return true;
    }
}
