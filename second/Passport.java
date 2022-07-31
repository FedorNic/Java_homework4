package second;
public class Passport extends Tasks {

    @Override
    public long time() {
        return 5000;
    }

    @Override
    public int priority() {
        return 5;
    }

    @Override
    public String toString(){
        return "Оформление Паспорта (время выполнения операции "+time()+"), Приоритет: "+priority()+'\n';
    }
    
}