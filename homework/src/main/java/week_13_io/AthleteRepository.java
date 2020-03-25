package week_13_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class AthleteRepository {

    private List<AthleteResult> athleteResultList;

    AthleteRepository() {
        athleteResultList = new LinkedList<>();
    }

    /**
     * Reads a CSV file of athlete results and stores the entries in a list.
     * Returns false if the file couldn't be read or has an incorrect number of fields.
     *
     * @param fileName
     * @return True if successfuly read, false if not
     */
    boolean readCsv(String fileName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] splitLine = line.split(",");
                if (splitLine.length == 7) {
                    athleteResultList.add(new AthleteResult(Integer.parseInt(splitLine[0]), splitLine[1], splitLine[2], splitLine[3], splitLine[4], splitLine[5], splitLine[6]));
                    line = bufferedReader.readLine();
                } else {
                    System.out.println("Invalid CSV entries found");
                    athleteResultList.clear();
                    return false;
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            athleteResultList.clear();
            return false;
        }
    }

    /**
     * Prints the first three winners
     */
    void printWinners() {
        athleteResultList.sort(new Comparator<AthleteResult>() {
            @Override
            public int compare(AthleteResult athleteResult, AthleteResult t1) {
                return athleteResult.getFinalSecondsResult() - t1.getFinalSecondsResult();
            }
        });

        if (athleteResultList.size() > 0) {
            AthleteResult first = athleteResultList.get(0);
            System.out.println("Winner - " + first.getName() + " " + first.getFinalTimeResult() + " (" + first.getSkiTimeResult() + " + " + first.getPenaltySeconds() + ")");
            if (athleteResultList.size() > 1) {
                AthleteResult second = athleteResultList.get(1);
                System.out.println("Runner-up - " + second.getName() + " " + second.getFinalTimeResult() + " (" + second.getSkiTimeResult() + " + " + second.getPenaltySeconds() + ")");
                if (athleteResultList.size() > 2) {
                    AthleteResult third = athleteResultList.get(2);
                    System.out.println("Third place - " + third.getName() + " " + third.getFinalTimeResult() + " (" + third.getSkiTimeResult() + " + " + third.getPenaltySeconds() + ")");
                }
            }
        }
    }
}
