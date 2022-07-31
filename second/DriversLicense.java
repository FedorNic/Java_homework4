package second;
public class DriversLicense extends Tasks {

    @Override
    public long time() {
        return 2000;
    }

    @Override
    public int priority() {
        return 2;
    }

    @Override
    public String toString(){
        return "Оформление Водительских прав (время выполнения операции "+time()+"), Приоритет: "+priority()+'\n';
    }
    
}