package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        //Laptop laptop = new Laptop(){}
        Laptop laptop = new Laptop(){
            public void ramSize(int memorySize) {
                System.out.println("The size of the memory is " + memorySize);
            }

            public void monitorSize(int screenSize) {
                System.out.println("The size of the screen is " + screenSize);
            }
        };
        laptop.ramSize(100);
        laptop.monitorSize(17);


        //please implement anonymous function for Phone interface
        Phone phone = (network) -> {
            System.out.println("The network that im using is " + network);
        };
        phone.cellularNetwork("optimum");

    }
}
