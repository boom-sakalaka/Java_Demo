package wrap;

public class WrapTestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// װ�䣺 �ѻ�����������ת���ɰ�װ��
		// �Զ�װ��
		int t1 = 2;
		Integer t2 =t1;
		
		// �ֶ�װ��
		Integer t3 = new Integer(t1);
		
		// ����
		System.out.println("int���ͱ���t1=" + t1);
		System.out.println("integer���ͱ���t2=" + t2);
		System.out.println("integer���ͱ���t3=" + t3);
		System.out.println("*************************");
		// ����: �Ѱ�װ��ת���ɻ�����������
		// �Զ�����
		int t4 = t2;
		// �ֶ�����
		int t5 = t2.intValue();
		System.out.println("Integer���Ͷ���t2=" + t2);
		System.out.println("�Զ������int���ͱ���t4=" + t4);
		System.out.println("�ֶ������int���ͱ���t4=" + t5);
		double t6 = t2.doubleValue();
		System.out.println("�ֶ������double���͵�6=" + t6);
		
		
	}

}
