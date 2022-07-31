package second;
public class Attestat extends Tasks {

    @Override
    public long time() {
        return 6000;
    }

    @Override
    public int priority() {
        return 6;
    }

    @Override
    public String toString(){
        return "Оформление Аттестата (время выполнения операции "+time()+"), Приоритет: "+priority()+'\n';
    }
}