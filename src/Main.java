public class Main {
    public static void main(String[] args) {
        int result=Add(10,30,40);
        System.out.println(result);

        Car myCar= new Car();

        myCar.addDoor();
        System.out.println(myCar.doors);


    }
        public static int Add(int a, int b, int c){
        return a+b+c;

    }

static class Car{
        public int doors=4;

        public void addDoor(){
            this.doors++;
        }
    }
}