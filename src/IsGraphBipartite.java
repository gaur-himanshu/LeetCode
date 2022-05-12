import java.util.HashMap;
import java.util.LinkedList;

public class IsGraphBipartite {
    //if graph contains cycle then it is not bipartite.
    // if cycle contains then side must be even length.
    public static void main(String[] args) {

    }

    public boolean isBipartite(int[][] graph) {
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            map.put(i, new HashMap<>());
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                map.get(i).put(graph[i][j], 1);
            }
        }
        LinkedList<BiparpitePair> qq = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int src : map.keySet()) {
            if(visited.containsKey(src))
                continue;
            BiparpitePair bp = new BiparpitePair(src, 0);
            qq.add(bp);
            while (!qq.isEmpty()) {
                BiparpitePair rbp = qq.remove();
                if (visited.containsKey(rbp.vtx) && visited.get(rbp.vtx) != rbp.lv) {
                    return false;
                }
                visited.put(rbp.vtx, rbp.lv);
                for (int key : map.get(rbp.vtx).keySet()) {
                    if (!visited.containsKey(key)) {
                        BiparpitePair nbp = new BiparpitePair(key, rbp.lv + 1);
                        qq.add(nbp);
                    }
                }
            }
        }
        return true;

    }

    public class BiparpitePair {
        int vtx;
        int lv;

        public BiparpitePair(int src, int i) {
            this.vtx = src;
            this.lv = i;
        }
    }
}
