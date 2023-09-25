public class DataStructureArray
{   
    public static void main(String [] args)
    {
       int arr[] = new int[7];
       arr[0] = 33;
       arr[1] = 34;
       arr[2] = 35;
       arr[3] = 36;
       arr[4] = 37;
       
              
       edit(35, 40, arr);
    }
  
    //a
    public static void edit(int toBeEdited, int newItemToReplace, int[] arrContents)
    {
    for(int a=0; a<arrContents.length; a++)
        if(newItemToReplace == arrContents[a]) 
            arrContents[a] = toBeEdited; 
    }
    
    //b
    public static void edit(int toBeEdited, int newItemToReplace, int[] arrContents)
    {
        for(int a=0; a<arrContents.length; a++)
            if(toBeEdited != arrContents[a]) 
                arrContents[a] = newItemToReplace; 
    }

    //c
    public static void edit(int toBeEdited, int newItemToReplace, int[] arrContents)
    {
        for(int a=0; a<arrContents.length; a++)
            if(toBeEdited == arrContents[a])
                arrContents[a] = newItemToReplace;
        return; 
    }

    //d
    public static void edit(int toBeEdited, int newItemToReplace, int[] arrContents)
    {
        for(int a=0; a<arrContents.length; a++)
            arrContents[a] = newItemToReplace; 
    }

    //e
    public static void edit(int toBeEdited, int newItemToReplace, int[] arrContents)
    {
        for(int a=0; a<arrContents.length; a++)
            if(toBeEdited == arrContents[a])
                arrContents[a] = newItemToReplace;
    }
  
    public static void search(int searchItem, int [] arrContents)
    {
        for(int i=0; i <arrContents.length; i++)
            if(arrContents[i] == searchItem)
            {
                System.out.println("Item " + searchItem + " is found!");
            }
    }
    
    public static void display(int[] arr)
    {
        for(int b=0; b<arr.length; b++)
            System.out.print(arr[b]+" ");
        System.out.println();
    }
}
