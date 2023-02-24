import java.lang.*;
class CommandArgs {
	public static void main(String args[]) {
		int count, i=0;
		String string;
		count = args.length;
		System.out.println("The number of arguments you hav passed is " + count);
		while(i<count){
			string = args[i];
			i++;
			System.out.println(string);
		}
	}
}
