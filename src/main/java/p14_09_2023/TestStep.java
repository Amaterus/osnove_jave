package p14_09_2023;

public class TestStep {
    private String opis;
    private Object actualVrednost;
    private Object expectedVrednost;
    private String errorMessage;

    public TestStep(String opis, Object actualVrednost, Object expectedVrednost, String errorMessage) {
        this.opis = opis;
        this.actualVrednost = actualVrednost;
        this.expectedVrednost = expectedVrednost;
        this.errorMessage = errorMessage;
    }

    public String getOpis() {
        return opis;
    }

    public Object getActualVrednost() {
        return actualVrednost;
    }

    public Object getExpectedVrednost() {
        return expectedVrednost;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean validate() {
        return actualVrednost.equals(expectedVrednost);
    }

    public void stampaj() {
        boolean isValid = validate();
        String status = "failed";
        String error = errorMessage;

        if (isValid) {
            status = "passed";
            error = "";
        }

        System.out.println("| Opis                     ");
        System.out.println("|                          ");
        System.out.println("|  " + this.opis + "       ");
        System.out.println("|  Status(" + status + ")  | " + error);
    }

}
