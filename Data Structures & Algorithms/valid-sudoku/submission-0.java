class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        HashSet<Character> rows[] = new HashSet[9];
        HashSet<Character> col[] = new HashSet[9];
        HashSet<Character> box[] = new HashSet[9];

        for(int i=0;i<9;i++)
        {
            rows[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }
        for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++)
            {
                char ch = board[r][c];
                if(ch=='.')
                continue;

                int boxes=(r/3)*3+(c/3);
                if(rows[r].contains(ch)||col[c].contains(ch)||box[boxes].contains(ch))
                return false;

                rows[r].add(ch);
                col[c].add(ch);
                box[boxes].add(ch);
            }
        }
        return true;
    }
}
