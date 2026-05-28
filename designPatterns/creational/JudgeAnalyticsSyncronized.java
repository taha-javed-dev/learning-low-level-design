package designPatterns.creational;

public class JudgeAnalyticsSyncronized {
    
    private static JudgeAnalyticsSyncronized judgeAnalyticsSyncronized;

    private JudgeAnalyticsSyncronized() {
    }

    public static synchronized JudgeAnalyticsSyncronized getInstance() {
        if (judgeAnalyticsSyncronized == null) {
            judgeAnalyticsSyncronized = new JudgeAnalyticsSyncronized(); 
        }
        return judgeAnalyticsSyncronized;
    }
}
