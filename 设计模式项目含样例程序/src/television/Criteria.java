package television;

import java.util.List;

//Ƶ���б�ӿ�
public interface Criteria {
    public List<Channel> meetCriteria(List<Channel> channels);
}
