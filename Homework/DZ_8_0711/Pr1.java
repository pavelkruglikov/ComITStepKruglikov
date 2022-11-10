package DZ_8_0711;

    class Detergent{
        void scrub(){
            System.out.println("Медод scrub()");
        }
    }

    class ChildrenDetergent extends Detergent{
        //Переопределение метода scrub()
        void scrub(){
            System.out.println("Переопределённый медод scrub()");
        }
        //Перегрузка метода scrub()
        void scrub(String s){
            System.out.println("Перегруженный медод scrub()");
        }
        //Новый метод sterilize()
        void sterilize(){
            System.out.println("Добавленный медод sterilize()");
        }
    }

    public class Pr1 {

        public static void main(String[] args) {

            ChildrenDetergent cd = new ChildrenDetergent();
            cd.scrub();
            cd.scrub("test");
            cd.sterilize();
        }
    }

