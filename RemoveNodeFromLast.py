class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class Linked:
    def __init__(self):
        self.head=None

    def insert(self,data):
        if(self.head is None):
            self.head=Node(data)
        else:
            temp=self.head
            while(temp.next is not None):
                temp=temp.next
            temp.next=Node(data)
    
    def display(self):
        if(self.head is None):
            print("List is Empty")
        else:
            temp=self.head
            while(temp is not None):
                print(temp.data,end='-->')
                temp=temp.next

    def remove(self,lastIndex):
        slow = self.head
        fast = self.head
        
        for i in range(0, lastIndex):
            if fast.next is None:
            
                if i == n - 1:
                    self.head = self.head.next
            
            print("fast = ",fast.data,"\n\n")   
            fast = fast.next
        
        while fast.next is not None:
            print("\nslow = ",slow.data,"\n")
            slow = slow.next
            print("fast = ",fast.data,"\n\n\n")
            fast = fast.next
       
        if slow.next is not None:
            slow.next = slow.next.next


class Excecution:
    o=Linked()
    o.insert(10)
    o.insert(20)
    o.insert(30)
    o.insert(40)
    o.insert(50)
    o.display()
    o.remove(2)
    print()