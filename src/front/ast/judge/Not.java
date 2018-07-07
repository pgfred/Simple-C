package front.ast.judge;

public class Not extends Judge {
    public Judge follow;

    public Not(Judge follow) {
        this.follow = follow;
        kind = Kind.NOT;
    }

    @Override
    public String toString() {
        return "!(" + follow.toString() + ")";
    }
}