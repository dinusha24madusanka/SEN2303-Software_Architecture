public class Test {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim = new LightDimCommand(kitchenLight, 50);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingRoomLight, 30);

        remote.setCommand(0, kitchenLightOn, kitchenLightOff);
        remote.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        System.out.println("Testing Kitchen Light:");
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
        kitchenLightDim.execute();
        kitchenLightDim.undo();

        System.out.println("\nTesting Living Room Light:");
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.undoButtonWasPushed();
        livingRoomLightDim.execute();
        livingRoomLightDim.undo();
    }
}
