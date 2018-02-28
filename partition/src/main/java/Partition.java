import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Partition {

    private static final Logger LOGGER = Logger.getLogger("Partition");

    public static List<Integer> listInput= new ArrayList<Integer>();

    public static int listSize = 2;

    public static void main(String[] args) {
        // init list
        for(int i=1;i<9;i++){
            listInput.add(i);
        }
        List<List<Integer>> reloadedList = getListPartition(listInput, listSize);
        LOGGER.info("The final List has the size : "+reloadedList.size());
    }

    public static List<List<Integer>> getListPartition(List<Integer> listInput, int listSize) {
            List<List<Integer>> reloadedList = new ArrayList<List<Integer>>();
            if (checkListSize(listSize)) {
                Integer count=0;
                List<Integer> partielList= new ArrayList<Integer>();
                for(Integer elementList: listInput){
                    if( count==listSize){
                        count=0;
                        reloadedList.add(partielList);
                        partielList= new ArrayList<Integer>();
                    }
                    partielList.add(elementList);
                    count++;
                    if(listInput.indexOf(elementList)==(listInput.size()-1))
                        reloadedList.add(partielList);
                }
            }
        LOGGER.info(PartitionConstants.DISPLAY_MSG + reloadedList.size());
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