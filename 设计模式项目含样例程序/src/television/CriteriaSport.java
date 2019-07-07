package television;

import java.util.ArrayList;
import java.util.List;

//获得体育类节目
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
