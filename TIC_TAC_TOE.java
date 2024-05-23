package puzzle;

import java.util.Scanner;

public class TIC_TAC_TOE 
{
 public static void main(String[] args) 
 {
  char player='X';
  boolean gameOver=false;
  char [][] board=new char[3][3];
  for(int r=0;r<=2;r++)
  {
	  for(int c=0;c<=2;c++)
	  {
		  board[r][c]=' ';
	  }
  }
  
  while(!gameOver)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Player "+player+" enter: ");
	  int r=sc.nextInt();
	  int c= sc.nextInt();
	  if(board[r][c]==' ')
	  {
		  board[r][c]=player;
		  gameOver=TicTacToeLogic.check(board, player);
		  if(gameOver)
		  {
			  System.out.println("player "+player +" won the match ");
		  }
		  if(player=='X')
		  {
			  player='O';
		  }
		  else player='X';
	  }
	  else
	  {
		  System.out.println("invalid move try again");
	  }
	  
	  for(int i=0;i<=2;i++)
	  {
		  for(int j=0;j<=2;j++)
		  {
			System.out.print(board[i][j]+"| ");
		  }
		  System.out.println();
		  System.out.println("--------");
	  }
	  
  }
  
 }
}
