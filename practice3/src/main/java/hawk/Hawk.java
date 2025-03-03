package hawk;

public class Hawk {
    private boolean isRedTailed;
    private boolean isRedShouldered;
    public Hawk(){}

    public void redTailed(boolean isRedTailed){
        this.isRedTailed= isRedTailed;
    }

    public void redShouldered(boolean isRedShouldered){
        this.isRedShouldered= isRedShouldered;
    }

    public boolean isRedTailed(){
        return isRedTailed;
    }

    public boolean isRedShouldered(){
        return isRedShouldered;
    }
}
