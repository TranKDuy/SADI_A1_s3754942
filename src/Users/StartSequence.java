package Users;

public class StartSequence extends StarSequenceSystem {
    public void print() {
        System.out.println("Welcome to enrollment system");
    }
    @Override
    public void invite(Users users) {
        users.visit(this);
    }
}
