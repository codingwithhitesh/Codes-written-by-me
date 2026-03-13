class EnumTest {

    enum TrafficLight {
        Red("Stop"),Yellow("Start your engine"),Green("Move");

        String Value;

        TrafficLight(String value) {
            Value = value;
        }

        private String getValue() {
            return Value;
        }

        public void setValue(String value) {
            Value = value;
        }
    }

        void LightSelector() {
        TrafficLight current = TrafficLight.Green;
        System.out.println("Currently Light is  " +current + "|| you can - " + current.getValue());
    }

    public static void main(String[] args) {
        EnumTest test1 = new EnumTest();
        test1.LightSelector();

    }
}