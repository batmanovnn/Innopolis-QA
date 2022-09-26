package draco;

public class Main {

	public static void main(String[] args) {
		// Auto-generated method stub
		int dragonHealth = 500;
	    int dragonAttack = 55;
	    
	    int spearHealth = 10;
	    int spearAttack = 10;
	    int numberOfSpears = 11;
	    
	    int count = 0;

	   
	    do {
	    	count++;
	    	System.out.println("Копейщиков: " + numberOfSpears);
	        // Attack spears --> Dragon
	        dragonHealth = dragonHealth - (spearAttack * numberOfSpears);
	        System.out.println("Копейщики атакуют (ущерб: " + (spearAttack * numberOfSpears) + ") - у дракона осталось " + dragonHealth + " HP");
	            
	        // Attack Dragon --> Spears
	        int spearsHealth = spearHealth * numberOfSpears - dragonAttack;
	        numberOfSpears = spearsHealth / spearHealth;
	        System.out.println("Дракон атакует (ущерб: " + dragonAttack + ") - осталось копейщиков: " + numberOfSpears);
	            
	        if (dragonHealth > 0) {
	            System.out.println("Дракон победил! Добавим еще одного копейщика и попробуем снова.");
	            numberOfSpears++;
	        }	        
	    } while (count < 20);
	    
	    System.out.println("Дракон побеждён! Народ ликует!");

	}

}
