    public class Fish extends Animal {
        private int fins;
        private int gills;

        public Fish(String type, double weight, int fins, int gills) {
            super(type, "small", weight);
            this.fins = fins;
            this.gills = gills;
        }

        private void moveMuscles() {
            System.out.print("moving Muscles");
        }

        private void moveFinns(){
            System.out.print("moving Finns");
        }

        @Override
        public void speedAnimal(String speed)
        {
            super.speedAnimal(speed);
            moveFinns();
            if(speed == "fast"){
                moveMuscles();
            }
            System.out.println();
        }

        @Override
        public String toString() {
            return "Fish{" +
                    "fins=" + fins +
                    ", gills=" + gills +
                    "} " + super.toString();
        }
    }
