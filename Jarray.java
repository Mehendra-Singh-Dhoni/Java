class Jarray{
    public static void main(String args[]){
        int[][] arr=new int [3][];
        arr[0]=new int[1];
        arr[1]=new int[3];
        arr[2]=new int[2];
        arr[0][0]=4;
        arr[1][0]=3;
        arr[1][1]=7;
        arr[1][2]=1;
        arr[2][0]=7;
        arr[2][1]=7;
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