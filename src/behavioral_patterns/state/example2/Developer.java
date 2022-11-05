package behavioral_patterns.state.example2;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity(){
        if(activity instanceof Sleeping){
            setActivity(new Training());
        } else if(activity instanceof Coding){
            setActivity(new Reading());
        } else if (activity instanceof Reading){
            setActivity(new Sleeping());
        }
    }
    public void justDoIt(){
        activity.justDoIt();
    }
}
