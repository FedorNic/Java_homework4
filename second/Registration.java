package second;

public class Registration extends Tasks {

    @Override
    public long time() {
        return 7000;
    }

    @Override
    public int priority() {
        return 7;
    }

    @Override
    public String toString(){
        return "Оформление Регистрации (время выполнения операции "+time()+"), Приоритет: "+priority()+'\n';
    }
}