package jaaa;

class hello {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0) ;
        int flag = 0;
        while(l1 != null && l2 != null)
        {
            int x = 0;
            x = l1.val + l2.val + flag;
            if(x >= 10)
            {
                x -= 10 ;
                flag = 1;
            }
            else
                flag=0;
            add(l3,x);
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 == null)
        {
            while(l2 != null)
            {
                
            }
        }
        return l1;
    }
    
    public static void add(ListNode l,int x)
    {
        if(l == null)
        {
            l = new ListNode(x);
            l.next = null;
            return ;
        }
        else
        {
            while(l != null)
            {
                l = l.next;
            }
            l = new ListNode(x);
            l.next = null ;
        }
    }
    public static void main(String[] args)
    {
//    	ListNode l1 = new ListNode(0);
//    	if(l1.val == 0)
//    	{
//    		System.out.println("11");
//    	}
//    	else
//    	{
//    		System.out.println(l1.val);
    	float a = 100.0000005f;
    	float b = 100.000001f;
    	double c = 10.0000005;
    	double d = 10.000001;
    	System.out.println("10.0000005f==10.000001f?" + (a == b));
    }
}
class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	  }