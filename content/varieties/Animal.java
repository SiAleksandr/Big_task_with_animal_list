package content.varieties;
import java.util.ArrayList;

public abstract class Animal {
    public Integer groupId;
    public String groupName;
    public Animal() {};
    public void setGroups(ArrayList<String> groupList, int groupNumber) {
        this.groupId = groupNumber;
        this.groupName = groupList.get(groupNumber);
    }
}
