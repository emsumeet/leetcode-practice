import java.util.Scanner;

class Binary{
    public int search(int[] arr, int target)
    {
        int left = 0; 
        int right = arr.length - 1;

        while(left<=right)
        {
            int mid = left +(right - left)/2 ;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] < target)
            {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
    
    /// input hard coded
    // public static void main(String[] args)
    // {
    //     Binary binsrch = new Binary();

    //     int arr[] = {-1, 0, 3, 5, 8, 9, 12 , 15};
    //     int target = 15;

    //     int res = binsrch.search(arr, target);
    //     if(res!=1)
    //     {
    //         System.out.println("Element found at " + res);
    //     }
    //     else{
    //         System.out.println("Element not found.");
    //     }
    // }


    //input given by user

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Binary binsrch = new Binary();

        int arr[] = {-1, 0, 3, 5, 8, 9, 12 , 15};

        System.out.println("Enter the number to be searched: ");
        int target = scan.nextInt();
        
        int res = binsrch.search(arr, target);
        if(res!=1)
        {
            System.out.println("Element found at " + res);
        }
        else{
            System.out.println("Element not found.");
        }

        scan.close();
    }
}