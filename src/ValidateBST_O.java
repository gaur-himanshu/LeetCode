public class ValidateBST_O {
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
    }

    public class BstPair {
        boolean isBst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
    }

    class Solution {
        public boolean isValidBST(TreeNode root) {
            return valid(root).isBst;
        }

        public BstPair valid(TreeNode root) {
            if (root == null) {
                return new BstPair();
            }
            BstPair lpbst = valid(root.left);
            BstPair rpbst = valid(root.right);
            BstPair spbst = new BstPair();
            spbst.min = Math.min(lpbst.min, Math.min(rpbst.min, root.val));
            spbst.max = Math.max(lpbst.max, Math.max(rpbst.max, root.val));
            if (lpbst.isBst && rpbst.isBst && (lpbst.max < root.val && rpbst.min > root.val)) {
                spbst.isBst = true;

                return spbst;
            }
            spbst.isBst = false;

            return spbst;
        }
    }
}
