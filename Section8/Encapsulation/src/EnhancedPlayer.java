public class EnhancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName,100,"AK-47");
    }

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;

        if(healthPercentage >= 100) {
            this.healthPercentage = 100;
        }
        else if (healthPercentage <= 0) {
            this.healthPercentage = 1;
        }
        else{
            this.healthPercentage = healthPercentage;
        }

        this.weapon = weapon;
    }


    public void loseHealth(int damage) {
        healthPercentage -= damage;

        if(healthPercentage <= 0) {
            System.out.println("is knocked out of the game");
        }

    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {

        if((healthPercentage +extraHealth) >= 100) {
            healthPercentage = 100;
            System.out.println("player health is fully restored");
        }
        else {
            healthPercentage += extraHealth;
            System.out.println("the player gained" + extraHealth + "extra health");
        }
    }



}
