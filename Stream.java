import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Stream implements Iterable<TeachGroup> {
    List<TeachGroup> teachGroups;

    public Stream() {
        this.teachGroups = new ArrayList<>();
    }

    public void addTeachGroup(TeachGroup teachGroup) {
        teachGroups.add(teachGroup);
    }

    public Iterator<TeachGroup> iterator() {
        return teachGroups.iterator();
    }
}