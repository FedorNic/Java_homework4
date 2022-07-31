package first;

public class Barrier {

    int level;


    public Barrier(int level) {
        this.level = level;
    }

    static Barrier pool = new Barrier(5);
    static Barrier road = new Barrier(4);
    static Barrier hole = new Barrier(5);
    static Barrier enemy = new Barrier(6);

    static Barrier[] challenge = new Barrier[]{Barrier.pool, Barrier.road, Barrier.hole, Barrier.enemy};
}