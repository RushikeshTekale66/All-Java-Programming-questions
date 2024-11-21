// Sort String
public class Main{
	public static void main(String[] args) {
		String str1 = "Tekale";
		char[] str = str1.toCharArray();
		for(int i=0; i<str.length; i++){
		    for(int j=i+1; j<str.length; j++){
		        if(str[i]>str[j]){
		            char temp = str[i];
		            str[i] = str[j];
		            str[j]=temp;
		        }
		    }
		}
		System.out.println(new String (str));
		
	}
}
//O/P :aeeklt