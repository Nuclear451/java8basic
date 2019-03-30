package enumeration;

/**
 * Created by Nuclear on 23.08.2018.
 */
public enum  Season {
    SUMMER(20){
        public void printState(){
            System.out.println("Sunny");
        }
    },
    AUTUMN(-5){
        public void printState(){
            System.out.println("Cloudy");
        }
    },
    WINTER(-20){
        public void printState(){
            System.out.println("Cold");
        }
    },
    SPRING(10){
        public void printState(){
            System.out.println("Freshly");
        }
    };

    private int expectedTemperature;

    Season(int temp) {
        this.expectedTemperature = temp;
    }

    public int getExpectedTemperature() {
        return expectedTemperature;
    }

    public static void main(String[] args) {
        for (Season season : Season.values()){
            System.out.println(season.getExpectedTemperature());
        }
    }
}
