package wrap;

public class WrapTestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1  =2;
		String t2 = Integer.toString(t1);
		System.out.println("int类型转换为String类型对象t2=" + t2);
		int t3 = Integer.parseInt(t2);
		int t4 = Integer.valueOf(t2);
		System.out.println("字符串类型转换为int类型变量t3=" + t3);
		System.out.println("字符串类型转换为int类型变量t4=" + t4);
	}

}
