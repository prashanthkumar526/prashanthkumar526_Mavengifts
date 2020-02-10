import java.util.Scanner;
class Sweets
{
    public static void main (String[] args) 
    { 
        int w,w1=0,w2=0,cost;
Scanner s=new Scanner(System.in);
        Chocolates c=new Chocolates(200,"FiveStar",10);
      // declares an Array of integers. 
        Chocolates[] arr; 
  
        // allocating memory for 5 objects of type Chocolates. 
        arr = new Chocolates[5]; 
int arr2[]={200,100,300,250,500};
  
        // initialize the first elements of the array 
        arr[0] = new Chocolates(200,"FiveStar",10); 
  
        // initialize the second elements of the array 
        arr[1] = new Chocolates(100,"DairyMilk",20); 
  
        // so on... 
        arr[2] = new Chocolates(300,"Snikers",30); 
        arr[3] = new Chocolates(250,"Munch",40); 
        arr[4] = new Chocolates(500,"Perk",50); 
  
        // accessing the elements of the specified array 
        for (int i = 0; i < arr.length; i++) 
System.out.println("Element at " + i + " : " + 
                        arr[i].cost+" "+ arr[i].name+" "+arr[i].weight); 


// declares an Array of integers. 
        
Candies d=new Candies(350,"Jaamun",30);

  int arr3[]={400,500,600,700,200};


        // allocating memory for 5 objects of type Candies 
       Candies[] arr1= new Candies[5]; 
  
        // initialize the first elements of the array 
        arr1[0] = new Candies(400,"Jaamun",30); 
  
        // initialize the second elements of the array 
        arr1[1] = new Candies(500,"Barfi",110); 
  
        // so on... 
        arr1[2] = new Candies(600,"sweet1",120); 
        arr1[3] = new Candies(700,"sweet2",300); 
        arr1[4] = new Candies(200,"sweet3",240); 
  
        // accessing the elements of the specified array 
        for ( int j = 0; j< arr1.length; j++) 
System.out.println("Element at " + j+ " : " + 
                        arr1[j].cost+" "+ arr1[j].name+" "+arr1[j].weight); 
//sorting
c.bubbleSort(arr2);
// for (int i = 0; i < n-1; i++)
System.out.println("Sorted chocolates according to the cost are:");
        c.printArray(arr2);



for (int i = 0; i < arr.length; i++) 
w1=w1+arr[i].weight;
for (int j = 0; j< arr1.length; j++)
 w2=w2+arr1[j].weight;
w=w1+w2;
System.out.println("weight of the gift is:" +w);
 
System.out.println("enter the candie cost");
   cost=s.nextInt();
for ( int j = 0; j< arr3.length; j++){
if(arr3[j]==cost)
{
System.out.println("the  candie is  found");
}
else 
System.out.println("the  candie is not  found");
}


    } 

} 
 class Chocolates extends Sweets
{
public int cost; 
    public String name; 
public int weight;
  Chocolates(int cost, String name,int weight) 
    { 
        this.cost = cost; 
        this.name = name;
        this.weight=weight;
 
    } 
 public void bubbleSort(int arr2[])
    {
        int n = arr2.length;
        for (int i = 0; i < n-1; i++)
            for (int k = 0; k < n-i-1; k++)
                if (arr2[k] > arr2[k+1])
                {
                    // swap temp and arr[i]
                    int temp = arr2[k];
                    arr2[k]= arr2[k+1];
                    arr2[k+1]= temp;
                }
    }
/* Prints the array */
    void printArray(int arr2[])
    {
        int n = arr2.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr2[i] + " ");
        System.out.println();
    }

}  
class Candies extends Sweets
{
public int cost; 
    public String name; 
public int weight;
  Candies(int cost, String name,int weight) 
    { 
        this.cost = cost; 
        this.name = name;
        this.weight=weight;

    } 
 public int binarySearch(int[] arr3, int key) {
         
        int start = 0;
        int end = arr3.length - 1;
        while (start <= end)
      {
            int mid = (start + end) / 2;
            if (key == arr3[mid]) 
	{
                return mid;
                }
            if (key < arr3[mid])
	 {
                end = mid - 1;
                } 
	else 
	 {
                start = mid + 1;
                }
        }
        return -1;
    }
  
    
}  



