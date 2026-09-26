public class C {
    public static void main (String [] args){

        int a[]={10,20,30,20,40,20};
        int x = 20;

        for(int i = 0; i<a.length; i++){
            if(a[i]==x){
                System.out.println(i);
            }
        }
    }
}
