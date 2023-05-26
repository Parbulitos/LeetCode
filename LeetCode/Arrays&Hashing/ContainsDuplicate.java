import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set target = new HashSet();
        for(int i = 0; i < nums.length; i++){
            target.add(nums[i]);
        }        
        if(target.size() < nums.length){
            return true;
        }
        return false;
    }
}