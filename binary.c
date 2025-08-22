#include <stdio.h>
int main(){
    int n=5;
    int arr[n];
    arr[0]=0;
    arr[1]=1;
    arr[2]=2;
    arr[3]=3;
    arr[4]=4;
    int low=0;
    int high=n-1;
    int x,mid;
    printf("Enter element to search:");
    scanf("%d",&x);
    int flag=0;
    for(int i=0;i<=n/2;i++){
        mid=(high+low)/2;
        if(arr[mid]==x){
            printf("Element %d found at index %d",x,mid);
            flag=1;
            break;
        }
        else if(arr[mid]>x){
            low=low;
            high=mid-1;
        }
        else{
            low=mid+1;
            high=high;
        }
    }
    if(flag==0){
        printf("element not in array");
    }
}