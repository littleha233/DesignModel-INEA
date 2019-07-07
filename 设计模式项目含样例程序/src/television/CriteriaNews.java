package television;

import java.util.ArrayList;
import java.util.List;

//����������Ŀ
public class CriteriaNews implements Criteria {
 
	public List<Channel> meetCriteria(List<Channel> channels){
		List<Channel> newsChannels = new ArrayList<Channel>();
		for(Channel channel : channels) {
			if(channel.getKind().equalsIgnoreCase("News")) {
				newsChannels.add(channel);
			}
		}
	     return newsChannels;
	}
}

