public class Knight {
    public int power=5;
    public int x = 0, y = 0;




    public void goForward() {
        x++;
        if (x == 4) {
            x = -3;
        }
    }

    public void goBackward() {
        x--;
        if (x == -4) {
            x = 3;
        }
    }

    public void goLeft() {
        y--;
        if (y == -4) {
            y = 3;
        }
    }

    public void goRight() {
        y++;
        if (y == 4) {
            y = -3;
        }
    }


    public int getX() {
        return x;
    }



    public int getY() {
        return y;
    }



    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
