public class Tea extends Beverages{
    void brew(){
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments(){
        System.out.println("Adding lemon");
    }

    @Override
    void addExtras(){
        System.out.println("Adding honey");
    }
}
