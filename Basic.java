class print {
    void display ()
    {
        System.out.print("Hello In class ");
    }
}
class addition {
    int add (int a, int b)
    {
        return a+b;
    }
}


class basic{
    public static void main (String [] args){
        int a,b;
    
       print obj = new print();
       obj.display ();
    //    addition obj1  = new addition(a,b);
    //    obj1.add (a,b);
    //    int n;
    //    System.out.print ("Enter the n's value :");
    //    scanf (n);
    //    if (n !=5)
    //    {
    //         obj.add ();
    //    }
    //    else {
    //     obj.display();
    //    }
    }
}