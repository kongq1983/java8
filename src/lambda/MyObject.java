package lambda;

/**
 * @author kq
 * @date 2022-11-04 8:44
 * @since 2020-0630
 */
public class MyObject {

    private Integer number;

    public MyObject(){

    }

    public MyObject(Integer number){
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "number=" + number +
                '}';
    }
}
