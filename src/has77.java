public class has77 {
  public boolean has77(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (i  < nums.length - 1 && nums[i] == 7 && nums[i + 1] == 7) {
        return true;
      }

      if (i < nums.length -2 && nums[i] == 7 && nums[i + 2] == 7) {
        return true;
      }
    }
    return false;
  }

}
