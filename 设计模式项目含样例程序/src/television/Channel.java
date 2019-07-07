package television;

public class Channel {
       private String name ;//节目名称
       private String kind; //节目类型
       private int num;     //该频道为几频道
       
       //初始化一个节目
       public Channel(String name,String kind,int num) {
    	   this.name = name;
    	   this.kind = kind;
    	   this.num = num;
       }
       
       //获得节目名称
       public String getName() {
    	   return name;
       }
       
       //获得节目类型
       public String getKind() {
    	   return kind;
       }
       
       //获得该节目为频道几
       public int getNum() {
    	   return num;
       }
       
}
