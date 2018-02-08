import java.util.Scanner;


public class lengtharrangement {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.println("PLEASE ENTER A FIRST WORD AND SENTENCES");
		String string_1=keyboard.nextLine();
		System.out.println("PLEASE ENTER A SECOND WORD AND SENTENCES");
		String string_2=keyboard.nextLine();
		
		int string1_length= string_1.length();
		int string2_length= string_2.length();
		
		int [][] table= new int [string1_length+1][string2_length+1];
		int len=0;
		int pos=-1;
		
		for(int x=1; x<string1_length+1;x++){
			for(int y=1; y<string2_length+1;y++){
				 if (string_1.charAt(x - 1) == string_2.charAt(y - 1))
	                {
	                        table[x][y] = table[x - 1][y - 1] + 1;
	                        if (table[x][y] > len)
	                        {
	                            len = table[x][y];
	                            pos = x;
	                        }               
	                }
	                else
	                    table[x][y] = 0;
	            }
				
			}
		
		System.out.println("The longest common subsequence is "+ string_1.substring(pos-len,pos));
	}
}


