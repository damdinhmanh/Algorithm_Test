import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//609. Find Duplicate File in System
public class FindDuplicateFileInSystem {
    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for (String path : paths) {
            String[] dir = path.split(" ");
            String rootPath = dir[0];

            for (int i = 1; i < dir.length; i++) {
                int openBracket = dir[i].indexOf("(");
                int closeBracket = dir[i].indexOf(")");

                String fileContent = dir[i].substring(openBracket, closeBracket);

                if (!map.containsKey(fileContent)) {
                    map.put(fileContent, new ArrayList<String>());
                }

                map.get(fileContent).add(rootPath + "/" + dir[i].substring(0, openBracket));
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();

        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                result.add(map.get(key));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"};

        List<List<String>> result = findDuplicate(paths);

        result.forEach(r -> System.out.println(r));
    }
}
