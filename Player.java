public class Player {
  private static final long serialVersionUID = 1L;
  public int x;
  public int y;
    
  public Player(int x_, int y_) {
    x = x_;
    y = y_;
  }
  
  public void up() {
    y--;
  }

  public void down() {
    y++;
  }

  public void left() {
    x--;
  }

  public void right() {
    x++;
  }

  @Override
  public String toString() {
    return Integer.toString(x) + Integer.toString(y); 
  }
}
