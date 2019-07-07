package appliance;

import java.util.ArrayList;

public class Appliance {
	
	//属性部分。。。。。。。。
	public String name;
	
	public enum State{
		//状态为空闲 工作中 损坏
		free, working, broken
	}
	
	//电器状态
	public State state;
	
	//电器功率
	public int power;
	
	//被实例化的电器列表
    ArrayList<Appliance> applianceList=new ArrayList<Appliance>();
	
	
	//操作部分。。。。。。。。。
	
	//获取具体电器名称
    public String getName() {
    	return name;
    }
	
	//读取到电器状态
	public State getState()
	{
		return state;
	}
	
	//读取到电器功率
	public int getPower()
	{
		return power;
	}
	
	//根据身份判断使用者是否有权限使用电器
	public Boolean usedBy() {
		return false;
	}
	
	//打开电器
	public void open() {
		//电器状态改变为working
	}
	
	//电器运行具体方法
	public void work() {
		//实现对特定电器的具体操作
		//参考冰箱类实现电器运行的相关流程
	}
	
	//关闭电器
	public void close() {
		//电器状态改变成free
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}