package wrap;

public class WrapTestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1  =2;
		String t2 = Integer.toString(t1);
		System.out.println("int����ת��ΪString���Ͷ���t2=" + t2);
		int t3 = Integer.parseInt(t2);
		int t4 = Integer.valueOf(t2);
		System.out.println("�ַ�������ת��Ϊint���ͱ���t3=" + t3);
		System.out.println("�ַ�������ת��Ϊint���ͱ���t4=" + t4);
	}

}
