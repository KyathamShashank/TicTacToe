package puzzle;

public class TicTacToeLogic 
{
 public static boolean check(char [][]board,char player)
 {
	//column check
   for(int r=0;r<=2;r++)
   {
	if(board[r][0]==player && board[r][1]==player &&board[r][2]==player)
	{
		return true;
	}
   }
   
   //row check
   for(int c=0;c<=2;c++)
   {
	if(board[0][c]==player && board[1][c]==player &&board[2][c]==player)
	{
		return true;
	}
   }
   
   //cross check
   if(board[0][0]==player && board[1][1]==player &&board[2][2]==player)
   {
	   return true;
   }
   if(board[0][2]==player && board[1][1]==player &&board[2][0]==player)
   {
	   return true;
   }
   return false;
   
 }
}
