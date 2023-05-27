import java.util.ArrayList;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> response = new ArrayList<List<String>>();
        if(strs.length == 1){
            List<String> res = new ArrayList<String>();
            res.add(strs[0]);
            response.add(res);
            return response;
        }
        return null;
    }
}
