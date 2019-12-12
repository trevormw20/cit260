public class CarSelection {
    //default ---------------------

    public void Model() {
        int carChoice = 0;
        System.out.println("Please select a car model by enter a number:");
        System.out.println("1: Model R\n" + "2: Model T\n" + "3: Model P\n" + "4: Model M\n" + "5: Model I\n");
        System.out.println("Press 9 to return to previous menu.");


        switch (carChoice){
            case 1:
                rUpgrades();
                break;
            case 2:
                tUpgrades();
                break;
            case 3:
                pUpgrades();
                break;
            case 4:
                mUpgrades();
                break;
            case 5:
                iUpgrades();
                break;
            case 9:
                break;
            default:
                break;
        }
    }

    // Model m choices/upgrades
    public void mUpgrades() {
        int rangeChoice = 0;
        System.out.println("Please select range with the corresponding number choice:");
        System.out.println("1: Standard\n" + "2: Long range\n" + "3: Performance\n");
        System.out.println("Press 9 to return to previous menu.");


        switch (rangeChoice){
            case 1:
                exteriorColorUpgrade();
                break;
            case 2:
                exteriorColorUpgrade();
                break;
            case 3:
                exteriorColorUpgrade();
                break;
            case 9:
                break;
            default:
                break;
        }
    }

    // Model R choices/upgrades
    public void rUpgrades() {
        int rangeChoice = 0;
        System.out.println("Please select range with the corresponding number choice:");
        System.out.println("1: Long range\n" + "2: Performance\n");
        System.out.println("Press 9 to return to previous menu.");


        switch (rangeChoice){
            case 1:
                exteriorColorUpgrade();
                break;
            case 2:
                exteriorColorUpgrade();
                break;
            case 9:
                break;
            default:
                break;
        }
    }

    // Model T choices/upgrades
    public void tUpgrades() {
        int rangeChoice = 0;
        System.out.println("Please select range with the corresponding number choice:");
        System.out.println("1: Long range\n" + "2: Performance\n");
        System.out.println("Press 9 to return to previous menu.");


        switch (rangeChoice){
            case 1:
                exteriorColorUpgrade();
                break;
            case 2:
                exteriorColorUpgrade();
                break;
            case 9:
                break;
            default:
                break;
        }
    }

    // Model P choices/upgrades
    public void pUpgrades() {
        int rangeChoice = 0;
        System.out.println("Please select range with the corresponding number choice:");
        System.out.println("1: Long range\n" + "2: Performance\n");
        System.out.println("Press 9 to return to previous menu.");


        switch (rangeChoice){
            case 1:
                exteriorColorUpgrade();
                break;
            case 2:
                exteriorColorUpgrade();
                break;
            case 9:
                break;
            default:
                break;
        }
    }

    // Model I choices/upgrades
    public void iUpgrades() {
        int rangeChoice = 0;
        System.out.println("Please select power and range with the corresponding number choice:");
        System.out.println("1: Single motor\n" + "2: Dual motor\n" + "3: Tri motor\n");
        System.out.println("Press 9 to return to previous menu.");


        switch (rangeChoice){
            case 1:
                exteriorColorUpgrade();
                break;
            case 2:
                exteriorColorUpgrade();
                break;
            case 3:
                exteriorColorUpgrade();
                break;
            case 9:
                break;
            default:
                break;
        }
    }

    // Exterior Color choices/upgrades
    public void exteriorColorUpgrade() {
        int colorChoice = 0;
        System.out.println("Please select exterior color with the corresponding number choice:");
        System.out.println("1: White\n" + "2: Black\n" + "3: Grey\n" + "4: Blue\n" + "5: Red\n");
        System.out.println("Press 9 to return to previous menu.");


        switch (colorChoice){
            case 1:
                rimUpgrade();
                break;
            case 2:
                rimUpgrade();
                break;
            case 3:
                rimUpgrade();
                break;
            case 4:
                rimUpgrade();
                break;
            case 5:
                rimUpgrade();
                break;
            case 9:
                break;
            default:
                break;
        }
    }

    // Rim color choices/upgrades
    public void rimUpgrade() {
        int rimChoice = 0;
        System.out.println("Please select power and range with the corresponding number choice:");
        System.out.println("1: Silver\n" + "2: Black\n" + "3: grey\n");
        System.out.println("Press 9 to return to previous menu.");


        switch (rimChoice){
            case 1:
                interiorUpgrade();
                break;
            case 2:
                interiorUpgrade();
                break;
            case 3:
                interiorUpgrade();
                break;
            case 9:
                break;
            default:
                break;
        }
    }

    // Interior color choices/upgrades
    public void interiorUpgrade() {
        int colorChoice = 0;
        System.out.println("Please select exterior color with the corresponding number choice:");
        System.out.println("1: Black and white leather\n" + "2: Dark wood with black leather\n" + "3: Light wood with white leather\n");
        System.out.println("Press 9 to return to previous menu.");


        switch (colorChoice){
            case 1:
                selfDrivingUpgrade();
                break;
            case 2:
                selfDrivingUpgrade();
                break;
            case 3:
                selfDrivingUpgrade();
                break;
            case 9:
                break;
            default:
                break;
        }
    }

    // Full self-driving upgrade
    public void selfDrivingUpgrade() {
        int selfDriveChoice = 0;
        System.out.println("Please input 1 if you would like full self-driving capability");
    }
}