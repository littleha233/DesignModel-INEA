package television;

import java.util.ArrayList;
import java.util.List;

//获得娱乐类节目
public class CriteriaVariety implements Criteria{
	
    public List<Channel> meetCriteria(List<Channel> channels){
	    List<Channel> varietyChannels = new ArrayList<Channel>();
	    for (Channel channel : channels) {
		    if(channel.getKind().equalsIgnoreCase("Variety")) {
			   varietyChannels.add(channel);
		    }
	    }
	    return varietyChannels;
    }
}
