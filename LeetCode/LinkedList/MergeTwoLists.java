package LeetCode.LinkedList;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 != null && list2 != null){
            mergeTwoListsVoid(list1,list2);
            if(list1.val <= list2.val){
                return list1;
            }else{
                return list2;
            }
        }else if(list1 != null){
            return list1;
        }else{
            return list2;
        }
    }

    public void mergeTwoListsVoid(ListNode list1, ListNode list2){
        if(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ListNode newList2Head = list2;
                if(list1.next == null){
                    list1.next = list2;
                }else if((list2.val >= list1.val) && (list2.val <= list1.next.val)){
                    newList2Head = list2.next;
                    list2.next = list1.next;
                    list1.next = list2;
                    if(newList2Head != null){
                        mergeTwoListsVoid(list1, newList2Head);
                    }                
                }else{
                    mergeTwoListsVoid(list1.next, list2);
                }
            }else{
                ListNode newList1Head = list1;
                if(list2.next == null){
                    list2.next = list1;
                }else if(list1.val >= list2.val && list1.val <= list2.next.val){
                    newList1Head = list1.next;
                    list1.next = list2.next;
                    list2.next = list1;
                    if(newList1Head != null){
                        mergeTwoListsVoid(list2, newList1Head);
                    }                
                }else{
                    mergeTwoListsVoid(list2.next, list1);
                }
            }
        }        
    }
}
