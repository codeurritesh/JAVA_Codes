class lab_class {
    void show(int[] arr1,int[]... arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int a : arr[i]) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
        for (int b:arr1) {
            System.out.print(b+" ");
        }
    }
}
class lab_classmain
{
    public static void main(String[] args) {
        lab_class a=new lab_class();
        int arr1 [][]={{4,5},{2,3,4}};
        int arr2[]={20,20,2,3,4};
        a.show(arr2,arr1);

    }
}
