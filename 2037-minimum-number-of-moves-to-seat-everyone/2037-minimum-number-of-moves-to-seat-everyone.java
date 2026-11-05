class Solution 
{
    public int minMovesToSeat(int[] seats, int[] students) 
    {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n = students.length;
        int s1=0;

        for(int i=0;i<n;i++)
        {
            int diff = Math.abs(seats[i]-students[i]);
            s1+=diff;
        }

        return s1;

    }
}