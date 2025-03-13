package bai2;

public class car {
    private String make;
    private String model;
    private String year;

    public car() {
    }

    public car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        if (year.matches("\\d{4}")) {
            int yearInt = Integer.parseInt(year);
            if (yearInt >= 1886 && yearInt <= java.time.Year.now().getValue()) {
                this.year = year;
            } else {
                System.out.println("Năm sản xuất không hợp lệ. Vui lòng nhập năm từ 1886 đến " + java.time.Year.now().getValue());
            }
        } else {
            System.out.println("Năm sản xuất phải là một số có 4 chữ số.");
        }
    }

}
