public class Randomfromarray {

    private int[] values;
    private int[] weights;
    private int[] ranges;
    private int sum;

    public Randomfromarray(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;

        sum = 0;
        for (int weight : weights){
            sum += weight;
        }
        ranges = new int[weights.length];
        int l_sum = 0;
        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = l_sum;
            l_sum += weights[i];
        }
    }

    public int get_random() {

        int random_n = (int) (Math.random() * (sum-1));
        int true_number = 0;
        for (int i =0; i < ranges.length; i++) {
            if (ranges[i] > random_n)
            {
                break;
            }
            true_number = i;
        }
        return values[true_number];
    }


}
