//Marc Encarnacion
//6.6 PP
//2/4/21
class TwoDArray 
{
  public static void main(String[] args) 
  {
    System.out.println("Marc Encarnacion, 6.6 PP");
    int[][]nums = new int[5][5];
    int row = nums.length;
    int column = nums[0].length;

    for(int i = 0; i < nums.length; i++)
      {
        for (int j = 0; j < nums[i].length;j++)
          {
            nums[i][j] = i;
            System.out.print(nums[i][j] + " ");
          }//end for loop
          System.out.println();
      }//end for loop
    System.out.println();
    for(int i = 0; i < nums.length; i++)
      {
        for (int j = 0; j < nums[i].length;j++)
          {
            nums[i][j] = j;
            System.out.print(nums[i][j] + " ");
          }//end for loop
          System.out.println();
      }//end for loop
    System.out.println();

    for(int i = 0; i < nums.length; i++)
      {
        for (int j = 0, n = 4; j < nums[0].length; j++, n--)
          {
            nums[i][j] = i * 5 + n + 1;
            System.out.print(nums[i][j] + " ");
          }//end for loop
          System.out.println();
      }//end main method
  }//end class Main
}