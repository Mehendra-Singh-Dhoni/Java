class Try{
public static void main(String args[]){
	System.out.println("First Java code");

	
	int a=0;
	int check=2;
	int b=1;
	int arr[]={1,2,3,4,5,6};
	for(b=0;b<=10;b++){
		if(b!=7){
			System.out.println("Talbe of " + b);
			for(a=1;a<=10;a++){
				System.out.println(a + "*" + b + "=" + (a*b));
			}
		}
		else{
			System.out.println("Skiped the table of " + b);
		}
	}
	for(int i=0; i< arr.length;i++){
		if(arr[i]==10){
			System.out.println("Found at index value" + i);
			check=1;
			break;
		}
		else{
			check=0;
		}
		
	}
	if(check==0){
		System.out.println("element not found");
	}
	}
}