package television;

import java.util.List;

//频道列表接口
public interface Criteria {
    public List<Channel> meetCriteria(List<Channel> channels);
}
