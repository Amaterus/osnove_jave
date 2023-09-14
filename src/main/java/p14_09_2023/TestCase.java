package p14_09_2023;

import java.util.ArrayList;

public class TestCase {
    private int id;
    private String naziv;
    private ArrayList<TestStep> nizTestKoraka;

    public TestCase(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
        this.nizTestKoraka = new ArrayList<>();
    }

    public void addTestStep(TestStep testStep) {
        nizTestKoraka.add(testStep);
    }

    public int brojFailovanihKoraka() {
        int brojFailovanih = 0;
        for (TestStep testStep : nizTestKoraka) {
            if (!testStep.validate()) {
                brojFailovanih++;
            }
        }
        return brojFailovanih;
    }

    public String stanjeTestCasea() {
        String stanje = "PASSED";
        if (brojFailovanihKoraka() != 0) {
            stanje = "TEST CASE FAILED";
        }
        return stanje;
    }

    public void stampa() {
        System.out.println(id + " - " + naziv);
        for (TestStep testStep : nizTestKoraka) {
            testStep.stampaj();
        }
        System.out.println("Ukupan broj koraka: " + nizTestKoraka.size() + " Broj test caseova koji su failovali: " + brojFailovanihKoraka());
    }
}
