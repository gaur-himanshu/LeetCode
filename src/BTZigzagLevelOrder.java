import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTZigzagLevelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        class Solution {
            public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
                List<List<Integer>> list=new ArrayList<>();
                levelOrder(list,root,0);
//                return list;
                return levelOrderI(root);
            }
            // Recursive approach
            public void levelOrder(List<List<Integer>> list, TreeNode root, int level){
               if (root==null)
                   return;
               if(list.size()<=level){
                   List<Integer> newLevel=new LinkedList<>();
                   list.add(newLevel);

               }
               if(level%2==0)
                   list.get(level).add(root.val);
               else
                   list.get(level).add(0,root.val);
               levelOrder(list,root.left,level+1);
               levelOrder(list,root.right,level+1);
            }
            // Iterative approach
            public List<List<Integer>> levelOrderI(TreeNode root){
                List<List<Integer>> list = new ArrayList<>();
                if(root==null)
                    return list;
                Queue<TreeNode> queue = new LinkedList<>();
                queue.add(root);
                boolean zigzag=false;
                while(!queue.isEmpty()){
                    LinkedList<Integer> level = new LinkedList<>();
                    int cnt = queue.size();
                    for (int i = 0; i < cnt; i++) {
                        TreeNode node = queue.poll();
                        if (zigzag)
                            level.addFirst(node.val);
                        else
                            level.add(node.val);
                        if (node.left!=null){
                            queue.add(node.left);
                        }
                        if (node.right!=null)
                            queue.add(node.right);
                    }
                    list.add(level);
                    zigzag=!zigzag;
                }
                return list;

            }
        }
    }

}
