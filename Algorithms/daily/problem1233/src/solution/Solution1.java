package Algorithms.daily.problem1233.src.solution;
import java.util.*;

public class Solution1 implements Solution {

    public List<String> removeSubfolders(String[] folder) {
        List<String> paths = new ArrayList<>(Arrays.stream(folder).toList());

        paths.sort(Comparator.comparingInt(this::getDepth));

        List<String> output = new ArrayList<>();

        for (String f: paths) {
            Optional<String> find = output.stream().filter(f::contains).reduce((first, second) -> second);
            if (find.isPresent() && f.startsWith(find.get()) && (f.replace(find.get(), "").startsWith("/"))) {
                continue;
            }
            output.add(f);
        }

        return output;
    }

    private int getDepth(String path) {
        // Split by '/' and count the non-empty parts to get depth
        return (int) Arrays.stream(path.split("/"))
                .filter(part -> !part.isEmpty())
                .count();
    }
}
