public class KitchenRoomLight implements Light{
    private int brightness;

    String location = "Kitchen Light";

    @Override
    public void on() {brightness = 100;
    System.out.println("Kitchen Light Is ON" + location);
    }

    @Override
    public void off() {brightness = 0;
        System.out.println("Kitchen Light Is OFF" + location);
    }

    @Override
    public void dim(int level) {brightness = level;
        System.out.println(("Kitchen Light Dimmed to" + level + "%") + location);
    }

    public int getBrightness(){
        return brightness;
    }

}
