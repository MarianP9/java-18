package week_5_oop_ii;

abstract class Samsung implements Phone {
    private int batteryLife = 10;

    int getBatteryLife() {
        return batteryLife;
    }

    /**
     * Lowers the battery level by some hours
     *
     * @param ammount the ammount of hours to be lowered
     */
    void lowerBatteryLife(int ammount) {
        if (batteryLife >= ammount)
            batteryLife -= ammount;
        else if (batteryLife > 0 && batteryLife < ammount)
            batteryLife = 0;
    }
}
