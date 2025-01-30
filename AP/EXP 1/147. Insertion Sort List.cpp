ListNode *insertionSortList(ListNode *head)
{
    if (head == NULL || head->next == NULL)
        return head;

    ListNode *p = head->next;
    head->next = NULL;

    while (p != NULL)
    {
        ListNode *pNext = p->next; /*store the next node to be insert*/
        ListNode *q = head;

        if (p->val < q->val) /*node p should be the new head*/
        {
            p->next = q;
            head = p;
        }
        else
        {
            while (q != NULL && q->next != NULL && q->next->val <= p->val)
                q = q->next;
            p->next = q->next;
            q->next = p;
        }

        p = pNext;
    }
    return head;
}