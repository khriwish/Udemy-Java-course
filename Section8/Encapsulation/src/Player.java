public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health -= damage;

        if(health <= 0) {
            System.out.println("is knocked out of the game");
        }

    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth) {

        if((health+extraHealth) >= 100) {
            health = 100;
            System.out.println("player health is fully restored");
        }
        else {
            health += extraHealth;
            System.out.println("the player gained" + extraHealth + "extra health");
        }
    }
}
