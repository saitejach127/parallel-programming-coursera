import java.util.concurrent.RecursiveAction;

class SumArray {
    int[] arr;
    int low,high;
    int sum;
    SumArray(int[] arr,int low,int high) {
        this.arr = arr;
        this.low = low;
        this.high = high;
    }

    protected void compute() {
        if(low > high){
            sum = 0;
        } else if (low == high){
            sum = arr[low];
        } else {
            int mid = (low + high )/2;
            invokeAll(new SumArray(arr,low,mid), new SumArray(arr,mid+1,high));
            sum = left.sum + right.sum;
        }
    }
}

class addArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        SumArray sum = new SumArray(arr,0,7);
        System.out.println(sum.sum);
    }
}