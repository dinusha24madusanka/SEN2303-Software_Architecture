public class LightDimCommand implements Command{
    private Light light;
    private int level;
    private int previousLevel;

    public LightDimCommand(Light light, int level){
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute(){
        previousLevel = light.getBrightness();
        light.dim(level);
    }

    @Override
    public void undo(){
        light.dim(previousLevel);
    }
}
