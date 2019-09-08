/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var middleNode = function(head) {
    if (head.next === null) {
        return head;
    }
    
    let length = 0;
    let current = head;
    
    while ( current != null) {
        length++;
        current = current.next;
    }
    
    length = Math.floor(length/2);
    current = head;
    for (let index = 0; index < length; index ++) {
            current = current.next
    }
    return current;
};