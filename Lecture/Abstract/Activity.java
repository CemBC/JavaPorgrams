public abstract class Activity {
    protected static int completionPercentage;
    protected static double timeLeft;
    protected static int energy;

    public Activity() {
        this.completionPercentage = 0;
        this.timeLeft = 12.0d;
        this.energy = 100;
    }



    public int getCompletionPercentage() { return completionPercentage;}

    public void setCompletionPercentage(int completionPercentage) {
        if(completionPercentage< 0 ) {
            this.completionPercentage = 0;
        }else if (completionPercentage > 100) {
			this.completionPercentage = 100;
		}else {
            this.completionPercentage = completionPercentage;
        }
    }

    public double getTimeLeft() {return timeLeft;}

    public void setTimeLeft(double timeLeft) {
        if(timeLeft< 0) {
            this.timeLeft = 0;
        }else {
            this.timeLeft = timeLeft;
        }
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if(energy < 0 ) {
            this.energy = 0;
        }else if(energy > 100) {
			this.energy = 100;
		}else {
            this.energy = energy;
        }
    }

    public void display() {
        System.out.println("Completion Percetage = " + getCompletionPercentage() + "\nTime Left = " + getTimeLeft() + "\nEnergy = " + getEnergy());
    }

    abstract void completed();
	
	public boolean check () {
		boolean flag = false;
		if(completionPercentage == 100) {
			System.out.println("You have completed your assignment");
			flag = true;
		}else if(timeLeft == 0 ) {
			System.out.println("Time is out");
			flag = true;
		}
		return flag;
	}
}