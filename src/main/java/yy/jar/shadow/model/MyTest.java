package yy.jar.shadow.model;

public class MyTest {
    private Integer id;

    private String tValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettValue() {
        return tValue;
    }

    public void settValue(String tValue) {
        this.tValue = tValue == null ? null : tValue.trim();
    }
}