//locked code

SinglyLinkedListNode* reverse(SinglyLinkedListNode* llist) {
    SinglyLinkedListNode* rHead =NULL;
    while(llist != NULL){
        SinglyLinkedListNode* node = new SinglyLinkedListNode(llist->data);
        node->next = rHead;
        rHead = node;
        
        llist = llist->next;
    }
    return rHead;
}

//locked code