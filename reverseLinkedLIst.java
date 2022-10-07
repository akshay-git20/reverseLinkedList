Node reverse(Node head){
    Node cur = head;
    Node prev = null;
    Node next;

    while(cur!=null)
    {
        next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
    }

    head = prev;
    
    return head;
}