import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pqueue = new LinkedList<>();
        Queue<TreeNode> qqueue = new LinkedList<>();
        pqueue.add(p);
        qqueue.add(q);

        while(!pqueue.isEmpty() && !qqueue.isEmpty()){
            TreeNode temp1 = pqueue.poll();
            TreeNode temp2 = qqueue.poll();
            if(temp1 == null && temp2 != null || temp1 != null && temp2 == null)
                return false;
            if(temp1 == null && temp2 == null)
                continue;
            if(temp1.val != temp2.val)
                return false;
            pqueue.add(temp1.left);
            pqueue.add(temp1.right);
            qqueue.add(temp2.left);
            qqueue.add(temp2.right);
        }

        if(pqueue.isEmpty() && !qqueue.isEmpty() || !pqueue.isEmpty() && qqueue.isEmpty())
            return false;
        else
            return true;

    }

    public static void main(String[] args) {
        boolean ans = isSameTree(new TreeNode(1, new TreeNode(2), new TreeNode(3)), new TreeNode(1, new TreeNode(2), new TreeNode(3)));
        System.out.println(ans);
    }
}
