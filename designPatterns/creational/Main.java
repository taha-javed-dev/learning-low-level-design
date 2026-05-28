package designPatterns.creational;

public class Main {
    
    public static void main(String[] args) {


        JudgeAnalyticsProblem judgeAnalyticsProblem = new JudgeAnalyticsProblem();
        JudgeAnalyticsProblem judgeAnalyticsProblem2 = new JudgeAnalyticsProblem();

        judgeAnalyticsProblem.setCount();
        judgeAnalyticsProblem.getCount();
        judgeAnalyticsProblem2.setCount();
        judgeAnalyticsProblem2.getCount();
        
        System.out.println();
        System.out.println(judgeAnalyticsProblem);
        System.out.println(judgeAnalyticsProblem2);
        System.out.println();
        System.out.println("JudgeAnalyicsProblem : both are diffrent variable");
        System.out.println();

        
        JudgeAnalyticsEager judgeAnalyticsEager = JudgeAnalyticsEager.getInstance();
        JudgeAnalyticsEager judgeAnalyticsEager2 = JudgeAnalyticsEager.getInstance();


        System.out.println(judgeAnalyticsEager);
        System.out.println(judgeAnalyticsEager2);
        System.out.println();
        System.out.println("JudgeAnalyicsEager : both are same variable");
        System.out.println();

        JudgeAnalyticsLazy judgeAnalyticsLazy = JudgeAnalyticsLazy.getInstance();
        JudgeAnalyticsLazy judgeAnalyticsLazy2 = JudgeAnalyticsLazy.getInstance();

        System.out.println(judgeAnalyticsLazy);
        System.out.println(judgeAnalyticsLazy2);
        System.out.println();
        System.out.println("JudgeAnalyicsLazy : both are same variable");
        System.out.println();

        JudgeAnalyticsSyncronized judgeAnalyticsSyncronized = JudgeAnalyticsSyncronized.getInstance();
        JudgeAnalyticsSyncronized judgeAnalyticsSyncronized2 = JudgeAnalyticsSyncronized.getInstance();

        System.out.println(judgeAnalyticsSyncronized);
        System.out.println(judgeAnalyticsSyncronized2);
        System.out.println();
        System.out.println("JudgeAnalyticsSyncronized : both are same variable");
        System.out.println();

        JADoubleCheck jADoubleCheck = JADoubleCheck.getInstance();
        JADoubleCheck jADoubleCheck2 = JADoubleCheck.getInstance();
        
        System.out.println(jADoubleCheck);
        System.out.println(jADoubleCheck2);
        System.out.println();
        System.out.println("JADoubleCheck : both are same variable");
        System.out.println();


    }
}
