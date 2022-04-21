import java.util.List;

public class AddTwoNumbersLL {
    public static void main(String[] args) {

    }
    public static ListNode add(ListNode l1,ListNode l2){
        ListNode temp= new ListNode(0);
        ListNode tail=temp;
        int carry=0;
        while(l1!=null||l2!=null){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=carry+x+y;
            carry=sum/10;
            tail.next=new ListNode(sum%10);
            tail=tail.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry>0){
            tail.next=new ListNode(carry);
        }
        return temp.next;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
