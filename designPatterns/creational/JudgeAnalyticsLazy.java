package designPatterns.creational;

//Lazy Loading //Not Thread Safe
public class JudgeAnalyticsLazy {

    private static JudgeAnalyticsLazy judgeAnalyticsLazy;

    private JudgeAnalyticsLazy() {
    }

    public static JudgeAnalyticsLazy getInstance() {
        if (judgeAnalyticsLazy == null) {
            judgeAnalyticsLazy = new JudgeAnalyticsLazy(); 
        }
        return judgeAnalyticsLazy;
    }
    
}