package fishtank;

public class LowApproTemp implements TempState {//�¶ȵ��ں����¶�
	
	public void adjust(Integer approTemp, Integer naturalTemp) {
		//�����ں����¶ȵ�ֵ�����������¶�
		naturalTemp = approTemp;
		System.out.println("ˮ�����ʵ����ߣ�");
	}
}
