public class BubbleSort{

    //bubbleSort
    public static void main(String[] args) {
        int[] a={12,26,56,-89,-203};
        
        int temp=0; 
        for(int i=0;i< a.length;i++)
             {
                 int flag=0;
                 for (int j=0;j<a.length-1-i;j++) {
                     if (a[j]>a[j+1]) {
                         temp=a[j];
                         a[j]=a[j+1];
                         a[j+1]=temp; flag=1;
                     }
                 
                 }
                 if (flag==0) {break;}
             }
             for(int k=0;k< a.length;k++){
                 System.out.print(a[k]+" ");
             }
             System.out.println();

             String[] b={"Ritam","Ok","Hello"};
             String temp2="";

             for(int i=0;i< b.length;i++)
             {
                 int flag=0;
                 for (int j=0;j<b.length-1-i;j++) {
                     if (b[j].compareTo(b[j+1])>0) {
                         temp2=b[j];
                         b[j]=b[j+1];
                         b[j+1]=temp2; flag=1;
                     }
                 
                 }
                 if (flag==0) {break;}
             }
             for(int k=0;k< b.length;k++){
                 System.out.print(b[k]+" ");
             }


   }

}