import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBT {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null)
                return "X";
            String ls = serialize(root.left);
            String rs = serialize(root.right);
            return root.val + "," + ls + "," + rs;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            Queue<String> nodesLeft=new LinkedList<>();
            nodesLeft.addAll(Arrays.asList(data.split(",")));
            return deserializehelper(nodesLeft);
        }

        private TreeNode deserializehelper(Queue<String> nodesLeft) {
            String valueForNode = nodesLeft.poll();
            if(valueForNode.equals("X"))
                return null;
            TreeNode newNode = new TreeNode(Integer.valueOf(valueForNode));
            newNode.left=deserializehelper(nodesLeft);
            newNode.right=deserializehelper(nodesLeft);
            return newNode;
        }
    }
}
