public class SuperCar implements CanDrive,CanFly {

    @Override
    public void Start(){
        System.out.println("Mozemy sie ruszyc!");
    }

    @Override
    public void Stop(){
        System.out.println("Możemy się zatrzymac!");
    }

    @Override
    public void TurnRight(){
        System.out.println("Mozemy skrecic w prawo");
    }

    @Override
    public void TurnLeft(){
        System.out.println("Mozemy skrecic w lewo");
    }

    @Override
    public void VeryHigh(){
        System.out.println("Mozemy leciec bardzo wysoko!");
    }

    @Override
    public void WithoutFuel(){
        System.out.println("Mozemy latać bez paliwa!");
    }
}
