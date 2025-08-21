class MultiDarray{
    public static void main(String args[]){
        int[][] arr=new int [2][2];
        arr[0][0]=4;
        arr[0][1]=5;
        arr[1][0]=7;
        arr[1][1]=1;
        int i=0;
        int j=0;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}