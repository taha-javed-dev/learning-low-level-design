package designPatterns.creational;

//Eager Loading, Thread Safe
public class JudgeAnalyticsEager {
    
    private static final JudgeAnalyticsEager JA_EAGER = new JudgeAnalyticsEager();

    private JudgeAnalyticsEager() {

    }

    public static JudgeAnalyticsEager getInstance(){
        return JA_EAGER;
    }
}
