package television;

public class Channel {
       private String name ;//��Ŀ����
       private String kind; //��Ŀ����
       private int num;     //��Ƶ��Ϊ��Ƶ��
       
       //��ʼ��һ����Ŀ
       public Channel(String name,String kind,int num) {
    	   this.name = name;
    	   this.kind = kind;
    	   this.num = num;
       }
       
       //��ý�Ŀ����
       public String getName() {
    	   return name;
       }
       
       //��ý�Ŀ����
       public String getKind() {
    	   return kind;
       }
       
       //��øý�ĿΪƵ����
       public int getNum() {
    	   return num;
       }
       
}
