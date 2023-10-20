import javax.sound.midi.Track;

public class a_14_trapping_rainwater {
    // ques
    // given n non - negative integers representing an elevation map
    // where the width of eact bar is 1 , compute
    // how much water it can trap after raining

    // ans
    // if the arr[2,0,4]
    // then the 3 building of height 2 , 0 , 4
    // width is 1

    // for that we are using the auxillary array

    // for trapping the water minimum number of bar have to be 3
    // if the bars in ascending or descending order , then at there no water will
    // trap
    //

    // function
    public static int trappintRainWater(int height[]) {

        int n = height.length;
        // calculate max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }

        // calculate right boundry

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        int TrapWater = 0;
        for (int i = 0; i < n; i++) {

            // waterlevel = min(left max bound , right max bound) ;

            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterLevel - height[i];
            TrapWater = TrapWater + (waterLevel - height[i]);

        }
        return TrapWater;

    }

    public static void main(String[] args) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("the trap water is "+ trappintRainWater(height));

    }
}
