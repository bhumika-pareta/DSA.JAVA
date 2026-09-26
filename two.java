//first occurence of an element in array.


public class Two {
    public static void main (String args[]){
        int arr[]= {10,20,30,20,40};
        int x = 20;
      for (int i=0; i<arr.length; i++){
        if (arr[i] == x){
            System.out.println("first occurence of x is found at"+" "+ i);
            break;
        }
      }


    }
}
