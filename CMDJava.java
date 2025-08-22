public class CMDJava
{
public static void main(String[] args){
	if(args.length <2)
		System.out.println("Invalid args");
	else{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("Addition : "+(a+b));
	}
}
}