package television;

import java.util.ArrayList;
import java.util.List;

//����������Ŀ
public class CriteriaSport implements Criteria{
	
    public List<Channel> meetCriteria(List<Channel> channels){
	    List<Channel> sportChannels = new ArrayList<Channel>();
	    for (Channel channel : channels) {
		    if(channel.getKind().equalsIgnoreCase("Sport")) {
			   sportChannels.add(channel);
		    }
	    }
	    return sportChannels;
    }
}
