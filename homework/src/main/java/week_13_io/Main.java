package week_13_io;

class Main {
    public static void main(String[] args) {

        AthleteRepository athleteRepository = new AthleteRepository();

        if (athleteRepository.readCsv("biathlon_example.csv"))
            athleteRepository.printWinners();
    }
}
