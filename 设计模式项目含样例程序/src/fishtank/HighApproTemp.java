package fishtank;

public class HighApproTemp implements TempState{//�¶ȸ��ں����¶�
	
	public void adjust(Integer approTemp, Integer naturalTemp) {
		//�����ں����¶ȵ�ֵ�����������¶�
		naturalTemp = approTemp;
		System.out.println("ˮ�����ʵ����ͣ�");
	}
}
