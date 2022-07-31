package second;
    public class Snils extends Tasks {

        @Override
        public long time() {
            return 3000;
        }
    
        @Override
        public int priority() {
            return 3;
        }
    
        @Override
        public String toString(){
            return "Оформление СНИЛС (время выполнения операции "+time()+"), Приоритет: " + priority()+'\n';
        }
    
    }