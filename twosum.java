import java.util.Scanner;

class twosum{
    public int[] twosum(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while(left < right)   //make sure this condition is right
        {
            int sum = arr[left] + arr[right];

            if(sum == target)
            {
                return new int[] {left, right};
            }
            else if (sum < target)
            {  
                left++;
            }
            else{
                right--;
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        twosum solver = new twosum();

        int arr[] = {-1, 0, 3, 5, 8, 9, 12 , 15};

        System.out.println("Enter the sum to be searched: ");
        int target = scan.nextInt();
        
        int[] res = solver.twosum(arr, target);
        if(res[0]!=-1)
        {
            System.out.println("Element found at " + res[0]+ "," + res[1]);
            System.out.println("values " + arr[res[0]] + "," + arr[res[1]]);
        }

        else{
            System.out.println("Element not found.");
        }

        scan.close();
    }

    
}