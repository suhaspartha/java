import java.util.ArrayList;
import java.util.List;

public final class TeamLead extends Employee {
    public TeamLead(String name, int age, Address address) {
        super(name, age, address);
        this.stakes = new ArrayList<>();
    }
    private final List<String> stakes;

    public void addStake(String project) {
        this.stakes.add(project);
    }

    public List<String> getStakes() {
        return this.stakes;
    }
}
