public abstract class Beverages {
    private boolean wantsExtras;

    public final void finalTemplateMethod(){
        boilwater();
        brew();
        pourInCup();
        addCondiments();
        if(wantsExtras){
            addExtras();
        }
    }
    void setWantsExtras(boolean wantsExtras){
        this.wantsExtras = wantsExtras;
    }
    abstract void addCondiments();
    abstract void brew();
    abstract void addExtras();

    void boilwater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouting into cup");
    }


}
